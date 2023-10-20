package task3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Plane plane1 = new Plane("Airbus A320", 120);
        Plane plane2 = new Plane("Boeing 747", 220);


        Airport airport1 = new Airport("Airport AAA");
        Airport airport2 = new Airport("Airport BBB");
        Airport airport3 = new Airport("Airport CCC");

        Flight flight1 = new Flight("Flight ABC", plane1);
        Flight flight2 = new Flight("Flight CBA", plane2);

        Passenger passenger1 = new Passenger("John", "Jo");
        Passenger passenger2 = new Passenger("Mak", "Ma");

        Ticket ticket1 = new Ticket(LocalDate.of(2023, 10, 22), passenger1, flight1, airport2, 150);
        Ticket ticket2 = new Ticket(LocalDate.of(2023, 10, 23), passenger2, flight2, airport1, 170);

        LocalDate dateStart = LocalDate.of(2023, 10, 15);
        LocalDate dateEnd = LocalDate.of(2023, 10, 25);

        Company company = new Company();
        company.addAirport(airport1);
        company.addAirport(airport2);
        company.addAirport(airport3);
        company.addFlight(flight1);
        company.addFlight(flight2);
        company.addTicket(ticket1);
        company.addTicket(ticket2);

        company.showAllFlights();
        company.showPriceForPeriod(dateStart, dateEnd);
    }
}
