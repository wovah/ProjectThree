package InheritanceProject;

public class NewMember extends SuperClassMember {
    String Health;

    public String getHealth() {
        return Health;
    }

    public void setHealth(String health) {
        Health = health;
    }
    public String toString(){
        return Health + " " + name + " " + contactInfo + " " + membershipPlan;
    }
}
