package departamentosempresa;

import java.util.ArrayList;
import java.util.Scanner;

public class DepartamentosEmpresa {

    public static void main(String[] args) {
        Scanner siu = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la empresa: ");
        String nombreEmpresa = siu.nextLine();
        System.out.print("Ingrese el RUC de la empresa: ");
        String rucEmpresa = siu.nextLine();
        System.out.print("Ingrese la dirección de la empresa: ");
        String direccionEmpresa = siu.nextLine();

        Empresa empresa = new Empresa(nombreEmpresa, rucEmpresa, direccionEmpresa);

        System.out.print("¿Cuántos departamentos desea ingresar? ");
        int numDepartamentos = siu.nextInt();
        siu.nextLine();

        for (int i = 0; i < numDepartamentos; i++) {
            System.out.println("Ingrese los datos del departamento " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombreDepto = siu.nextLine();
            System.out.print("Número de empleados: ");
            int numEmpleados = siu.nextInt();
            System.out.print("Producción anual: ");
            double produccionAnual = siu.nextDouble();
            siu.nextLine();
            Departamento departamento = new Departamento(nombreDepto, numEmpleados, produccionAnual);
            empresa.agregarDepartamento(departamento);
        }
        for (Departamento depto : empresa.getDepartamentos()) {
            depto.determinarCategoria();
        }
        System.out.println("\nDatos de la empresa:");
        System.out.println(empresa);

        System.out.println("\nDatos de los departamentos:");
        for (Departamento depto : empresa.getDepartamentos()) {
            System.out.println(depto);
        }
        siu.close();
    }
}
