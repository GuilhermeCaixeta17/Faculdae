/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication81;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Caixeta
 */
public class MapasEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Map<Integer,String> lojas = new HashMap();
      Set<Entry<Integer,String>> consulta = lojas.entrySet();
      
      lojas.put(5,"Anápolis");
      lojas.put(10,"Luziânia");
      lojas.put(2,"Jataí");
      lojas.put(1, "Goianésia");
      lojas.put(3,"Catalão");
      
      Iterator it = consulta.iterator();
      while (it.hasNext())
      {
          Entry<Integer,String> entrada =(Entry) it.next();
          System.out.println("Chave: " + entrada.getKey() + "\t" + entrada.getValue());
      }
      for (Integer chave: lojas.keySet())
      {
          System.out.println("Chave: " + chave + "\tValor:" + lojas.get(chave));
      }
      for (String valor: lojas.values())
      {
          System.out.println("Valor:" + valor + "\tChaves:" + lojas.get(valor));
      }
    }
    
}
