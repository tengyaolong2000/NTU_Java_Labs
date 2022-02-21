import java.util.Scanner;

public class lab3_planeapp {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        lab3_plane arrayseat = new lab3_plane();

        System.out.println("(1) Show number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of seat assignments by seat ID");
        System.out.println("(4) Show the list of seat assignments by customer ID");
        System.out.println("(5) Assign a customer to a seat");
        System.out.println("(6) Remove a seat assignment");
        System.out.println("(7) Exit");
        System.out.println("Enter the number of your choice: ");
        int input = sc.nextInt();

        while(input!=7){
            switch(input){
                case 1 -> {arrayseat.showNumEmptySeats();}
                case 2 -> {arrayseat.showEmptySeats();}
                case 3 ->{arrayseat.showAssignedSeats(true);}
                case 4 ->{arrayseat.showAssignedSeats(false);}
                case 5 -> {
                    System.out.println("Assigning seat...");
                    System.out.println("Please enter seat id");
                    int id = sc.nextInt();
                    System.out.println("Please enter customer id");
                    int cust  = sc.nextInt();
                    arrayseat.assignSeat(id, cust);
                }
                case 6 -> {
                    System.out.println("Enter seatID to un-assign customer from");
                    int seatid = sc.nextInt();
                    arrayseat.unAssignSeat(seatid);}

            }
            System.out.println("Enter the number of your choice: ");
            input = sc.nextInt();
        }
    }
}
