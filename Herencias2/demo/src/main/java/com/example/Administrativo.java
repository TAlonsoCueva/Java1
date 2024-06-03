package com.example;

class Administrativo extends Empleado {
    private int horasTrabajadas;
    private double sueldoPorHora;

    public Administrativo(int id, String nombre, String email, int horasTrabajadas, double sueldoPorHora) {
        super(id, nombre, email);
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    public void describir() {
        System.out.println("Administrativo ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
    }

    public double calcularSalario() {
        return horasTrabajadas * sueldoPorHora;
    }
}
