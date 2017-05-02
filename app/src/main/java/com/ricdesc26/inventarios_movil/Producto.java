package com.ricdesc26.inventarios_movil;

import java.util.UUID;

/**
 * Created by dirck26 on 27/04/2017.
 */

public class Producto {
    private String id;
    private String Nombre;
    private String Tipo;
    private String Marca;
    private int Cantidad;
    private double Compra;
    private double Venta;

    public Producto(String Nombre, String Tipo, String Marca,
                    int Cantidad, double Compra, double Venta){
        this.id = UUID.randomUUID().toString();
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Marca = Marca;
        this.Cantidad = Cantidad;
        this.Compra = Compra;
        this.Venta = Venta;
    }

    public String getId(){
        return id;
    }

    public String getNombre(){
        return Nombre;
    }

    public String getTipo(){
        return Tipo;
    }

    public String getMarca(){
        return Marca;
    }

    public Integer getCantidad(){
        return Cantidad;
    }

    public Double getCompra(){
        return Compra;
    }

    public Double getVenta(){
        return Venta;
    }
}
