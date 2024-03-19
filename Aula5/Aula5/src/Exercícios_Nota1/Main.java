package Exercícios_Nota1;

public class Main {
    public static void main(String[] args) {
        Pessoa a = new Pessoa("João", "Masculino", 7, false);
        Pessoa b = new Pessoa("Maria", "Feminino", 14, true);

        Churrasco churrasco = new Churrasco();
        churrasco.verificarConsumo(a);
        churrasco.verificarConsumo(b);
    }
}