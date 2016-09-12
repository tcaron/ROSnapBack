/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro1;

/**
 *
 * @author thomas
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Solutions maSolu = new Solutions();
        maSolu.loadFile();
        int arrayTest[] = {0,1,1,1,0};
        maSolu.calcul(arrayTest);
        
        
    }
    
}
