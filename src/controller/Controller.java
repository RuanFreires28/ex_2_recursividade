package controller;

public class Controller 
{	
	public Controller() 
	{
		super();
	}
	
	public int MostraMenor (int[] vet, int tamanho, int menor) {
		// CONDIÇÃO DE PARADA.
		if (tamanho == 0) 
		{ 
			return menor;
		}
		//  CHAMADA DE PASSOS
		else if (vet[tamanho-1] < menor)
		{
			menor = vet[tamanho-1];
		}
			return MostraMenor(vet, tamanho-1, menor);
		}
}