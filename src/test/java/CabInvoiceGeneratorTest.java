
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

	@Test
	public void givenDistanceAndTime_shouldReturnFare() {
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double result = cabInvoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25, result, 0.0);
	}

	@Test
	public void givenLessDistanceAndTime_shouldReturnMinimumFare() {
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		double result = cabInvoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5, result, 0.0);
	}

	@Test
	public void givenMultipleRides_shouldReturnTotalFare() {
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
		double result = cabInvoiceGenerator.calculateFare(rides);
		Assert.assertEquals(30, result, 0.0);

	}

}
