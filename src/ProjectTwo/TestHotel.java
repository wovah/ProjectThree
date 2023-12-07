package ProjectTwo;

public class TestHotel {
    public static void main(String[] args) {
        Tennant[] tennantsOne = {
                new Tennant("happy", "brown", "Sally")
        };
        Tennant[] tennantsTwo = {
                new Tennant("upset","black", "Noah"),
                new Tennant("sad", "red", "Jimmy"),
                new Tennant("joyful", "blonde", "Sarah")
        };
        Tennant[] array = {};
        Room[] rooms = {
                new Room("queen",70,"not available", array),
                new Room("king", 90, "not available", array),
                new Room("queen", 65, "not available", array),
                new Room("king", 100, "not available", array)
        };
        Hotel hotel = new Hotel("Great Escape", "blue", rooms);
        hotel.checkIn(tennantsOne);
        hotel.checkIn(tennantsTwo);
        hotel.checkOut(tennantsTwo);
    }
}
