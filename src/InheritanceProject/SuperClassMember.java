package InheritanceProject;

public class SuperClassMember {
    protected String name, contactInfo, membershipPlan;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public String getContactInfo(){
        return this.contactInfo;
    }
    public void setMembershipPlan(String membershipPlan) {
        this.membershipPlan = membershipPlan;
    }
    public String getMembershipPlan(){
        return this.membershipPlan;
    }
    public String toString(){
        return name + " " + contactInfo + " " + membershipPlan;
    }

}
