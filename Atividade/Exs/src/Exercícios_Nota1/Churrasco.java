package Exercícios_Nota1;

public class Churrasco {
    double qtdCarne;

    public void verificarConsumo(Pessoa pessoa) {
        if (pessoa.idade >= 4 && pessoa.idade <= 12 && !pessoa.vegetariana) {
            qtdCarne = 1.0;
        }if (pessoa.idade >= 13 && !pessoa.vegetariana) {
            qtdCarne = 2.0;
        }else {
            qtdCarne = 0.0;
        }
        System.out.println(pessoa.nome + " consome " + qtdCarne + " kilos de carne.");
    }
}