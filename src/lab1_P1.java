import java.util.Scanner;

public class lab1_P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);

        switch(input) {
            case 'a', 'A' -> System.out.println("Action movie fan.");
            case 'c', 'C' -> System.out.println("Comedy movie fan.");
            case 'd', 'D' -> System.out.println("Drama movie fan.");
            default -> System.out.println("Invalid Choice.");
        }
    }
}
