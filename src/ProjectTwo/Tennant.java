package ProjectTwo;

public class Tennant {
    private String attitude;
    private String hairColor;
    private String name;
    public Tennant(String newAttitude, String newHairColor, String newName){
        this.attitude = newAttitude;
        this.hairColor = newHairColor;
        this.name = newName;
    }
    public Tennant(){
        this.attitude = "";
        this.hairColor = "";
        this.name = "";
    }

    public String getAttitude() {
        return attitude;
    }

    public void setAttitude(String attitude) {
        this.attitude = attitude;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
