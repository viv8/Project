package com.Entoss;

import java.util.Scanner;

public class TwoElevatorsOperation {

	// static int floor;

	public static void main(String args[]) {

		int ElOneFloor = (int) (Math.random() * 10 + 1);
		System.out.println("The elevatorOne is now on floor " + ElOneFloor);
		int ElTwoFloor = (int) (Math.random() * 10 + 1);
		System.out.println("The elevator is now on floor " + ElTwoFloor);
		System.out.print("Which floor are you at now (0-10) where 0 = basement: ");
		Scanner sc = new Scanner(System.in);
		int current_floor = sc.nextInt();

		// int current_floor = Keyboard.readInt();
		int elevOneDist = current_floor - ElOneFloor;
		int elevTwoDist = current_floor - ElTwoFloor;

		if ((ElOneFloor | ElTwoFloor) == current_floor) {
			System.out.println("Enter the elevator");
		} else {
			if (elevOneDist > 0 && elevTwoDist > 0) {
				if (elevOneDist < elevTwoDist) {
					MoveElevator(current_floor,ElOneFloor);
				} else {
					MoveElevator(current_floor,ElOneFloor);
				}
			} else if (elevOneDist < 0 && elevTwoDist > 0) {
				if (elevOneDist > elevTwoDist) {
					MoveElevator(current_floor,ElOneFloor);
				} else {
					MoveElevator(current_floor,ElTwoFloor);
				}

			} else if (elevOneDist > 0 && elevTwoDist < 0) {
				if (elevOneDist < elevTwoDist) {
					MoveElevator(current_floor,ElOneFloor);
				} else {
					MoveElevator(current_floor,ElTwoFloor);
				}
			} else if (elevOneDist < 0 && elevTwoDist < 0) {
				if (elevOneDist > elevTwoDist) {
					MoveElevator(current_floor,ElOneFloor);
				} else {
					MoveElevator(current_floor,ElTwoFloor);
				}
			}

			//MoveElevator(current_floor);
		}

		System.out.println("To which floor would you want to go (0-10) where 0 = basement");
		int target_floor = sc.nextInt();
		// int current_floor = sc.nextInt();
		MoveElevator(target_floor,current_floor);
	}

	public static void MoveElevator(int target_floor,int floor) {
		int direction;
		if (target_floor > floor) {
			System.out.println("The elevator is on it's way up...");
			direction = 1;
		} else {
			System.out.println("The elevator is on it's way down...");
			direction = -1;
		}

		while (target_floor != floor) {
			floor += direction;
			System.out.println(floor);
		}

		System.out.println("The elevator has arrived");
	}
}
