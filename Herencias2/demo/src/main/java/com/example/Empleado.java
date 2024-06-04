package com.example;

abstract class Empleado {
    protected int id;
    protected String nombre;
    protected String email;
// Constructor Empleado
    public Empleado(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }
// Funciones describir() y calcularSalario()
    public abstract void describir();
    public abstract double calcularSalario();
}
