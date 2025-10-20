import java.util.Scanner;

public class MoonComputerTests {

    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your request: ");
        String input = scanner.nextLine();
        System.out.println(input);
        scanner.close();
    }

    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        computerTests.testBasicInputOutput();
    }
}
