/*Author: Paola Flores T0065188*/

public abstract class Animal
{
     protected String name, primaryColor;
     protected int health;
     protected static int animalCount;

     //map
     public static final int WIDTH = 1000;
     public static final int HEIGHT = 1000;
     public static final int HALF = 500; 
     //initial position (x,y)=(0,0)
     public static int x = 0;
     public static int y = 0;
     
     public Animal()
     {
          this.name="unknown";
          this.primaryColor="unknown";
          animalCount++;
          this.health = 3;
     }//end of Animal()
     
     public Animal (String name, String primaryColor)
     {
          this.name=name;
          this.primaryColor=primaryColor;
          animalCount++;
          this.health = 3;
     }//end of Animal()
     
     public String getName()
     {
          return name;
     }//end of getName()
     
     public void setName(String newName)
     {
          this.name=newName;
     }//end of setName()
     
     public String getColor()
     {
          return primaryColor;
     }//end of getColor()
     
     public void setColor(String newColor)
     {
          this.primaryColor=newColor;
     }//end of setColor()
     
     public String toString()
     {
          return name +" is "+primaryColor;
     }//end of toString()
     
     public int getHealth()
     {
          return health;
     }//end of getHealth()
     
     public static void getCount()
     {
          System.out.println(animalCount);
     }//end of getCount()
     
     public void hit()
     {
          if (this.health == 0) 
          {
               System.out.println("Animal is dead");
          }
          else
          {
               if(this.health==1)
               {
                    animalCount--;
               }
               {
                    this.health--;
                    System.out.println("Oh no! " + this.name + " got hit!! It has " +
                                       this.health + " lives left");
               }
          }
     }//end of hit()     
}//end of abstract class 
