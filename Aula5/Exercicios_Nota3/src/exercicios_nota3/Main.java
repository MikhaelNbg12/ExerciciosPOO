package exercicios_nota3;

public class Main {
    public static void main(String[] args) {
    
        Complexo c1 = new Complexo(3, 2);
        Complexo c2 = new Complexo(1, -4);
        
   
        Complexo soma = c1.soma(c2);
        Complexo produto = c1.multiplica(c2);
        
     
        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
        
        System.out.println("Módulo de c1: " + c1.modulo());
        System.out.println("Argumento principal de c1: " + c1.argumentoPrincipal());
    }
}
