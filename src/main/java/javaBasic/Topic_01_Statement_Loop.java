package javaBasic;

public class Topic_01_Statement_Loop {

    String[] array = {"3", "5", "apple", "2", "8", "10", "Banana", "1", "6", "4", "Cherry", "7", "9"};

    public void printArray() {

        System.out.print("We have String array: ");
        for (String str : array)
            System.out.print("|" + str);
        System.out.println("\n");
    }

    public void Ex_01_FindMaxAndMinNumbers() {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("========Ex_01_FindMaxAndMinNumbers");
        for (String str : array) {
            try {
                int number = Integer.valueOf(str);
                if (number < min)
                    min = number;

                if (number > max)
                    max = number;

            } catch (NumberFormatException ex) {
            }
        }
        System.out.println("Min value of array is " + min);
        System.out.println("Max value of array is " + max + "\n");

    }

    public void Ex_02_CountEvenAndOddNumbers() {

        System.out.println("========Ex_02_CountEvenAndOddNumbers========");
        int even = 0;
        int odd = 0;
        int i = 0;
        while (i < array.length) {
            try {
                if (isEven(Integer.valueOf(array[i])))
                    even++;
                else
                    odd++;

            } catch (NumberFormatException ex) {
            }
            i++;
        }
        System.out.println("Number of even is " + even);
        System.out.println("Number of odd is " + odd + "\n");

    }

    public void Ex_03_FindLongestStringAndNonNumericStrings() {

        System.out.println("========Ex_03_FindLongestStringAndNonNumericStrings========");
        String longestString = "";
        int numOfNonNumericString = 0;
        for (String str : array) {
            if (longestString.length() < str.length()) {
                longestString = str;
            }
            try {
                Integer.valueOf(str);
            } catch (NumberFormatException ex) {
                numOfNonNumericString++;
            }
        }
        System.out.println("The longest string is " + longestString);

        System.out.println("The number of Non-Numeric String in the array is " + numOfNonNumericString);
    }

    public static boolean isEven(int i) {
        return i % 2 == 0;
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

}