package exercises;
import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dfr;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dfr = A * B - C * D;
		
		
		System.out.println("O resultado da diferenca é de: " + dfr);
		

	}

}
