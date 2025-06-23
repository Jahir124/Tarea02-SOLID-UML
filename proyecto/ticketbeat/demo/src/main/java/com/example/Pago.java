package com.example;

public class Pago {
    private int id;
    private double monto;
    private String fechaPago;
    private MetodoPago metodoPago; 

    public Pago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void procesarPago() {
        metodoPago.procesarPago();
    }
}


