public class Main {
    public static void main(String[] args) {

        SoftwareEngineer Satya = new SoftwareEngineer("Satya");
        TechnicalLead Rolf = new TechnicalLead("Rolf");
        Satya.setManager(Rolf);


        System.out.println("code access: " + Satya.getCodeAccess());
        System.out.println("Satya's manager: " + Satya.getManager());

        Rolf.approveCheckIn(Satya);
        System.out.println("Checkin approved: " + Rolf.approveCheckIn(Satya));
        System.out.println("How many successful checkins: " + Satya.getSuccessfulCheckIns());

        System.out.println("Employee status: " +  Satya.employeeStatus());

        System.out.println("Did manager Rolf approve checkin: " + Rolf.approveCheckIn(Satya));
        System.out.println(Satya.checkIns);
        System.out.println(Satya.getManager());
        Satya.checkInCode();
        System.out.println(Satya.checkIns);

//        System.out.println(Satya.getSuccessfulCheckIns());
    }
}
