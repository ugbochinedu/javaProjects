public class CalculatePie {

    public void solveForPie(){
        int num = 1;
        int termNumber = 150000;
        double total = 0;
        int i;
        for (i = 1; i <= termNumber; i++) {
            if(i % 2 == 1) total += 4.0/num;
            else  total -= (4.0 / num);

            num= num +2;
            System.out.printf(" %d----%.5f%n",i,total);
            if (total == 3.14159) System.out.println(i);
        }
    }
}
