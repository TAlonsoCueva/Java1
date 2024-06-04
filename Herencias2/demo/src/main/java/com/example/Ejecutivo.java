package com.example;

    class Ejecutivo extends Empleado 
    {
        private int salarioHorasTrabajadas;
        private double Extras;
        private double pagasFestivos;
       // CONSTRUCTOR ADMINISTRATIVO 
        public Ejecutivo(int id, String nombre, String email, int salarioHorasTrabajadas, double Extras,double pagasFestivos) {
            super(id, nombre, email);
            this.salarioHorasTrabajadas=salarioHorasTrabajadas;
            this.Extras = Extras;
            this.pagasFestivos=pagasFestivos;
        }

        @Override
        // FUNCION DESCRIBIR
        public void describir() {
            System.out.println("Ejecutivo ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
        }
       @Override
    // FUNCION CALCULARSALARIO
        public double calcularSalario() {
            return salarioHorasTrabajadas + Extras + pagasFestivos;
        }
    }

    

