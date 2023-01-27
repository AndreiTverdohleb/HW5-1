public class Main {
    public static void main(String[] args) {
     task1();
     task2();
     task3();
     task4();
    }
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
            }
    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int consumption = 0;
        for (int i = 0;i< arr.length; i++) {
            consumption = consumption + arr[i];}
        System.out.println("Сумма трат за месяц составила "+consumption+" рублей.");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maximumFlow =-1;
        for (int i = 0;i< arr.length; i++) {
            if (arr[i]>maximumFlow)
                maximumFlow=arr[i];}
            System.out.println(maximumFlow);
        int minimumFlow = maximumFlow;
        for (int i = 0;i< arr.length; i++) {
            if (arr[i]<minimumFlow)
                minimumFlow=arr[i];}
        System.out.println(minimumFlow);
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int maximumFlow1 =0;
        for (int i = 0;i< arr.length; i++) {
            maximumFlow1 = maximumFlow1 + arr[i];}
        double sum = maximumFlow1/arr.length;
        System.out.println(sum);
        System.out.println();

    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}