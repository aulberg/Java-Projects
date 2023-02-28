
public class Dice {

   private int faceValue;
   private static final int HIGHEST = 6;
   private static final int LOWEST = 1;
   
   
   public Dice() {
       
       faceValue = ((int)(Math.random() * 100) % HIGHEST + LOWEST);
       
   }
   
   public int getFaceValue() {
       
       return faceValue;
       
   }
}
