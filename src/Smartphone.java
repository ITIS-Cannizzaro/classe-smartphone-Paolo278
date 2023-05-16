

public class Smartphone {
	
	    private String marca;
	    private String modello;
	    private double prezzoDiLancio;
	    private double numPollici;
	    private int ram;

	   public Smartphone(String marca, String modello, double prezzoDiLancio, double numPollici, int ram) {
	        this.marca = marca;
	        this.modello = modello;
	        this.prezzoDiLancio = prezzoDiLancio;
	        this.numPollici = numPollici;
	        this.ram = ram;
	    }
	   public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public String getModello() {
	        return modello;
	    }

	    public void setModello(String modello) {
	        this.modello = modello;
	    }

	    public double getPrezzoDiLancio() {
	        return prezzoDiLancio;
	    }

	    public void setPrezzoDiLancio(double prezzoDiLancio) {
	        this.prezzoDiLancio = prezzoDiLancio;
	    }

	    public double getNumPollici() {
	        return numPollici;
	    }

	    public void setNumPollici(double numPollici) {
	        this.numPollici = numPollici;
	    }

	    public int getRam() {
	        return ram;
	    }

	    public void setRam(int ram) {
	        this.ram = ram;
	    }
	    public String ottieniFasciaDiPrezzo() {
	        if (prezzoDiLancio > 500) {
	            return "fascia ALTA";
	        } else if (prezzoDiLancio >= 200 && prezzoDiLancio <= 500) {
	            return "fascia MEDIA";
	        } else {
	            return "fascia BASSA";
	        }
	    }

	    public String ottieniTipologiaSmartphone() {
	        if (numPollici < 5) {
	            return "Mini";
	        } else if (numPollici >= 5 && numPollici <= 7) {
	            return "Normal";
	        } else {
	            return "Maxi";
	        }
	    }

	  
	    public String toString() {
	        return "Marca: " + marca +
	                "\nModello: " + modello +
	                "\nPrezzo di lancio: " + prezzoDiLancio +
	                "\nNumero di pollici: " + numPollici +
	                "\nRAM: " + ram +
	                "\nFascia di prezzo: " + ottieniFasciaDiPrezzo() +
	                "\nTipologia di smartphone: " + ottieniTipologiaSmartphone();
	    }
	}

