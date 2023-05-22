package Exceptions;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Favour", new BigDecimal(20));
        try{
            String message = customer.withdraw(80.90);
            System.out.println(message);
            System.out.println(customer);
        }catch (TrenchesException exception){
            System.out.println("ERROR "+ exception.getMessage());
        }finally {
            System.out.println(customer);
            System.out.println("Thanks for Banking with us");
        }
    }
}
