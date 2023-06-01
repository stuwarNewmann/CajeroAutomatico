package Clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        //Aqui estaria la logica de la base de datos
        ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
        mensajero.setSaldo(500);


        mensajero.Operaciones();
    }
}
