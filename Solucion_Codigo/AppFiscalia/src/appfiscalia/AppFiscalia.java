package appfiscalia;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AppFiscalia {
    public static void main(String[] args) {
        Scanner siu = new Scanner(System.in);
       
        System.out.println("Bienvenido Fiscalía General del Estado");
        System.out.println("-------------------------------------");
        System.out.println("Información de los casos registrados (1/2)");
        System.out.println("-------------------------------------");
        System.out.println("1) Caso Accidente Vehicular");
        System.out.println("2) Caso Corrupción");

        CasoCorrupcion accidenteVehicular = new CasoCorrupcion("Accidente Vehicular", "Iniciado");
        CasoCorrupcion casoCorrupcion = new CasoCorrupcion("Caso Corrupción", "Iniciado");

        Persona emilio = new Persona("Emilio Peña", 30, "Conductor", "Victima");
        Persona nathan = new Persona("Nathan Moreno", 45, "Funcionario", "Acusado");
        accidenteVehicular.agregarPersona(emilio);
        casoCorrupcion.agregarPersona(nathan);

        System.out.print("Seleccione el número de caso que desea ver: ");
        int numeroCaso = siu.nextInt();

        if (numeroCaso == 1) {
            System.out.println(accidenteVehicular);
            accidenteVehicular.mostrarPersonasImplicadas();
            System.out.println("El señor caminaba por las calles de la ciudad cuando fue impactado por un carro, el conductor estaba en estado etílico");
            accidenteVehicular.incrementarDiasDesdeRegistro(7);
            accidenteVehicular.actualizarEstado();
            System.out.println("Estado del caso: " + accidenteVehicular.getEstado());
            System.out.println("Se le pagara por daños a la persona ");
        } else if (numeroCaso == 2) {
            System.out.println(casoCorrupcion);
            casoCorrupcion.mostrarPersonasImplicadas();
            System.out.println("Se lo acusa de lavado de dinero mediante el nombre de la empresa, y ese dinero utilizado para compra de sustancias ilícitas");
            casoCorrupcion.incrementarDiasDesdeRegistro(16);
            casoCorrupcion.actualizarEstado();
            System.out.println("Estado del caso: " + casoCorrupcion.getEstado());
            casoCorrupcion.reduccionDePena();
            System.out.println("Personas implicadas actualizadas:");
            casoCorrupcion.mostrarPersonasImplicadas();
            System.out.println("La sentencia será de 5 años de cárcel.");
            double danioEconomico = 5000; 
            double fianzaMaxima = danioEconomico * 0.5; 
            System.out.println("La fianza máxima que se puede pagar es: $" + fianzaMaxima);
            System.out.println("Se reducio la sentencia por colaborar con informacion. Fianza total de 5000" + fianzaMaxima);
        } else {
            System.out.println("Número de caso inválido");
        }

        siu.close();
    }
}