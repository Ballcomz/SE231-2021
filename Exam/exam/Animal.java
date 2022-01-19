package exam;

public class Animal {
 private double weight;
 private String color;
 private String food;

 public Animal(){

 }
 public Animal(double weight,String color,String food){
     this.weight = weight;
     this.color = color;
     this.food = food;
 }

 public void setWeight(double w){
     this.weight = w;
 }

 public void setColor(String c){
     this.color = c;
 }

 public void setFood(String f){
     this.food = f;
 }

 public String toString(){
     return "Animal "+this.weight+" kg."+"color: "+this.color+" food: "+this.food;
 }
}
