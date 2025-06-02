
public class MovieTicket {
    int ticketCount;
    int availableSeats;
    boolean isBookingOpen;
    boolean isBooked;

    public MovieTicket(int count, int seats, boolean open){
        ticketCount = count;
        availableSeats = seats;
        isBookingOpen = open;
    }

    public void bookTickets(){
        if(availableSeats>=ticketCount && isBookingOpen == true){
            System.out.println("Booking Confirmed");
            isBooked = true;
        }else{
            System.out.println("Booking Denied");
            isBooked = false;
        }
    }

    public void printTicket(){
        if(isBooked==true){
            System.out.println("Enjoy your movie!");
        }else{
            System.out.println("Sorry Not booked");
        }
    }

    public void showSoldOutMessage(){
        System.out.println("Sorry , Tickets has been Sold..");
    }

    public static void main(String[] args) {
        MovieTicket three = new MovieTicket(3, 45, true);
        MovieTicket seven = new MovieTicket(7,45, false);
        three.bookTickets();
        three.printTicket();
        seven.bookTickets();
        seven.printTicket();
        seven.showSoldOutMessage();
    }
}
