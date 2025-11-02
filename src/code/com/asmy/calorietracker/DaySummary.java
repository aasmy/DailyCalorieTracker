package com.asmy.calorietracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a summary of all meals consumed in a single day.
 * Calculates total and average calories and analyzes results
 * against a user's daily limit.
 *
 * @author Abdullah Asmy
 * @version 1.0
 */
public class DaySummary
{
    private static final int INITIAL_TOTAL_CALORIES = 0;
    private static final int INITIAL_AVERAGE_CALORIES = 0;

    private final List<Meal> meals;

    /**
     * Constructs an empty DaySummary object.
     */
    public DaySummary()
    {
        meals = new ArrayList<>();
    }

    /**
     * Adds a meal to the day's list of meals.
     *
     * @param meal the meal to add (cannot be null)
     * @throws IllegalArgumentException if meal is null
     */
    public void addMeal(final Meal meal)
    {
        validateMeal(meal);
        meals.add(meal);
    }

    /**
     * Validates that the meal is not null.
     *
     * @param meal the meal to validate
     */
    private static void validateMeal(final Meal meal)
    {
        if (meal == null)
        {
            throw new IllegalArgumentException("Meal cannot be null.");
        }
    }

    /**
     * Calculates the total calories consumed during the day.
     *
     * @return total calorie count
     */
    public int getTotalCalories()
    {
        int totalCalories;
        totalCalories = INITIAL_TOTAL_CALORIES;

        for (Meal meal : meals)
        {
            totalCalories += meal.getCalories();
        }
        return totalCalories;
    }

    /**
     * Calculates the average calorie count per meal.
     *
     * @return average calories (0 if no meals)
     */
    public double getAverageCalories()
    {
        if (meals.isEmpty())
        {
            return INITIAL_AVERAGE_CALORIES;
        }
        return (double) getTotalCalories() / meals.size();
    }

    /**
     * Analyzes the user's calorie intake relative to their daily limit.
     *
     * @param user the user containing the daily limit
     * @return a message describing the analysis
     */
    public String analyze(final User user)
    {
        validateUser(user);

        int totalCalories;
        int dailyLimit;

        totalCalories = getTotalCalories();
        dailyLimit = user.getDailyCalorieLimit();

        if (totalCalories > dailyLimit)
        {
            return String.format("Limit exceeded by %d kcal.", totalCalories - dailyLimit);
        }
        else if (totalCalories == dailyLimit)
        {
            return "Perfect! You've exactly met your daily calorie goal.";
        }
        else
        {
            return String.format("You can still consume %d kcal.", dailyLimit - totalCalories);
        }
    }

    /**
     * Validates that the user object is not null.
     *
     * @param user the user to validate
     */
    private static void validateUser(final User user)
    {
        if (user == null)
        {
            throw new IllegalArgumentException("User cannot be null.");
        }
    }

    /**
     * Prints a formatted summary of all meals, including totals and averages.
     */
    public void printSummary()
    {
        System.out.println("\n--- Meal Summary ---");
        System.out.printf("%-15s %s%n", "Meal Name", "Calories");
        System.out.println("-----------------------------");

        for (Meal meal : meals)
        {
            System.out.println(meal);
        }

        System.out.println("-----------------------------");
        System.out.printf("Total: %d kcal%n", getTotalCalories());
        System.out.printf("Average: %.2f kcal%n", getAverageCalories());
    }
}
