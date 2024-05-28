package com.iudigital.concurrency.activity.domain;

public class Producto {

    /**
     * Atributo que determina el nombre del peoducto
     */
    private String nombre;

    /**
     * Atributo que determina el precio del peoducto
     */
    private float precio;

    /**
     * Atributo que determina la cantidad del peoducto
     */
    private int cantidad;

    public Producto(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }


    /**
     * @return Cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
