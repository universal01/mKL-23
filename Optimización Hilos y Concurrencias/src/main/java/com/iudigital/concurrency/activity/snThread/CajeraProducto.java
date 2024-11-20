package com.iudigital.concurrency.activity.snThread;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

public class CajeraProducto {
    private final String nombreCajera;
    public CajeraProducto(String nombreCajera) {
        this.nombreCajera = nombreCajera;
    }
    public void procesarCompra(ClienteProducto cliente, long timeStanp) {
        System.out.println(this.nombreCajera + ": Procesando compra para: " + cliente.getNombre()
                + " en el tiempo:" + (System.currentTimeMillis() - timeStanp) + "ms");
        int conCliente = 1;
        for (Producto p : cliente.getProductos()) {
            this.esperarxSegundos();
            System.out.println(" Procesando el producto " + conCliente
            + " nombre producto: " + p.getNombre()
            + " precio producto: " + p.getPrecio()
            + " cantidad productos: "  + p.getCantidad()
            + " costo total: " + p.getCantidad()*p.getPrecio()
            + " tiempo: " + (System.currentTimeMillis() - timeStanp/1000 + "seg")
            );
        }
        System.out.println("La cajera " + this.nombreCajera + " ha terminado de procesar la combra de "
        + cliente.getNombre() + "en el tiempo " + (System.currentTimeMillis() - timeStanp)/1000 + "seg");


    }

    private void esperarxSegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
