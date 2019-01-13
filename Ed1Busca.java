/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;
/**
 *
 * @author Caixeta
 */
public class Ed1Busca {

    public static void buscaVetor(Vector v, int valor)
    {
        int i;
        int contador=0;
        for (i=0;i<v.size();i++)
        {
            if (v.elementAt(i).equals(valor))
            {
                System.out.println("Elemento " + valor + " encontrado em: " + i);
                contador++;
            }
        }
        System.out.println("Itens encontrados: " + contador);
    }
        
    public static void buscaLista(ArrayList l, int valor)
    {
         int i;
        int contador=0;
        for (i=0;i<l.size();i++)
        {
            if (l.get(i).equals(valor))
            {
                System.out.println("Elemento " + valor + " encontrado em: " + i);
                contador++;
            }
        }
        System.out.println("Itens encontrados: " + contador);
    }
    
    public static void buscaFila(Queue v, int valor)
    {
        Iterator t = v.iterator();
        int i=0, contador=0;
        while (t.hasNext())
        {
            if (t.next().equals(valor))
            {
                System.out.println("Elemento: " + valor + " encontrado na posição: " + i);
                contador++;
            }
            i++;
        }
        System.out.println("Itens encontrados: " + contador);
    }
    
        public static void buscaPilha(Stack v, int valor)
    {
        Iterator t = v.iterator();
        int i=0, contador=0;
        while (t.hasNext())
        {
            if (t.next().equals(valor))
            {
                System.out.println("Elemento: " + valor + " encontrado na posição: " + i);
                System.out.println("Elemento: " + valor + " será removido da posição : " + (v.size()-i-1));
                contador++;
            }
            i++;
        }
        System.out.println("Itens encontrados: " + contador);
    }
    
      public static void buscaDequeAscendente(Deque d, int valor)
    {
        Iterator t = d.iterator();
        int i=0, contador=0;
        while (t.hasNext())
        {
            if (t.next().equals(valor))
            {
                System.out.println("Elemento: " + valor + " encontrado na posição: " + i);
                contador++;
            }
            i++;
        }
        System.out.println("Itens encontrados: " + contador);
    }  
    
    public static void buscaDequeDescendente(Deque d, int valor)
    {
        Iterator t = d.descendingIterator();
        int i=(d.size()-1), contador=0;
        while (t.hasNext())
        {
            if (t.next().equals(valor))
            {
                System.out.println("Elemento: " + valor + " encontrado na posição: " + i);
                contador++;
            }
            i--;
        }
        System.out.println("Itens encontrados: " + contador);
    } 
        
    public static void main(String[] args) {
        int n=10;
        Vector<Integer> vetor = new Vector(n);
        ArrayList<Integer> lista = new ArrayList();
        Queue<Integer> fila = new LinkedList();
        Stack<Integer> pilha = new Stack();
        Deque<Integer> deque = new ArrayDeque();
        
        Random valores = new Random();
        Scanner ler = new Scanner (System.in);
        int i;
        
        for (i=1;i<=n;i++)
        {
            vetor.add(valores.nextInt(n));
            lista.add(valores.nextInt(n));
            fila.add(valores.nextInt(n));
            pilha.push(valores.nextInt(n));
            deque.push(valores.nextInt(n));
        }
 //       System.out.println("Vetor: " + vetor);
//        System.out.println("Primeiro elemento: " + vetor.firstElement() );
//        System.out.print("Digite um numero: ");
 //       i=ler.nextInt();
//        System.out.println("Ultimo elemento: " + vetor.lastElement() );
//        System.out.println("LastIndexOf: " + vetor.lastIndexOf(i) );
//        System.out.println("IndexOf: " + vetor.indexOf(i) );
//        buscaVetor(vetor,i);
 //       System.out.println("Lista: " + lista);
 //       System.out.print("Digite um numero: ");
 //       i=ler.nextInt();
//        buscaLista(lista,i);
        
 //       System.out.println("Fila: " + fila);
//        System.out.print("Digite um numero: ");
 //       i=ler.nextInt();
//        buscaFila(fila,i);
        
        System.out.println("Pilha: " + pilha);
        System.out.print("Digite um numero: ");
        i=ler.nextInt();
        buscaPilha(pilha,i);
        
        System.out.println("Deque: " + deque);
        System.out.print("Digite um numero: ");
        i=ler.nextInt();
        buscaDequeAscendente(deque,i);
        buscaDequeDescendente(deque,i);

    }
    
}
