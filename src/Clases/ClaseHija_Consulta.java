package Clases;

public class ClaseHija_Consulta extends ClasePadre_Abstracta{

    //Importante sobre escribir nuestros metodos abstracctos
    @Override
    public void Transacciones() {
        System.out.println("--------------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("--------------------------------------");
    }
}
