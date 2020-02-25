public class Main {
    public static void main(String[] args) {
        int clientBalance = 100;
        int balanceRefill = 3000;
        int step = 100;
        int bonus = balanceRefill / step;
        if (balanceRefill > 1000) {
            System.out.println(bonus);
        }
    }
}
