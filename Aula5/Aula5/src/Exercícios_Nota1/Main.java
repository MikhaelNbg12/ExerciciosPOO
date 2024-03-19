package Exercícios_Nota1;

public class Main {
    public static void main(String[] args) {
        Pessoa a = new Pessoa("Mikhael", "Masculino", 22, false);
        Pessoa b = new Pessoa("Thatiane", "Feminino", 20, true);

        Churrasco churrasco = new Churrasco();
        churrasco.verificarConsumo(a);
        churrasco.verificarConsumo(b);
    }
}