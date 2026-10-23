package edu.umn.cs.csci3081w.lab8;

public class JalapenoPeppersDecorator extends ToppingDecorator {

  public JalapenoPeppersDecorator(FastFoodItem fastFoodItem){
    super(fastFoodItem);
    rewardPoints = 5;
  }

  @Override
  public int getRewardPoints(){
    return rewardPoints + fastFoodItem.getRewardPoints();
  }

  @Override
  public String getDescription(){
    return fastFoodItem.getDescription()+" jalapeno peppers";
  }

}
