// Mariana Alves - F2211313

import java.util.Scanner;

public class Main 
{	
	public static void main (String[] args) 
	{		
		Scanner sc = new Scanner (System.in);
		Numero n1 = new Numero();
		
		System.out.print("informe um n�mero: ");
		n1.setNumero(sc.nextInt());
		
		System.out.printf("\nN�mero informado: %d\nForma reversa: %d", n1.getNumero(), n1.inverter());
	}
}

