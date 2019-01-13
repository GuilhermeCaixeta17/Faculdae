/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao03;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        Scanner lerPlaca=new Scanner (System.in);
        int i;
        char opcao='s';
        String placa;
        Queue<String> estacionamento = new LinkedList();
        
        estacionamento.add("PRB-1234");
        estacionamento.add("XCR-7777");
        estacionamento.add("FGT-2020");
        estacionamento.add("TYU-0007");
        estacionamento.add("XCD-1010");
        estacionamento.add("QWE-1254");
        estacionamento.add("TYU-6463");
        estacionamento.add("PRT-9284");
        estacionamento.add("PED-8129");
        estacionamento.add("QWC-1232");
        System.out.println("ESTACIONAMENTO:");
        System.out.println(estacionamento);
        while (Character.toUpperCase(opcao)=='S')
        {
           
              System.out.println("Digite a placa do carro: ");
              placa=lerPlaca.next();  
              if (estacionamento.contains(placa)==false)
                  System.out.println("Carro não encontrado.");
              else
              {  
                 while (!estacionamento.element().equals(placa))
                {
                          estacionamento.add(estacionamento.remove());
                 }
                  estacionamento.remove(); 

              }
              System.out.println("ESTACIONAMENTO:");
              System.out.println(estacionamento);
              System.out.println("Deseja continuar? [s/n]");
              opcao=lerPlaca.next().charAt(0);
              
        }
        
                
                
                
          
        
    }
    
}
