package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

            // Llamar al método operativa_cuenta para realizar operaciones
            operativa_cuenta(cuenta1, 2300); // Retirar 2300
            operativa_cuenta(cuenta1, 695); // Ingresar 695

    }

    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        // Intentar retirar dinero
        try {
            cuenta.retirar(cantidad);
            System.out.println("Se ha retirado " + cantidad + " de la cuenta.");
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        // Intentar ingresar dinero
        try {
            cuenta.ingresar(cantidad);
            System.out.println("Se ha ingresado " + cantidad + " en la cuenta.");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}