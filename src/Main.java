public class Main {
    public static void main(String[] args) {
        int payment = 2000;
        int balance = 100;
        int bonus = (payment / 100) + payment;
        int total = bonus + balance;
        boolean enoughPayment = payment > 1000;
        boolean notEnough = payment < 1000;
        int countBonus = (payment / 100);
        int plus = 1000 - payment;
        if (enoughPayment) {
            System.out.println("Начисленный бонус:");
            System.out.println(countBonus);
            System.out.println("Сумма на счету:");
            System.out.println(total);
        } else {
            System.out.println("Оплата");
            System.out.println(payment);
            System.out.println(" Для получения бонуса Пополните счет еще на:");
            System.out.println(plus);


        }
    }
}