/*Author: Paola Flores ID T00651883*/

public class Driver
{
     public static void main(String[] args)
     {
          //testing the set() and get()
          AngryDuck pato = new AngryDuck();
          pato.setName("Pato");
          System.out.println(pato.getName());
          pato.setColor("Yellow");
          System.out.println(pato.getColor());
          //testing hit actually reducing health 
          pato.hit();
          pato.hit();
          pato.hit();
          //testing is actions are not performed after the animal is dead
          pato.fly();
          //testing when animal is not flying
          System.out.println(pato.isItFlying());
          //testing toString() to show name and color of the animal
          System.out.println(pato.toString());
          
          System.out.println();
          
          CuriousBunny blacky = new CuriousBunny("Blacky","black");
          //testing the action of hopping
          blacky.hop();
          blacky.hit();
          //testing the method to get the current health of the character
          System.out.println("The health of the character is " + blacky.getHealth());
          //testing toString() to show name and color of the animal
          System.out.println(blacky.toString());
          
          System.out.println();
          
          HappyPig pinky = new HappyPig ("Pinky", "pink");
          pinky.hit();
          //testing rolling action
          pinky.roll();
          pinky.hit();
          pinky.hit();
          //testing sleeping when animal is dead (cannot perfom action)
          pinky.sleep();
          //testing toString() to show name and color of the animal
          System.out.println(pinky.toString());
          
          System.out.println();
          
          LoudGoose violet = new LoudGoose();
          //testing setters
          violet.setName("Violet");
          violet.setColor("purple");
          violet.hit();
          violet.hit();
          //testing if animal is flying while being alive
          System.out.println(violet.isItFlying());
          //testing getHealth()
          System.out.println("The health of the character is " + violet.getHealth());
          //testing swimming action
          violet.swim();
          //testing toString() to show name and color of the animal
          System.out.println(violet.toString());
          
          System.out.println();
          
          //Testing if the total of animals alive is working properly
          System.out.print("Animals alive ");
          Animal.getCount();
          
          System.out.println("New thing testing:------------------------------ " ); 
          System.out.println(blacky.getPosition());
          System.out.println( pato.getPosition()); 
          pato.teleport(1100,500);
          System.out.println( pato.getPosition()); 
          pato.teleport(1000,500);
          blacky.teleport(1100,500);
          blacky.teleport(500,500);
          blacky.teleport(600,500);
          
          
          
          
          
          
     }//end of main()
     
}//end of class
