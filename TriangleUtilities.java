 

public class TriangleUtilities {
 public static String getRow(int numberOfStars) {
       
       String output ="";
        for (int i=0; i<= numberOfStars; i++){
            output += "*";
            }
            return output ;   
     
    
        }public static String getTriangle(int numberOfRows) {
        String output ="";
        for (numberOfRows =1; numberOfRows<= 3; numberOfRows++){
            
            
            for (int r=1; r<= numberOfRows; r++){
               output += '*'; 
              output += "\n";
              
              
             
            }
            
          
    }return output;

   }public static String getSmallTriangle() {
       String output ="";
        for (int i=1; i<= 4; i++){
            
            
            for (int r=1; r<= i; ++r){
                
             output += "*"; 
              
             
            } 
            output += "\n";
              
         
    }  return output;
   } public static String getLargeTriangle() {
         String output ="";
        for (int i=1; i<= 9; i++){
            
            
            for (int r=1; r<= i; r++){
              output += "*";
              
              
             
            } 
             output += "\n";  
         
    }  return output;
    
   } 
}