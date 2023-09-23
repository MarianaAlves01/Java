/*
 * Ex25.java
 * 
 * Copyright 2022 Mariana Alves <Mariana Alves@DESKTOP-BDG0JMS>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;

public class Ex25 
{
	public static void main (String[] args) 
	{
		
		Scanner read = new Scanner (System.in);
		
		String senha ;
		
		//variáveis
		int letras = 0;
		int numeros = 0;
		int simbolos = 0;
		int tamanho;
		boolean aprove = true;

		do
		{
			System.out.print("Crie uma senha: ");
			senha = read.nextLine();
			tamanho = senha.length();
			
			//verificação de cada caractér da senha
			for(int i = 0; i < tamanho; i++)
			{
				//contando a quantidade de letras
				if( ( (senha.charAt(i) >= 'a') && (senha.charAt(i) <= 'z') ) || ( (senha.charAt(i) >= 'A') && (senha.charAt(i) <= 'Z') ) )
				{
					letras++;
				}
				
				//contando a quantidade de números
				if( (senha.charAt(i) >= '0') && (senha.charAt(i) <= '9') )
				{
					numeros++;
				}
				
				//contando a quantidade de caracteres especiais
				if( (senha.charAt(i) == '!') || (senha.charAt(i) == '@') || (senha.charAt(i) == '#') || (senha.charAt(i) == '$') || (senha.charAt(i) == '%') || (senha.charAt(i) == '&') || (senha.charAt(i) == '*') || (senha.charAt(i) == '(') || (senha.charAt(i) == ')') || (senha.charAt(i) == '+') )
				{
					simbolos++;
				}
			}
			
			//fazendo verificação da senha
			if( (tamanho < 10) || (letras < 3) || (numeros < 3) || (simbolos < 2) )
			{
				aprove = false;
			}
			else
			{
				aprove = true;
			}
			
			//exibindo as regras
			System.out.println("\nREGRAS \n"+
							   "Tamanho 10: " + tamanho + ((tamanho < 10)? " (x) ":" (ok) ") + "\n"+
							   "Letras 3: " + letras + ((letras < 3)? " (x) ":" (ok) ") + "\n"+
							   "Números 3: " + numeros + ((numeros < 3)? " (x) ":" (ok) ") + "\n"+
							   "Símbolos 2: " + simbolos + ((simbolos < 2)? " (x) ":" (ok) ") + "\n");
			
			//exibindo o resultado
			System.out.print("\nSenha " + ((aprove == true)?"aprovada! Parabéns." : "reprovada! Tente novamente." ) + "\n\n");
			
			
		}while(aprove == false);
		
	}
}

