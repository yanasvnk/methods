import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2022;
        printIsLeapYear(year);
        int clientOS = 1;
        int deviceYear = 2023;
        recommendAppVersion (clientOS, deviceYear);
        int deliveryDistance = 110;
        calculateDeliveryDays(deliveryDistance);



    }

    // Домашнее задание
    // Задача 1
    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    // Задача 2
    public static void recommendAppVersion (int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld (deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("lite ");
        }
        System.out.print("версию для ");
        if (clientOS==0) {
            System.out.println("iOS");
        } else {
            System.out.println("Android");
        }
    }
    public static boolean isDeviceOld (int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

    // Задача 3
    public static void calculateDeliveryDays(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance<=20) {
            System.out.println("Потребуется дней " + days);
        }
        else if (deliveryDistance > 20 && deliveryDistance<= 60) {
            days++;
            System.out.println("Потребуется дней " + days);
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней 3");
        }
        else {
            System.out.println("Невозможно рассчитать срок доставки");
        }

        }
    }







