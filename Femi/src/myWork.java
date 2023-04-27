import java.util.Arrays;

public class myWork {
    public static void main(String[] args) {
//        String words = "Hello world, I am here to transform the process of tech";
//        String words1 = "Hello world";
//
//
//        for (int i = words1.length() - 1; i >= 0; i--) {
//            char letters = words1.charAt(i);
//            System.out.println(letters);
//        }

//        String s1 = new String("edu");
//        String s2 = new String("edu");
//
//        if (s1 == s2){
//            System.out.println("true, they are the same objects");
//        } else {
//            System.out.println("false, they are not the same object");
//        }
//
//        if (s1.equals(s2)){
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//        String s = "chinedu";
//        String m = s.toUpperCase();
//        char[] cha = s.toCharArray();
//        System.out.println(cha);
//        for (char ch:cha) {
//            System.out.println(ch);
//        }
        //System.out.println(m);


//        String[] arr = {"Ugbo", "Chinedu", "Aba", "Ballow"};
//
//        for (int i = 0; i < arr.length; i++) {
//                if (arr[i].charAt(0) > arr[i + 1].charAt(0)){
//                    System.out.println(arr[i]);
//                }else{
//                    System.out.println(arr[i]);
//                }
//        }
//        String newWord = words.replace("l","L");
//        System.out.println(newWord);
//
//        String changeSentence = words.replace("I am here to", "transform the process");
//        System.out.println(changeSentence);
//        changeSentence = words.replace("transform the process","I am here to" );
//        System.out.println(changeSentence);
//        char[] charArray = {'a','e','f'};
//       String change = String.valueOf(charArray);
//        System.out.println(change);
//        System.out.println(change.getClass());

        StringBuilder stringBuilder = new StringBuilder("my football");
        StringBuilder builder = new StringBuilder();
//        System.out.println(stringBuilder.charAt(0));
//        char[] cha = new char[stringBuilder.length()];
//        stringBuilder.getChars(0,stringBuilder.length(),cha, 0);
//        System.out.println(cha);
//        stringBuilder.reverse();
//        System.out.println(stringBuilder);
//
//        String me = "The name you called me is unacceptable";
//        String splitIt = Arrays.toString(me.split(" "));
//        System.out.println( splitIt.replace("you","me"));
//        System.out.println(splitIt);

        String s = new String("ugbo");
        s.concat("Software");
        System.out.println(s);
    }
}
