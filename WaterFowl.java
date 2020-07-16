/*Author: Paola Flores ID T00651883 */

public abstract class WaterFowl extends Animal
{
     protected boolean isFlying;
     
     public WaterFowl()
     {
          super();
          isFlying = false;
     }//end of WaterFowl()
     
     public WaterFowl(String name, String primaryColor)
     {
          super(name, primaryColor);
          isFlying = false;
     }//end of WaterFowl()
     
     public abstract void fly();
     public abstract void swim();
     
     public String isItFlying()
     {
          String str = "";
          
          if (super.health == 0)
          {
               this.isFlying = false;
               str = name + " is not flying";
               
          }
          else if (super.health >= 1)
          {
               this.isFlying = true;
               str = "look at the sky! " + name +" is flying!";
          }
          return str;
     }
     
}//end of abstract class