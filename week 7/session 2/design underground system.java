```java
import java.util.*;

class UndergroundSystem {

    // Stores passenger's check-in station and time
    HashMap<Integer, String> checkInStation;
    HashMap<Integer, Integer> checkInTime;

    // Stores total travel time and number of trips
    HashMap<String, Integer> totalTime;
    HashMap<String, Integer> totalTrips;

    public UndergroundSystem() {
        checkInStation = new HashMap<>();
        checkInTime = new HashMap<>();
        totalTime = new HashMap<>();
        totalTrips = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInStation.put(id, stationName);
        checkInTime.put(id, t);
    }

    public void checkOut(int id, String stationName, int t) {

        String startStation = checkInStation.get(id);
        int startTime = checkInTime.get(id);

        int travelTime = t - startTime;

        String route = startStation + "->" + stationName;

        totalTime.put(route,
                totalTime.getOrDefault(route, 0) + travelTime);

        totalTrips.put(route,
                totalTrips.getOrDefault(route, 0) + 1);

        checkInStation.remove(id);
        checkInTime.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {

        String route = startStation + "->" + endStation;

        return (double) totalTime.get(route)
                / totalTrips.get(route);
    }
}
```
