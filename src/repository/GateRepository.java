package repository;

import exception.ParkingFloorNotFoundException;
import models.Gate;
import models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Integer, Gate> gateMap;

    public GateRepository() {
        this.gateMap = new HashMap<>();
    }

    public Gate get(int gateId) {
        Gate gate = gateMap.get(gateId);
        if(gate == null) {
            throw new GateNotFoundException("Gate not found for : "
                    + gateId);
        }
        return gate;
    }
    public void put(ParkingFloor parkingFloor){
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("Parking floor has been added successfully");
    }
}
