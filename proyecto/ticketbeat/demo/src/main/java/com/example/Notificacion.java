package com.example;

public class Notificacion {
    private int id;
    private String mensaje;
    private CanalNotificacion canal;

    public Notificacion(CanalNotificacion canal) {
        this.canal = canal;
    }

    public void enviarNotificacion() {
        canal.enviar();
    }
}

