/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Caixeta
 */
public class JavaApplication24 {

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        ArrayList<Double> lista=new ArrayList();
        int i;
        double soma=0, media=0, maior=0, elemento=0;
        
        for(i=0;i<10;i++)
        {
            System.out.print("Digite o numero " + (i+1) + ": ");
            lista.add(ler.nextDouble());
        }
        System.out.println("Lista digitada:");
        System.out.print("LISTA=[ ");
        Iterator<Double> it = lista.iterator();
        while (it.hasNext())
        {
            System.out.print(" " + it.next());
        }
        System.out.println(" ]");
        lista.set(5, 5.5);
        System.out.println("Lista digitada:");
        System.out.print("LISTA=[ ");
        it = lista.iterator();
        while (it.hasNext())
        {
            System.out.print(" " + it.next());
        }
        System.out.println(" ]");
        it=lista.iterator();
        while (it.hasNext())
        {
            elemento=it.next();
            soma=soma+elemento;
            if (elemento>maior)
                maior=elemento;
        }
        media=soma/lista.size();
        System.out.println("Media encontrada: " + media);
        System.out.println("Maior num da lista: " + maior);
        lista.clear();
        if (lista.isEmpty())
            System.out.println("\nLISTA VAZIA!");
    }
    
}
