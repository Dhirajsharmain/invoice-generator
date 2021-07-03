package model;

/**
 ****************************************************************************
 * Purpose:This is a POJO for Rides
 *
 * @author Dhiraj and Naziya
 * @version 1.0
 * @since 01-07-2021
 ****************************************************************************
 */

public class Ride {

	public final int time;
	public double distance;

	public Ride(double distance, int time) {
		this.distance = distance;
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public double getDistance() {
		return distance;
	}

}
