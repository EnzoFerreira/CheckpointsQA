package aplicacao;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ola usuario, vamos classificar seus valores em um triangulo correspondente!");
		System.out.println("Digite o primeiro valor:");
		int l1 = input.nextInt();
		System.out.println("Digite o segundo valor:");
		int l2 = input.nextInt();
		System.out.println("Digite o terceiro valor:");
		int l3 = input.nextInt();
		
		String tipoTriangulo="";
		if(Triangulacao.equilatero(l1, l2, l3).equals("Equilatero")) {
			tipoTriangulo = "Equilatero";
		}else if(Triangulacao.isosceles(l1, l2, l3).equals("Isosceles"))
			tipoTriangulo = "Isosceles";
		else if(Triangulacao.escaleno(l1, l2, l3).equals("Escaleno")) {
			tipoTriangulo ="Escaleno";
		}
		System.out.println("Triangulo do tipo "+tipoTriangulo);
		input.close();
	}

}
