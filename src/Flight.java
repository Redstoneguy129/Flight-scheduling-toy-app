public class Flight {

	public Flight() {
	}

	private Integer number;

	private String departureAirport;

	private String arrivalAirport;

	private String departureDate;

	private SeatingList seatingList;

	public void setNumber(Integer numberIn) {
		number = numberIn;
	}

	public Integer getNumber() {
		return number;
	}

	public void setDepartureAirport(String departureAirportIn) {
		departureAirport = departureAirportIn;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setArrivalAirport(String arrivalAirportIn) {
		arrivalAirport = arrivalAirportIn;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setDepartureDate(String departureDateIn) {
		departureDate = departureDateIn;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setSeatingList(SeatingList seatingListIn) {
		seatingList = seatingListIn;
	}

	public SeatingList getSeatingList() {
		return seatingList;
	}

}