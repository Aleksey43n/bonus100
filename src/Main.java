public class Main {
    public static void main(String[] args) {
        int amount = 100; // имеется на счёте
        int topUp = 1000;// сумма пополнения
        int sum1 = amount + topUp;
        int bonus = topUp / 100;
        if (topUp >= 1000) {
            int sum2 = bonus + sum1;
            System.out.println("Бонус составил: " + bonus);
            System.out.println("На счете: " + sum2);
        } else {
            System.out.println("На счете: " + sum1);
        }
    }
}
