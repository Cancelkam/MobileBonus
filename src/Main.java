public class Main {
    public static void main(String[] args) {
        int clientBalance = 100;
        int balanceRefill = 100;
        int step = 100;
        if (balanceRefill > 1000) {
            int bonus = balanceRefill / step;
            System.out.println(bonus);
        } else {
            int bonus=0;
            System.out.println(bonus);
        }
    }
}
