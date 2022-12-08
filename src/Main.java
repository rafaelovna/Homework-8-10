public class Main {
    public static void main(String[] args) {
        task8();
        task9();
        task10();
    }
    public static void task8() {
        System.out.println("Задача 8");
        int capital = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + capital;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
        public static void task9() {
            System.out.println("Задача 9");
            int capital = 29000;
            int total = 0;
            for (int i = 1; i <= 12; i++) {
                total = total + total / 100;
                total = total + capital;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
    }
        public static void task10() {
            System.out.println("Задача 10");
            int a = 2;
            for (int i = 1; i <= 10; i++){
                int b = a * i;
                    System.out.println(a+" * "+i+" = "+b);
                }
    }
}