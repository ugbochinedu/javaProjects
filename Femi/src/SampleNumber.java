import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleNumber {
    public void factorsOfNumbers(int num){
        List<Integer> answerArray = new ArrayList<>();
        int counter = 0;
        for (int divisor = 2; divisor <= num; divisor++) {
            if(num % divisor == 0 ) {
                answerArray.add(divisor);
                num = num / divisor;
                while (num !=0 && num%divisor == 0){
                    answerArray.add(divisor);
                }
//                do {
//                    num = num / divisor;
//                    answerArray.add(divisor);
//                    counter++;
//                } while (num != 0 && num % divisor == 0);
            }
        }
        appendToArray(answerArray);
    }

    public void appendToArray(List<Integer> answerArray){
        int[] resultArray = new int[answerArray.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = answerArray.get(i);
        }
        System.out.println(Arrays.toString(resultArray));
    }
//    public int divisibleByTwo(int givenNumber) {
//        int ans = 0;
//        if (givenNumber % 2 == 0) {
//            ans = givenNumber / 2;
//            answerArray.add(2);
////            int secondAns = 0;
////            if (ans % 2 == 0) {
////                secondAns = ans / 2;
////                answerArray.add(2);
////            } else {
////                //divisibleByThree(secondAns);
////            }
//        }
//        return ans;
//    }
//
//    public int divisibleByThree(int giveNumber) {
//        int ansFromThree = 0;
//        if (giveNumber % 3 == 0) {
//            ansFromThree = giveNumber / 3;
//            answerArray.add(3);
//        }
//        return ansFromThree;
//    }
//
//    public int divisibleByFive(int giveNumber) {
//        int ansFromFive = 0;
//        if (giveNumber % 5 == 0) {
//            ansFromFive = giveNumber / 5;
//            answerArray.add(3);
//        }
//        return ansFromFive;
//    }
//
//    public int divisibleBySeven(int givenNumber) {
//        int ansFromSeven = 0;
//        if (givenNumber % 7 == 0) {
//            ansFromSeven = givenNumber / 7;
//            answerArray.add(7);
//        }
//        return ansFromSeven;
//    }
//
//    public int divisibleByEleven(int givenNumber) {
//        int ansFromEleven = 0;
//        if(givenNumber % 11 == 0){
//            ansFromEleven = givenNumber / 11;
//            answerArray.add(11);
//        }
//        return ansFromEleven;
//    }
//
//    public int divisibleByThirteen(int givenNumber) {
//        int ansFromThirteen = 0;
//        if(givenNumber % 13 == 0){
//            ansFromThirteen = givenNumber / 13;
//            answerArray.add(13);
//        }
//        return ansFromThirteen;
//    }
}
