package com.asmy.calorietracker;

import java.util.Scanner;

/**
 * Handles the main logic and user interaction for the Daily Calorie Tracker.
 * Connects User, Meal, and DaySummary classes through console-based input and output.
 *
 * This class acts as the central controller for the application.
 *
 * @author Abdullah Asmy
 * @version 1.1
 */
public class CalorieTracker
{

    private final Scanner scanner;
    private final DaySummary daySummary;

    /**
     * Constructs a CalorieTracker object and initializes its components.
     */
    public CalorieTracker()
    {
        scanner = new Scanner(System.in);
        daySummary = new DaySummary();
    }

    /**
     * Starts the calorie tracking process by prompting user inputs.
     */
    public void start()
    {
        System.out.println("Welcome to the Daily Calorie Tracker!");

        User user;
        user = createUser();

        int numberOfMeals;
        numberOfMeals = promptForMealCount();

        for (int i = 0; i < numberOfMeals; i++)
        {
            Meal meal;
            meal = createMeal(i + 1);
            daySummary.addMeal(meal);
        }

        System.out.println("\nAll meals recorded successfully!");
        displayResults(user);
    }

    /**
     * Prompts the user to create a User object.
     *
     * @return the created User
     */
    private User createUser()
    {
        String name;
        int limit;
        User user;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your daily calorie limit: ");
        limit = scanner.nextInt();

        scanner.nextLine();
        user = new User(name, limit);

        return user;
    }

    /**
     * Prompts the user for the number of meals they want to log.
     *
     * @return the number of meals
     */
    private int promptForMealCount()
    {
        System.out.print("How many meals do you want to log today? ");

        int count;
        count = scanner.nextInt();

        scanner.nextLine();

        return count;
    }

    /**
     * Creates a Meal object by prompting the user for its name and calories.
     *
     * @param mealNumber the current meal number (for display)
     * @return the created Meal
     */
    private Meal createMeal(final int mealNumber)
    {
        String mealName;
        int calories;
        Meal meal;

        System.out.printf("Meal #%d name: ", mealNumber);
        mealName = scanner.nextLine();


        System.out.printf("Calorie count for '%s': ", mealName);
        calories = scanner.nextInt();

        scanner.nextLine();

        meal = new Meal(mealName, calories);

        return meal;
    }

    /**
     * Displays the analysis and summary results.
     *
     * @param user the user whose limit is being analyzed
     */
    private void displayResults(final User user)
    {
        System.out.println("\n--- Daily Analysis ---");
        System.out.println(daySummary.analyze(user));
        daySummary.printSummary();
    }
}
