package repository;

import exception.ParkingLotNotFoundException;
import models.ParkingLot;
import models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Integer, ParkingLot> parkingLotMap;

    public ParkingLotRepository(Map<Integer, ParkingLot> parkingLots) {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot get(int parkingLotId) {
        ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
        if(parkingLot == null) {
            throw new ParkingLotNotFoundException("Parking lot not found for : " + parkingLotId);
        }
        return parkingLot;
    }
    public ParkingLot put(ParkingLot parkingLot){
        parkingLotMap.put(parkingLot.getId(), parkingLot);
    }
}
