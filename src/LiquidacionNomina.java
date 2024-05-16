import java.util.Scanner;

public class LiquidacionNomina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables
        String nombre, apellido, documento;
        int diasTrabajados;
        double salarioBasico, subsidioTransporte, totalDevengos, totalDescuentos, totalNeto;

        // Input de datos
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = input.nextLine();
        System.out.println("Ingrese el apellido del empleado: ");
        apellido = input.nextLine();
        System.out.println("Ingrese el documento del empleado: ");
        documento = input.nextLine();
        System.out.println("Ingrese los días trabajados: ");
        diasTrabajados = input.nextInt();
        System.out.println("Ingrese el salario básico: ");
        salarioBasico = input.nextDouble();
        System.out.println("¿Recibe subsidio de transporte? (Sí/No): ");
        String respuestaSubsidio = input.next();
        if (respuestaSubsidio.equalsIgnoreCase("Sí")) {
            System.out.println("Ingrese el valor del subsidio de transporte: ");
            subsidioTransporte = input.nextDouble();
        } else {
            subsidioTransporte = 0;
        }

        // Cálculos
        double salarioDevengado = (salarioBasico / 30) * diasTrabajados;
        totalDevengos = salarioDevengado + subsidioTransporte;
        double saludPension = totalDevengos * 0.08; // Porcentaje de salud y pensión
        double totalAportes = saludPension * 2; // Suma de salud y pensión
        totalDescuentos = totalAportes;
        totalNeto = totalDevengos - totalDescuentos;

        // Resultados
        System.out.println("----- Liquidación de Nómina -----");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Documento: " + documento);
        System.out.println("Total devengado: " + totalDevengos);
        System.out.println("Total descuentos: " + totalDescuentos);
        System.out.println("Valor neto a pagar: " + totalNeto);
    }
}

