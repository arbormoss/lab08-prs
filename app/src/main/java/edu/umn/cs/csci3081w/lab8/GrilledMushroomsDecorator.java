package edu.umn.cs.csci3081w.lab8;

public class GrilledMushroomsDecorator extends ToppingDecorator {

  public GrilledMushroomsDecorator(FastFoodItem fastFoodItem){
    super(fastFoodItem);
    rewardPoints = 20;
  }

  @Override
  public int getRewardPoints(){
    return rewardPoints + fastFoodItem.getRewardPoints();
  }

  @Override
  public String getDescription(){
    return fastFoodItem.getDescription()+" grilled mushrooms";
  }

}
