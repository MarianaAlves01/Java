/*
 * Ex26.java
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

public class Ex26 
{
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		int size = (int) (Math.random() * 10 + 1);
		
        int[] AG = new int[size];
        
        for (int i = 0; i < AG.length; i++) 
        {
            System.out.printf("[%d] = ", i);
            AG[i] = read.nextInt();
        }
        
        
        //exibindo vetor
        System.out.print("\n\nVetor AG: ");
        
        for(int num : AG)
        {
			System.out.printf("[%d] ", num);
		}
		
		//obtendo a qtd de números primos
		int qtd_primos = 0;
		int n; 
		int div;
		
        for (int i = 0; i < AG.length; i++) 
        {
            n = AG[i];
            div = 0;
            
            for (int j = 1; j <= n; j++) 
            {
                if (n % j == 0) 
                {
                    div++;
                }
            }
            if (div == 2) 
            {
                qtd_primos++;
            }
        }
        
        //separando os primos dos demais
        int [] num_primos = new int[qtd_primos]; 
        int [] num_demais = new int[AG.length - qtd_primos];
        int aux_primo = 0; 
        int aux_demais = 0;
        
        for (int i = 0; i < AG.length; i++) 
        {
            int nume = AG[i];
            div = 0;
            for (int j = 1; j <= nume; j++) 
            {
                if (nume % j == 0) 
                {
                    div++;
                }
            }
            if (div == 2) 
            {
                num_primos[aux_primo++] = nume;
            } 
            else 
            {
                num_demais[aux_demais++] = nume;
            }
        }
        
        //colocando primos em ordem crescente
        int xi;
        for (int i = 0; i < num_primos.length; i++) 
        {
            for (int j = i + 1; j < num_primos.length; j++) 
            {
                if (num_primos[i] > num_primos[j]) 
                {
                    xi = num_primos[j];
                    num_primos[j] = num_primos[i];
                    num_primos[i] = xi;
                }
            }
        }
        
        //concatenando
        int xa = 0;
        for (int i = 0; i < num_primos.length; i++) 
        {
            AG[xa++] = num_primos[i];
        }
        for (int i = 0; i < num_demais.length; i++) 
        {
            AG[xa++] = num_demais[i];
        }
        
        
        
        //exibindo vetor
        System.out.print("\n\nVetor ORDENADO AG: ");
        
        for(int number : AG)
        {
			System.out.printf("[%d] ", number);
		}
        
	}
}

