public class Main {

    private static final int GOLD_LEVEL = 150000;
    private static final int SILVER_LEVEL = 15000;

    public static void main(String[] args) {
        int oldAmount = 200;
        int currentAmount = 10000;
        int newAmount = oldAmount + currentAmount;
        int discountCoefficient = newAmount > GOLD_LEVEL ? 100 : newAmount > SILVER_LEVEL ? 70 : 50;

        int discountValue = (currentAmount / 1000) * discountCoefficient;
        System.out.println(discountValue);
    }
}
