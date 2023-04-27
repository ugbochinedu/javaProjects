package hotelApp;

import java.util.Arrays;
import java.util.Scanner;

public class Hotel {
    private String [] rooms;

    public Hotel(int roomLength){
        this.rooms = new String[roomLength];

    }
    public String bookRoom(String username,int roomNumber) {
        if (rooms[roomNumber]!=null) return "Room already occupied";
        else return assignRoom(username, roomNumber);

    }

    private String assignRoom(String username, int roomNumber) {
        rooms[roomNumber] = username;
        return "room Booked Successfully";
    }


    public boolean Checkout(int roomNumber) {
        boolean hasCheckedOut = false;
        if( rooms[roomNumber] != null)
            rooms[roomNumber] = null;
        hasCheckedOut = true;
        return hasCheckedOut;
    }

    public int getRooms() {
        return rooms.length;
    }

    public int getfreeRooms() {
        int availableRoom = 0;
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i]==null) {
                availableRoom += 1;
            }}
        return availableRoom;
    }

    public int  getBookedRooms() {
        int bookedRooms = 0;
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i]!=null) {
                bookedRooms += 1;
            }}
        return bookedRooms;
    }

    public String getguest(int roomNumber) {
        String guest = null;
        if(rooms[roomNumber] != null){
            guest = rooms[roomNumber];
        }
        return guest;
    }
    public void options(int choice){
        Scanner input = new Scanner(System.in);
        switch (choice){
            case 1:
                System.out.printf("There are %d rooms",getRooms());
                break;
            case 2:
                System.out.println("Enter your name");
                String name = input.next();
                System.out.println("Enter the room number you would like to book");
                int roomNumber = input.nextInt();
                System.out.println(bookRoom(name,roomNumber));
                break;
            case 3:
                System.out.println("Enter the room number you would like to check out");
                int roomNumber1 = input.nextInt();
                System.out.printf("%s Room successfully checked out",Checkout(roomNumber1));
                break;
            case 4:
                System.out.printf("There are %d rooms available", getfreeRooms());
                break;
            case 5:
                System.out.printf("There are %d booked rooms ",getBookedRooms());
                break;
            case 6:
                System.out.println("Enter the room number you would like to check ");
                int roomNumber2 = input.nextInt();
                System.out.println(getguest(roomNumber2));
                break;
            default:
                System.out.println("Invalid number");

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hotel hotel = new Hotel(10);
        System.out.println("""
                Enter 1 to check the total number of room(s) in the hotel
                Enter 2 to book room(s)
                Enter 3 to check out
                Enter 4 to check the number of free room(s)
                Enter 5 to check the number of booked room(s)
                Enter 6 to check the details of the guest in room(s)
                Enter 7 to set the number of rooms 
                """);
        int choice = input.nextInt();
        hotel.options(choice);

//        switch (choice){
//            case 1:
//                System.out.printf("There are %d rooms",hotel.getRooms());
//            break;
//            case 2:
//                System.out.println("Enter your name");
//                String name = input.next();
//                System.out.println("Enter the room number you would like to book");
//                int roomNumber = input.nextInt();
//                System.out.println(hotel.bookRoom(name,roomNumber));
//                break;
//            case 3:
//                System.out.println("Enter the room number you would like to check out");
//                int roomNumber1 = input.nextInt();
//                System.out.printf("%s Room successfully checked out",hotel.Checkout(roomNumber1));
//                break;
//            case 4:
//                System.out.printf("There are %d rooms available", hotel.getfreeRooms());
//            break;
//            case 5:
//                System.out.printf("There are %d booked rooms ",hotel.getBookedRooms());
//            break;
//            case 6:
//                System.out.println("Enter the room number you would like to check ");
//                int roomNumber2 = input.nextInt();
//                System.out.println(hotel.getguest(roomNumber2));
//                break;
//            default:
//                System.out.println("Invalid number");
//
//        }

//        hotel.bookRoom("Goodness",4);
//        System.out.println((hotel.getguest(4)));
    }
}