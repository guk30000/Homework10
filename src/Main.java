import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        checkYear(2024);
        checkYear(2020);
        checkYear(2017);

        //Задача 2
        System.out.println("Задача 2");
        checkDevice(0, 2024);
        checkDevice(1, 2024);
        checkDevice(1, 2015);
        checkDevice(1, 2253);

        //Задача 3
        System.out.println("Задача 3");
        int days = checkDelivery(95);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }


    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkDevice(int clientOS, int year) {
        int currentYear = LocalDate.now().getYear();
        String result;
        if (year > currentYear) {
            System.out.println("Год не может быть больше " + currentYear);
            return;
        }
        if (year < currentYear) {
            result = (clientOS == 0)
                    ? "Установите облегченную версию для iOS по ссылке"
                    : "Установите облегченную версию для Android по ссылке";
        } else {
            result = (clientOS == 0)
                    ? "Установите версию для iOS по ссылке"
                    : "Установите версию для Android по ссылке";
        }
        System.out.println(result);
    }

    public static int checkDelivery(int distance) {
        if (distance > 100) {
            return -1;
        }
        int days = 1;
        if (distance >= 20) {
            days++;
        }
        if (distance >= 60) {
            days++;
        }
        return days;
    }
}
