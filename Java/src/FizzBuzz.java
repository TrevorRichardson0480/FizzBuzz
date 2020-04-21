// ================================================
// # FizzBuzz Java Edition
// ================================================

public class FizzBuzz {

    public static void main(String[] args) {

        // Set variables for fizz, buzz, and duration
        int fizzWhen = 3;
        int buzzWhen = 5;
        int fizzBuzzFor = 100;

        // loop through the duration and find all the fizzes, buzzes, and fizzbuzzes
        for (int i = 1; i < fizzBuzzFor + 1; i++) {

            if (i % buzzWhen == 0 && i % fizzWhen == 0) {
                System.out.println("FizzBuzz!");

            } else if (i % fizzWhen == 0) {
                System.out.println("Fizz!");

            } else if (i % buzzWhen == 0) {
                System.out.println("Buzz!");

            } else {
                System.out.println(i);

            }
        }
    }
}
