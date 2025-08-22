package Assignment_5;

public class AirIndia implements Airfare {
    int hours;
    double costPerHour;

    public AirIndia(int hours2, double costPerHour2) {
		// TODO Auto-generated constructor stub
	}

	public double calculateAmount() {
        return hours * costPerHour;
    }

    public void display() {
        System.out.printf("%.2f\n", calculateAmount());
    }
}