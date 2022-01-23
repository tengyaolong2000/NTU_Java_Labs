import java.util.ArrayList;
import java.util.Scanner;

public class lab2_P1 {
    public static void main(String[] args)
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> lab2_P1.mulTest();
                case 2 -> {

                    int first, second, result;

                    System.out.println("Enter the first digit:");
                    first = sc.nextInt();
                    System.out.println("Enter the second digit:");
                    second = sc.nextInt();
                    result = lab2_P1.divide(first, second);
                    System.out.println(first + " divided by " + second + " is " + result);
                    System.out.println();}
                case 3 -> {

                    int first, second, result;
                    System.out.println("Enter the first digit:");
                    first = sc.nextInt();
                    System.out.println("Enter the second digit:");
                    second = sc.nextInt();
                    result= lab2_P1.modulus(first, second);
                    System.out.println(first + " modulus " + second + " is " + result);
                    System.out.println();}
                case 4 -> {System.out.println("Enter your number n: ");
                            int n = sc.nextInt();
                            if(n<0){
                            System.out.println("ERROR! Positive digits only");
                             continue;
                    }
                    System.out.println("Count = " + lab2_P1.CountDigits(n));
                    System.out.println();}
                case 5 -> {

                    System.out.println("Enter your number n: ");
                    int n = sc.nextInt();
                    if(n<0){
                        System.out.println("ERROR! Positive digits only");
                        continue;
                    }
                    System.out.println("Enter the digit you want to find: ");
                    int digit = sc.nextInt();
                    int pos = lab2_P1.position(n, digit);
                    System.out.println("position: " + pos);
                    System.out.println();}
                case 6 -> {long res = lab2_P1.ExtractAllOdd();
                    if (res==2)System.out.println("Error input!");
                    else
                    System.out.println(res);
                    System.out.println();}
                case 7 -> System.out.println("Program terminating ….");
            }
        } while (choice < 7);
    }


    public static void mulTest(){
        Scanner scan = new Scanner(System.in);
        int val1 ;
        int val2 ;
        int answer;
        int result = 0;

        for (int i=0; i<5; i++) {
            val1 = (int) (Math.random()*10);
            val2 = (int) (Math.random()*10);
            System.out.println("How much is " + val1 + " times " + val2 + " ?");
            answer = scan.nextInt();
            if (answer == val1*val2) result++;
        }
        System.out.println(result + " out of 5 are correct.");
        System.out.println();

    }

    public static int modulus(int first, int second){
        Scanner scan = new Scanner(System.in);
         int result;

        result = first;
        while (result >= second){
            result -= second;
        }
        return result;
    }

    public static int divide(int first, int second){
        int minus, result=0;
        minus = first;
        while (minus >= second){
            minus -= second;
            result++;
        }
        return result;

    }

    public static int CountDigits(int n){

        ArrayList<Integer> array = new ArrayList<>();

            while (n != 0) {
                array.add(n%10);
                n /= 10;
            }
        return array.size();
    }

    public static int position(int n, int digit) {

        ArrayList<Integer> array = new ArrayList<>();

        while (n != 0) {
            array.add(n % 10);
            n /= 10;
        }
       if (!array.contains(digit)) return -1;

       return array.indexOf(digit) +1;
    }

    public static long ExtractAllOdd(){
        int val;

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Enter your list of numbers: ");
        String input  = scan.nextLine();
        if (!input.isEmpty()) {
            val = Integer.parseInt(input);
            if (val <= 0 ){
                return 2;
            }
            while (val != 0) {
                array.add(val%10);
                val /= 10;
            }
        }

        if(array.isEmpty()){return -1;}

        String out = "";
        StringBuilder str = new StringBuilder();
        System.out.println("The odd numbers in the array are:");
        for (int i : array){
            if (i%2==1) str.append(i);
        }
        out = str.reverse().toString();
        if (out.equals("")) return -1;
        return Long.parseLong(out);

    }
}



