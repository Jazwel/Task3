public class Main {
    public static void main(String[] args) {
        int payment = 500;
        int balance = 50;
        int bonus = (payment / 100) + payment;
        int total = bonus + balance;
        boolean enoughPayment = payment > 1000;
        boolean notEnough = payment < 1000;
        int plus = 1000 - payment;
        if (enoughPayment) {

            System.out.println(total);
        } else {
            System.out.println(" Для получения бонусаПополните счет еще на");
            System.out.println(plus);


        }
    }
}