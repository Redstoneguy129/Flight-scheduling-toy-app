import java.util.List;

public class Passenger {

	public Passenger() {
	}

	private String name;

	private List<Flight> scheduledFlights;

	public void setName(String nameIn) {
		name = nameIn;
	}

	public String getName() {
		return name;
	}

	public void setScheduledFlights(List<Flight> scheduledFlightsIn) {
		scheduledFlights = scheduledFlightsIn;
	}

	public List<Flight> getScheduledFlights() {
		return scheduledFlights;
	}

}