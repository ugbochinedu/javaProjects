package CommandLIne;

public class CommandLine {

    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("You must enter at least two numbers, please try again");
            System.exit(0);
        }else {
            CommandLine.setMaximum(args);
        }
    }

    public static void setMaximum(String[] arg) {
        int numbers;
        //int sum = 0;
        int numMax = Integer.parseInt(arg[0]);
        int numMin = Integer.parseInt(arg[0]);

        for (int counter = 0; counter < arg.length; counter++) {
            numbers = Integer.parseInt(arg[counter]);
            //sum = sum + numbers;
            if (numbers > numMax) numMax = numbers;
            if (numbers < numMin) numMin = numbers;
        }
        double average = (double) (numMax + numMin) / 2;

        System.out.printf("The average between the maximum number and minimum number is: %2f", average);
    }
}
