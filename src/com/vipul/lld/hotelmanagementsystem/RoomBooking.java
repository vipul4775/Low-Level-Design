package com.vipul.lld.hotelmanagementsystem;

import java.util.Date;
import java.util.List;

public class RoomBooking {
    int bookingId;
    Date startDate;
    Date checkOutDate;
    List<Guest> guestList;
    List<Room> allRooms;
    BaseRoomCharge baseRoomCharge;
}
