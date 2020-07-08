package hbcu.stay.ready.mastering_loops;

public class NumberUtilities {
    public static String getOddNumbers(int start, int stop) {
        String emptyString = "";
        for (Integer i = start; i < stop; i += 2) {
            String oddNumbers = Integer.toString(i);
            emptyString = emptyString.concat(oddNumbers);
        }
        return emptyString;
    }

    public static String getEvenNumbers(int start, int stop) {
        String emptyString = "";
        for (Integer i = start + 1; i < stop; i += 2) {
            String evenNumbers = Integer.toString(i);
            emptyString = emptyString.concat(evenNumbers);
        }
        return emptyString;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        String emptyString = "";
        for (int i = start; i < stop; i += step) {
            int square = i * i; // squares each number in loop
            String squareNumbers = Integer.toString(square); // convert # to string
            emptyString = emptyString.concat(squareNumbers); // add # to end of string
        }
        return emptyString;
    }

    public static String getRange(int start) {
        String value = "";
        for (int i = 0; i < start; i++) {
            value = value + i;
        }
        return value;
    }

    public static String getRange(int start, int stop) {
        String value = "";
        for (int i = start; i < stop; i++) {
            value = value + i;
        }
        return value;
    }

    public static String getRange(int start, int stop, int step) {
        String value = "";
        for (int i = start; i < stop; i += step) {
            value = value + i;
        }
        return value;
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String emptyString = "";
        for (int i = start; i < stop; i += step) {
            double exponentiation = Math.pow(i, exponent); // loop increments of 5 until 2
            int value = (int) exponentiation;  // cast double to an integer
            String exponentNumbers = Integer.toString(value); // convert # to string
            emptyString = emptyString.concat(exponentNumbers); // add # to end of string
        }
        return emptyString;
    }
}
