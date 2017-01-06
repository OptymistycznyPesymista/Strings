/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilerazyostatniznak;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class IleRazyOstatniZnak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Program, który wczytuje od użytkownika ciąg znaków, a następnie wyświetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak
        
        Scanner odczyt = new Scanner (System.in);
        System.out.println(" Wpisz tu jakis ciag znaków ");
        String napis = odczyt.nextLine();
        
        int b=0;  //zmienna licząca ilość znaków 
        
        
        for (int a=0; a<napis.length();a++){
            char i;
            
            if (napis.charAt(a)==napis.charAt(napis.length()-1)){
                b++;
                
            }
                
        }
            System.out.println(b);
      }
      }

