import java.util.List;

public class SeatingList {

	public SeatingList() {
	}

	private List<Seat> firstClassSeats;

	private List<Seat> businessClassSeats;

	private List<Seat> economyClassSeats;

	public void setFirstClassSeats(List<Seat> firstClassSeatsIn) {
		firstClassSeats = firstClassSeatsIn;
	}

	public List<Seat> getFirstClassSeats() {
		return firstClassSeats;
	}

	public void setBusinessClassSeats(List<Seat> businessClassSeatsIn) {
		businessClassSeats = businessClassSeatsIn;
	}

	public List<Seat> getBusinessClassSeats() {
		return businessClassSeats;
	}

	public void setEconomyClassSeats(List<Seat> economyClassSeatsIn) {
		economyClassSeats = economyClassSeatsIn;
	}

	public List<Seat> getEconomyClassSeats() {
		return economyClassSeats;
	}

}