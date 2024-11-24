package org.example;


public class Main {
    public static void main(String[] args) {
       Churro simpleChurro = new Churro();
       ChurroRelleno churroRelleno = new ChurroRelleno();

       ChurrosFactory churrosFactory = new ChurrosFactory();
       churrosFactory.prepareChurro(simpleChurro);


       //Adapter
        DeliciousFoodToFood churoAdapter = new DeliciousFoodToFood(churroRelleno);
        churrosFactory.prepareChurro(churoAdapter);
    }
}