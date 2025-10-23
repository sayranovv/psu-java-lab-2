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

            System.out.println("------------ Задача 2 | Задание 2 ------------");

            Name n1 = new Name(null, "Клеопатра", null);
            Name n2 = new Name("Пушкин", "Александр", "Сергеевич");
            Name n3 = new Name("Маяковский", "Владимир", null);

            PersonWithName p1 = new PersonWithName(n1, 152);
            PersonWithName p2 = new PersonWithName(n2, 167);
            PersonWithName p3 = new PersonWithName(n3, 189);

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);

        } else if (exercise == 3 && task == 3) {

            System.out.println("------------ Задача 3 | Задание 3 ------------");

            City a = new City("A");
            City b = new City("B");
            City c = new City("C");
            City d = new City("D");
            City e = new City("E");
            City f = new City("F");

            a.addPath(b, 5);
            a.addPath(f, 1);
            a.addPath(d, 6);
            b.addPath(a, 5);
            b.addPath(c, 3);
            c.addPath(b, 3);
            c.addPath(d, 4);
            d.addPath(a, 6);
            d.addPath(c, 4);
            d.addPath(e, 2);
            e.addPath(f, 2);
            f.addPath(b, 1);
            f.addPath(e, 2);

            System.out.println("Реализованная схема:");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);


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