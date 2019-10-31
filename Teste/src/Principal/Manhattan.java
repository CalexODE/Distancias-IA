package Principal;

import java.util.Random;

public class Manhattan {
	
	
	private int array1[][] = new int[100][100];
	private int array2[] = new int[100];
	private double distancias[] = new double[100];
	
	
	
	public Manhattan() {
		Random r = new Random();
		for (int i = 0; i < 100; i++)
		{
			for(int j = 0; j < 100; j++)
			{
				array1[i][j] = Math.abs(r.nextInt()) % 10;
			}
		}
		for (int i = 0; i < 100; i++)
		{ 
			array2[i] = Math.abs(r.nextInt()) % 10;
		}
	}

	public Manhattan(int[][] array1, int[] array2) {
		this.array1 = array1;
		this.array2 = array2;
	}
	
	public void calcularDistacia() {
		double soma = 0;
		
		for (int j = 0; j < 100; j++) 
		{
			soma = 0;
			for(int k = 0; k < 100; k++)
			{
				soma += Math.abs(array1[j][k] - array2[k]);
			}
			distancias[j] = soma;
			
		}
		
	}
	
	public void menorDistacia()
	{
		double menor = distancias[0];
		int posicao = 0;
		
		for(int i = 0; i < 100; i++) 
		{
			if(menor > distancias[i]) {
				menor = distancias[i];
				posicao = i;
			}
		}
		System.out.println("Manhattan -> Maior: "+menor+" Posicão: "+posicao);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		int array1[][] = new int[100][100];
		int array2[] = new int[100];
		
		double distancias[] = new double[100];
		
		Random r = new Random();
		for (int i = 0; i < 100; i++)
		{
			for(int j = 0; j < 100; j++)
			{
				array1[i][j] = Math.abs(r.nextInt()) % 10;
			}
		}
		for (int i = 0; i < 100; i++)
		{ 
			array2[i] = Math.abs(r.nextInt()) % 10;
		}
		
		
		
		
		
		double soma = 0;
		
		for (int j = 0; j < 100; j++) 
		{
			soma = 0;
			for(int k = 0; k < 100; k++)
			{
				soma += Math.abs(array1[j][k] - array2[k]);
			}
			distancias[j] = soma;
			System.out.println(distancias[j]);
		}
		
		
		
		for (int j = 0; j < 100; j++)
		{
			System.out.println(distancias[j]);
		}
		
		
		
		
		double menor = distancias[0];
		int posicao = 0;
		
		for(int i = 0; i < 100; i++) 
		{
			if(menor > distancias[i]) {
				menor = distancias[i];
				posicao = i;
			}
		}
		System.out.println("Maior: "+menor+" Posicão: "+posicao);
	}
}
