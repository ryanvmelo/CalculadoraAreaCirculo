import java.util.Scanner;

public class CalculadoraAreaCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r;
		double pi = 3.14159;
		
		System.out.println("Digite o raio:");
		r = sc.nextDouble();
		
		double area = r*r*pi;
		System.out.printf("Área: %.5f%n", area);

	}

}
