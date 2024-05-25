package sistemacalificaciones;

class Estudiante {

    private String nombre;
    private int edad;
    private String materia;
    private double[] calificaciones;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void agregarMateria(String materia, double[] calificaciones) {
        this.materia = materia;
        this.calificaciones = calificaciones;
    }

    public void verificarAprobacion() {
        if (calificaciones != null) {
            double sumaCalificaciones = calificaciones[0] + calificaciones[1] + calificaciones[2];
            if (sumaCalificaciones >= 7.0) {
                System.out.println(nombre + " ha aprobado la materia " + materia + ".");
            } else {
                System.out.println(nombre + " deberá rendir un examen de recuperación en la materia " + materia + ".");
            }
        } else {
            System.out.println(nombre + " no está inscrito en ninguna materia.");
        }
    }
}