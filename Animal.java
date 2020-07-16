//Hai tao Mao T00646865

public abstract class Animal 
{
  
   protected String name;
   protected String primaryColor;
   protected static int count = 0;
   protected int health = 3;
   protected boolean isAlive = true;
   
   //Killpoint
   protected static int killPoint = 0; 
   
   //world map, 
   public static final int WIDTH = 1000;
   public static final int HEIGHT = 1000;
   public static final int HALF = 500; //half width
   
   
   //initial position (x,y)=(0,0)
   public static int x = 0;
   public static int y = 0;
   
   
   public interface Teleporter 
   {
       public void teleport (int x, int y);
       public String getPosition() ;
   }
   
   /*
   public interface  Attacker 
   {
       public void attack (String name)
       {
           if(isAlive)
           {
            if 
             
           }
           else
           {
               System.out.println("Attacker already dead, cant attack!");
           }
       }

  
       public int getKillCount() 
       {
           return killPoint;
       }
   
   }
   */
   
   
   
   
   
   
   
   
   
   
   
   public Animal(String name, String primaryColor) 
   {
       super();
       count ++;
       this.name = name;
       this.primaryColor = primaryColor;
      
   }
  
   // set & get name
   public String getName() 
   {
       return name;
   }

   public void setName(String name) 
   {
       this.name = name;
   }
  
   // set & get primaryColor
   public String getPrimaryColor() 
   {

       return primaryColor;
   }

   public void setPrimaryColor(String primaryColor) 
   {
       this.primaryColor = primaryColor;
   }
   
   // s%g Health
   public int getHealth() 
   {
       return health;
   }

   public void setHealth(int health) 
   {
       this.health = health;
   }
   
   
   // hit & isAlive status
   public void hit() 
   {
       if (isAlive) 
       {
           System.out.println("Pikachu used THUNDER SHOCK!");
           health--;
           
           
       if (!isAlive()) 
       {
           System.out.println("Animal is already fainted, can't hit it again!");
           return;
       }
       }
       if (this.health == 0) 
       {
           this.isAlive = false;
           count --;
           System.out.println( "*************************************************");
           System.out.println(this.name + " fainted, Pikachu Gained 115 EXP.Points !!");
           System.out.println( "*************************************************");
       }
   }
   
   public String toString()
   {
       return "Name:" + name +
         "\nColor:"  + primaryColor +
         "\nhealth:" + health;
   }
   
   public boolean isAlive() 
   {
       return isAlive;
   }
}