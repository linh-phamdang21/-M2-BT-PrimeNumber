import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber < 2){
            System.out.println(inputNumber + " is Not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(inputNumber)) {
                if (inputNumber % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(inputNumber + " is a prime");
            else
                System.out.println(inputNumber + " is not a prime");
        }
    }
}

