import java.util.Scanner;
public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        System.out.println(produceAnswer(userInput));




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

        int frac1num = 0;
        int frac2num = 0;
        int frac1denom = 0;
        int frac2denom = 0;
        int frac1whole = 0;
        if (frac1.contains("_")){
            Scanner w = new Scanner(frac1);
            w.useDelimiter("_");
            frac1whole = w.nextInt();

            Scanner frac1scan = new Scanner(w.next());
            frac1scan.useDelimiter("/");
            frac1num = frac1scan.nextInt();
            frac1denom = frac1scan.nextInt();
            frac1num += (frac1whole * frac1denom);

        }
        else if (!(frac2.contains("_") || frac2.contains("/"))) {
            Scanner w = new Scanner(frac2);
            frac1num = w.nextInt();
            frac1denom = 1;
        }
        else {
            Scanner frac1scan = new Scanner(frac1);
            frac1scan.useDelimiter("/");
            frac1num = frac1scan.nextInt();
            if (frac1scan.hasNextInt()){
                frac1denom = frac1scan.nextInt();
            }
            else {
                frac1denom = 1;
            }
        }
            int frac2whole = 0;
        if (frac2.contains("_")){
            Scanner w = new Scanner(frac2);
            w.useDelimiter("_");
            frac2whole = w.nextInt();

            Scanner frac2scan = new Scanner(w.next());
            frac2scan.useDelimiter("/");
            frac2num = frac2scan.nextInt();
            frac2denom = frac2scan.nextInt();
            frac2num += (frac2whole * frac2denom);

        }
        else if (!(frac2.contains("_") || frac2.contains("/"))) {
            Scanner w = new Scanner(frac2);
            frac2num = w.nextInt();
            frac2denom = 1;
        }
        else {
            Scanner frac2scan = new Scanner(frac2);
            frac2scan.useDelimiter("/");
            frac2num = frac2scan.nextInt();
            if (frac2scan.hasNextInt()){
                frac2denom = frac2scan.nextInt();
            }
            else {
                frac2denom = 1;
            }
        }

        if (operator.equals("+")){
            if (frac1denom != frac2denom){
            int numSum = (frac1num * frac2denom) + (frac2num * frac1denom);
            int denomSum = (frac1denom * frac2denom);
            return "" + numSum + "/" + denomSum;
            }
            else {
                int numSum = frac1num + frac2num;
                int denomSum = frac1denom;
            }
        }
        if (operator.equals("-")){
            if (frac1denom != frac2denom) {
                int numDif = (frac1num * frac2denom) - (frac2num * frac1denom);
                int denomDif = (frac1denom * frac2denom);
                return "" + numDif + "/" + denomDif;
            }
            else {
                int numDif = frac1num - frac2num;
                int denomDif = frac1denom;
            }
        }
        if (operator.equals("/")){
            int numQuo = frac1num * frac2denom;
            int denomQuo = frac2num * frac1denom;
            return "" + numQuo + "/" + denomQuo;
        }
        if (operator.equals("*")) {
            int numPro = frac1num * frac2num;
            int denomPro = frac1denom * frac2denom;
            return "" + numPro + "/" + denomPro;
        }

        //return "whole:" + frac2whole + " numerator:" + frac2num + " denominator:" + frac2denom;
        return
    }

    // TODO: Fill in the space below with any helper methods that you think you will need

}
