public class Seat {

	public Seat() {
	}

	private Integer number;

	private SeatingClass seatingClass;

	private Passenger passenger;

	public void setNumber(Integer numberIn) {
		number = numberIn;
	}

	public Integer getNumber() {
		return number;
	}

	public void setSeatingClass(SeatingClass seatingClassIn) {
		seatingClass = seatingClassIn;
	}

	public SeatingClass getSeatingClass() {
		return seatingClass;
	}

	public void setPassenger(Passenger passengerIn) {
		passenger = passengerIn;
	}

	public Passenger getPassenger() {
		return passenger;
	}

}