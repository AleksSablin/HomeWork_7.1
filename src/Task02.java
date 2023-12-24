import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Задание 2");
        Scanner scanner = new Scanner(System.in);
        List<Range2> ranges = new ArrayList<>();

        System.out.print("Введите количество диапазонов: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите начальную точку для диапазона " + (i + 1) + ": ");
            int start = scanner.nextInt();

            System.out.print("Введите конечную точку для диапазона " + (i + 1) + ": ");
            int end = scanner.nextInt();

            Range2 range = new Range2();
            range.setStart(start);
            range.setEnd(end);
            ranges.add(range);
        }

        for (Range2 range : ranges) {
            if (range.isValid()) {
                System.out.println("Длина диапазона: " + range.getLength());
            } else {
                System.out.println("Ошибка: начало диапазона больше, чем конец");
            }
        }

        System.out.println("Проверка пересечения диапазонов:");
        for (int i = 0; i < ranges.size() - 1; i++) {
            for (int j = i + 1; j < ranges.size(); j++) {
                Range2 range1 = ranges.get(i);
                Range2 range2 = ranges.get(j);

                if (range1.isIntersecting(range2)) {
                    System.out.println("Диапазон " + (i + 1) + " пересекается с диапазоном " + (j + 1));
                } else {
                    System.out.println("Диапазон " + (i + 1) + " не пересекается с диапазоном " + (j + 1));
                }
            }
        }
    }
}