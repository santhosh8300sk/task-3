import java.util.Scanner;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
    
/*Build a hotel reservation system where users can
search for available rooms, make reservations, and view
booking details. Include features like room
categorization and payment processing */
public class HotelReservation {
    static String name;
    static int roomNo;
    static String accno;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        boolean[] rooms = new boolean[50];
        int i;
        for(i = 8; i < 14; i++){
            rooms[i] = true;
        }
        for(i = 20; i < 27; i++){
            rooms[i] = true;
        }
        for(i = 43; i < 47; i++){
            rooms[i] = true;
        }
        System.out.println("Welcome");
        System.out.print("Please enter your name : ");
        name = sc.nextLine();
        System.out.println("Categories of rooms : \nSingle Room : 1 - 20 -> Charges per day : 1000\nking Room : 21 - 40 -> Charges per day : 5000\nSuite : 41 - 50 -> Charges per day : 10000\n");
        System.out.println("Please enter your choice\n1.Single Room\n2.King Room\n3.Suite");
        char ch = ' ';
        ch = sc.next().charAt(0);
        switch(ch){
            case '1' : System.out.println("Available rooms : ");
                       for(i = 0; i < 20; i++){
                            if(!rooms[i]){
                                System.out.print(i+1+" ");
                            }
                       }
                       System.out.println();
                       System.out.println("Please select the room no from the available rooms");
                       roomNo = sc.nextInt();
                       sc.nextLine();
                       System.out.println("enter your account number !!");
                       accno = sc.nextLine();
                       System.out.println("checking account number......");
                       try{
                        Thread.sleep(2000);
                       }
                      catch(Exception e){
                        e.printStackTrace();
                        }
                       System.out.println("Please wait while the payment is being processed");
                       try{
                            Thread.sleep(5000);
                       }
                       catch(Exception e){
                            e.printStackTrace();
                       }
                       System.out.println("Booking is confirmed");
                       rooms[roomNo - 1] = true;
                       break;
            case '2' : System.out.println("Available rooms : ");
                       for(i = 20; i < 40; i++){
                            if(!rooms[i]){
                                System.out.print(i+1+" ");
                            }
                       }
                       System.out.println();
                       System.out.println("Please select the room no from the available rooms");
                       roomNo = sc.nextInt();
                       sc.nextLine();
                       System.out.println("enter your account number !!");
                       accno = sc.nextLine();
                       System.out.println("checking account number......");
                       try{
                        Thread.sleep(2000);
                       }
                      catch(Exception e){
                        e.printStackTrace();
                        }
                       System.out.println("Please wait while the payment is being processed");
                       try{
                            Thread.sleep(5000);
                       }
                       catch(Exception e){
                            e.printStackTrace();
                       }
                       System.out.println("Booking is confirmed");
                       rooms[roomNo - 1] = true;
                       break;
            case '3' : System.out.println("Available rooms : ");
                       for(i = 40; i < 50; i++){
                            if(!rooms[i]){
                                System.out.print(i+1+" ");
                            }
                       }
                       System.out.println();
                       System.out.println("Please select the room no from the available rooms");
                       roomNo = sc.nextInt();
                       sc.nextLine();
                       System.out.println("enter your account number !!");
                       accno = sc.nextLine();
                       System.out.println("checking account number......");
                       try{
                        Thread.sleep(2000);
                       }
                      catch(Exception e){
                        e.printStackTrace();
                        }
                       System.out.println("Please wait while the payment is being processed");
                       try{
                            Thread.sleep(5000);
                       }
                       catch(Exception e){
                            e.printStackTrace();
                       }
                       System.out.println("Booking is confirmed");
                       rooms[roomNo - 1] = true;
                       break;
            default : System.out.println("Irrelevant choice");
                   
        }
        try{
            Thread.sleep(2000);
       }
       catch(Exception e){
            e.printStackTrace();
       }
        System.out.println();
        viewDetails();
        System.out.println("Thank You for Booking\3 \3 \3");
    }
    public static void viewDetails(){
        System.out.println("Booking Details : ");
        System.out.println("Booking id : "+(int)(Math.random()*50)+1);
        System.out.println("Name : "+name);
        System.out.println("Room Number : "+roomNo);
        if(roomNo >= 1 && roomNo <= 20){
            System.out.println("Room category : Single Room");
        }
        else if(roomNo >= 21 && roomNo <= 40){
            System.out.println("Room category : King Room");
        }
        else if(roomNo >= 41 && roomNo <= 50){
            System.out.println("Room category : Suite");
        }
        System.out.println("Booking Timing : "+java.time.LocalDate.now());
        System.out.println("payment done through account no: "+accno);
        System.out.println();
    }
}
