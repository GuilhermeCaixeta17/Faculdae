/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deques;
import java.util.Iterator;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Collections;
import java.lang.Character;

public class Deques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Deque<Character> dados = new ArrayDeque();
       char y;
       int i;
       String palavra = "j9i8h7g6f5e4d3c2b1a0";
       for (i=1;i<=palavra.length();i++)
           dados.addLast(palavra.charAt(i-1));
       
       
       Iterator it = dados.iterator();
       while (it.hasNext())
       {
          y=(char)it.next();
          if (Character.isLetter(y))
           System.out.print(y + " ");
       }
       System.out.println("");
       Iterator it2 = dados.descendingIterator();
       while (it2.hasNext())
       {
           y=(char)it2.next();
           if (Character.isDigit(y))
              System.out.print(y + " ");
       }
       
    }
    
}
