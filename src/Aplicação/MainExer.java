package Aplicação;

import java.util.Scanner;

import entities.Quartos;

public class MainExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		
		Quartos[] vect = new Quartos[10];
		
		System.out.print("Quantos quartos quer alugar?: ");
		int n = input.nextInt();
		
		
		
		for (int i = 1; i < n; i++) {
			System.out.println();
			System.out.println("Aluguel #" +i + ":");
			System.out.println("Nome: ");
			input.nextLine();
			String nome = input.nextLine();
			System.out.println("Email: ");
			String email = input.nextLine();
			System.out.println("Quarto: ");
			int quarto = input.nextInt();
			vect[quarto] = new Quartos(nome, email);
			
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		for(int i = 0; i < 10; i++) {
			if (vect != null) {
				System.out.println(i+ ":" + vect[i]);
			}
		}
		input.close();

	}

}
