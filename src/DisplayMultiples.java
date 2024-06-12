import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       System.out.print("Escreva um numero: ");
     Scanner console = new Scanner(System.in);
	int x = console.nextInt();
        for(int i = 12; i >= 0; i--) {
            System.out.print((i*x) + " "); 
        }
    }

}
