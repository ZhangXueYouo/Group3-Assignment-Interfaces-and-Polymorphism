/*Author: Paola Flores ID T00651883*/

public class LoudGoose extends WaterFowl
{
     public LoudGoose()
     {
          super();
     }//end of LoudGoose()
     
     public LoudGoose(String name, String primaryColor)
     {
          super(name, primaryColor);
     }//end of LoudGoose()
     
     public void fly()
     {
          if(super.health==0)
          {
               System.out.println("Sorry, it cannot do that because it is dead");
          }
          else
          {
               super.isFlying = true;
               System.out.println(super.name + " is flying");
          }
     }//end of fly()
     
     public void swim()
     {
          if(super.health==0)
          {
               System.out.println("Sorry, it cannot do that because it is dead");
          }
          else
          {
               super.isFlying = false;
               System.out.println(super.name + " is swimming");
          }
     }//end of swim()
}//end of class