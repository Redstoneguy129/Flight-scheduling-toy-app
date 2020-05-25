import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static List<Flight> listOfFlights = new ArrayList<>();
    public static List<Passenger> listOfPassengers = new ArrayList<>();

    public static void main(String[] args) {
        final String airlineName = "Data Structure Airlines";
        StringBuilder airlineNameUnderline = new StringBuilder();

        System.out.println(airlineName);
        for (int i = 0; i < airlineName.length(); i++) {
            airlineNameUnderline.append("=");
        }
        System.out.println(airlineNameUnderline);

        System.out.println("_Menu_");
        System.out.println("S) Schedule a passenger for a flight");
        System.out.println("C) Cancel a passenger from a flight");
        System.out.println("P) Passenger status");
        System.out.println("F) Flight information");
        System.out.println("Q) Quit");

        Scanner inputReader = new Scanner(System.in);
        String input = inputReader.next().toLowerCase();
        System.out.println("got input: " + input);

        switch(input) {
            case "s":
                schedulePassengerForFlight();
                break;
            case "c":
                cancelPassengerFromFlight();
                break;
            case "p":
                passengerStatus();
                break;
            case "f":
                flightInfo();
                break;
            case "q": // Quit
                System.exit(0);
                break;
            default:
                System.out.println("Error: Unknown input");
                System.exit(1);
        }
    }

    public static void schedulePassengerForFlight() {
        Scanner inputReader = new Scanner(System.in);
        inputReader.useDelimiter("\n");
        Flight flight = new Flight();
        Passenger passenger = new Passenger();
        SeatingList seatingList = new SeatingList();
        Seat seat = new Seat();

        // Tmp seating stuff
        Seat economyClassSeat = new Seat();
        Seat businessClassSeat = new Seat();
        Seat firstClassSeat = new Seat();

        economyClassSeat.setNumber(1);
        businessClassSeat.setNumber(2);
        firstClassSeat.setNumber(3);

        economyClassSeat.setSeatingClass(SeatingClass.economy);
        businessClassSeat.setSeatingClass(SeatingClass.business);
        firstClassSeat.setSeatingClass(SeatingClass.first);

        List<Seat> economySeatList = new ArrayList<>();
        economySeatList.add(economyClassSeat);

        System.out.println();
        System.out.println("Schedule a passenger for a flight");
        System.out.println("---");

        System.out.print("Enter passenger name: ");
        String input = inputReader.nextLine().toLowerCase();
        System.out.println("got input: " + input);
        passenger.setName(input);

        System.out.print("Enter a flight number: ");
        input = inputReader.next().toLowerCase();
        System.out.println("got input: " + input);
        flight.setNumber(Integer.parseInt(input));

        System.out.print("TMP Enter a flight arrival airport: ");
        input = inputReader.next().toLowerCase();
        System.out.println("got input: " + input);
        flight.setArrivalAirport(input);

        System.out.print("TMP Enter a flight departure airport: ");
        input = inputReader.next().toLowerCase();
        System.out.println("got input: " + input);
        flight.setDepartureAirport(input);

        System.out.print("TMP Enter a flight departure date: ");
        input = inputReader.nextLine().toLowerCase();//Just Like The Name at start. Does not work with Ints. Scanners Default Delimiter was spaces, changed to \n(new lines).
        System.out.println("got input: " + input);
        flight.setDepartureDate(input);

        System.out.print("Choose a class: ");
        input = inputReader.next().toLowerCase();
        System.out.println("got input: " + input);
        switch (input) {
            case "first":
                seat.setSeatingClass(SeatingClass.first);
                break;//Need breaks in switch cases!
            case "business":
                seat.setSeatingClass(SeatingClass.business);
                break;
            default://Always need one default in switches! Defaults do not need breaks.
            case "economy":
                seat.setSeatingClass(SeatingClass.economy);
        }

        System.out.print("Pick a seat number: ");
        input = inputReader.next().toLowerCase();
        System.out.println("got input: " + input);
        seat.setNumber(Integer.parseInt(input));

        listOfFlights.add(flight);
        listOfPassengers.add(passenger);
    }

    public static void cancelPassengerFromFlight() {
        Scanner inputReader = new Scanner(System.in);

        System.out.println();
        System.out.println("Cancel a passenger from a flight");
        System.out.println("---");
        System.out.print("Enter passenger name:");

        String input = inputReader.next().toLowerCase();
        System.out.println("got input: " + input);
    }

    public static void passengerStatus() {
        Scanner inputReader = new Scanner(System.in);

        System.out.println();
        System.out.println("Passenger status");
        System.out.println("---");
        System.out.print("Enter passenger name:");

        String input = inputReader.next().toLowerCase();
        System.out.println("got input: " + input);

        listOfPassengers.forEach(passenger -> {
            if (passenger.getName().equals(input)) {
                System.out.println("Passenger name: " + passenger.getName());
                System.out.println("Scheduled flights:");
                passenger.getScheduledFlights().forEach(flight -> {
                    System.out.println(flight.getNumber() + " " + flight.getDepartureDate());
                });
            }
        });
    }

    public static void flightInfo() {
        Scanner inputReader = new Scanner(System.in);

        System.out.println();
        System.out.println("Flight info");
        System.out.println("---");
        System.out.print("Enter flight number:");

        String input = inputReader.next().toLowerCase();
        System.out.println("got input: " + input);
    }
}