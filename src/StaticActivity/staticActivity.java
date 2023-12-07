package StaticActivity;

public class staticActivity {
    public String shoe;
    public String girl;
    public String boy;
    public static int instanceCount = 0;
    public staticActivity(){
        this.boy = "jimmy";
        this.girl = "taylor";
        this.shoe = "nike";
        instanceCount++;
    }
    public static int getInstanceCount(){
        return instanceCount;
    }


}
