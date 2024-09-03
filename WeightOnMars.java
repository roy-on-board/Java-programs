import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber, opt, add, sub, mul;
        double div;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNumber = s.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = s.nextInt();

        while (true) {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to Exit");
            int option = s.nextInt();
            switch (option) {
                case 1:
                    add = firstNumber + secondNumber;
                    System.out.println("Result:" + add);
                    break;

                case 2:
                    sub = firstNumber - secondNumber;
                    System.out.println("Result:" + sub);
                    break;

                case 3:
                    mul = firstNumber * secondNumber;
                    System.out.println("Result:" + mul);
                    break;

                case 4:
                    div = (double) firstNumber / secondNumber;
                    System.out.println("Result:" + div);
                    break;

                case 5:
                    System.exit(0);

            }
        }

    }
}