package edu.umn.cs.csci3081w.lab8;

public class GrilledOnionsDecorator extends ToppingDecorator {

  public GrilledOnionsDecorator(FastFoodItem fastFoodItem){
    super(fastFoodItem);
    calories = 10;
  }

  @Override
  public int getCalories(){
    return calories+ fastFoodItem.getCalories();
  }

  @Override
  public String getDescription(){
    return fastFoodItem.getDescription()+" grilled mushrooms";
  }

}
