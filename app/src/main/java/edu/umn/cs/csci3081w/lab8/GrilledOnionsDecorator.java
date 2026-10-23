package edu.umn.cs.csci3081w.lab8;

public class GrilledOnionsDecorator extends ToppingDecorator {

  public GrilledOnionsDecorator(FastFoodItem fastFoodItem){
    super(fastFoodItem);
    rewardPoints = 10;
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
