/*
 * Ex29.java
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

public class Ex29 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		int a = 10;
		
		int [] AJ = new int[a];
		
		//preenchendo AJ com números aleatórios
        for (int i = 0; i < AJ.length; i++) 
        {
            AJ[i] = (int) (Math.random() * 9 + 1);
        }
        
        int rest = a / 2;
        int life = a / 2;
        
        boolean shoot = false;
        
        while (!shoot && rest >= 0) 
        {
            System.out.printf("\n\nTente acertar um número do vetor [%d/%d]: ", rest, life);
            int chance = read.nextInt();
            
            for (int i = 0; i < AJ.length; i++) 
            {
                if (chance == AJ[i]) 
                {
                    System.out.println("Você acertou!");
                    
                    //exibindo vetor
                    System.out.print("\nVetor: ");
                    for(int num : AJ)
                    {
						System.out.printf("[%d] ", num);
					}
					
                    shoot = true;
                    break;
                }
            }
            rest--;
        }
        
        
	}
}

