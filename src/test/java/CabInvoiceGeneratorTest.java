
/**
 ****************************************************************************
 * Purpose:This is a cab invoice generator Test class
 * @author Dhiraj and Naziya
 * @version 1.0
 * @since 01-07-2021
 ****************************************************************************
 */

import model.Ride;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.CabInvoiceGenerator;
import service.InvoiceSummary;

public class CabInvoiceGeneratorTest {
	CabInvoiceGenerator cabInvoiceGenerator = null;

	@Before
	public void setup() {
		cabInvoiceGenerator = new CabInvoiceGenerator();
	}

	@Test
	public void givenDistanceAndTime_shouldReturnFare() {
		double distance = 2.0;
		int time = 5;
		double result = cabInvoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25, result, 0.0);
	}

	@Test
	public void givenLessDistanceAndTime_shouldReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		double result = cabInvoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5, result, 0.0);
	}

	@Test
	public void givenMultipleRides_shouldReturnInvoiceSummary() {
		Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
		InvoiceSummary summary = cabInvoiceGenerator.calculateFare(rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30);
		Assert.assertEquals(expectedInvoiceSummary, summary);
	}

}
