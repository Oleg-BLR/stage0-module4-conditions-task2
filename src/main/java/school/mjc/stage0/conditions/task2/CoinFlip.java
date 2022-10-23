package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public static void main(String[] args) {
        throwCoin(599);
    }
    public static void throwCoin(int from1UpTo1000) {

        if (from1UpTo1000 < 500) {
            System.out.println("Eagle");
        } else {
            System.out.println("Tail");
        }
    }
}
