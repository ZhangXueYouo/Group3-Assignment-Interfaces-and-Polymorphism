/*Author: Paola Flores ID T00651883*/

public class HappyPig extends Animal
{
     public HappyPig()
     {
          super();
     }//end of HappyPig()
     
     public HappyPig(String name, String primaryColor)
     {
          super(name, primaryColor);
     }//end of HappyPig()
     
     public void sleep()
     {
          if(super.health==0)
          {
               System.out.println("Sorry, it cannot do that because it is dead");
          }
          else
          {
               System.out.println(super.name + " is sleeping");
          }
     }//end of sleep()
     
     public void roll()
     {
          if(super.health==0)
          {
               System.out.println("Sorry, it cannot do that because it is dead");
          }
          else
          {
               System.out.println(super.name + " is rolling");
          }
     }//end of roll()
     
}//end of class