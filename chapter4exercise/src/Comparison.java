public class Comparison {
    public int addThreeIntegers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int findMinimum(int num1,int num2,int num3) {
        if(num1 < num2 && num1 <num3){
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        }else return num3;
    }

    public int productAnswer(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public int averageOfNumbers(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public int getLargestNumber(int num1, int num2, int num3) {
        if(num1 > num2 && num1 > num3){
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else return num3;
    }
}
