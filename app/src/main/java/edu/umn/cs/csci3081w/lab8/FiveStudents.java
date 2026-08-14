package edu.umn.cs.csci3081w.lab8;

public class FiveStudents {
  public static void main(String[] args) {
    String type = "";
    String toppings = "";
    if(args.length==1){
      type = args[0];
    }
    else if(args.length==2){
      type = args[0];
      toppings = args[1];
    }
    else{
      System.out.println("the fast food item order is not right");
      return;
    }
    FastFoodItemFactory fastFoodItemFactory = new OrderBasedFastFoodItemFactory();
    FastFoodItem fastFoodItem = fastFoodItemFactory.makeFastFoodItem(type,toppings);
    if(fastFoodItem==null){
      System.out.println("we do not have this type of fast food item");
      return;
    }
    else {
      System.out.println(fastFoodItem.getCalories());
      System.out.println(fastFoodItem.getDescription());
    }
  }
}
