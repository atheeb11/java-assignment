import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade: ");
        int grade = sc.nextInt();

        if (grade >= 70 && grade <= 100) {
            System.out.println("Pass");
        } else if (grade >= 0 && grade <= 69) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
