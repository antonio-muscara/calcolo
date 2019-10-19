
// Calcoliamo area e perimetro di un rettangolo,
// con un metodo apposito.


import java.util.Scanner;

public class Calcolo {

    public static void main(String[] args) {
  
            int b, h, area, perimetro;
            Scanner tastiera = new Scanner(System.in);
            
            System.out.print("Inserisci la base: ");
            b = tastiera.nextInt();
            System.out.print("Inserisci l'altezza: ");
            h = tastiera.nextInt();
           
            System.out.println("Area: " + calcolo(b, h, 'a')); 
            System.out.println("Perimetro: " + calcolo(b, h, 'p'));
                
    }
    
    public static int calcolo(int b, int h, char c) {
        
        // se mettiamo l'istruzione break; 
        // il compilatore si accorge del dead code.
        switch (c) {
            case 'p': return 2 * (b + h); // break;
            case 'a': return b * h; // break;
            default : return 0; // break; 
        }
    }
}