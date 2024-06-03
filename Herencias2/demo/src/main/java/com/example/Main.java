package com.example;

public class Main 
{
    public static void main(String[] args) 
    {
        Empleado newGerente=new Gerente(1, "carlos", "jaunca", 30, 15);
        Empleado newAdministrativo=new Administrativo(2, "carlos", "jaunca", 20, 15);
        Empleado newIngeniero=new Ingeniero(3, "carlos", "jaunca", 20, 15);

        System.out.println(newGerente.calcularSalario());
        System.out.println(newAdministrativo.calcularSalario());
        System.out.println(newIngeniero.calcularSalario());
        
    }
    
}
