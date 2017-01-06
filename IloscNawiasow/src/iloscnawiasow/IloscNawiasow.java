/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iloscnawiasow;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class IloscNawiasow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu arytmetycznym nawiasy są poprawnie sparowane
        
        Scanner odczyt = new Scanner (System.in);
        System.out.println(" Wpisz wyrażenie z nawiasami");
        String wyrazenie = odczyt.nextLine();
        int lewo=0;
        int prawo=0;
        
        for (int i=0;i<wyrazenie.length(); i++){
            
            if (wyrazenie.charAt(i)=='(')
                lewo++;
            if(wyrazenie.charAt(i)==')')
              prawo++;
    }
    if (lewo==prawo)
    {System.out.println("Prawidłowe sparowanie nawiasów");}
    else 
        System.out.println(" Błędne sparowanie nawiasów");
    
        
        
}
}