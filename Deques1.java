/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deques;
import java.util.Iterator;
import java.util.Deque;
import java.util.ArrayDeque;

public class Deques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayDeque<Integer> dados = new ArrayDeque();
       int y;
       
       dados.addFirst(20);
       dados.addFirst(100);
       dados.addLast(30);
       dados.addLast(2);
       dados.addFirst(50);
       System.out.println(dados);
       for (int x: dados)
       {
           System.out.print(x + " ");
       }
       System.out.println("");
       dados.offerFirst(1000);
       dados.offerLast(2000);
       System.out.println(dados);
       y=dados.pollFirst();
       System.out.println(dados);
       y=dados.pollLast();
       System.out.println(dados);
       System.out.println("Inicio: " + dados.peekFirst());
       System.out.println("Fim: " + dados.getLast());
       Iterator it = dados.iterator();
       while (it.hasNext())
       {
           System.out.print(it.next() + " ");
       }
        System.out.println("");
       Iterator it2 = dados.descendingIterator();
       while (it2.hasNext())
       {
           System.out.print(it2.next() + " ");
       }
    }
    
}
