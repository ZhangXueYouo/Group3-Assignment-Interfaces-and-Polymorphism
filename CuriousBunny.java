/*Author: Paola Flores ID T00651883*/

public class CuriousBunny extends Animal implements Teleporter
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
     
     public void teleport (int x, int y)
     {
       if( x > HALF || x < 0 )
       {
         System.out.println(this.getName()+ " cant teleport,value x is out of range [0,500]");
         return;
       }
       
       if( y > HEIGHT || y < 0 )
       {
         System.out.println(this.getName() + " cant teleport, value y is out of range [0,1000]");
       }
       this.x = x;
       this.y = y;
       System.out.println(getPosition());
     }
     
     public String getPosition() 
     {
       return this.getName() + "'s position is:(" + x + "," + y +")";
     }
     
}//end of class
