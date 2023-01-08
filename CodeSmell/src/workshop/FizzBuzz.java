package workshop;

/**
 * Requirements:
 * For factor of three print Fizz instead of the number
 * For factor of five print Buzz instead of the number
 * For numbers which are factors of both three and five print FizzBuzz instead of the number
 */
public class FizzBuzz {
    public static String stringCatagory(int number) {       //inappropriate naming
        String strReturn = null;                            //duplicate code

        if (isDivideable(number, 15)) {
            return "FizzBuzz";
        } 
        else if(isDivideable(number, 3)){
            return "Fizz";
        }
        else if(isDivideable(number, 5)){
            return "Buzz";
        }
        else{
            return String.valueOf(number);
        }
    
    }
    
    public static boolean isDivideable(int number, int divisor)
    {
    	if (number % divisor == 0) 
            return true;
        else
            return false;
    }
       	
}
