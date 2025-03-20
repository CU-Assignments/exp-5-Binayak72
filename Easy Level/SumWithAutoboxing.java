import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumWithAutoboxing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            numbers.add(scanner.nextInt()); // Autoboxing
        }

        // Calculate sum using unboxing
        int sum = calculateSum(numbers);

        // Display result
        System.out.println("Sum of numbers: " + sum);

        scanner.close();
    }

    // Method to calculate sum with unboxing
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing occurs here
        }
        return sum;
    }
}
