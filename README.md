# Getir & Patika Java Spring Boot Cohorts Homework 1

This is a pure Java application that demonstrates object-oriented programming (OOP) principles and clean code practices.
It models real estate listings for different types of homes: **House**, **Villa**, and **SummerHouse**.

## 📂 Project Structure

<pre> RealEstateApp/
  ├── src/ 
    │ └── com/ 
      ├── Main.java │
      ├── model/ │ 
      │ └── House.java │ 
      ├── repository/ │ 
      │ └── HouseRepository.java 
      │── service/ 
      │ └── HouseService.java </pre>

---

## 🧱 Classes Overview

### `House`
Base class containing common attributes:
- Type
- Price
- Square meters
- Number of rooms
- Number of living rooms

### `HouseRepository`
Provides static methods that return lists of:
- Houses
- Villas
- SummerHouses

### `HouseService`
Contains business logic for:
- Total price calculations
- Average square meter calculations
- Filtering by room and living room count

### `Main`
Entry point that:
- Initializes lists
- Aggregates data
- Calls service methods
- Displays results in a readable format

## ⚙️ Functionalities

- ✅ Get total price for each type
- ✅ Get total price for all houses
- ✅ Calculate average square meters
- ✅ Filter homes by room/living room count

### `Console Output`

<img width="386" alt="Screenshot 2025-03-26 at 18 39 53" src="https://github.com/user-attachments/assets/033f8667-fba5-49be-a107-3db5d63b1eec" />
