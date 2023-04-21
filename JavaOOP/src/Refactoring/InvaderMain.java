package Refactoring;

public class InvaderMain {
    public static void main(String[] args) {
        InvaderGames invaderGames = new InvaderGames();
        Invader invader = new Invader();
        invaderGames.draw(invader);
    }
}
