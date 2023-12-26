package com.mycompany.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        // Ejercicio Nº 1 - JDBC - Individual
        
        /**
        Crear una aplicación para gestionar una lista de estudiantes en una base de datos. Los estudiantes tendrán atributos como id, nombre, edad y calificación.
        - El sistema debe ser capaz de permitir agregar nuevos estudiantes, recuperar la lista de todos y mostrar su información.
        - Crear una base de datos mediante MySQL llamada universidad y una tabla llamada estudiantes cuyas columnas coincidan con los atributos de la clase estudiante.
        - Utilizar JDBC (Java Database Connectivity) para interactuar con la base de datos.
        */
        
        Scanner scan = new Scanner(System.in);
       
        String url = "jdbc:mysql://localhost:3306/universidad";
        String usuario = "root";
        String contraseña = "";
        boolean flag = true;
        
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            System.out.println("// Conexion establecida //");
            
            System.out.println("-- Menu gestor estudiantes --");
            
            while (flag) {
                System.out.println("Selecciona una opcion:");
                System.out.println("1. Agregar");
                System.out.println("2. Mostrar lista");
                System.out.println("3. Salir");
                
                int opcion = scan.nextInt();
                
                switch(opcion){
                    //Ingresar datos
                    case 1:
                        try{
                            String insertSql = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?,?,?)";
                            PreparedStatement prepararStatement = conexion.prepareStatement(insertSql);

                            System.out.println("Agrega un nuevo estudiante: ");
                            System.out.println("Nombre");
                            String nombreAgregar = scan.next();
                            System.out.println("Edad");
                            int edadAgregar = scan.nextInt();
                            System.out.println("Calificacion (1-10)");
                            int calificacionAgregar = scan.nextInt();

                            prepararStatement.setString(1, nombreAgregar);
                            prepararStatement.setInt(2, edadAgregar);
                            prepararStatement.setInt(3, calificacionAgregar);

                            prepararStatement.executeUpdate();

                            prepararStatement.close();
                            
                            System.out.println("Estudiante agregado");
                            
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        
                        break;
                        
                    //Recuperar datos
                    case 2:
                        try{
                            String sql = "SELECT * FROM estudiantes"; // Cambia el nombre de la tabla a "pacientes"
                            ResultSet resultado = statement.executeQuery(sql);

                            System.out.println("-- Lista de Estudiantes --");
                            
                            // Procesa los resultados
                            while (resultado.next()) {
                                int id = resultado.getInt("id");
                                String nombre = resultado.getString("nombre");
                                int edad = resultado.getInt("edad");
                                int calificacion = resultado.getInt("calificacion");
                                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Diagnóstico: " + calificacion);
                            }
    
                            resultado.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        break;
                        
                    //Salir del programa
                    case 3:
                        System.out.println("Hasta la proxima!");
                        flag = false;
                        break;
                        
                    default:
                        System.out.println("Selecciona una opcion valida");
                        break;
             
                }
                 
            }
            statement.close();
            conexion.close();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
