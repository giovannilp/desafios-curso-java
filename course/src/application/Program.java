package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {
	
	/* 	Fazer um programa para ler os valores da largura e altura
		de um retângulo. Em seguida, mostrar na tela o valor de
		sua área, perímetro e diagonal. Usar uma classe como
		mostrado no projeto ao lado.
		
		Enter rectangle width and height:
		3.00
		4.00
		AREA = 12.00
		PERIMETER = 14.00
		DIAGONAL = 5.00
	*/

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();
	}

}
