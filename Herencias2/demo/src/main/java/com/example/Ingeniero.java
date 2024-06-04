package com.example;

class Ingeniero extends Empleado {
    private int horasTrabajadas;
    private double sueldoPorHora;

    public Ingeniero(int id, String nombre, String email, int horasTrabajadas, double sueldoPorHora) {
        super(id, nombre, email);
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    @Override
    public void describir() 
    {
        System.out.println("Ingeniero ID: " + id + ", Nombre: " + nombre + ", Email: " + email);

    }

    @Override
    public double calcularSalario() 
    {
        return horasTrabajadas * sueldoPorHora;
    }
}
