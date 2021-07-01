/**
 ****************************************************************************
 * Purpose:This is a cab invoice generator class
 *
 * @author Dhiraj and Naziya
 * @version 1.0
 * @since 01-07-2021
 ****************************************************************************
 */

public class CabInvoiceGenerator {

	private static final double MINIMUM_COST_PER_KILOMETER = 10;
	private static final int COST_PER_MINUTE = 1;
	private static final double MIN_FARE = 5;

	/**
	 * This method is used to calculate minimum fare
	 * 
	 * @param distance
	 * @param time
	 * @return minimum fare
	 */
	public double calculateFare(double distance, int time) {
		double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_MINUTE;
		if (totalFare < MIN_FARE)
			return MIN_FARE;

		return totalFare;
	}

	/**
	 * This method is used to get the average fare per ride, total fare and number
	 * of rides taken.
	 * 
	 * @param rides
	 * @return invoice summary
	 */
	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length, (int) totalFare);
	}

}
