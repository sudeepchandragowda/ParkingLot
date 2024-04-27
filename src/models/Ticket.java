package models;

import java.time.LocalDateTime;

public class Ticket extends BaseModel {
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
}
