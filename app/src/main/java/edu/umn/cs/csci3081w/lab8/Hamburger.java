package edu.umn.cs.csci3081w.lab8;

public class Hamburger extends FastFoodItem {

  public Hamburger() {
    calories = 835;
  }

  @Override
  public int getCalories() {
    return calories;
  }

  @Override
  public String getDescription() {
    return "hamburger";
  }
}
