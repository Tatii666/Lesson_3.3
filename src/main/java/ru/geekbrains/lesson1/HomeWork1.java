package ru.geekbrains.lesson1;

public class HomeWork1 {
    public static void main(String[] args) {

       dataType();

        float result = calculate(7.12f, 5.8f, 18f, 5.5f);
        System.out.println(result);


        task10and20(7,4);


        isPositiveOrNegative(-7);

        testTurn(8);

        isNegative(-300);

        greetings("Tania");

        leapYearCount(2020);


    }
    public static void dataType() {
        byte val1 = -110;
        short val2 = 15444;
        int val3 = 15;
        long longVal = 200000L;
        float floatVal = 15.33f;
        double val4 = 154.356;
        char valChr = 'S';
        boolean isVal = true;

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(longVal);
        System.out.println(floatVal);
        System.out.println(val4);
        System.out.println(valChr);
        System.out.println(isVal);
    }

    public static float calculate (float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    public static boolean task10and20(int x1, int x2){
        int sum = x1 + x2;
        boolean rightTask = true;
        boolean wrongTask = false;

        if(sum > 10 && sum <= 20){
            System.out.println(rightTask);
        } else {
            System.out.println(wrongTask);
        }
        return(rightTask);
    }



    public static void isPositiveOrNegative(int x) {

        if(x >= 0) {
            System.out.println("x is positive:" + x);
        } else {
            System.out.println("x is negative:" + x);
        }

    }

    static void testTurn (int digit){
        String word = ( digit > 0) ? ("positiv") : ("negative");
        System.out.println(digit + " is " + word + " digit");
    }



    public  static boolean isNegative(int x){

        boolean negativeNumb = true;
        if (x < 0){
            negativeNumb = true;
            System.out.println("Number is negative.");
        }
        return negativeNumb;
    }

    public static void greetings(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static int leapYearCount(int year){
        int count = 0;

        for(int i = 1; i <= year; i++) {
            if(((i%4 == 0) && (i%100 != 0)) || (i%400 == 0)){
                System.out.println("Leap year is " +i);
            }
        }
        return count;
    }

}
