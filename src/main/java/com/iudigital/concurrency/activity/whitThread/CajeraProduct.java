package com.iudigital.concurrency.activity.whitThread;

import com.iudigital.concurrency.activity.domain.ClienteProducto;
import com.iudigital.concurrency.activity.domain.Producto;

public class CajeraProduct implements Runnable {
    private String nombreCajera;
    private ClienteProducto cliente;
    private long initialTime;

    /**
     * @param nombreCajera
     * @param cliente
     * @param initialTime
     */
    public CajeraProduct(String nombreCajera, ClienteProducto cliente, long initialTime) {
        this.nombreCajera = nombreCajera;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    @Override
    public void run() {
        procesarCompra(cliente, initialTime);
    }

    /**
     * @param cliente
     * @param timeStamp
     */
    public void procesarCompra(ClienteProducto cliente, long timeStamp) {
        System.out.println(this.nombreCajera + ": Procesando compra para: " + cliente.getNombre()
                + " en el tiempo: " + (System.currentTimeMillis() - timeStamp) /1000.0+ " seg");
        int conCliente = 1;
        for (Producto p : cliente.getProductos()) {
            this.esperarxSegundos();
            double elapsedTime = (System.currentTimeMillis() - timeStamp) / 1000.0;

            System.out.println(

                      " \n Procesando el producto: " + conCliente
                    + " \n nombre producto: " + p.getNombre()
                    + " \n precio producto: " + "$" + p.getPrecio()
                    + " \n cantidad productos: "  + p.getCantidad() + " unidades"
                    + " \n costo total: " + "$" +p.getCantidad() * p.getPrecio()
                    + " \n tiempo: " + String.format("%.2f", elapsedTime) + " seg \n"

            );
            conCliente++;

        }
        double totalTime = (System.currentTimeMillis() - timeStamp) / 1000.0;
        System.out.println(
                " La cajera " + this.nombreCajera + " ha terminado de procesar la compra de "
                + cliente.getNombre() + " en el tiempo promedio de:  " + String.format("%.2f", totalTime) + " seg\n "
                + " *************************************************************************************\n");

    }

    /**
     * tiempo de espera
     */
    private void esperarxSegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
