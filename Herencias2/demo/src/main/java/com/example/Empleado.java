package com.example;

abstract class Empleado {
    protected int id;
    protected String nombre;
    protected String email;

    public Empleado(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public abstract void describir();
    public abstract double calcularSalario();
}
