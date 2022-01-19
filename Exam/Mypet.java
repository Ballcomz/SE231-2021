package Exam;

public class Mypet {
    public class Mypets {
        public void main(String[] args) {
            Dog dog1 = new Dog("Lucky", "Pooddle", "brown", 2);
    
            dog1.size = "Small";
            dog1.shortHair = true;
    
            System.out.println("My dog");
            //dog1.showPetData();
            dog1.dogRun();
            dog1.dogBark(); // Missing 1.
            dog1.dogHair();
        }  
}}
