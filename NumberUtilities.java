


public class NumberUtilities {

    public static String getRange(int stop) {
        int counter = 0; 
        String output= "";
        while (counter < stop) {
            output += counter;
            counter++; }
        
        
        return output;
    }

    public static String getRange(int start, int stop) {
        int counter = 0; 
        String output= "";
        while (counter < stop) {
            output += counter;
            counter++; }
        
        
        return output;
    }


    public static String getRange(int start, int stop, int step) {
        int counter = 0; 
        String output= "";
        while (counter < stop) {
            output += counter;
            counter+= step; }
        
        
        return output;
    }

    public static String getEvenNumbers(int start, int stop) {
       int counter = 0; 
        String output= "";
        while (counter < stop) {
            output += counter;
            counter= counter + 2; }
        
        
        return output;
    }


    public static String getOddNumbers(int start, int stop) {
        int counter = 1; 
        String output= "";
        while (counter < stop) {
            output += counter;
            counter= counter + 2; }
        
        
        return output;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        
        String output= "";
        for (  int n = start; n <= stop; n++) {
         output += (int)Math.pow(n,exponent) ;  
        
        //1*3, , 3+3,4+3   13
    
    
}return output;
}
}


