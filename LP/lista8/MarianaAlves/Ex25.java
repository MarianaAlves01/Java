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
		
		int size = (int) (Math.random() * 10 + 1);
		
        int[] AF = new int[size];
        
        for (int i = 0; i < AF.length; i++) 
        {
            System.out.printf("[%d] = ", i);
            AF[i] = read.nextInt();
        }
        
        //contando os números pares
        int cont = 0;
        for (int i = 0; i < AF.length; i++) 
        {
            if (AF[i] % 2 == 0) 
            {
                cont++;
            }
        }
        
        int qtdpares = cont;
        
        //contando os números ímpares
        int cont2 = 0;
        for (int i = 0; i < AF.length; i++) 
        {
            if (AF[i] % 2 != 0) 
            {
                cont2++;
            }
        }
        int qtdimpares = cont2;
        
        //distribuindo em suas respectivas "classes"
        int [] par = new int [qtdpares]; int [] impar = new int [qtdimpares];
        int aux = 0, aux2 = 0;
        
        for(int i = 0; i < AF.length; i++)
        {
			if (AF[i] % 2 == 0) 
            {
                par[aux++] = AF[i];
            }
            else
            {
				impar[aux2++] = AF[i];
			}
		}
		
		//impar em ordem crescente
		int xa, xe;
		
        for (int i = 0; i < impar.length; i++) {
            for (int j = i + 1; j < impar.length; j++) {
                if (impar[i] > impar[j]) {
                    xa = impar[j];
                    impar[j] = impar[i];
                    impar[i] = xa;
                }
            }
        }
        
        //par em ordem decrescente
        for (int i = 0; i < par.length; i++) {
            for (int j = i + 1; j < par.length; j++) {
                if (par[i] < par[j]) {
                    xe = par[j];
                    par[j] = par[i];
                    par[i] = xe;
                }
            }
        }
        
        //concatenando os dois
        int xi = 0;
        for (int i = 0; i < impar.length; i++) 
        {
            AF[xi++] = impar[i];
        }
        for (int i = 0; i < par.length; i++) 
        {
            AF[xi++] = par[i];
        }
        
        //exibindo o vetor
		for (int num : AF) 
		{
			System.out.printf("[%d] ", num);
		}	
        
	}
}

