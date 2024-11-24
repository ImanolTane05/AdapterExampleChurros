package org.example;

public class ChurroRelleno  implements  DeliciousFood{
    String food = "Churro Relleno";
    String[] ingredients = {"Flour","Water","Cajeta"};

    @Override
    public String getChurrito(){
        return food;
    }

    @Override
    public  String[]  getChurrosIngredients(){
        return ingredients;
    }
}
