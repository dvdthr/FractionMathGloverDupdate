import java.util.Scanner;
public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        while (true){
            userInput = input.next();
            if (userInput.equals("quit")){
                break;
            }
        }

        produceAnswer(userInput);
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    {
        Scanner foo = new Scanner(input);
        foo.useDelimiter(" ");
        String frac1 = foo.next();
        String operator = foo.next();
        String frac2 = foo.next();
        
        int wholeFrac1 = 0;
        int wholeFrac2 = 0;
        int numFrac1 = 0;
        int numFrac2 = 0;
        int denomFrac1 = 0;
        int denomFrac2 = 0;

        Scanner bar = new Scanner(frac1);
        if (frac1.contains("_")) {
            bar.useDelimiter("_");
            wholeFrac1 = bar.nextInt();
            bar.useDelimiter("/");
            numFrac1 = bar.nextInt();
            denomFrac1 = bar.nextInt();
        }
        else {
            bar.useDelimiter("/");
            numFrac1 = bar.nextInt();
            denomFrac1 = bar.nextInt();
        }

        Scanner foobar = new Scanner(frac2);
        if (frac2.contains("_")){
            foobar.useDelimiter("_");
            wholeFrac2 = foobar.nextInt();
            foobar.useDelimiter("/");
            numFrac2 = foobar.nextInt();
            denomFrac2 = foobar.nextInt();
        }
        else {
            foobar.useDelimiter("/");
            numFrac2 = foobar.nextInt();
            denomFrac2 = foobar.nextInt();
        }


        String s = "whole:" + wholeFrac2 + " numerator:" + numFrac2 + " denominator:" + denomFrac2;
        return s;

    }

    // TODO: Fill in the space below with any helper methods that you think you will need

}
