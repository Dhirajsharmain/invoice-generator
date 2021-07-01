/**
 ****************************************************************************
 * Purpose:This is a POJO for Invoice Summary.
 *
 * @author Dhiraj and Naziya
 * @version 1.0
 * @since 01-07-2021
 ****************************************************************************
 */
public class InvoiceSummary {

	int totalFare;
	double avgFare;
	double numOfRides;

	public InvoiceSummary(double numOfRides, int totalFare) {
		this.numOfRides = numOfRides;
		this.totalFare = totalFare;
		this.avgFare = this.numOfRides / this.totalFare;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		InvoiceSummary that = (InvoiceSummary) o;
		return Double.compare(that.avgFare, avgFare) == 0 && totalFare == that.totalFare
				&& Double.compare(that.numOfRides, numOfRides) == 0;
	}

}
