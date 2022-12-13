package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BabyTest {

    @Test
    public void requiredArgsConstructorsTest(){
        Baby babym = new Baby(7);
        assertEquals(7, babym.getWeightInKg());
        assertEquals(0, babym.getAge());
        assertEquals(null,babym.getName());



        Baby babymu = new Baby();
        assertEquals(0, babymu.getWeightInKg());
        assertEquals(0, babymu.getAge());
        assertEquals(null, babymu.getName());

        Baby davidJnr = new Baby("David Junior");
        Baby legendSnr = new Baby("legend charles", 9);
    }

}