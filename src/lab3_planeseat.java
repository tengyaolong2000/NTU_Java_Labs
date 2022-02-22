public class lab3_planeseat {

    private int seatId;
    public boolean assigned = false;
    private int customerId;

    public lab3_planeseat(int seat_id){
        this.seatId = seat_id;
    }

    public int getSeatId() {
        return seatId;
    }

    public int getCustomerId() {
        if (assigned == true) {
            return customerId;
        }
        else return -1;
    }

    public boolean isOccupied(){
        return assigned;
    }

    public void assign(int customerId){
        if (assigned == false) {
            this.customerId = customerId;
            this.assigned = true;
            System.out.println("Seat assigned!");
        }
        else {

            System.out.println("Seat already assigned to a customer!");
        }
    }

    public void unAssign(){
        this.assigned = false;
        System.out.println("Seat unassigned!");
    }




}
