package com.Entoss;

import java.util.Scanner;
public class OnlyOneElevatorOperation
{

    static int floor;

    public static void main(String args[])
    {

        floor = (int) (Math.random() * 10 + 1);

        System.out.println("The elevator is now on floor " +floor);
        System.out.print("Which floor are you at now (0-10) where 0 = basement: ");
        Scanner sc=new Scanner(System.in);
        int current_floor = sc.nextInt();

//        int current_floor = Keyboard.readInt();

        if(floor == current_floor)
        {
            System.out.println("Enter the elevator");
        }
        else
        {
            MoveElevator(current_floor);
        }


        System.out.println("To which floor would you want to go (0-10) where 0 = basement");
        int target_floor = sc.nextInt();
        //int current_floor = sc.nextInt();
        MoveElevator(target_floor);
    }

    public static void MoveElevator(int target_floor)
    {
        int direction;
        if( target_floor > floor )
        {
            System.out.println("The elevator is on it's way up...");
            direction = 1;
        }else{
            System.out.println("The elevator is on it's way down...");
            direction = -1;
        }

        while(target_floor != floor)
        {
            floor += direction;
            System.out.println(floor);
        }

        System.out.println("The elevator has arrived");
    }
}

