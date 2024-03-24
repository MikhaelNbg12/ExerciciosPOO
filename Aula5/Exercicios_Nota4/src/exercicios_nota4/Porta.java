package exercicios_nota4;


//exercicio 8 da lista

public class Porta {
	
	    private static int numAberturasTotal = 0;
	    private boolean isOpen;
	    private int numAberturas;
	  
	    public Porta() {
	        this.isOpen = false;
	        this.numAberturas = 0;
	    }
	    
	    public void abrir() {
	        isOpen = true;
	        numAberturas++;
	        numAberturasTotal++;
	    }
	   
	    public void fechar() {
	        isOpen = false;
	    }

	    public boolean isOpen() {
	        return isOpen;
	    }

	    public int getNumAberturas() {
	        return numAberturas;
	    }
	    
	    // Método para obter o número total de aberturas de todas as portas
	    public static int getNumAberturasTotal() {
	        return numAberturasTotal;
	    }
	}
