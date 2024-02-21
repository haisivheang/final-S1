import java.util.Scanner;

class NumberListProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Input Numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        scanner.close();
    }
}
