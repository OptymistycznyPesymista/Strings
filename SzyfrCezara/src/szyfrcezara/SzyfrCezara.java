/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szyfrcezara;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class SzyfrCezara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner odczyt = new Scanner(System.in);
        System.out.println(" Podaj ciąg znakow skladajacych sie z malych liter");
        String napis = odczyt.nextLine();    
       System.out.println(" Podaj o ile chcesz przesunąć");
       int n=odczyt.nextInt();
       char znak;
       
       for (int i=0; i<napis.length(); i++){
           znak = napis.charAt(i);
           if(znak>='a'&& 'z'>znak)
           { znak=(char)(znak+n);
       }
           if (znak>='z'){
          
               znak='a';
               znak= (char)(znak+n);}
          
                  
               System.out.print(znak); 
    
    
    
    
    
    
    
    }
 System.out.println();   
}
}
 