package com.example;

class Administrativo extends Empleado {
    private int horasTrabajadas;
    private double sueldoPorHora;
   // CONSTRUCTOR ADMINISTRATIVO 
    public Administrativo(int id, String nombre, String email, int horasTrabajadas, double sueldoPorHora) {
        super(id, nombre, email);
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }
    @Override
    // FUNCION DESCRIBIR
    public void describir() {
        System.out.println("Administrativo ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
    }
@Override
// FUNCION CALCULARSALARIO
    public double calcularSalario() {
        return horasTrabajadas * sueldoPorHora;
    }
}
