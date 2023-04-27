package CardGame;

public class DeckOfCardsMain {
    public static void main(String[] args) {
        DeskOfCard myDeskOfCards = new DeskOfCard();
        myDeskOfCards.shuffle();

        for (int i = 0; i < 52; i++) {
            System.out.printf("%-19s", myDeskOfCards.dealCard());

            if (i % 4 == 0){
                System.out.println();
            }
        }
    }
}
