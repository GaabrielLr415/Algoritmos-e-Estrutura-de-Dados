/**
 * 
 */
package Tarefa_05;

import java.util.Arrays;
/**
 * Tarefa_05 - Ex. min 
 */
public class Tarefa_05 {

	
	public static void main(String[] args) {
		
		int [] d = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};
		
		int menor = Arrays.stream(d).min().getAsInt();
		
	System.out.println("O menor número é: " + menor);
		
		
		
	}

}
