package airLine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class airLineTest {

    private AirLine airLine;

    @BeforeEach

    void setUp(){
        airLine = new AirLine();
    }

    @Test

    public void testFemiAirLineHasTenSeats(){
        //when
        boolean[] seats = airLine.getSeats();
        //assert
        assertEquals(10,seats.length);
    }

    @Test

    public  void testThatPlaneSeatsAreUnoccupiedByDefault(){
        //when
        boolean[] seats = airLine.getSeats();
        boolean[] expected = {false,false,false,false,false,false,false,false,false,false};
        assertArrayEquals(expected,seats);
    }

    @Test
    public void testThatCustomersCanBookFirstClassPlaneTicket(){
        //when
        int firstClassTicketBooking = 1;
       airLine.bookTicket(firstClassTicketBooking);
       assertTrue(airLine.getSeats()[0]);
    }

    @Test
    public void testThatCustomerCanBookEconomyClassTicket(){
        int economyClassTicketBookingRequest = 2;
        airLine.bookTicket(economyClassTicketBookingRequest);
        assertTrue(airLine.getSeats()[5]);
    }

    @Test
    public void testThatExceptionIsThrownWhenBookingCategoryIsInvalid(){
        int invalidBookingCategory = 3;
       // assertThrows( RuntimeException, airLine.bookTicket(invalidBookingCategory);)
    }
}
