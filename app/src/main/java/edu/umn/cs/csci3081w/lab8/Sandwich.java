package edu.umn.cs.csci3081w.lab8;

public class Sandwich extends FastFoodItem {

  public Sandwich() {
    rewardPoints = 290;
  }

  @Override
  public int getRewardPoints() {
    return rewardPoints;
  }

  @Override
  public String getDescription() {
    return "sandwich";
  }
}
