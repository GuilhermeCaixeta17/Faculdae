/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respostas;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Caixeta
 */
public class Exercicio02 {
    public static void main(String[] args) {
         TreeMap<Integer,String> cidades = new TreeMap();
    
         cidades.put(59,"Anápolis");
         cidades.put(199,"Luziânia");
         cidades.put(321,"Jataí");
         cidades.put(177,"Goianésia");
         cidades.put(261,"Catalão");
         System.out.println("Cidade com distância maior que 150 Km: ");
         for (Integer chave: cidades.keySet())
         {
             if (chave.compareTo(150)>0)
             {
                 System.out.println(cidades.get(chave) + "(" + chave + " Km)");
             }
         }
         
         
    }
}
