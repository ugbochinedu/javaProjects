package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class SuperMarketTest {

    @Test

    void SuperMarket(){
        //given a price List in a superMarket
        PriceList priceList = new PriceList();
        //display menu - shoe, bag, book
        String menu = priceList.displayMenu();
        // check
        assertEquals(menu, priceList.displayMenu());
    }

    @Test

    void setBookPrice(){
        PriceList priceList = new PriceList();
        int totalPriceOfBooks = priceList.setBookPrice(3);
        assertEquals(600,totalPriceOfBooks);
    }
    @Test
    void setBagPrice(){
        PriceList priceList = new PriceList();
        int totalPriceOfBags = priceList.setBagPrice(3);
        assertEquals(1200, totalPriceOfBags);
    }

    @Test
    void setShoePrice(){
        PriceList priceList = new PriceList();
        int totalPriceOfShoes = priceList.setShoePrice(3);
        assertEquals(2100, totalPriceOfShoes);
    }

//    @Test
//
//    void UserInput(){
//        PriceList priceList = new PriceList();
//        int userInput = priceList.getUserInput();
//        assertEquals(0, userInput);
//    }

//    @Test

//    void userChoice(){
//        PriceList priceList =  new PriceList();
//        String userChoice = priceList.proceed("No");
//        assertEquals("No", userChoice );
//    }

//    @Test

//    void loopMenu(){
//        PriceList priceList = new PriceList();
//        String returnMenu = priceList.displayMenu();
//        assertEquals("shoe",returnMenu);
//    }

}

