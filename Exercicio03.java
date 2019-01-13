/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respostas;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Map;
/**
 *
 * @author Caixeta
 */



public class Exercicio03 {

    public static int contador(ArrayList l, String v)
    {  
        int j;  
        j=0;  
        for(int i=0;i<l.size();i++)
        {  
               if(l.get(i)==v)
                 j++;// ELA NAO ACEITA A ATRIBUIÇÃO  
        }   
        return j;  
}  

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        ArrayList<String> lista2 = new ArrayList();
        Map<String,String> ferramentas = new Hashtable();
        
        ferramentas.put("Vermelho","martelo");
        ferramentas.put("Azul","pincel");
        ferramentas.put("Verde","martelo");
        ferramentas.put("Amarelo","alicate");
        ferramentas.put("Roxo","serrote");
        ferramentas.put("Laranja","alicate");
                
        for (String cor: ferramentas.keySet())
             lista.add(ferramentas.get(cor));
   
        for (String cor: ferramentas.keySet())
        {
            if (contador(lista, ferramentas.get(cor))>1)
                if (!lista2.contains(ferramentas.get(cor)))lista2.add(ferramentas.get(cor));
        }
        System.out.println("Ferramentas Repetidas: " + lista2);
    }
}
