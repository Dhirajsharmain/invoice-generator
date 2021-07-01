public class CabInvoiceGenerator {

    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_MINUTE = 1;
    private static final double MIN_FARE = 5;

    public double calculateFare(double distance, int time){
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_MINUTE;
        if (totalFare < MIN_FARE)
            return MIN_FARE;

        return totalFare;
    }
}
