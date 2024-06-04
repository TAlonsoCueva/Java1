package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Empleado> empleados;

    public Main() {
        // crear una arrat que almacene empleados
        empleados = new ArrayList<>();
    }
// crear funciom agregar empleados,añadiendo empleado en a nueva variable empleados
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
// Funciom para mostrar informacionEmpleados, desde empleados., accedemos a los salarios y descripciones de ellos, para luego imprmirlos
    public void mostrarInformacionEmpleados() {
        for (Empleado empleado : empleados) {
            empleado.describir();
            System.out.println("Salario: " + empleado.calcularSalario());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main test = new Main();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de empleados: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el tipo de empleado (1: Gerente, 2: Ingeniero, 3: Administrativo): ");
            int tipo = scanner.nextInt();

            System.out.print("Ingrese el ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consumir el salto de línea
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el email: ");
            String email = scanner.nextLine();
// Creamos un swich para ver en que caso si es 1 es gerente,2 ingenirero o 3 administrativo
            switch (tipo) {
                case 1:
                    System.out.print("Ingrese el sueldo base: ");
                    double sueldoBase = scanner.nextDouble();
                    System.out.print("Ingrese la bonificación: ");
                    double bonificacion = scanner.nextDouble();
                    test.agregarEmpleado(new Gerente(id, nombre, email, sueldoBase, bonificacion));
                    break;
                case 2:
                    System.out.print("Ingrese las horas trabajadas: ");
                    int horasTrabajadasIng = scanner.nextInt();
                    System.out.print("Ingrese el sueldo por hora: ");
                    double sueldoPorHoraIng = scanner.nextDouble();
                    test.agregarEmpleado(new Ingeniero(id, nombre, email, horasTrabajadasIng, sueldoPorHoraIng));
                    break;
                case 3:
                    System.out.print("Ingrese las horas trabajadas: ");
                    int horasTrabajadasAdm = scanner.nextInt();
                    System.out.print("Ingrese el sueldo por hora: ");
                    double sueldoPorHoraAdm = scanner.nextDouble();
                    test.agregarEmpleado(new Administrativo(id, nombre, email , horasTrabajadasAdm , sueldoPorHoraAdm));
                    break;
                default:
                    System.out.println("Tipo de empleado no válido.");
                    i--; // Decrementar para repetir la entrada de este empleado
                    break;
            }
        }
        System.out.println("\nInformación de todos los empleados:");
        test.mostrarInformacionEmpleados();

        scanner.close();
    }
}
