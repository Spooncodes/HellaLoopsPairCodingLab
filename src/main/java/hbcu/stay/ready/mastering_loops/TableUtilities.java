package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
    // method header, returns string, accepts nothing.., basing output on test case
    private static String buildTableRow(int i, int length) {
        String rowBuild = "";
        for (int x = 1; x <= length; x++) {
            int number = x * i;
            rowBuild += String.format("%3d |", number);
        }
        return rowBuild;
    }

    public static String getSmallMultiplicationTable() {
        String getSmall = "";
        for (int i = 1; i <= 5; i++) {
            int length = 5;
            getSmall += buildTableRow(i, length) + "\n";

        }
        return getSmall;
    }

    public static String getLargeMultiplicationTable() {
        String getLarge = "";
        for (int i = 1; i <= 10; i++) {
            int length = 10;
            getLarge += buildTableRow(i, length) + "\n";
        }

        return getLarge;
    }

    public static String getMultiplicationTable(int tableSize) {
        String getMultiplication = "";
        for (int i = 1; i <= tableSize; i++) {
            int length = tableSize;
            getMultiplication += buildTableRow(i, length) + "\n";
        }

        return getMultiplication;
    }
}