package com.iudigital.concurrency.activity.whitThread;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

import java.util.ArrayList;
import java.util.List;

public class CajeraProductMain {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<Producto>();
        setProductos(productos);

        ClienteProducto cliente1 = new ClienteProducto("Tesla", productos);
        ClienteProducto cliente2 = new ClienteProducto("Isaac", productos);
        ClienteProducto cliente3 = new ClienteProducto("Tony Stark", productos);

        long initialTime = System.currentTimeMillis();

        Thread cajera1 = new Thread(new CajeraProduct("Elizabeth", cliente1, initialTime));
        Thread cajera2 = new Thread(new CajeraProduct("Paulina", cliente2, initialTime));
        Thread cajera3 = new Thread(new CajeraProduct("Fabiola", cliente3, initialTime));

        cajera1.start();
        cajera2.start();
        cajera3.start();

    }

    /**
     * @param productos
     */
    public static void setProductos(List<Producto> productos) {
        Producto producto1 = new Producto("Zapatos", 500, 5);
        Producto producto2 = new Producto("BlueJeans", 300, 15);
        Producto producto3 = new Producto("Camisas", 700, 12);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

    }

}
