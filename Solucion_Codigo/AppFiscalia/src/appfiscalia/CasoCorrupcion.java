package appfiscalia;

import java.util.ArrayList;
import java.util.List;

class CasoCorrupcion {

    private String nombreCaso;
    private String estado;
    private String contexto;
    private int diasDesdeRegistro;
    private List<Persona> personasImplicadas;

    public CasoCorrupcion(String nombreCaso, String estado) {
        this.nombreCaso = nombreCaso;
        this.estado = estado;
        this.personasImplicadas = new ArrayList<>();
        this.diasDesdeRegistro = 0; // Inicia en 0
    }

    @Override
    public String toString() {
        return "CasoCorrupcion{" + "nombreCaso=" + nombreCaso + ", estado=" + estado + ", contexto=" + contexto + ", diasDesdeRegistro=" + diasDesdeRegistro + ", personasImplicadas=" + personasImplicadas + '}';
    }
    
    public void setContexto(String contexto) {
        this.contexto = contexto;
    }

    public void agregarPersona(Persona persona) {
        personasImplicadas.add(persona);
    }

    public String getEstado() {
        return estado;
    }

    public List<Persona> getPersonasImplicadas() {
        return personasImplicadas;
    }

    public void incrementarDiasDesdeRegistro(int dias) {
        this.diasDesdeRegistro += dias;
    }

    public void actualizarEstado() {
        if (diasDesdeRegistro > 7 && diasDesdeRegistro <= 14) {
            estado = "Alerta";
        } else if (diasDesdeRegistro > 14) {
            estado = "Urgente";
        }
    }

    public void mostrarPersonasImplicadas() {
        for (Persona persona : personasImplicadas) {
            System.out.println(persona);
        }
    }

    public void reduccionDePena() {
        for (Persona persona : personasImplicadas) {
            if (persona.getRol().equals("Acusado")) {
                if (colaboracionParaReduccionDePena()) {
                    persona.setRol("Colaborador");
                }
            }
        }
    }

    private boolean colaboracionParaReduccionDePena() {
        return true;

    }
}
