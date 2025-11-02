package com.asmy.calorietracker;

/**
 * Entry point of the Daily Calorie Tracker application.
 * Initializes the CalorieTracker and starts the program.
 *
 * @author Abdullah Asmy
 * @version 1.0
 */
public class Main
{
    /**
     * Main method - entry point for the application.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args)
    {
        CalorieTracker tracker;
        tracker = new CalorieTracker();

        tracker.start();
    }
}
