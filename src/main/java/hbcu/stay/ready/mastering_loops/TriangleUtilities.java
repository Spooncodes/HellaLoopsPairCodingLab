package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";

        for (int i = 1; i < numberOfRows; i++) {
            triangle += getTriangleHelper(i) + "\n"; // calls Helper and creates line break
        }

        return triangle;
    }

    private static String getTriangleHelper(int row) {
        String triangle = "";

        for (int j = 0; j < row; j++) { // row is equal to i
            triangle += "*"; // calls empty string and adds star
        }
        return triangle; // goes back to original loop in getTriangle
    }

    public static String getRow(int numberOfStars) {
        String row = "";

        for (int i = 0; i < numberOfStars; i++)
        {
            row += "*";
        }
        return row;
    }

    public static String getSmallTriangle() {

        return getTriangle(5); // runs getTriangle method 5 times
    }

    public static String getLargeTriangle() {

        return getTriangle(10); // runs getTriangle method 10 times
    }
}
