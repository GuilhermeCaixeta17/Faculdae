/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respostas;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;


/**
 *
 * @author Caixeta
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer,String> lojas=new HashMap();
        Set<Entry<Integer,String>> consulta = lojas.entrySet();
        
        lojas.put(5,"Anápolis");
        lojas.put(10,"Luziânia");
        lojas.put(2,"Jataí");
        lojas.put(1,"Goianésia");
        lojas.put(3,"Catalão");
        
        Iterator it = consulta.iterator();
        
        while (it.hasNext())
        {
            Entry<Integer,String> entrada = (Entry)it.next();
            System.out.println("Chave: " + entrada.getKey() + "\tValor: " + entrada.getValue());
        }
                
    }
    
}
