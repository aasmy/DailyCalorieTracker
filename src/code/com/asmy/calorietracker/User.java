package com.asmy.calorietracker;

/**
 * Represents a user who tracks their daily calorie intake.
 * Stores the user's name and daily calorie limit, with validation.
 *
 * @author Abdullah Asmy
 * @version 1.0
 */
public class User
{
    private final String name;
    private final int dailyCalorieLimit;

    /**
     * Constructs a User object with the given name and daily calorie limit.
     *
     * @param name              the user's name
     * @param dailyCalorieLimit the user's daily calorie limit (must be > 0)
     * @throws IllegalArgumentException if the name is invalid or limit <= 0
     */
    public User(final String name, final int dailyCalorieLimit)
    {
        validateName(name);
        validateDailyLimit(dailyCalorieLimit);

        this.name = name.trim();
        this.dailyCalorieLimit = dailyCalorieLimit;
    }

    /**
     * Validates the user's name.
     *
     * @param name the user's name
     * @throws IllegalArgumentException if name is null or blank
     */
    private static void validateName(final String name)
    {
        if (name == null || name.isBlank())
        {
            throw new IllegalArgumentException("User name cannot be empty.");
        }
    }

    /**
     * Validates the daily calorie limit.
     *
     * @param limit the daily calorie limit
     * @throws IllegalArgumentException if limit <= 0
     */
    private static void validateDailyLimit(final int limit)
    {
        if (limit <= 0)
        {
            throw new IllegalArgumentException("Daily calorie limit must be greater than zero.");
        }
    }

    /**
     * Returns the user's name.
     *
     * @return user name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the user's daily calorie limit.
     *
     * @return daily calorie limit
     */
    public int getDailyCalorieLimit()
    {
        return dailyCalorieLimit;
    }

    /**
     * Returns a formatted string representation of the user.
     *
     * @return formatted user information
     */
    @Override
    public String toString()
    {
        return String.format("User: %s | Daily Limit: %d kcal", name, dailyCalorieLimit);
    }
}
