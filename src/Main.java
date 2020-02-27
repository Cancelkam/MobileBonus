public class Main {
    public static void main(String[] args) {
        int clientBalance = 100;
        int balanceRefill = 100;
        int step = 100;
        int bonus=0;
        if (balanceRefill > 1000) {
            bonus = balanceRefill / step;
        }
        System.out.println(bonus);
    }
}
