package edu.umn.cs.csci3081w.lab8;

public class Hamburger extends FastFoodItem {

  public Hamburger() {
    rewardPoints = 835;
  }

  @Override
  public int getRewardPoints() {
    return rewardPoints;
  }

  @Override
  public String getDescription() {
    return "hamburger";
  }
}
