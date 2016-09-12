/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro1;
import java.util.ArrayList;
/**
 *
 * @author thomas
 */
public class Test {
    
   public ArrayList weightObject;
   public ArrayList valueObject;
   public int nbOject;
   public int maxWeight;
   private final double beta;
    
    
    public Test(ArrayList wObject, ArrayList valObject, int nbObj, int maximumW){
        
        this.weightObject = wObject;
        this.valueObject = valObject;
        this.nbOject = nbObj;
        this.maxWeight = maximumW;
        this.beta = (double)(int)valueObject.get(valueObject.size()-1)/(int)(weightObject.get(weightObject.size()-1));
        
         
    }
    
    public double getBeta(){
        
        return this.beta;
    }
    
    public ArrayList getVObject(){
        
        return this.valueObject;
    }
    
    public void setVObject(ArrayList newValues){
        
        this.valueObject = newValues;
    }
    public ArrayList getWObject(){
        
        return this.weightObject;
    }
    
    public void setWObject(ArrayList newWghtObject){
        
        this.weightObject = newWghtObject;
    }
    
    public int getMawWeight(){
        
        return this.maxWeight;
    }
    public void setMaxWeight(int nwMaxWeight){
        
        this.maxWeight = nwMaxWeight;
    }
       
    
    public int getNbObj(){
        
        return this.nbOject;
    }
    
    public void setNbObj (int nvObj){
        
        this.nbOject = nvObj;
    }
    
    
    public String _ToString(){
        
     return Integer.toString(this.nbOject);
        
    }
    
   // public function double (int[]){
        
     //   return 
    //}
}
