public class Main {
    public static void main(String[] args) {
        int balance = 50; // текущий баланс
        int addCount = 1100; // пополнение баланса
        int bonus;

        if (addCount > 1000) {
            bonus = addCount / 100;
        } else {
            bonus = 0;
        }
        balance = balance + addCount + bonus;
        System.out.println("На Вашем счете: " + balance + " рублей");
        System.out.println("Бонус: " + bonus + " рублей");
    }
}




