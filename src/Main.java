public class Main {
    public static void main(String[] args) {
        int clientBalance = 100;
        int balanceRefill = 100;
        int step = 100;
        int bonus = balanceRefill / step;
        if (balanceRefill < 1000) {
            bonus = 0 ;
            System.out.println(bonus);
        } else {
            System.out.println(bonus);
        }
    }
}
