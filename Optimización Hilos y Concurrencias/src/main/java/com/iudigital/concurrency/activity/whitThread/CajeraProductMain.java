package com.iudigital.concurrency.activity.whitThread;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

import java.util.ArrayList;
import java.util.List;

public class CajeraProductMain {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        ClienteProducto cliente1 = new ClienteProducto("Ana Isabel", productos);
        ClienteProducto cliente2 = new ClienteProducto("Juan Felipe", productos);
        ClienteProducto cliente3 = new ClienteProducto("Miguel Angel", productos);

        long initialTime = System.currentTimeMillis();

        Thread cajera1 = new Thread(new CajeraProduct("Karla yisell", cliente1, initialTime));
        Thread cajera2 = new Thread(new CajeraProduct("Katerinne", cliente2, initialTime));
        Thread cajera3 = new Thread(new CajeraProduct("Andrea", cliente3, initialTime));

        cajera1.start();
        cajera2.start();
        cajera3.start();

    }

   
    public static void setProductos(List<Producto> productos) {
        Producto producto1 = new Producto("Zapatos", 600, 4);
        Producto producto2 = new Producto("BlueJeans", 500, 10);
        Producto producto3 = new Producto("Camisas", 800, 18);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

    }

}
