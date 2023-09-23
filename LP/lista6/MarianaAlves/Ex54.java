/*
 * Ex54.java
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

public class Ex54
{
    public static void main(String[] args) 
    {
        Scanner read = new Scanner (System.in);

        //variáveis
        int
        numNext = 1,
        numBef = 0,
        item,
        aux = 0;

        System.out.print("Termo inicial: ");
        int init = read.nextInt();

        //espaçamento
        System.out.println(" ");

        System.out.print("Termo final: ");
        int end = read.nextInt();

        //array que vai armazenar os itens da sequência.
        int [] sequencia = new int [end];

        sequencia[0] = 0; sequencia[1] = 1;

        for(int i = 2; i < end; i++)
        {
            item = numBef + numNext;
            sequencia[i] = item;
            
            aux = numNext;
            numNext += numBef;
            numBef = aux;
        }

        for(int k = init - 1; k < end; k++)
        {
            System.out.print(" " + sequencia[k]);
        }

    }
}
