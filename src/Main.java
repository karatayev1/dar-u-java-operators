// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1
        int i = 10, j = 5;
        System.out.println("10 * 5 = " + (i * j));

        // 2
        int a = 20;
        float f = 2.5f;
        System.out.println("20 / 2.5 = " + a / f);

        // 3
        int l = 15, w = 9;
        System.out.println("Площадь прямоугольника 15 на 9: " + (l * w));
        System.out.println("Периметр прямоугольника 15 на 9: " + (2 * (l + w)));

        // 4
        int x = 1;
        System.out.println("Префиксная форма увеличеия: " + ++x);
        System.out.println("Постфиксная форма увеличеия: " + x++);

        // 5
        x += 5;
        System.out.println("Присваивание сложение: " + x);

        // 6
        int b = 25, c = 43;
        boolean equals;
        equals = b == c;
        System.out.println("Равенство числел " + b + " и " + c + " = " + equals);

        // 7
        int g = 10, h = 5;
        System.out.println("Сложение: " + (g + h));
        System.out.println("Вычитание: " + (g - h));
        System.out.println("Умножение: " + (g * h));
        System.out.println("Деление: " + (g / h));
        System.out.println("Деление по модулю: " + (g % h));

        // 8
        double cel, fr = 80;
        cel = (fr - 32) * 5 / 9;
        System.out.println(fr + " градус Фаренгейта = " + cel + " градус Цельсия");

        // 9
        int k = 10, m = 451, n = 3, p = 5, q = 5;
        double result = (((k + m) / n) + p) * 5;
        System.out.println(result);

        // 10
        int r = 65, s = 80;
        System.out.println(r < 50);
        System.out.println(r < s);
    }
}