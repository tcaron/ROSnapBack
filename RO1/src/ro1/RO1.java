/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro1;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author thomas
 */
public class RO1 {
    
    
    
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
                    
               Test Montest = new Test(weightOb,valObj ,nbObject,maxW);
               
               
             int somme=0;
              int t[] = {1,0,1,1,0};
             for (int i = 0 ;  i<t.length;i++)
             {
                 if (t[i] == 1){
                     
                    somme = (int)Montest.getWObject().get(i)+somme; 
                    
                 }
                
             }
            
             
             if (somme > Montest.getMawWeight()){
                 
                 double calcul = Montest.getBeta()*(somme-Montest.getMawWeight());
             System.out.println(calcul);     
                 
             }
             else {
               System.out.println("ok");   
                 
             }
       
               } 
       
       }
       catch(IOException e){
           
         System.out.println ("Erreur lors de la lecture : " + e.getMessage());   
       }
        
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RO1 test = new RO1();
        test.loadFile();
    }
    
}
