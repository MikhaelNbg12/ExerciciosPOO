package Exercícios_Nota2;

public class Lampada {
    private Estado estado; 
    private int qtdAcendimentos; 

    
    public Lampada() {
        this.estado = Estado.APAGADA;
        this.qtdAcendimentos = 0;
    }
    public void click() {
        if (this.estado == Estado.ACESA) {
            this.estado = Estado.APAGADA;
        } else {
            this.estado = Estado.ACESA;
            this.qtdAcendimentos++; 
        }
    }
 
    public int qtdAcendimentos() {
        return this.qtdAcendimentos;
    }

    public Estado checaEstado() {
        return this.estado;
    }
}
