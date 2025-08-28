/**
 * 
 */
package Tarefa_05_2;

import java.util.Arrays;
/**
 * Ex.max
 */
public class Tarefa_05_2 {

	
	public static void main(String[] args) {
	
		int [] L = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};
		
		int maior = Arrays.stream(L).max().getAsInt();
		
		System.out.println("O maior número é: " + maior);
		
		
	}

}
