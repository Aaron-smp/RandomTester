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
    
    public int lanzarDado(){
        boolean completado = false;
        Random dado = new Random();
        int tirada = dado.nextInt(6);
        return tirada + 1;
    }
    
    
    public String getRespuesta(){
        Random numero = new Random();
        int aleatorio = numero.nextInt(3);
        String respuesta = "";
        if(aleatorio == 0){
            respuesta = "Si";
        }
        else if(aleatorio == 1){
            respuesta = "No";
        }
        else{
            respuesta = "Quizás";
        }
        return respuesta;
    }
    
    public int getNumeroEntre1Y(int limite){
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(limite);
        return numero + 1;
    }
    
    public int getNumeroEntre(int limite, int limiteBajo){
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(limite - limiteBajo);
        return numero + limiteBajo;
    }
}