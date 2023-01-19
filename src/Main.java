public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() { // объявление метода сгенерироватьМассив
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();//объявление массива и вызов метода «сгенерироватьМассив»
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minDailySum = arr[0];
        int maxDailySum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minDailySum) {
                minDailySum = arr[i];
            }
            if (arr[i] > maxDailySum) {
                maxDailySum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDailySum + " рублей." +
                " Максимальная сумма трат за день составила " + maxDailySum + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        double averageDailySum = (double) sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageDailySum + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
