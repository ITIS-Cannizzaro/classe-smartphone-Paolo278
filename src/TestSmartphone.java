
import java.util.Scanner;

	public class TestSmartphone {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("inserire marca smartphone: ");
	        String marca = scan.nextLine();
	        System.out.println("inserire il modello del telefono");
	        String modello = scan.nextLine();
	        System.out.println("inserire il prezzo di lancio dello smartphone");
	        double prezzoDiLancio = scan.nextDouble();
	        System.out.println("inserire il numero di pollici del smartphone");
	        double numPollici = scan.nextDouble();
	        System.out.println("inserire la ram del smartphone");
	        int ram = scan.nextInt();
	        
	        Smartphone telefono = new Smartphone(marca, modello, prezzoDiLancio, numPollici, ram);
	        System.out.println(telefono.toString());
	        Smartphone telefono1 = new Smartphone(marca, modello, numPollici, numPollici, ram);
	        System.out.println(telefono1.toString());
	    }
}