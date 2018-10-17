package com.example.sebastian.fastparking;

public class Reservas {

    private String direccion;
    private String fecha;
    private String llegada;
    private String salida;


    public Reservas() {
    }


    public Reservas(String direccion, String fecha, String llegada, String salida) {
        this.direccion = direccion;
        this.fecha = fecha;
        this.llegada = llegada;
        this.salida = salida;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
}
