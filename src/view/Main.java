package view;

import controller.Controller;

public class Main 
{
	public static void main(String[] args) 
	{		
		Controller c = new Controller();
		int[] vet = {5, 10, 18, 3,-3, 4, 5, 2};
		int tamanho = vet.length;
		int m = c.MostraMenor(vet, tamanho, vet[tamanho-1]);
		System.out.println("O menor valor deste vetor é " + m);
			
	}	
}