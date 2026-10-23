package edu.umn.cs.csci3081w.lab8;

public class HotDog extends FastFoodItem {

  public HotDog() {
    rewardPoints = 520;
  }

  @Override
  public int getRewardPoints() {
    return rewardPoints;
  }

  @Override
  public String getDescription() {
    return "hotdog";
  }
}
