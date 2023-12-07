package ProjectTwo;

public class Room {
    private String bedsize;
    private int tvSize;
    private String availability;
    private Tennant[] tennants;
    public Room(String newBedSize, int newTvSize, String newAvailability, Tennant[] newTennants ){
        this.bedsize = newBedSize;
        this.tvSize = newTvSize;
        this.availability = newAvailability;
        this.tennants = newTennants;
    }
    public Room(){
        this.bedsize = "";
        this.tvSize = 0;
        this.availability = "available";
        Tennant[] newTennant = {};
        this.tennants = newTennant;
    }
    public boolean checkAvailability(){
        if(this.availability.equals("available")){
            return true;
        }
        return false;
    }
    public void changeAvailability(Tennant[] newTennants){
        this.tennants = newTennants;
        this.availability = "not available";
    }

    public String getBedsize() {
        return bedsize;
    }

    public void setBedsize(String bedsize) {
        this.bedsize = bedsize;
    }

    public int getTvSize() {
        return tvSize;
    }

    public void setTvSize(int tvSize) {
        this.tvSize = tvSize;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Tennant[] getTennants() {
        return tennants;
    }

    public void setTennants(Tennant[] tennants) {
        this.tennants = tennants;
    }
}
