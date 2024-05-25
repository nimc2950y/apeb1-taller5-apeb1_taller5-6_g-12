package sistemacalificaciones;

import java.util.Scanner;

public class SistemaCalificaciones {

    public static void main(String[] args) {
        Scanner siu = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String nombreEstudiante = siu.nextLine();

        System.out.println("Ingrese la edad del estudiante:");
        int edadEstudiante = siu.nextInt();
        siu.nextLine();

        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante);

        System.out.println("Ingrese el nombre de la materia:");
        String nombreMateria = siu.nextLine();

        double[] calificaciones = new double[3];

        System.out.println("Ingrese la calificación del estudiante en la categoría ACD (1-10):");
        calificaciones[0] = siu.nextDouble();

        System.out.println("Ingrese la calificación del estudiante en la categoría APE (1-10):");
        calificaciones[1] = siu.nextDouble();

        System.out.println("Ingrese la calificación del estudiante en la categoría AA  (1-10):");
        calificaciones[2] = siu.nextDouble();

        estudiante.agregarMateria(nombreMateria, calificaciones);

        estudiante.verificarAprobacion();
    }
}
