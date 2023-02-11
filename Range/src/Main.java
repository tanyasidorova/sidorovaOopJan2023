import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Range range = new Range(1, 20);

        System.out.println("Начало диапазона: " + range.getFrom());
        System.out.println("Конец диапазона: " + range.getTo());
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        double dot = scanner.nextDouble();

        System.out.println(range.isInside(dot));
        System.out.println();

        System.out.print("Длина диапазона: от " + range.getFrom() + " до " + range.getTo());

        System.out.println();

        range.setFrom(12);
        range.setTo(36);
        System.out.println(range.getFrom());
        System.out.println(range.getTo());

        System.out.println("Длина диапазона: " + range.getLength());
    }
}
