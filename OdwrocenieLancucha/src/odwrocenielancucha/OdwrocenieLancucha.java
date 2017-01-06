/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odwrocenielancucha;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class OdwrocenieLancucha {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      //Program, który wczytuje od użytkownika ciąg znaków, a następnie tworzy łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie
        
        
        Scanner odczyt = new Scanner (System.in);
        System.out.println(" Wpisz tu jakis ciag znaków ");
        String napis = odczyt.nextLine();
        
        for (int a=napis.length()-1; a>=0; a--){
          System.out.print(napis.charAt(a));
    }
    }
    
}
