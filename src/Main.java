public class Main {
    public static void main(String[] args) {
        int addAmount = 2000;
        int startBalance = 100;
        int bonus = (addAmount / 100);
        int finalBalance = bonus + addAmount + startBalance;
        boolean enoughPayment = addAmount > 1000;
        boolean notEnough = addAmount < 1000;

        if (enoughPayment) {
            System.out.println("Начисленный бонус:");
            System.out.println(bonus);
            System.out.println("Сумма на счету:");
            System.out.println(finalBalance);
        }


    }
}
