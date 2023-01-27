package PrintEvenElement;

public class PrintEvenElement {
    int[] array = {2,3,5,67,4,67,45,6};
    public void printEvenElement(){
        for (int arrayCounter = 1; arrayCounter < array.length; arrayCounter +=2) {
                System.out.println(array[arrayCounter]);
        }

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) System.out.println(array[i]);
        }
    }
}
