/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filas;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;
import java.util.NoSuchElementException;
import java.util.Iterator;


public class Filas {


    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList();
        int i, quantidade=10;
        Random fator = new Random();
        
        for (i=0;i<quantidade;i++)
        {
            fila.add(i+1);
        }
        System.out.println("Fila:");
        System.out.println(fila);
        System.out.println("Primeiro elemento: " + fila.peek());
        System.out.println("Primeiro elemento: " + fila.element());
        System.out.println("Fila:");
        System.out.println(fila);
        System.out.println("Remover elemento: " + fila.poll());
        System.out.println("Fila:");
        System.out.println(fila);
        System.out.println("Remover elemento: " + fila.remove());
        System.out.println("Fila:");
        System.out.println(fila);
        fila.add(90);
        System.out.println("Fila:");
        System.out.println(fila);
        System.out.println("Quantidade: " + fila.size());
        System.out.println("Fila:");
        System.out.println(fila);
        if (fila.contains(60)==true)
            System.out.println("Fila contem 60.");
        else
            System.out.println("Fila não contem 60.");
        fila.clear();
        if (fila.isEmpty())
            System.out.println("FILA VAZIA!");
        if (fila.peek()==null)
            System.out.println("Não existe elemento!");
        try
        {
            fila.element();
        }catch (NoSuchElementException e)
        {
            System.out.println("Não existe elemento!");
        }
        for (i=0;i<quantidade;i++)
        {
            fila.add(fator.nextInt(quantidade)+1);
        }
        Iterator<Integer> ponteiro = fila.iterator();
        System.out.println("Fila:");
        System.out.print("[");
        while (ponteiro.hasNext())
        {
            System.out.print(ponteiro.next());
            if (ponteiro.hasNext()!= false)
                System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Fila:");
        System.out.print("[");
        for (int num: fila)
        {
                System.out.print(num + " ");
        }
        System.out.println("]");

    }
    
}
