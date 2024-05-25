package departamentosempresa;


public class Departamento {
    private String nombre;
    private int numeroEmpleados;
    private double produccionAnual;
    private String categoria;

    public Departamento(String nombre, int numeroEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.produccionAnual = produccionAnual;
    }

    public void determinarCategoria() {
        if (numeroEmpleados > 20 && produccionAnual > 1000000) {
            categoria = "A";
        } else if (numeroEmpleados == 20 && produccionAnual == 1000000) {
            categoria = "B";
        } else if (numeroEmpleados == 10 && produccionAnual == 500000) {
            categoria = "C";
        } else {
            categoria = "Sin Categoría";
        }
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombre=" + nombre + ", numeroEmpleados=" + numeroEmpleados + ", produccionAnual=" + produccionAnual + ", categoria=" + categoria + '}';
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public double getProduccionAnual() {
        return produccionAnual;
    }

    public String getCategoria() {
        return categoria;
    }
}