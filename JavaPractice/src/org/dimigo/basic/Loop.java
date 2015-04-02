package org.dimigo.basic;


/**
 * <pre>
 * org.dimigo.basic
 * 		|_ Loop
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 2.
 * </pre>
 *
 * @author CX61
 * @version 1.0.0
 * 
 */
public class Loop {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == j) {
					System.out.printf("*");
					continue;
				}
				System.out.print(j);
			}  
			System.out.println();
		}
	}

}
	