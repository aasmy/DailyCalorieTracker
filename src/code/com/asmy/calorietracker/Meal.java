package com.asmy.calorietracker;

/**
 * Represents a single meal with a name and its calorie count.
 * Provides validation and formatted output.
 *
 * @author Abdullah Asmy
 * @version 1.0
 */
public class Meal
{
    private static final int MIN_CALORIES = 1;

    private final String mealName;
    private final int calories;

    /**
     * Constructs a Meal object with the given name and calorie count.
     * Validation is handled through private static methods.
     *
     * @param mealName the name of the meal
     * @param calories the calorie count of the meal (must be > 0)
     * @throws IllegalArgumentException if mealName is null/blank or calories <= 0
     */
    public Meal(final String mealName, final int calories)
    {
        validateMealName(mealName);
        validateCalories(calories);

        this.mealName = mealName.trim();
        this.calories = calories;
    }

    /**
     * Validates the meal name.
     *
     * @param name meal name
     * @throws IllegalArgumentException if name is null or blank
     */
    private static void validateMealName(final String name)
    {
        if (name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Meal name cannot be empty.");
        }
    }

    /**
     * Validates the calorie count.
     *
     * @param calories calorie amount
     * @throws IllegalArgumentException if calories <= 0
     */
    private static void validateCalories(final int calories)
    {
        if (calories < MIN_CALORIES)
        {
            throw new IllegalArgumentException("Calories must be greater than zero.");
        }
    }

    /**
     * Returns the name of the meal.
     *
     * @return meal name
     */
    public String getMealName()
    {
        return mealName;
    }

    /**
     * Returns the calorie count of the meal.
     *
     * @return calories
     */
    public int getCalories()
    {
        return calories;
    }

    /**
     * Returns a formatted string representation of the meal.
     *
     * @return formatted meal details
     */
    @Override
    public String toString()
    {
        return String.format("%-15s %d kcal", mealName, calories);
    }
}
