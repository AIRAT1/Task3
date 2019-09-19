public class Main {

    private static final int GOLD_LEVEL = 150000;
    private static final int SILVER_LEVEL = 15000;

    public static void main(String[] args) {
        int accumulatedAmount = 150100;
        int currentPurchase = 10000;
        int bonusAmount = calculateBonus(accumulatedAmount); // we consider bonus amount according to the old amount value
        int bonusValue = (currentPurchase / 1000) * bonusAmount; //and apply them to the last purchase

        // after accruing bonuses we increase the total amount of purchases by the current value... And save it
        accumulatedAmount += currentPurchase;
        System.out.println(bonusValue);
    }

    private static int calculateBonus(int amount) {
        if (amount > GOLD_LEVEL) {
            return 100;
        }else if (amount > SILVER_LEVEL) {
            return 70;
        }else {
            return 50;
        }
    }
}
