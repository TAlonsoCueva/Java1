package com.example;

    class Supervisor extends Empleado 
    {
        private int salarioAnual;
        private double extras;
       // CONSTRUCTOR ADMINISTRATIVO 
        public Supervisor(int id, String nombre, String email, int salarioAnual, double extras) {
            super(id, nombre, email);
            this.salarioAnual=salarioAnual;
            this.extras = extras;
        }

        @Override
        // FUNCION DESCRIBIR
        public void describir() {
            System.out.println("Administrativo ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
        }
       @Override
    // FUNCION CALCULARSALARIO
        public double calcularSalario() {
            return salarioAnual + extras;
        }
    }

