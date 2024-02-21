package cuentas;

public class Main {

    public static void main(String[] args) {
        float cantidad=0;
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, cantidad);
    }
//INTRODUZCO ESTE CAMBIO PARA EL GITHUB
//CREADA UNA NUEVA RAMA INTRODUZCO ESTE COMENTARIO
    public static void operativa_cuenta(CCuenta cuentaActual, float cantidad) {
        double saldoActual;

        saldoActual = cuentaActual.estado();
        System.out.println("El saldo actual es: " + saldoActual);

        try {
            cuentaActual.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuentaActual.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
