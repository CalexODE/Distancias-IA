package Principal;

import java.util.Random;

public class TesteDasTres {

	public static void main(String[] args) {
		int array1[][] = new int[100][100];
		int array2[] = new int[100];
		
		
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
		
		Euclidiana euc = new Euclidiana(array1, array2);
		Manhattan man = new Manhattan(array1, array2);
		Chebychev che = new Chebychev(array1, array2);
		
		euc.calcularDistacia();
		man.calcularDistacia();
		che.calcularDistacia();
		
		euc.menorDistacia();
		man.menorDistacia();
		che.menorDistacia();
		
		
	}

}
