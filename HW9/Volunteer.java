//Zaid Abu Jumaiza - CS113-004

public class Volunteer extends StaffMember {

    public Volunteer(String eName, String eAddress, String ePhone)
    {
        super(eName, eAddress, ePhone);
    }

    public double pay()
    {
        return 0.0;
    }

	public double getVacaDays() {
		return super.VacaDays;
	}

}
