/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofilacircular;

/**
 *
 * @author Caixeta
 */
public class ProjetoFilaCircular {


    public static void main(String[] args) {
        int t=5;
        FilaCircular fila = new FilaCircular(t);
        int i;
        Object x;
        
        fila.imprimir();

        for (i=0;i<t;i++)
          fila.add(i+10);
        
        fila.imprimir();
       System.out.println("Removido:" + fila.del());
       fila.imprimir();
       fila.add(1000);
       System.out.println("Removido:" + fila.del());
       fila.imprimir();
       fila.add(2000);
       fila.imprimir();     
       System.out.println("Removido:" + fila.del());
       System.out.println("Removido:" + fila.del());
       System.out.println("Removido:" + fila.del());
       fila.imprimir();
       fila.add(3000);
       fila.imprimir();
       System.out.println("Removido:" + fila.del());
       System.out.println("Removido:" + fila.del());
       fila.imprimir(); 
       System.out.println("Removido:" + fila.del());
       fila.imprimir(); 
       fila.add(4000);
       fila.imprimir(); 
       fila.add(5000);
       fila.add(6000);
       fila.add(7000);
       fila.imprimir(); 
       fila.add(8000);
       fila.imprimir();  
             fila.add(9000);
    }

    
    
}
