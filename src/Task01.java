import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01 {public static void main(String[] args) {
    System.out.println("Задание 1");
    Scanner scanner = new Scanner(System.in);
    List<Range> ranges = new ArrayList<>();

    System.out.print("Введите количество диапазонов: ");
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
        System.out.print("Введите начальную точку для диапазона " + (i + 1) + ": ");
        int start = scanner.nextInt();

        System.out.print("Введите конечную точку для диапазона " + (i + 1) + ": ");
        int end = scanner.nextInt();

        Range range = new Range();
        range.setStart(start);
        range.setEnd(end);
        ranges.add(range);
    }

    for (Range range : ranges) {
        if (range.isValid()) {
            System.out.println("Длина диапазона: " + range.getLength());
        } else {
            System.out.println("Ошибка: начало диапазона больше, чем конец");
        }
    }
}
}
