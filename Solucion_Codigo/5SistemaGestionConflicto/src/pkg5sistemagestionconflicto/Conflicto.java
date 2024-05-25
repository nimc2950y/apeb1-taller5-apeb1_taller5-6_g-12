package pkg5sistemagestionconflicto;

import java.util.ArrayList;

class Conflicto {
    private String nombre;
    private ArrayList<String> paisesInvolucrados;
    private String fechaInicio;
    private ArrayList<Evento> eventos;

    public Conflicto(String nombre, ArrayList<String> paisesInvolucrados, String fechaInicio) {
        this.nombre = nombre;
        this.paisesInvolucrados = paisesInvolucrados;
        this.fechaInicio = fechaInicio;
        this.eventos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Conflicto{" + "nombre=" + nombre + ", paisesInvolucrados=" + paisesInvolucrados + ", fechaInicio=" + fechaInicio + ", eventos=" + eventos + '}';
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getEstadoActual() {
        return "En curso"; // Por simplicidad, siempre en curso
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public ArrayList<Evento> consultarEventos() {
        return eventos;
    }
}