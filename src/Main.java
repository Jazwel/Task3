public class Main {
    public static void main(String[] args) {
        int addAmount = 1200;
        int startBalance = 100;
        int bonus = (addAmount / 100);

        if (addAmount > 1000) {
            System.out.println("Начисленный бонус:");
            System.out.println(bonus);
            int finalBalance = bonus + addAmount + startBalance;
            System.out.println("Сумма на счету");
            System.out.println(finalBalance);
        } else {
            System.out.println("Начисленный бонус:0");
            System.out.println("Сумма на счету:");
            int finalBalance = addAmount + startBalance;
            System.out.println(finalBalance);


        }
    }
}
