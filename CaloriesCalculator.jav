import java.util.Scanner;

public class CaloriesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Running minutes: ");
        int run = sc.nextInt();

        System.out.print("Push-ups minutes: ");
        int push = sc.nextInt();

        System.out.print("Planks minutes: ");
        int plank = sc.nextInt();

        int runningCalories = (run / 5) * 60;
        int pushupCalories = (push / 30) * 200;
        int plankCalories = plank * 5;

        int totalCalories = runningCalories + pushupCalories + plankCalories;

        System.out.println("Total calories burned: " + totalCalories);

        sc.close();
    }
}
