package sistemaventas.p1;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaVentasP1 {

    public static void main(String[] args) {
        Scanner siu = new Scanner(System.in);
        ArrayList<P1ProductoClaseBase> productos = new ArrayList<>();
        System.out.println("//////////////-MI-TIENDA-LINDA-///////////////");
        System.out.println("\n'Donde cada compra es una BENDICION!!!'");
        System.out.println("\nEste es nuestro catálogo>");
        System.out.println("Ingrese el número de productos (1/5)>");

        productos.add(new P1ProductoClaseBase("1)Impresora", 455, 10));
        productos.add(new P1ProductoClaseBase("2)Lavadora", 1000, 20));
        productos.add(new P1ProductoClaseBase("3)Secadora", 800, 15));
        productos.add(new P1ProductoClaseBase("4)Batidora", 200, 25));
        productos.add(new P1ProductoClaseBase("5)Juego de mesa", 50, 35));

        System.out.println("Catálogo de Productos");
        System.out.println("=====================");

        for (P1ProductoClaseBase producto : productos) {
            System.out.println(producto);
            System.out.println("---------------------");
        }

        System.out.println("Ingrese el número del producto que desea comprar:");
        int numeroProducto = siu.nextInt();
        System.out.println("Ingrese la cantidad que desea comprar:");
        int cantidad = siu.nextInt();
        if (numeroProducto >= 1 && numeroProducto <= productos.size()) {
            P1ProductoClaseBase productoSeleccionado = productos.get(numeroProducto - 1);
            productoSeleccionado.AgregarProducto(cantidad);

            double totalCompra = productoSeleccionado.CalcularTotal();
            System.out.println("El total de la compra es: $" + totalCompra);

            System.out.println("Ingrese la cantidad que va a pagar:");
            double montoPagado = siu.nextDouble();

            productoSeleccionado.RealizarPago(montoPagado);

            System.out.println("\nDetalle de la compra:");
            productoSeleccionado.MostrarDetalleCompra(totalCompra, montoPagado);
        } else {
            System.out.println("Número de producto no válido.");
        }

        siu.close();
    }
}
