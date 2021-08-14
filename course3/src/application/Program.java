package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	
	/* 	Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
		Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) 
		e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). 
		Você deve criar uma classe Student para resolver este problema.
		Exemplos:
		Entrada:          Saída
		Alex Green
		17.00			  FINAL GRADE = 52.00
		20.00			  FAILED
		15.00			  MISSING 8.00 POINTS	
*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", student.notaFinal());

		if (student.notaFinal() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.pontosFaltantes());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
