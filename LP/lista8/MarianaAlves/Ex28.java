/*
 * Ex28.java
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


public class Ex28 
{
	public static void main (String[] args) 
	{
		//variáveis
		int a = 10;
		int b = 5;
		
		//vetores
        int[] AH = new int[(int) (Math.random() * a + 1)];
        int[] AI = new int[(int) (Math.random() * b + 1)];
        
        
        //preenchendo AH com números aleatórios
        for (int i = 0; i < AH.length; i++) 
        {
            AH[i] = (int) (Math.random() * a + 1);
        }
        
        
        //preenchendo AI com números aleatórios
        for (int i = 0; i < AI.length; i++) 
        {
            AI[i] = (int) (Math.random() * b + 1);
        }
       
        
        //exibindo AH
        System.out.print("Vetor AH: ");
        for(int n1 : AH)
        {
			System.out.printf("[%d] ", n1);
		}
        
       
        //exibindo AI
        System.out.print("\n\nVetor AI: ");
        for(int n2 : AI)
        {
			System.out.printf("[%d] ", n2);
		}
		
		
		//intercalando os vetores
		int size = AH.length + AI.length;
		int i = 0;
        int j = 0;
        int k = 0;
        int [] uniao = new int[size];
        
       
        while (i < AH.length && j < AI.length) 
        {
            uniao[k++] = AH[i++];
            uniao[k++] = AI[j++];
        }
        
        while (i < AH.length) 
        {
            uniao[k++] = AH[i++];
        }
        
        while (j < AI.length) 
        {
            uniao[k++] = AI[j++];
        }
		
		//exibindo os valores intercalados
        System.out.print("\n\nVetores concatenados: ");
        for(int n3 : uniao)
        {
			System.out.printf("[%d] ", n3);
		}
		
		
	}
}

