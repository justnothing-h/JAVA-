package javaprograms;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

class Flight {
    String flightId, source, destination;
    int availableSeats;
    double price;

    public Flight(String id, String src, String dest, int seats, double p) {
        this.flightId = id;
        this.source = src;
        this.destination = dest;
        this.availableSeats = seats;
        this.price = p;
    }

    public void display() {
        System.out.printf("%-10s | %-12s -> %-12s | Seats: %-3d | Price: ₹%.2f\n",
                          flightId, source, destination, availableSeats, price);
    }
}

public class FlightManagementSystem {
    private static List<Flight> flights = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Initial Data
        flights.add(new Flight("AI-101", "Delhi", "Mumbai", 50, 5000));
        flights.add(new Flight("IX-202", "Indore", "Bangalore", 40, 4500));
        flights.add(new Flight("UK-303", "Jaipur", "Delhi", 30, 3500));

        System.out.println("Welcome, Harshit Choudhary!");
        
        while (true) {
            System.out.println("\n========================================");
            System.out.println("   IIST FLIGHT MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. View Available Flights");
            System.out.println("2. Book a Ticket (Generate E-Ticket)");
            System.out.println("3. Exit");
            System.out.print("Select Option: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1: showFlights(); break;
                case 2: bookTicket(); break;
                case 3: 
                    System.out.println("Thank you for using our system. Goodbye!");
                    return;
                default: System.out.println("Invalid Selection!");
            }
        }
    }

    private static void showFlights() {
        System.out.println("\n%-10s | %-12s    %-12s | %-10s | %-10s".formatted("ID", "FROM", "TO", "SEATS", "PRICE"));
        System.out.println("----------------------------------------------------------------------");
        for (Flight f : flights) f.display();
    }

    private static void bookTicket() {
        System.out.print("\nEnter Flight ID to book: ");
        String id = sc.nextLine();
        
        for (Flight f : flights) {
            if (f.flightId.equalsIgnoreCase(id)) {
                if (f.availableSeats > 0) {
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();
                    
                    try {
                        applyLoadingEffect(); // Visual flair
                        f.availableSeats--;
                        generateETicket(name, f); // File Handling
                        System.out.println("\n[SUCCESS] Ticket booked for " + name);
                    } catch (InterruptedException e) {
                        System.out.println("Error during processing.");
                    }
                    return;
                } else {
                    System.out.println("Flight is currently full!");
                    return;
                }
            }
        }
        System.out.println("Error: Flight ID not found.");
    }

    private static void applyLoadingEffect() throws InterruptedException {
        System.out.print("Validating Payment and Generating Ticket");
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            System.out.print(".");
        }
        System.out.println("\n");
    }

    private static void generateETicket(String name, Flight f) {
        String fileName = name.replace(" ", "_") + "_Ticket.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("--------------------------------------\n");
            writer.write("       BOARDING PASS - IIST AIR       \n");
            writer.write("--------------------------------------\n");
            writer.write("Passenger Name : " + name + "\n");
            writer.write("Flight ID      : " + f.flightId + "\n");
            writer.write("Route          : " + f.source + " to " + f.destination + "\n");
            writer.write("Fare           : ₹" + f.price + "\n");
            writer.write("Status         : CONFIRMED\n");
            writer.write("--------------------------------------\n");
            System.out.println("Digital Ticket saved as: " + fileName);
        } catch (IOException e) {
            System.out.println("Could not generate text file.");
        }
    }
}