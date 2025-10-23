import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер задания:");
        int exercise = sc.nextInt();

        System.out.println("Введите номер задачи:");
        int task = sc.nextInt();

        boolean valid = true;

        if (exercise == 1 && task == 2) {

            System.out.println("------------ Задача 1 | Задание 2 ------------");

            Person p1 = new Person("Клеопатра", 152);
            Person p2 = new Person("Пушкин", 167);
            Person p3 = new Person("Владимир", 189);

            System.out.println("Созданные люди:");
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);

        } else if (exercise == 1 && task == 3) {

            System.out.println("------------ Задача 1 | Задание 2 ------------");

            Name n1 = new Name(null, "Клеопатра", null);
            Name n2 = new Name("Пушкин", "Александр", "Сергеевич");
            Name n3 = new Name("Маяковский", "Владимир", null);

            System.out.println("Созданные имена:");
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);

        } else if (exercise == 2 && task == 2) {

        } else if (exercise == 3 && task == 3) {

        } else if (exercise == 4 && task == 8) {

        } else if (exercise == 5 && task == 5) {

        } else {
            valid = false;
        }

        if (!valid) {
            System.out.println("Нет такой задачи!");
        }

        sc.close();
    }
}