package exercises;
import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int code1, quant1, code2, quant2;
		double val1, val2, total;
		
		code1 = sc.nextInt();		
		quant1 = sc.nextInt();
		val1 = sc.nextDouble();	
		
		code2 = sc.nextInt();		
		quant2 = sc.nextInt();
		val2 = sc.nextDouble();
		
		total = quant1 * val1 + quant2 * val2;
		
		System.out.println("TOTAL= U$" + total);

	}

}
