import java.util.Arrays;
import java.util.Comparator;

public class lab3_plane {

    private lab3_planeseat[] seat = new lab3_planeseat[12];
    private int numEmptySeat = 12;

    public lab3_plane() {

        for(int i=0; i<12; i++){
            seat[i] = new lab3_planeseat(i+1);
        }

    }

    private lab3_planeseat[] sortSeats() {

        lab3_planeseat[] copy = seat.clone();
        Arrays.sort(copy, Comparator.comparing(lab3_planeseat::getCustomerId));
        return copy;
    }

    public void showNumEmptySeats(){
        System.out.println("The number of empty seats are: " + this.numEmptySeat);
    }

    public void showEmptySeats(){
        System.out.println("The following seats are not occupied: ");
        for (lab3_planeseat seatt : seat){
            if (seatt.isOccupied() == false){
                System.out.println("Seat ID: " + seatt.getSeatId());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId){
        System.out.println("The seat assignments are as follows: ");
        if (bySeatId == true){
            for (lab3_planeseat i : seat){
                if (i.isOccupied() == true ){
                    System.out.println("Seat ID " + i.getSeatId() + " is assigned to " + i.getCustomerId());
                }

            }
        }

        else{
            for (lab3_planeseat i : this.sortSeats()){
                if (i.isOccupied()==true){
                    System.out.println("Seat ID " + i.getSeatId() + " is assigned to " + i.getCustomerId());
                }
            }

        }

    }


    public void assignSeat(int seatId, int cust_id){
        seat[seatId-1].assign(cust_id);
        numEmptySeat -= 1;
    }

    public void unAssignSeat(int seatId){

        seat[seatId-1].unAssign();
        numEmptySeat+=1;
    }

}






