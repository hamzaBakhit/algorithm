package com.company;

public class Main {

    public static void main(String[] args) {

        //*************************** DECLARE AND INITIAL THE MAIN ARRAY *****************//
        int numbers[] = {7,4,1,2,5,8,9,6,3};

        //*************************** USING THE FUNCTIONS AND PRINT THE RESULT **********//
        //q.1
        int ascNumbers []= ascOrder(numbers);
        print("the ascending order is","");
        for (int number :
                ascNumbers) {
         print("",number+"");
        }

        int desc []= descOrder(numbers);
        print("the desc order is","");
        for (int number :
                desc) {
            print("",number+"");
        }

        //q.2
        int[] evenNumbers = evenNumbers(numbers);
        print("the odd numbers is", "");
        for (int number :
                evenNumbers) {
            if (number != 0)
                print("", number + "");
        }

        int[] oddNumbers = oddNumbers(numbers);
        print("the odd numbers is", "");
        for (int number :
                oddNumbers) {
            if (number != 0)
                print("", number + "");
        }
        // q.3
        print("The largest number is", largestNumber(numbers) + "");

    }

    //******************************* SINGLE RESPONSIBILITY ***********************************//
    // question num. 1
    static int[] ascOrder(int numbers[]) {
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    static  int[] descOrder(int numbers[]){
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }


    // question num. 2 find even numbers and odd numbers...
    static int[] oddNumbers(int numbers[]) {
        int oddNumbers[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) oddNumbers[i] = numbers[i];
        }
        return oddNumbers;
    }

    static int[] evenNumbers(int numbers[]) {
        int evenNumbers[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) evenNumbers[i] = numbers[i];
        }
        return evenNumbers;
    }

    // question num. 3 : find the largest element of array of numbers...
    static int largestNumber(int numbers[]) {
        int largestNum = 0;
        for (int number :
                numbers) {
            if (number > largestNum) largestNum = number;
        }
        return largestNum;
    }

    //print func.
    //********************************** DRY: DO NOT REPEAT YOUR SELF *******************//
    static void print(String text, String value) {
        System.out.println(text + ": " + value);
    }

}