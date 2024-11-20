package com.iudigital.concurrency.activity.snThread;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

import java.util.ArrayList;
import java.util.List;

public class CajeraProductoMain {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<Producto>();
        setProductos(productos);

        ClienteProducto cliente1 = new ClienteProducto("Superman ", productos);
        ClienteProducto cliente2 = new ClienteProducto("Tony Stark ", productos);
        ClienteProducto cliente3 = new ClienteProducto("Aquaman ", productos);

        long initialTime = System.currentTimeMillis();
        CajeraProducto cajera1 = new CajeraProducto("Elizabeth: ");
        CajeraProducto cajera2 = new CajeraProducto("Sofia: ");
        CajeraProducto cajera3 = new CajeraProducto("Paulina: ");

        cajera1.procesarCompra(cliente2, initialTime);
        cajera2.procesarCompra(cliente3, initialTime);
        cajera3.procesarCompra(cliente1, initialTime);
    }

    public static void setProductos(List<Producto> productos) {
        Producto producto1 = new Producto("Zapatos ", 500 , 5);
        Producto producto2 = new Producto("BlueJeans", 300, 15);
        Producto producto3 = new Producto("Camisas", 700, 12);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
}
