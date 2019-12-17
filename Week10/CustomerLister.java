/**
 * Auto Generated Java Class.
 */
public class CustomerLister {
  
  
  public static void main(String[] args) { 
    
    String [] names = {"Cathy", "Ben", "Jorge", "Wanda", "Feddie"};
    
    Printname(names);
    
  }
  
  public static void Printname( String temp[]){
  
    for(int i = 0; i < temp.length; i++){
    
      System.out.println(temp[i] + "  " + i);
    }
  
  }
  
}
