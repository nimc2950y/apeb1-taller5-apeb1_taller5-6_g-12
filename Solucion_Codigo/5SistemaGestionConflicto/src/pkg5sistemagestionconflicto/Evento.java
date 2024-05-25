package pkg5sistemagestionconflicto;

class Evento {
    private String nombre;
    private String fecha;
    private String pais;
    private String tipo;
    private String descripcion;
    private boolean exito;
    private int bajas;

    public Evento(String nombre, String fecha, String pais, String tipo, String descripcion, boolean exito, int bajas) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.pais = pais;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.exito = exito;
        this.bajas = bajas;
    }

    @Override
    public String toString() {
        return "Evento{" + "nombre=" + nombre + ", fecha=" + fecha + ", pais=" + pais + ", tipo=" + tipo + ", descripcion=" + descripcion + ", exito=" + exito + ", bajas=" + bajas + '}';
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPais() {
        return pais;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isExito() {
        return exito;
    }

    public int getBajas() {
        return bajas;
    }
}