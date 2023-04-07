public class Main {
    public static void main(String[] args) {
        int payment = 500;
        int balance = 50;
        int bonus = (payment / 100) + payment;
        int total = bonus + balance;
        boolean correct = payment > 1000;
        boolean not = payment < 1000;
        int plus = 1000 - payment;
        if (correct) {

            System.out.println(total);
        } else if (not) {
            System.out.println(" Для получения бонусаПополните счет еще на");
            System.out.println(plus);


        }
    }
}