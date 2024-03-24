package exercicios_nota4;

public class Main {
    public static void main(String[] args) {
  
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        
        porta1.abrir();
        porta1.abrir();
        porta2.abrir();
        porta1.fechar();
        
     
        System.out.println("Porta 1 está aberta? " + porta1.isOpen());
        System.out.println("Porta 2 está aberta? " + porta2.isOpen());
       
        System.out.println("Número de aberturas da porta 1: " + porta1.getNumAberturas());
        System.out.println("Número de aberturas da porta 2: " + porta2.getNumAberturas());
        
        System.out.println("Número total de aberturas de portas: " + Porta.getNumAberturasTotal());
    }
}

