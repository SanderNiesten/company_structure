public class SoftwareEngineer extends TechnicalEmployee {
    private boolean accessToCode;
    private static int count;

    public SoftwareEngineer(String name) {
        super(name);
        accessToCode = true;
        checkIns = 0;
    }

    //Should return whether or not this SoftwareEngineer has access to make changes to the code base
    public boolean getCodeAccess() {
        return this.accessToCode;
    }

    //Should allow an external piece of code to update the SoftwareEngieer's code privileges to either true or false
    public void setCodeAccess(boolean access) {
        if (access == true) {
            this.accessToCode = true;
        } else {
            this.accessToCode = false;
        }
    }

    //Should return the current count of how many times this SoftwareEngineer has successfully checked in code
    public int getSuccessfulCheckIns() {
        return checkIns;
    }

    //Should check if this SoftwareEngineer's manager approves of their check in. If the check in is approved their
    //successful checkin count should be increased and the method should return "true". If the manager does not approve
    //the check in, the SoftwareEngineer's code access should be changed to false and the method should return "false"
    TechnicalLead manager = (TechnicalLead) this.getManager();
    public void testManager() {
        System.out.println(manager);
    }

    public boolean checkInCode() {
        if (manager.approveCheckIn(this)) {
            this.checkIns++;
            return true;
        } else {
            this.accessToCode = false;
            return false;
        }
    }
}
