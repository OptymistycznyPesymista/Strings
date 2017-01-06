/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyfrywciagutekstowym;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class CyfryWCiaguTekstowym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);    
        System.out.println(" Podaj ciag znakow");
        String napis = odczyt.nextLine();
        
        int suma=0;
        
        for (int i=0; i<napis.length();i++){
            
            {
            if (napis.charAt(i)=='1')
                suma=suma+1;
             if (napis.charAt(i)=='2')
                suma=suma+2;
               if (napis.charAt(i)=='3')
                suma=suma+3;
                 if (napis.charAt(i)=='4')
                suma=suma+4;
                   if (napis.charAt(i)=='5')
                suma=suma+5;
                     if (napis.charAt(i)=='6')
                suma=suma+6;
              if (napis.charAt(i)=='7')
                suma=suma+7;
                if (napis.charAt(i)=='8')
                suma=suma+8;
                  if (napis.charAt(i)=='9')
                suma=suma+9;}}
        System.out.println(suma);
                  
        
        }
    
    }
    

