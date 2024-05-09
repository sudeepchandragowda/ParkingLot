package repository;

import exception.ParkingLotNotFoundException;
import models.Gate;
import models.ParkingLot;
import models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Integer, ParkingLot> parkingLotMap;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot get(int parkingLotId) {
        ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
        if(parkingLot == null) {
            throw new ParkingLotNotFoundException("Parking lot not found for : "
                    + parkingLotId);
        }
        return parkingLot;
    }
    public void put(ParkingLot parkingLot){
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        System.out.println("Parking lot has been added successfully");
    }
    public ParkingLot getParkingLotFromGate (Gate gate){
        int parkingLotId = gate.getParkingLotId();
        ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
        if(parkingLot == null) {
            throw new ParkingLotNotFoundException("Parking lot not found for : "
                    + gate.getId());
        }
        return parkingLot;
    }
}
