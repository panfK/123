import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, m, x;
        double D, x1, x2, B;
        System.out.println("выберите действие:");
        System.out.println("1-сложение");
        System.out.println("2-умножение");
        System.out.println("3-вычитание");
        System.out.println("4-деление");
        System.out.println("5-вычисление квадратного уравнения");
        System.out.println("выберите цифру данного действия");
        x =scanner.nextInt();
        if (x==1) {
            System.out.println("введите первое число");
            a = scanner.nextInt();
            System.out.println("введите второе число");
            b = scanner.nextInt();
            m = (a+b);
            System.out.println(m);
        }
        else if (x==2) {
            System.out.println("введите первое число");
            a = scanner.nextInt();
            System.out.println("введите второе число");
            b = scanner.nextInt();
            m = (a*b);
            System.out.println(m);
        }
        else if (x==3) {
            System.out.println("введите первое число");
            a = scanner.nextInt();
            System.out.println("введите второе число");
            b = scanner.nextInt();
            m = (a-b);
            System.out.println(m);
        }
        else if (x==4) {
            System.out.println("введите первое число");
            a = scanner.nextInt();
            System.out.println("введите второе число");
            b = scanner.nextInt();
            m = (a/b);
            System.out.println(m);
        }
        else if (x==5) {
            System.out.println("введите первое число");
            a = scanner.nextInt();
            System.out.println("введите второе число");
            B = scanner.nextInt();
            System.out.println("введите третье число");
            c = scanner.nextInt();
            D = Math.sqrt(B*B-4*a*c);
            if (D>0) {
                x1 = (-B + D) / (a * 2);
                x2 = (-B - D) / (a * 2);
                System.out.println(x1);
                System.out.println(x2);
            }
            else if (D==0) {
                x1 = (-B) / (a * 2);
                System.out.println(x1);
            }
            else
                System.out.println("корней нет");
        }
        else {
            System.out.println("Вы неправильно ввели значение");
        }
    }
}