// TIENDA
/*
Descripción: Programa para calcular el total de una compra en una tienda de frutas y verduras.
Entradas: Cantidad de manzanas y cantidad de bananos ingresadas por el usuario.
Salidas: Subtotal de cada producto, total sin descuento, descuento aplicado y total final.
*/

import java.util.Scanner;

public class TiendaFrutas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int PRECIO_MANZANA = 1000;
        final int PRECIO_BANANO = 800;

        System.out.print("Ingrese la cantidad de manzanas: ");
        int cantidadManzanas = entrada.nextInt();

        System.out.print("Ingrese la cantidad de bananos: ");
        int cantidadBananos = entrada.nextInt();

        double subtotalManzanas = calcularSubtotal(cantidadManzanas, PRECIO_MANZANA);
        double subtotalBananos = calcularSubtotal(cantidadBananos, PRECIO_BANANO);

        double totalSinDescuento = subtotalManzanas + subtotalBananos;
        double descuento = totalSinDescuento * 0.10;
        double totalFinal = totalSinDescuento - descuento;

        System.out.println("--- DETALLE DE COMPRA ---");
        System.out.println("Subtotal manzanas: $" + subtotalManzanas);
        System.out.println("Subtotal bananos: $" + subtotalBananos);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("Descuento (10%): $" + descuento);
        System.out.println("Total final: $" + totalFinal);
    }

    public static double calcularSubtotal(int cantidad, double precioUnitario) {
        return cantidad * precioUnitario;
    }
}