 
import java.util.Scanner;
public class TableUtilities {
    public static String getSmallMultiplicationTable() 
       {String output = "";
        for (int i = 1; i <= 5; i++) {
            
         //System.out.println();
         
           //System.out.format(i + "|  ");
           for (int j = 1; j <= 5; j++) {
                
                    if (i * j < 10)
                    output +=  "  " + i * j + " " + "|" ;
                else
                    output +=" "+ i * j  + " " +  "|" ;
                       
                    //System.out.format(i * j + "|  ");
                      //System.out.println();
               
                }
               output += "\n";
            
            
        }return output;
    }
    public static String getLargeMultiplicationTable() {
        String output = "";
        for (int i = 1; i <= 10; i++) {
            
         //System.out.println();
         
           //System.out.format(i + "|  ");
           for (int j = 1; j <= 10; j++) {
                
                    if (i * j < 10)
                    output +=  "  " + i * j + " " + "|" ;
                    else if (i * j > 99) 
                    output +=  i * j + " " + "|" ;
                else
                    output +=" "+ i * j  + " " +  "|" ;
                
                       
                    //System.out.format(i * j + "|  ");
                      //System.out.println();
               
                }
               output += "\n";
            
            
        }return output;
        
    }public static String getMultiplicationTable(int tableSize) {
        String output = "";
        for (tableSize= 1; tableSize <= 20; tableSize++) {
            
         //System.out.println();
         
           //System.out.format(i + "|  ");
           for (int j = 1; j <= 20; j++) {
                
                    if (tableSize * j < 10)
                    output +=  "  " + tableSize * j + " " + "|" ;
                    else if (tableSize * j > 99) 
                    output +=  tableSize * j + " " + "|" ;
                else
                    output +=" "+ tableSize * j  + " " +  "|" ;
                
                       
                    //System.out.format(i * j + "|  ");
                      //System.out.println();
               
                }
               output += "\n";
            
            
        }return output;
 }
}




/** int a;
int b;
for (a=1; a<=12; ++a)
{
    for (b=1; b<=12; ++b)
    {
        System.out.print(a*b+"  ");  
    }
    System.out.println();
}    
*/