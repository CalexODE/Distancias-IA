package Principal;

import java.util.Random;

public class Chebychev {

	private int array1[][] = new int[100][100];
	private int array2[] = new int[100];
	private double distancias[] = new double[100];
	private double distanciasLocal[] = new double[100];
	
	
	public Chebychev() {
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

	public Chebychev(int[][] array1, int[] array2) {
		this.array1 = array1;
		this.array2 = array2;
	}
	
	public void calcularDistacia() {
		for (int j = 0; j < 100; j++) 
		{
			for(int k = 0; k < 100; k++)
			{
				distanciasLocal[k] = array2[k] - array1[j][k];
			}
			distancias[j] = distanciasLocal[0];
			for(int i = 0; i < 100; i++)
			{
				if(distancias[j] < distanciasLocal[i])
				{
					distancias[j] = distanciasLocal[i];
				}
			}
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
		System.out.println("Chebychev -> Maior: "+menor+" Posicão: "+posicao);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		int array1[][] = new int[100][100];
		int array2[] = new int[100];
		
		double distancias[] = new double[100];
		double distanciasLocal[] = new double[100];
		
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
		
		
		
		
		
		//double soma = 0;
		
		for (int j = 0; j < 100; j++) 
		{
			//soma = 0;
			for(int k = 0; k < 100; k++)
			{
				distanciasLocal[k] = array2[k] - array1[j][k];
			}
			distancias[j] = distanciasLocal[0];
			for(int i = 0; i < 100; i++)
			{
				if(distancias[j] < distanciasLocal[i])
				{
					distancias[j] = distanciasLocal[i];
				}
			}
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
