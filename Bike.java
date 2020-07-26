import java.util.Scanner;

class BikeDesign {

     private String[] bikeModel = new String[] {"Splendid","Naruto","Maxi"};
     private Integer[]  bikeCost= new Integer[] {50000,100000,150000};
     private Integer[] numberOfGears= new Integer[]{4,5,6};
     private String[] features= new String[] {"Automatic ignition, Low power consumption","Higest Mileage ever in an vehicle","Best comfortable vechicle of the year"};

     
     BikeDesign (Integer cost, Integer noOfGears) {

          if(cost>150000) {
               print(bikeModel[2], bikeCost[2], numberOfGears[2], features[2]);
          }
          else if (cost >50000 && cost<150000) {
               print(bikeModel[1], bikeCost[1], numberOfGears[1], features[1]);
          }
          else if (cost>=50000) {
               print(bikeModel[0], bikeCost[0], numberOfGears[0], features[0]);
          }
          else {
               System.out.print("No Bikes Avalaible");
          }
     }
     
     void print(String bikeModel, Integer bikeCost, Integer numberOfGears, String features) {
          System.out.println("Bike Model: "+bikeModel);
          System.out.println("Bike Cost: " +bikeCost);
          System.out.println("Number of Gears: "+numberOfGears);
          System.out.println("Features: "+features);
     }

}

public class Bike {
     public static void main(String[] arg) {
          
          System.out.println("Hero Honda");
       
          Scanner in = new Scanner(System.in);

          System.out.println("Budget Of Your Bike: ");
          int budget = in.nextInt();

          System.out.println("Number Of Gears: ");
          int gears = in.nextInt();

          BikeDesign B = new BikeDesign(budget, gears);
     }
}