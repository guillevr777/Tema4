package parteprimera.ejercicio1;

public class Principal {
    public static void main(String[] args) {
        // Crear objetos CuentaCorriente con distintos constructores
        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", 1000);
        CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Juan Pérez", 500);
        CuentaCorriente cuenta3 = new CuentaCorriente("11223344C", "Ana López", 2000, "Extranjera");

        // Mostrar la información de las cuentas
        System.out.println("Información de las cuentas:");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);

        // Operaciones de ingreso y retirada de dinero
        System.out.println("\nOperaciones en cuenta1:");
        if (cuenta1.ingresarDinero(500)) {
            System.out.println("Ingreso exitoso. Nuevo saldo: " + cuenta1.getSaldo());
        } else {
            System.out.println("Error al ingresar dinero.");
        }

        if (cuenta1.sacarDinero(300)) {
            System.out.println("Extracción exitosa. Nuevo saldo: " + cuenta1.getSaldo());
        } else {
            System.out.println("Fondos insuficientes.");
        }

        // Comparar cuentas
        System.out.println("\nComparación de cuentas:");
        if (cuenta1.equals(cuenta2)) {
            System.out.println("cuenta1 y cuenta2 son iguales.");
        } else {
            System.out.println("cuenta1 y cuenta2 son diferentes.");
        }

        // Ingreso con cantidad negativa (debería fallar)
        System.out.println("\nIntento de ingreso negativo en cuenta2:");
        if (cuenta2.ingresarDinero(-100)) {
            System.out.println("Ingreso exitoso.");
        } else {
            System.out.println("No se puede ingresar una cantidad negativa.");
        }
    }
}
