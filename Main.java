import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int slow = 1;
        int medium = 2;
        int fast = 3;
        String color = "Blue";
        int radius = 5;
        int number;
        System.out.println(".Thông tin quạt.");
        Fan fan = new Fan();

        //Bật tắt quạt
        System.out.println("1. Bật quạt");
        System.out.println("2. Tắt quạt");
        System.out.print("Chọn: ");
        number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Quạt bật tốc độ: " + slow + " " + fan.setTurnOn() + " " + fan.getSpeed());
            System.out.println(fan.Fan1());
            System.out.println(fan.Fan2());
        } else {
            System.out.println(fan.setTurnOff());
            System.out.println("Quạt tắt");
            System.exit(0);
        }

    }

}
