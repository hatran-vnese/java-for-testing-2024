package javaBasic;

public class Topic_01_Statement_Loop {


    public static void Ex_01_FindMaxAndMinNumbers(String[] array) {

        int minNumber = Integer.valueOf(array[0]);
        int maxNumber = Integer.valueOf(array[0]);
        System.out.println("========Ex_01_FindMaxAndMinNumbers");
        for (String item : array) {
            try {
                if (minNumber > Integer.valueOf(item)) {
                    minNumber = Integer.valueOf(item);
                }
                if (maxNumber < Integer.valueOf(item)) {
                    maxNumber = Integer.valueOf(item);
                }
            } catch (NumberFormatException ex) {
            }
        }
        System.out.println("Min value of array is " + minNumber);
        System.out.println("Max value of array is " + maxNumber + "\n");

    }

    public static void Ex_02_CountEvenAndOddNumbers(String[] array) {
        System.out.println("========Ex_02_CountEvenAndOddNumbers========");

        int even = 0;
        int odd = 0;
        int item = 0;
        while (item < array.length) {
            try {
                if (isEven(Integer.valueOf(array[item]))) {
                    even = even + 1;
                } else {
                    odd = odd + 1;
                }
            } catch (NumberFormatException ex) {
            }
            item = item + 1;
        }
        System.out.println("Number of even is " + even);
        System.out.println("Number of odd is " + odd + "\n");

    }

    public static void Ex_03_FindLongestStringAndNonNumericStrings(String[] array) {
        System.out.println("========Ex_03_FindLongestStringAndNonNumericStrings========");
        int maxLength = 0;
        int numOfNonNumericString = 0;
        for (int i = 0; i < array.length; i++) {

            try {
                if (maxLength < array[i].length()) {
                    maxLength = array[i].length();
                }
                if (!isNumeric(array[i])) {
                    numOfNonNumericString = numOfNonNumericString + 1;
                }

            } catch (NumberFormatException ex) {
            }
        }
        System.out.println("The longest string length is " + maxLength + ", the string is:");
        for (String item : array) {

            try {
                if (item.length() == maxLength) {
                    System.out.println(item);
                }
            } catch (NumberFormatException ex) {
            }
        }

        System.out.println("The number of Non-Numeric String in the array is " + numOfNonNumericString);
    }

    public static boolean isEven(int i) {
        return i % 2 == 0;
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
}
