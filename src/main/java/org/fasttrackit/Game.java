package org.fasttrackit;


import org.fasttrackit.utils.ScannerUtils;


public class Game {

    public void start() {
        System.out.println("Welcome to the racing game!");

        int playerCount = getPlayerCountFromUser();

        System.out.println("Player count: " + playerCount);

        String vehicleName = getVehicleNameFromUser();

        System.out.println("Vehicle name: " +vehicleName);
    }

    private int getPlayerCountFromUser() {
        System.out.println("Please enter the number of players:");
        return ScannerUtils.nextIntAndMoveToNextLine();
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name:");
        return ScannerUtils.nextLine();
    }
}
