package Clases;
import java.util.Scanner;
public abstract class ClasePadre_Abstracta {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada  = new Scanner(System.in);

    public void  Operaciones () {
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("Por favor Seleccione Una Opcion: ");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. Salir.");

                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("Opcion no disponible, vuelva a intentar por favor");
                    System.out.println("--------------------------------------------------");
                }

            } while (bandera == 0);
            if (seleccion == 1){
                ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
            } else if (seleccion == 2) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
            } else if (seleccion == 3) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
            } else if (seleccion == 4) {
                System.out.println("--------------------------------------------------");
                System.out.println("Gracias, Vuelva Pronto");
                System.out.println("--------------------------------------------------");
                bandera = 2;
            }
        }while (bandera != 2);
    }

    //Metodo Para Solicitar la cantidad de retiro:
    public void Reriro () {
        retiro = entrada.nextInt();
    }

    //Metodo para solicitar Depositos:
    public void Deposito(){
        deposito = entrada.nextInt();
    }

    //Metodo Abstrantp que va a contener el polimorfismo
    // (la parte logica no se declara dentro de la clase donde estamos formando el metodo)
    public abstract void Transacciones();

    //Metodos Geter Seter
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
      this.saldo = saldo;
    }

}
