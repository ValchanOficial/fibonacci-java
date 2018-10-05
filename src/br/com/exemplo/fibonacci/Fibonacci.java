package br.com.exemplo.fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		
		String seq = "Sequência de Fibonacci: ";
		for(int a=0, b=1, i=0; i<19; b+=a, a=b-a, i++) {
			seq += (a + ", ");
		}
		System.out.println(seq + "...");
    }
}