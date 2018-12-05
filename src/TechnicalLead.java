import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {

    private int headCount;
    public ArrayList<SoftwareEngineer> directReports;

    //Should create a new TechnicalLead that is a Manager. The TechnicalLead's base salary should be 1.3 times that
    // of a TechnicalEmployee. TechnicalLeads should have a default head count of 4.
    public TechnicalLead(String name) {
        super(name);
        this.baseSalary *= 1.3;
        headCount = 4;
        this.directReports = new ArrayList<SoftwareEngineer>();
    }

    //Should return true if the number of direct reports this manager has is less than their headcount.
    public boolean hasHeadCount() {
       return directReports.size() < headCount;
    }

    //Should accept the reference to a SoftwareEngineer object, and if the TechnicalLead has head count left should add
    // this employee to their list of direct reports. If the employee is successfully added to the TechnicalLead's
    // direct reports true should be returned, false should be returned otherwise
    public boolean addReport(SoftwareEngineer e) {
        if (hasHeadCount()) {
            directReports.add(e);
            return true;
        }
        return false;
    }

    //Should see if the employee passed in does report to this manager and if their code access is currently set to
    // "true". If both those things are true, true is returned, otherwise false is returned
    public boolean approveCheckIn(SoftwareEngineer e) {
        if (e.getManager().equals(this) && e.getCodeAccess()) {
            return true;
        }
        return false;
    }
}
