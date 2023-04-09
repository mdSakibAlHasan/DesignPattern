package workshop;

/**
 * Requirements:
 * For factor of three print Fizz instead of the number
 * For factor of five print Buzz instead of the number
 * For numbers which are factors of both three and five print FizzBuzz instead of the number
 */
public class FizzBuzz {

    public static boolean isDivideable(int number, int divisor)
    {
    	if (number % divisor == 0) 
            return true;
        else
            return false;
    }
       	
}
