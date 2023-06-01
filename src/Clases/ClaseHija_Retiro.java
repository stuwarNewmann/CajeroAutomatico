package Clases;

public class ClaseHija_Retiro extends ClasePadre_Abstracta {

    @Override
    public void Transacciones(){
        System.out.println("--------------------------");
        System.out.println("Cuanto deseas Retirar: ");
        System.out.println("--------------------------");
        Reriro();
        if(retiro <= getSaldo()){
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("------------------------------------");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("------------------------------------");
        }else{
            System.out.println("------------------------------------");
            System.out.println("Saldo Insuficiente.");
            System.out.println("------------------------------------");
        }
    }
}
