package tdd;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SuperMarketTest {

    @Test

    void MenuOfProducts(){
        SuperMarket availableProducts = new SuperMarket();
        availableProducts.displayProducts("book","bag", "shoe");
    }

    @Test

    void SelectProduct(){
        SuperMarket availableProduct = new SuperMarket();
        availableProduct.selectProduct(3);
    }
}
