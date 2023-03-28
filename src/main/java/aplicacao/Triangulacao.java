package aplicacao;

public class Triangulacao {
	
	public static String equilatero(int a, int b, int c) {
		if(a == b && a == c && c == a) {
		return "Equilatero";}
		else {
			return "";
		}
	} 
	public static String isosceles(int a, int b, int c) {
		if(a == b || a == c) {
		return "Isosceles";}
		else {
			return"";
		}
	}
	public static String escaleno(int a, int b, int c) {
		if(a != b && a != c && b != c) {
		return "Escaleno";}
		else {
			return "";
		}
	}
}
