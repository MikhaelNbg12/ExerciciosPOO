package exercicios_nota3;

public class Complexo {
    private double a; 
    private double b; 
 
    public Complexo(double a, double b) {
        this.a = a;
        this.b = b;
    }
    

    public Complexo soma(Complexo outro) {
        double novaParteReal = this.a + outro.a;
        double novaParteImaginaria = this.b + outro.b;
        return new Complexo(novaParteReal, novaParteImaginaria);
    }
    
    public Complexo multiplica(Complexo outro) {
        double novaParteReal = (this.a * outro.a) - (this.b * outro.b);
        double novaParteImaginaria = (this.a * outro.b) + (this.b * outro.a);
        return new Complexo(novaParteReal, novaParteImaginaria);
    }
    
    public String toString() {
        return a + " + " + b + "i";
    }
   
    public double modulo() {
        return Math.sqrt(a * a + b * b);
    }
    
    public double argumentoPrincipal() {
        return Math.atan2(b, a);
    }
}
