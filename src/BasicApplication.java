import java.util.Scanner;

    public class BasicApplication {
        public static void main(String [] args){
            Scanner num = new Scanner(System.in);
            System.out.println("Enter a number: ");

            int userNum = num.nextInt();
            int sum = userNum + 5;
            int doubleSum = sum * 2;
            int minusSum = doubleSum - 7;
            System.out.println("The final result is: " + minusSum);

        }
    }


