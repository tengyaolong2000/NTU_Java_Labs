import java.util.Scanner;

public class lab1_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of pattern!");
        int height = sc.nextInt();
        if (height ==0) {System.out.println("ERROR!"); return;}
        for (int i = 1; i <= height; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 == 1) System.out.print("AA");
                    else System.out.print("BB");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 == 1) System.out.print("BB");
                    else System.out.print("AA");
                }
            }
            System.out.println("");
        }
    }
}
