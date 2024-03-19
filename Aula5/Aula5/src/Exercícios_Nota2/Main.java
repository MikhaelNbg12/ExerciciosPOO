package Exercícios_Nota2;

public class Main {
	
	public static void main (String[] args) {
   
    Lampada lampada = new Lampada();
    System.out.println("Lampada começou: " + lampada.checaEstado());
    lampada.click(); 
    System.out.println("Apos primeiro click: " + lampada.checaEstado());
    System.out.println("Quantidade de acendimentos: " + lampada.qtdAcendimentos());
    lampada.click();
    System.out.println("Apos segundo click: " + lampada.checaEstado());
    System.out.println("Quantidade de acendimentos: " + lampada.qtdAcendimentos());
}
}
