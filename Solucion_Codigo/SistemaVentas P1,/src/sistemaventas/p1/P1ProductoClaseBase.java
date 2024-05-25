package sistemaventas.p1;

class P1ProductoClaseBase {

    public String nameP;
    public double price;
    public int quantity;
    private int cantidadSeleccionada;

    public P1ProductoClaseBase(String nameP, double price, int quantity) {
        this.nameP = nameP;
        this.price = price;
        this.quantity = quantity;
        this.cantidadSeleccionada = 0;
    }

    @Override
    public String toString() {
        return "Producto: " + nameP + "\nPrecio: " + price + "\nCantidad: " + quantity;
    }

    public void AgregarProducto(int cantidad) {
        if (this.quantity >= cantidad) {
            this.cantidadSeleccionada = cantidad;
            System.out.println("Se han agregado " + cantidad + " unidades de " + this.nameP + " al carrito.");
            this.quantity -= cantidad;
        } else {
            System.out.println("No hay suficiente cantidad disponible para " + this.nameP);
        }
    }

    public double CalcularTotal() {
        return this.price * this.cantidadSeleccionada;
    }

    public void RealizarPago(double montoPagado) {
        double total = CalcularTotal();
        if (montoPagado >= total) {
            if (montoPagado > 1000) {
                double montoConDescuento = AplicarDescuento(total);
                System.out.println("¡Gracias por su compra! El total con descuento es: $" + montoConDescuento);
            } else {
                System.out.println("¡Gracias por su compra! El total es: $" + total);
            }
            double cambio = montoPagado - total;
            if (cambio > 0) {
                System.out.println("Su cambio es: $" + cambio);
            }
            this.quantity += this.cantidadSeleccionada;
        } else {
            System.out.println("El monto pagado no es suficiente. Faltan $" + (total - montoPagado) + " para completar la compra. Hasta Luego");
        }
    }

    private double AplicarDescuento(double monto) {
        double descuento = 0.05 * monto;
        return monto - descuento;
    }

    public void MostrarDetalleCompra(double totalCompra, double montoPagado) {
        System.out.println("Total de la compra: $" + totalCompra);
        System.out.println("Monto pagado: $" + montoPagado);
        System.out.println("Producto: " + nameP + ", Cantidad: " + cantidadSeleccionada);
        System.out.println("Muchas Gracias por su compra");
    }
}
