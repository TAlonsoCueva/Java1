
package com.example;

class Gerente extends Empleado {
    private double sueldoBase;
    private double bonificacion;

    public Gerente(int id, String nombre, String email, double sueldoBase, double bonificacion) {
        super(id, nombre, email);
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
    }

    public void describir() {
        // System.out.println("Gerente ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
        System.out.println("Hola");
    }


    public double calcularSalario() {
        return sueldoBase + bonificacion;
    }
}
