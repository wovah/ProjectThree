package ProjectTwo;

import java.util.Arrays;

public class Hotel {
    private String name;
    private String color;
    private Room[] rooms;
    public Hotel(String newName, String newColor, Room[] newRooms){
        this.name = newName;
        this.color = newColor;
        this.rooms = newRooms;
    }
    public Hotel(){
        this.name = "";
        this.color = "";
        Room[] newRoom = {};
        this.rooms = newRoom;
    }
    public void checkIn(Tennant[] newTennants){
        for(Room room : this.rooms){
            if(room.checkAvailability()){
                room.changeAvailability(newTennants);
                break;
            }
        }
    }
    public void checkOut(Tennant[] leavingTennants){
        for(Room room : this.rooms){
            if(Arrays.equals(room.getTennants(), leavingTennants)){
                room.setAvailability("available");
                Tennant[] newTennant = {};
                room.setTennants(newTennant);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
