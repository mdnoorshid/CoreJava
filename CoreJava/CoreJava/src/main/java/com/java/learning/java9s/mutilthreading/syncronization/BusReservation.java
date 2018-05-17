package com.java.learning.java9s.mutilthreading.syncronization;

import org.apache.log4j.Logger;

/**
 * Class that contains run method and bookTicket mwethod
 * 
 * @author mdnoo
 *
 */
public class BusReservation implements Runnable {

	static Logger logger = Logger.getLogger(BusReservation.class);

	private int totalSeatsAvailable = 10;

	@Override
	public void run() {
		
		logger.debug("EXECUTING ==>"+Thread.currentThread().getName()+" THREAD");
		
		PassengerThread pt = (PassengerThread) Thread.currentThread();

		boolean ticketBooked = this.bookTickets(pt.getSeatNeeded(), pt.getName());

		if (ticketBooked == true) {
			logger.debug("CONGRATS " + Thread.currentThread().getName() + " ..The number of seats required("
					+ pt.getSeatNeeded() + ") are booked");
		} else {
			logger.debug("Sorry Mr. " + Thread.currentThread().getName() + " ...The number of seats requested("
					+ pt.getSeatNeeded() + ") are not available");
		}
	}

	public synchronized boolean bookTickets(int seats, String name) {
		logger.info("Welcome to happy Bus " + Thread.currentThread().getName() + " Number of Tickets available are :"
		 		+ this.getTotalSeatsAvailable());

		if (seats > this.getTotalSeatsAvailable()) {
			return false;
		} else {
			totalSeatsAvailable = totalSeatsAvailable - seats;
			return true;
		}
	}

	private int getTotalSeatsAvailable() {
		return totalSeatsAvailable;
	}

}
