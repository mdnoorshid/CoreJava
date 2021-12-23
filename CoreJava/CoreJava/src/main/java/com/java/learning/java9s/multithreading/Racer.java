package com.java.learning.java9s.multithreading;


public class Racer implements Runnable {
	public static String winner;

	public void race() {

		for (int distance = 1; distance <= 100; distance++) {
			System.out.println("Distance Covered by " + Thread.currentThread().getName() + " is: " + distance + " meters");
			// Check if race is complete and someone has already won
			
			if(distance == 30 && Thread.currentThread().getName().equalsIgnoreCase("rabbit")){
				try {
					System.out.println(Thread.currentThread().getName() +" is sleeping GRRRRR");
					Thread.sleep(10*1000);
				} catch (InterruptedException e) {
					System.err.println((e.getMessage()));
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
			System.out.println("Winner is:: " + winnerName);
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
