import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество рублей: ");
        long hryvnia = scanner.nextLong();

        System.out.print("Введите количество копеек: ");
        byte kopiyka = scanner.nextByte();

        Money money1 = new Money(hryvnia, kopiyka);

        System.out.print("Введите количество рублей для второй суммы: ");
        hryvnia = scanner.nextLong();

        System.out.print("Введите количество копеек для второй суммы: ");
        kopiyka = scanner.nextByte();

        Money money2 = new Money(hryvnia, kopiyka);

        System.out.println("Первая сумма:");
        money1.displayAmount();

        System.out.println("Вторая сумма:");
        money2.displayAmount();

        System.out.println("Сумма:");
        Money sum = money1.add(money2);
        sum.displayAmount();

        System.out.println("Разность:");
        Money difference = money1.subtract(money2);
        difference.displayAmount();

        System.out.println("Деление на число:");
        System.out.print("Введите число: ");
        double divisor = scanner.nextDouble();
        Money division = money1.divide(divisor);
        division.displayAmount();

        System.out.println("Умножение на число:");
        System.out.print("Введите число: ");
        double multiplier = scanner.nextDouble();
        Money multiplication = money1.multiply(multiplier);
        multiplication.displayAmount();

        System.out.println("Сравнение:");
        int comparison = money1.compare(money2);
        if (comparison < 0) {
            System.out.println("Первая сумма меньше второй");
        } else if (comparison > 0) {
            System.out.println("Первая сумма больше второй");
        } else {
            System.out.println("Суммы равны");
        }
    }
}
