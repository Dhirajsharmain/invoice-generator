/**
 * ****************************************************************************
 *  * Purpose:This is a RideRepository class for list of rides.
 *  *
 *  * @author Dhiraj and Naziya
 *  * @version 1.0
 *  * @since 01-07-2021
 *  ****************************************************************************
 */
package service;

import model.Ride;

import java.util.HashMap;
import java.util.Map;

public class RideRepository {
    public Map<String, Ride[]> ridesMap;

    /**
     * Method for adding the rides
     * @param userId : key for ride list
     * @param rides : list of rides;
     */
    public void addRides(String userId, Ride[] rides) {
        ridesMap = new HashMap<>();
        ridesMap.put(userId, rides);
    }

    /**
     * Method returns the array of rides queried by user using userId
     * @param userId : key of rideMap
     * @return : Ride[];
     */
    public Ride[] getRides(String userId) {
        return ridesMap.get(userId);
    }
}
