/*Author: Paola Flores ID T00651883*/

public class CuriousBunny extends Animal
{
     public CuriousBunny()
     {
          super();
     }//end of CuriousBunny()
     
     public CuriousBunny(String name, String primaryColor)
     {
          super(name, primaryColor);
     }//end of CuriousBunny()
     
     public void hop()
     {
          if(super.health==0)
          {
               System.out.println("Sorry, it cannot do that because it is dead");
          }
          else
          {
               System.out.println(super.name + " is hopping");
          }
     }//end of hop()
     
}//end of class