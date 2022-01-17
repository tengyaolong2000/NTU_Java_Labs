import java.util.Scanner;

public class lab1_P3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start, end, increment;
        System.out.println("Enter start value:");
        start = sc.nextInt();
        System.out.println("Enter end value:");
        end = sc.nextInt();
        System.out.println("Enter increment:");
        increment = sc.nextInt();

        if (start > end ){
            System.out.println("ERROR!");
            return;
        }

        System.out.println("With for loop");
        System.out.println("US$        S$");
        System.out.println("_____________");
        for(int i=start; i<=end; i+=increment){
            System.out.println(i + "          " + 1.82*i);
        }
        System.out.println();
        System.out.println("With while loop");
        System.out.println("US$        S$");
        System.out.println("_____________");
        int i = start;
        while(i<=end){
            System.out.println(i + "          " + 1.82*i);
            i+= increment;
        }

        System.out.println();
        System.out.println("With do/while loop");
        System.out.println("US$        S$");
        System.out.println("_____________");
        i = start;
        do{
            System.out.println(i + "          " + 1.82*i);
            i+= increment;
        }while(i<=end);




    }

}
