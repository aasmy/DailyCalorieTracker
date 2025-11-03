# Daily Calorie Tracker

A clean, object-oriented Java application that helps track daily calorie intake through the console.  
The project demonstrates OOP best practices such as encapsulation, validation, and modular design, written in a consistent and professional coding style.

---

## Features

- Dynamic meal entry: log any number of meals with custom names and calorie values.
- Automatic calculations: compute total and average calories consumed.
- Daily limit analysis: compare your total intake with your daily calorie limit.
- Console-based interaction: clear input and output through simple text prompts.
- Robust validation: prevents invalid inputs using private static helper methods.
- Clean code standards: Allman brace style, explicit variable initialization, and no magic numbers.

---

## Project Structure
``` text 
DailyCalorieTracker/
│
├── src/
│   └── code/
│       └── com/asmy/calorietracker/
│           ├── Meal.java
│           ├── User.java
│           ├── DaySummary.java
│           ├── CalorieTracker.java
│           └── Main.java
│
├── .gitignore
└── README.md
```
---

## How It Works

1. The program welcomes the user.
2. The user enters their name and daily calorie limit.
3. The user specifies how many meals they had during the day.
4. For each meal, the program asks for its name and calorie count.
5. A summary is displayed with total, average, and remaining calories.

---

## Example Output
``` text
Welcome to the Daily Calorie Tracker!
Enter your name: Abdullah Asmy
Enter your daily calorie limit: 2200
How many meals do you want to log today? 3
Meal #1 name: Oatmeal
Calorie count for 'Oatmeal': 450
Meal #2 name: Sandwich
Calorie count for 'Sandwich': 650
Meal #3 name: Veggies
Calorie count for 'Veggies': 700

All meals recorded successfully!

--- Daily Analysis ---
You can still consume 400 kcal.

--- Meal Summary ---
Meal Name       Calories
-----------------------------
Oatmeal         450 kcal
Sandwich        650 kcal
Veggies         700 kcal
-----------------------------
Total: 1800 kcal
Average: 600.00 kcal
```
---

## How to Run

1. Clone the repository:
   git clone https://github.com/aasmy/DailyCalorieTracker.git
   cd DailyCalorieTracker

2. Compile the project:
   javac src/code/com/asmy/calorietracker/*.java -d out

3. Run the program:
   java -cp out com.asmy.calorietracker.Main

---

## Requirements

- Java 17 or higher
- IntelliJ IDEA or any standard Java IDE

---

## Author

Abdullah Asmy  
Version 1.0  
October 2025
