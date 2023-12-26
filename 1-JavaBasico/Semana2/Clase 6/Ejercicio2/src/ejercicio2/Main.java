package ejercicio2;

import ejercicio2.models.Producto;
import java.util.ArrayList;


public class Main {

    
    public static void main(String[] args) {
        
        // Ejercicio Nº 2 - Collections - Individual (Extra/Opcional)
        
        /**
         * Un administrador de una tienda de electrónica necesita un programa para gestionar los productos en su inventario. Para ello, necesita la creación de una clase             Producto que cuente con los siguientes datos: código, nombre, marca, tipo, precio costo, precio venta, cantidad en stock.

        A partir de esto, realizar las siguientes acciones en el programa desarrollado:

        a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados (por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).

        b) Guardar estos objetos creados en un ArrayList.

        c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.

        d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.

        e) Borrar el producto que se encuentre en la posición 5 del ArrayList.

        f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.

        g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.
         */
        
        //a)
        Producto telefono1 = new Producto(54789, "Phone2", "Nothing", "Telefono", 450, 600, 15);
        Producto telefono2 = new Producto(78944, "Iphone ProMax15", "Apple", "Telefono", 800, 1200, 20);
        Producto tv1 = new Producto(9685, "mxGL", "Samsung", "Televisor", 450, 700, 9);
        Producto tv2 = new Producto(9874, "mk120", "LG", "Televisor", 230, 450, 10);
        Producto auriculares1 = new Producto(5977, "mx580u", "Sony", "Auriculares", 100, 300, 15);
        Producto auriculares2 = new Producto(6899, "ear", "Nothing", "Auriculares", 100, 150, 15);
        Producto consola1 = new Producto(0124, "Ps5", "Sony", "Consola", 350, 550, 35);
        Producto consola2 = new Producto(0321, "Xbox Series S", "Microsoft", "Consola", 300, 500, 25);
        Producto portatil1 = new Producto(5449, "GamingSeries", "Msi", "Portatil", 1900, 3000, 13);
        Producto portatil2 = new Producto(9889, "Ultragear", "Lg", "Portatil", 600, 1200, 12);
        System.out.println("Productos creados ...");
        
        
        //b)
        ArrayList<Producto> tienda = new ArrayList();
        
        tienda.add(telefono1);
        tienda.add(telefono2);
        tienda.add(tv1);
        tienda.add(tv2);
        tienda.add(auriculares1);
        tienda.add(auriculares2);
        tienda.add(consola1);
        tienda.add(consola2);
        tienda.add(portatil1);
        tienda.add(portatil2);
        System.out.println("Productos guardados ...");
        
        //c)
        //Creamos dos variables para que en el bucle vayamos asignando el que mayor precio de venta tiene en cada iteracion. Tanto el nombre como el precio.
        String productoMasCaro = "";
        int precioMax=0;
        
        for(Producto producto:tienda){
            if(precioMax < producto.getPrecioVenta()){
                precioMax = producto.getPrecioVenta();
                productoMasCaro = producto.getMarca()+ " "+ producto.getNombre();
            }          
        }
        
        System.out.println("El producto con mayor precio de venta es el "+ productoMasCaro + " con un precio de " + precioMax + "€.");
        
        //d)
        //Realizamos un bucle parecido al anterior pero eligiendo ahora el mas barato.
        String productoMenorCosto = "";
        int precioMinCosto = 9999999; //Inicializamos el valor de la variable en un numero alto para que el if pueda funcionar
        
        for(Producto producto:tienda){
            if(precioMinCosto > producto.getPrecioCosto()){
                precioMinCosto = producto.getPrecioCosto();
                productoMenorCosto = producto.getMarca()+ " "+ producto.getNombre();
            }          
        }
        
        System.out.println("El producto con menor precio de costo es el "+ productoMenorCosto + " con un precio de " + precioMinCosto + "€.");
        
        //e)
        tienda.remove(5);
        System.out.println("Producto de la tienda en la posición 5 eliminado");
        
        //f)
        //Realizamos un bucle for con indice para poder recuperar el objeto del arraylist y modificarlo. 
        String productoMaxStock = "";
        int maxStock=0;
        int indiceProductoMaxStock=0;
        
        for(int i =0; i < tienda.size();i++){
            if(maxStock < tienda.get(i).getStock()){
                maxStock = tienda.get(i).getStock();
                productoMaxStock = tienda.get(i).getMarca()+ " "+ tienda.get(i).getNombre();
                indiceProductoMaxStock = i;
            } 
        }
        
        int nuevoStock = tienda.get(indiceProductoMaxStock).getStock()-3; //Le restamos 3 al stock del producto con mas stock
        
        tienda.get(indiceProductoMaxStock).setStock(nuevoStock);
        
        System.out.println("Stock del producto "+ productoMaxStock + " actualizado. Nuevo stock: "+ nuevoStock);
        
    }
    
}
