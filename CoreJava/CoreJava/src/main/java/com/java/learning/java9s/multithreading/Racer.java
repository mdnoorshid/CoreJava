package com.java.learning.java9s.multithreading;

import org.apache.log4j.Logger;

public class Racer implements Runnable {
	static Logger logger = Logger.getLogger(Racer.class);
	public static String winner;

	public void race() {

		for (int distance = 1; distance <= 100; distance++) {
			logger.debug("Distance Covered by " + Thread.currentThread().getName() + " is: " + distance + " meters");
			// Check if race is complete and someone has already won
			
			if(distance == 30 && Thread.currentThread().getName().equalsIgnoreCase("rabbit")){
				try {
					logger.debug(Thread.currentThread().getName() +" is sleeping GRRRRR");
					Thread.sleep(10*1000);
				} catch (InterruptedException e) {
					logger.error(e.getMessage());
				}
			}
			
			boolean isRaceWon = isRaceWon(distance);
			if (isRaceWon) {
				break;
			}

		}

	}

	private boolean isRaceWon(int totalDistanceCovered) {
		boolean isRaceWon = false;
		if ((Racer.winner == null) && (totalDistanceCovered == 100)) {
			String winnerName = Thread.currentThread().getName();
			Racer.winner = winnerName; // setting the winner Name
			logger.debug("Winner is:: " + winnerName);
			isRaceWon = true;
		} else if (Racer.winner == null) {
			isRaceWon = false;
		} else if (Racer.winner != null) {
			isRaceWon = true;
		}

		return isRaceWon;
	}

	@Override
	public void run() {
      race();
	}

}
