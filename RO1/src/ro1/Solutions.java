/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author thomas
 */
public class Solutions {
    
    Test Montest;
    
     public void loadFile(){
        
       try {
          
           FileReader fr = new FileReader("valeurs.txt");
           BufferedReader br = new BufferedReader(fr);
           
           
           while (br.ready())
               {
                    int nbObject = Integer.parseInt(br.readLine());
                    
                    String[] lignevalObj = br.readLine().split(" ");
                    ArrayList valObj = new ArrayList();
                    for(String s : lignevalObj) {
                        valObj.add(Integer.parseInt(s));
                        
                    }
                    
                    String[] wLine = br.readLine().split(" ");
                    ArrayList weightOb = new ArrayList();
                    for(String s : wLine) {
                        weightOb.add(Integer.parseInt(s));
                        
                    }
                    
                    int maxW = Integer.parseInt(br.readLine());
                    
               Montest = new Test(weightOb,valObj ,nbObject,maxW);
               }
           
           
               }
            catch(IOException e){
           
         System.out.println ("Erreur lors de la lecture : " + e.getMessage());   
       }
           
       }
               
               
         public void calcul(int array[]){
               
             int sommeValue = 0 ; 
             int sommeWeight=0;
             
             for (int i = 0 ;  i<array.length;i++)
             {
                 if (array[i] == 1){
                     
                    sommeWeight = (int)Montest.getWObject().get(i)+sommeWeight; 
                    sommeValue = (int)Montest.getVObject().get(i)+sommeValue; 
                 }
                
             }
            
             
             if (sommeWeight > Montest.getMawWeight()){
                 
            double calcul = sommeValue - Montest.getBeta()*(sommeWeight-Montest.getMawWeight());
             System.out.println(calcul);     
                 
             }
             else {
               System.out.println(sommeValue);   
                 
             }
              
               } 
       
       }

        
        
    
    
    
    
    
    
    
    

