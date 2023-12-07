package InheritanceProject;

public class ReturningMember extends SuperClassMember {
    String membershipRenewalDate;
    public String getMembershipRenewalDate() {
        return membershipRenewalDate;
    }

    public void setMembershipRenewalDate(String membershipRenewalDate) {
        this.membershipRenewalDate = membershipRenewalDate;
    }
    public String toString(){
        return membershipRenewalDate + " " + name + " " + contactInfo + " " + membershipPlan;
    }


}
