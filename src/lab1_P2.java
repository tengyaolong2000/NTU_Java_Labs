import java.util.Scanner;

public class lab1_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary, merit;

        System.out.println("Please enter your salary");
        salary = sc.nextInt();
        System.out.println("Please enter your merit points");
        merit = sc.nextInt();

        if (salary>=700 && salary <= 899){
            if (salary <=799 && merit <20){
                System.out.println("Grade B");
            }
            else System.out.println("Grade A");
        }

        else if (salary>=600 && salary <=799) {
            if (salary <= 649 && merit < 10) {
                System.out.println("Grade C");
            }
            else System.out.println("Grade B");
        }

        else if (salary>=500 && salary <=649){
            System.out.println("Grade C");
            }
        }
}
