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
public class FilaCircular {

   private Object[] Q;
   private int n;
   private int entrada;
   private int saida;
   private int contador;
   
   public FilaCircular(int tamanho)
   {
     this.n=tamanho;
     this.Q = new Object[n];
     this.entrada = this.saida = 0;
     this.contador=0;
   }

   public void add(Object v)
   {
     if(this.contador<this.n)
     {
        this.Q[this.entrada] = v;
        this.entrada = (this.entrada + 1) % n;
        this.contador++;
     }
     else
        System.out.println("Fila Cheia !");
   }
   
   public boolean EstaVazia()
   {
       if (this.contador==0)
           return true;
       return false;
            
   }

   public Object del()
   {
     Object v;
     if(!this.EstaVazia())
     {
        v = this.Q[this.saida];
        this.Q[this.saida]=null;
        this.saida = (this.saida+1)%this.n;
        this.contador--;
        return v;
     }
     else
     {
        System.out.println("Fila Vazia !");
        return null;
     }
   }

   public void imprimir()
   {
      int i, cont=0;
      if(!this.EstaVazia())
      {
         i = (this.saida) % (this.n);
	 System.out.print("[ ");
         while(cont<this.contador)
         {
            System.out.print(this.Q[i] + " ");
	    i=(i+1) % this.n;
            cont++;
         }
	 System.out.println("]");
         System.out.println("IN  : " + this.entrada);
         System.out.println("OUT : " + this.saida);
         System.out.println("CONT: " + this.contador);
      }
      else
         System.out.println("Fila Vazia !");
   }
   
   public void ApagaFila()
   {
       while (!this.EstaVazia())
           this.del();
   }
}
