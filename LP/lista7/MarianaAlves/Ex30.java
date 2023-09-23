/*
 * Ex30.java
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

public class Ex30 
{	
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        int escolha = 0;
        do {
            System.out.print("Digite uma frase: ");
            String frase = scStr.nextLine().toLowerCase();
            System.out.print("Opções:\n" +
                    "1 - Criptografar\n" +
                    "2 - Descriptografar\n" +
                    "3 - Sair\n" +
                    "Escolha: ");
            escolha = sc.nextInt();

            String novaFrase = "";
            boolean encontrou = false;
            String criptografia = "abcdefghijklmnopqrstuvwxyz";
            String descriptografia = "nopqrstuvwxyzabcdefghijklm";
            switch (escolha) {
                case 1:
                    for (int i = 0; i < frase.length(); i++) {
                        encontrou = false;
                        for (int j = 0; j < criptografia.length(); j++) {
                            if (frase.charAt(i) == criptografia.charAt(j)) {
                                encontrou = true;
                                novaFrase += descriptografia.charAt(j);
                            }
                        }
                        if (!encontrou) {
                            novaFrase += frase.charAt(i);
                        }
                    }
                    System.out.println("Frase criptografada: " + novaFrase);
                    break;
                case 2:
                    for (int i = 0; i < frase.length(); i++) {
                        encontrou = false;
                        for (int j = 0; j < descriptografia.length(); j++) {
                            if (frase.charAt(i) == descriptografia.charAt(j)) {
                                encontrou = true;
                                novaFrase += criptografia.charAt(j);
                            }
                        }
                        if (!encontrou) {
                            novaFrase += frase.charAt(i);
                        }
                    }
                    System.out.println("Frase descriptografada: " + novaFrase);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
            }
        } while (escolha != 3);
        sc.close();
        scStr.close();	
	}
}

