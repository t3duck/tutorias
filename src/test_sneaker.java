import java.util.Scanner;

public class test_sneaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var sneaker_12 = new sneaker();
        System.out.println("dame la marca");
        sneaker_12.setMarca();
        String marca = scanner.nextLine();
    }
}
