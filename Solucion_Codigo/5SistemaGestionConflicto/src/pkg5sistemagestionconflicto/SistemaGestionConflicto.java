
package pkg5sistemagestionconflicto;
import java.util.ArrayList;
import java.util.Random;

class GestionConflictos {
    public static void main(String[] args) {
        ArrayList<String> paises = generarPaisesAleatorios(3); // Generamos 3 países aleatorios
        Conflicto conflicto = new Conflicto("Conflicto Internacional", paises, "2023-01-13");
        
        Random random = new Random();
        for (int i = 1; i <= 5; i++) { // Generamos 5 eventos aleatorios
            Evento evento = generarEventoAleatorio(i, paises.get(random.nextInt(paises.size())));
            conflicto.agregarEvento(evento);
        }

        System.out.println("Nombre del conflicto: " + conflicto.getNombre());
        System.out.println("Estado actual del conflicto: " + conflicto.getEstadoActual());
        for (Evento evento : conflicto.consultarEventos()) {
            System.out.println("Evento: " + evento.getNombre() + ", Tipo: " + evento.getTipo() + ", Fecha: " + evento.getFecha());
        }
    }

    private static ArrayList<String> generarPaisesAleatorios(int cantidad) {
        String[] nombresPaises = {"Pais1", "Pais2", "Pais3", "Pais4", "Pais5"};
        ArrayList<String> paises = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            paises.add(nombresPaises[random.nextInt(nombresPaises.length)]);
        }
        return paises;
    }

    private static Evento generarEventoAleatorio(int indice, String pais) {
        Random random = new Random();
        String[] tiposEvento = {"Batalla", "Negociación", "Tregua"};
        String tipo = tiposEvento[random.nextInt(tiposEvento.length)];
        String fecha = "2023-" + (random.nextInt(12) + 1) + "-" + (random.nextInt(28) + 1);
        String descripcion = "Descripción del evento " + indice;
        boolean exito = random.nextBoolean();
        int bajas = random.nextInt(100);
        return new Evento("Evento " + indice, fecha, pais, tipo, descripcion, exito, bajas);
    }
}