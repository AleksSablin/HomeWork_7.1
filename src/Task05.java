import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание 5");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вещественную часть первого комплексного числа: ");
        double real1 = scanner.nextDouble();

        System.out.println("Введите мнимую часть первого комплексного числа: ");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Введите вещественную часть второго комплексного числа: ");
        double real2 = scanner.nextDouble();

        System.out.println("Введите мнимую часть второго комплексного числа: ");
        double imaginary2 = scanner.nextDouble();

        ComplexNumber complexNumber1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber complexNumber2 = new ComplexNumber(real2, imaginary2);

        System.out.println("Первое комплексное число: " + complexNumber1.getReal() + " + " + complexNumber1.getImaginary() + "i");
        System.out.println("Второе комплексное число: " + complexNumber2.getReal() + " + " + complexNumber2.getImaginary() + "i");

        ComplexNumber sum = complexNumber1.add(complexNumber2);
        System.out.println("Сумма комплексных чисел: " + sum.getReal() + " + " + sum.getImaginary() + "i");

        ComplexNumber difference = complexNumber1.subtract(complexNumber2);
        System.out.println("Разность комплексных чисел: " + difference.getReal() + " + " + difference.getImaginary() + "i");

        ComplexNumber product = complexNumber1.multiply(complexNumber2);
        System.out.println("Произведение комплексных чисел: " + product.getReal() + " + " + product.getImaginary() + "i");

        boolean isEqual = complexNumber1.equals(complexNumber2);
        System.out.println("Комплексные числа равны: " + isEqual);
    }
    }

