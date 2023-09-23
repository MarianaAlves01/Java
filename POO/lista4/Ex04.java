// Mariana Alves - F2211313

import java.util.Scanner;
import java.util.Arrays;

public class Ex04 
{	
	public static void main (String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		
		double [] n = new double [3];
		
		//inserindo as notas
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Entre com a nota " + (i+1) + " : ");
			n[i] = sc.nextDouble();
			
			//fazendo a validação da nota inserida
			if(n[i] < 0.0 || n[i] > 10.0) 
			{
                n[i] = 0.0;
            }
			
		}
		
		System.out.println(calcularNotas(n));
		
		
	}
	
	private static String calcularNotas(double n[]) 
	{
        Arrays.sort(n);
        
        double maior = n[2];
        double menor = n[0];
        double media_maior = (n[2] + n[1])/2;
        double media = (n[0] + n[1] + n[2])/3; 
        
        return String.format("Média maior: %.2f\nMédia : %.2f\nMaior nota: %.2f\nMenor nota: %.2f", media_maior, media, maior, menor);
    }
}

