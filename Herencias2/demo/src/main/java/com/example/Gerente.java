
package com.example;

class Gerente extends Empleado {
    private double sueldoBase;
    private double bonificacion;
// CONSTRUCTOR DE GERENTE
    public Gerente(int id, String nombre, String email, double sueldoBase, double bonificacion) {
        super(id, nombre, email);
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
    }
    @Override
    //FUNCION describir
    public void describir() 
    {
     System.out.println("Gerente ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
        
    }

    @Override
    // FUNCION calcularSalario
    public double calcularSalario() {
        return sueldoBase + bonificacion;
    }
}
