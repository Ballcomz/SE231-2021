package Lab9;

public class Dog {
    private String name;
   private int age;

   //-----------------------------------------------------------------
   //  Sets up this Dog object with the specified data.
   //-----------------------------------------------------------------
   public Dog (String called, int years)
   {
      name = called;
      age = years;
   }

   //-----------------------------------------------------------------
   //  Name accessor.
   //-----------------------------------------------------------------
   public String getName ()
   {
	   return name;
   }

   //-----------------------------------------------------------------
   //  Name mutator.
   //-----------------------------------------------------------------
   public void setName (String called)
   {
	   name = called;
   }

   //-----------------------------------------------------------------
   //  Age accessor.
   //-----------------------------------------------------------------
   public int getAge ()
   {
	   return age;
   }

   //-----------------------------------------------------------------
   //  Age mutator.
   //-----------------------------------------------------------------
   public void setAge (int years)
   {
	   age = years;
   }

   //-----------------------------------------------------------------
   //  Computes and returns this dog's age in "person-years".
   //-----------------------------------------------------------------
   public int personYears ()
   {
      return age * 7;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this dog.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return "Dog: " + name + "   Age: " + age + "   Person-Years: "
             + personYears();
   }

}
