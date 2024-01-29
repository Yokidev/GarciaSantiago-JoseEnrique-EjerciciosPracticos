/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackaboss.ejerciciointegrador.persistence;

import com.hackaboss.ejerciciointegrador.persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.hackaboss.ejerciciointegrador.models.Equipo;
import com.hackaboss.ejerciciointegrador.models.Partido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jegs_
 */
public class PartidoJpaController implements Serializable {

    public PartidoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public PartidoJpaController() {
        emf = Persistence.createEntityManagerFactory("TorneoPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Partido partido) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Equipo equipoLocal = partido.getEquipoLocal();
            if (equipoLocal != null) {
                equipoLocal = em.getReference(equipoLocal.getClass(), equipoLocal.getId());
                partido.setEquipoLocal(equipoLocal);
            }
            Equipo equipoVisitante = partido.getEquipoVisitante();
            if (equipoVisitante != null) {
                equipoVisitante = em.getReference(equipoVisitante.getClass(), equipoVisitante.getId());
                partido.setEquipoVisitante(equipoVisitante);
            }
            em.persist(partido);
            if (equipoLocal != null) {
                equipoLocal.getListaPartidos().add(partido);
                equipoLocal = em.merge(equipoLocal);
            }
            if (equipoVisitante != null) {
                equipoVisitante.getListaPartidos().add(partido);
                equipoVisitante = em.merge(equipoVisitante);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Partido partido) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Partido persistentPartido = em.find(Partido.class, partido.getId());
            Equipo equipoLocalOld = persistentPartido.getEquipoLocal();
            Equipo equipoLocalNew = partido.getEquipoLocal();
            Equipo equipoVisitanteOld = persistentPartido.getEquipoVisitante();
            Equipo equipoVisitanteNew = partido.getEquipoVisitante();
            if (equipoLocalNew != null) {
                equipoLocalNew = em.getReference(equipoLocalNew.getClass(), equipoLocalNew.getId());
                partido.setEquipoLocal(equipoLocalNew);
            }
            if (equipoVisitanteNew != null) {
                equipoVisitanteNew = em.getReference(equipoVisitanteNew.getClass(), equipoVisitanteNew.getId());
                partido.setEquipoVisitante(equipoVisitanteNew);
            }
            partido = em.merge(partido);
            if (equipoLocalOld != null && !equipoLocalOld.equals(equipoLocalNew)) {
                equipoLocalOld.getListaPartidos().remove(partido);
                equipoLocalOld = em.merge(equipoLocalOld);
            }
            if (equipoLocalNew != null && !equipoLocalNew.equals(equipoLocalOld)) {
                equipoLocalNew.getListaPartidos().add(partido);
                equipoLocalNew = em.merge(equipoLocalNew);
            }
            if (equipoVisitanteOld != null && !equipoVisitanteOld.equals(equipoVisitanteNew)) {
                equipoVisitanteOld.getListaPartidos().remove(partido);
                equipoVisitanteOld = em.merge(equipoVisitanteOld);
            }
            if (equipoVisitanteNew != null && !equipoVisitanteNew.equals(equipoVisitanteOld)) {
                equipoVisitanteNew.getListaPartidos().add(partido);
                equipoVisitanteNew = em.merge(equipoVisitanteNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = partido.getId();
                if (findPartido(id) == null) {
                    throw new NonexistentEntityException("The partido with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Partido partido;
            try {
                partido = em.getReference(Partido.class, id);
                partido.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The partido with id " + id + " no longer exists.", enfe);
            }
            Equipo equipoLocal = partido.getEquipoLocal();
            if (equipoLocal != null) {
                equipoLocal.getListaPartidos().remove(partido);
                equipoLocal = em.merge(equipoLocal);
            }
            Equipo equipoVisitante = partido.getEquipoVisitante();
            if (equipoVisitante != null) {
                equipoVisitante.getListaPartidos().remove(partido);
                equipoVisitante = em.merge(equipoVisitante);
            }
            em.remove(partido);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Partido> findPartidoEntities() {
        return findPartidoEntities(true, -1, -1);
    }

    public List<Partido> findPartidoEntities(int maxResults, int firstResult) {
        return findPartidoEntities(false, maxResults, firstResult);
    }

    private List<Partido> findPartidoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Partido.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Partido findPartido(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Partido.class, id);
        } finally {
            em.close();
        }
    }

    public int getPartidoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Partido> rt = cq.from(Partido.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
