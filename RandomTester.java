import java.util.Random;
/**
 * Write a description of class RandomTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomTester
{
    public RandomTester(){
    }
    
    public void printOneRandom(){
        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt());
    }
    
    public void printMultiRandom(int veces){
        Random aleatorio = new Random();
        for(int index = 1; index <= veces; index++){
            System.out.println(aleatorio.nextInt());
        }
    }
}