package POO.proyecto.modeloKFC.Vista;

import POO.proyecto.modeloKFC.Clases.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppVenta {
    public static void main(String[] args) {
        // Datos iniciales
        Combo combo1 = new Combo(1, "Combo de pollo", "Incluye \n - 2 Piezas de pollo \n- Papas tamaño regurales \n- 1 Gaseosa tamaño regular", 19.9);
        Combo combo2 = new Combo(2, "Combo de pollo extra grande", "Incluye \n - 5 Piezas de pollo \n- 2 Papas tamaño familiar \n- 3 Gaseosa tamaño grande", 35.99);

        Empleado empleado = new Empleado(1, "Juan", "908639126", "juanito@gmail.com", "Cajero");

        // Pedir datos del cliente
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER para Ingresar los datos del cliente:");
        Cliente cliente = llenarCliente(scanner);

        // Seleccionar combo y cantidad
        System.out.println("========= Seleccione el combo ==========:");
        System.out.println("1. " + combo1.getNombreCombo());
        System.out.println("2. " + combo2.getNombreCombo());
        System.out.print("Opción: ");
        int opcionCombo = scanner.nextInt();
        Combo comboSeleccionado = (opcionCombo == 1) ? combo1 : combo2;

        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        // Calcular el total de la venta
        double totalVenta = comboSeleccionado.getPrecio() * cantidad;

        // Seleccionar tipo de pago
        System.out.println("Seleccione el metodo de pago:");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
        System.out.print("Ingrese opción: ");
        int opcionPago = scanner.nextInt();
        Pago pago;
        if (opcionPago == 1) {
            pago = new PagoEfectivo(totalVenta);
        } else {
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.print("Titular de la tarjeta: ");
            String titular = scanner.nextLine();
            System.out.print("Número de tarjeta: ");
            String numeroTarjeta = scanner.nextLine();
            System.out.print("Fecha de vencimiento (MM/YY): ");
            String fechaVencimiento = scanner.nextLine();
            System.out.print("Clave de seguridad: ");
            int claveSeguridad = scanner.nextInt();

            pago = new PagoTarjeta(totalVenta, titular, numeroTarjeta, new Date(), claveSeguridad);
        }

        // Crear detalle de venta
        DetalleVenta detalleVenta = new DetalleVenta(1, comboSeleccionado, cantidad);

        // Crear venta
        Venta venta = new Venta(1, new Date(), "Pendiente");
        venta.agregarDetalle(detalleVenta);

        // Mostrar detalles de la venta
        System.out.println("Detalles de la venta:");
        System.out.println("Combo: " + detalleVenta.getCombo().getNombreCombo() +
                ", Cantidad: " + detalleVenta.getCantidad() +
                ", Subtotal: " + detalleVenta.getSubtotal());

        // Realizar pago
        pago.realizarPago();

        // Mostrar boleta del clinet
        mostrarBoleta(cliente, empleado, pago, totalVenta);
    }

    public static Cliente llenarCliente(Scanner scanner) {
        scanner.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Teléfono del cliente: ");
        String telefonoCliente = scanner.nextLine();
        System.out.print("Email del cliente: ");
        String emailCliente = scanner.nextLine();

        return new Cliente(1, nombreCliente, telefonoCliente, emailCliente);
    }

    public static void mostrarBoleta(Cliente cliente, Empleado empleado, Pago pago, double totalVenta) {
        System.out.println("============================================");
        System.out.println("\n\n======== BOLETA DE VENTA =========");
        System.out.println("============================================");
        System.out.println("Cliente:");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("\nEmpleado:");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Teléfono: " + empleado.getTelefono());
        System.out.println("Email: " + empleado.getEmail());
        System.out.println("\nMétodo de pago:");
        if (pago instanceof PagoEfectivo) {
            System.out.println("Efectivo");
        } else if (pago instanceof PagoTarjeta) {
            PagoTarjeta pagoTarjeta = (PagoTarjeta) pago;
            System.out.println("Tarjeta");
            System.out.println("Titular: " + pagoTarjeta.getTitular());
            System.out.println("Número de tarjeta: " + pagoTarjeta.getNumeroTarjeta());
            System.out.println("Fecha de vencimiento: " + new SimpleDateFormat("MM/YY").format(pagoTarjeta.getFechaVencimiento()));
        }
        System.out.println("\nTotal: $" + totalVenta);
        System.out.println("============================================");
    }
}
