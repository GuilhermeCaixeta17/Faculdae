/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emsalahashmap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.Map;


/**
 *
 * @author Caixeta
 */
public class EmSalaHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	        
                //<String, Integer> veiculos = new HashMap();
                Map<String, Integer> veiculos = new Hashtable();
                //TreeMap<String, Integer> veiculos = new TreeMap();
                // Add some vehicles.
	        veiculos.put("BMW", 5);
                veiculos.put("Mercedes", 3);
                veiculos.put("Audi", 4);
	        veiculos.put("Ford", 10);
                veiculos.put("Honda", 20); //hashtable = testar com valor null
                veiculos.put("Hyundai", 12); //hashtable = testar com chave null
                veiculos.put("Fiat", 7);
                //veiculos.put(null, 30);
	        System.out.println("Total de carros: " + veiculos.size());
	        // Iterate over all vehicles, using the keySet method.
	        for(String chave: veiculos.keySet())
	            System.out.println(chave + " - " + veiculos.get(chave));
                for(int valor: veiculos.values())
	            System.out.println(valor + " - " + veiculos.get(valor));
	        System.out.println();
	        String busca = "Audi";
	        if(veiculos.containsKey(busca))
	            System.out.println("Encontrados " + veiculos.get(busca) + " carros " + busca + " !\n");
               

                //Testar com TreeMap SOMENTE
               // System.out.println("Chave maior: " + veiculos.lastKey());
               // System.out.println("Chave menor: " + veiculos.firstKey());
	        // Clear all values.
	        veiculos.clear();
	        // Equals to zero.
	        System.out.println("Apagando mapa, tamanho: " + veiculos.size());
    }
    
}
