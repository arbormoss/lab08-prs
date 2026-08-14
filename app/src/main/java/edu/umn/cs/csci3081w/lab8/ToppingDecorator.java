package edu.umn.cs.csci3081w.lab8;

public abstract class ToppingDecorator extends FastFoodItem {

  protected FastFoodItem fastFoodItem;

  public ToppingDecorator(FastFoodItem fastFoodItem){
    this.fastFoodItem = fastFoodItem;
  }

}