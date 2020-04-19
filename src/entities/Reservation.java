package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Execptions.DomainException;

public class Reservation {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	public Reservation() {
	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		Date currentDate = new Date();
		if (checkIn.before(currentDate)) {
			throw new DomainException("Invalid date");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out before check-in");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRommNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		Date currentDate = new Date();
		if (checkIn.before(currentDate)) {
			throw new DomainException("Invalid date");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out before check-in");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Room number: " + roomNumber);
		sb.append(", Check-in date " + sdf.format(checkIn));
		sb.append(",Check-out date " + sdf.format(checkOut));
		sb.append(duration() + ", nights" + "\n");
		return sb.toString();

	}

}
