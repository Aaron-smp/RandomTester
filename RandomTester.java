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
    
    public void lanzarDado(){
        boolean completado = false;
        while(!completado){
            Random dado = new Random();
            int tirada = dado.nextInt(7);
            if(tirada > 0){
                System.out.println(tirada);
                completado = true;
            }
        }
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
    
    public void getNumeroEntre1Y(int limite){
        boolean completado = false;
        while(!completado){
            Random aleatorio = new Random();
            int numero = aleatorio.nextInt(limite + 1);
            if(numero > 0){
                System.out.println(numero);
                completado = true;
            }
        }
    }
    
    public int getNumeroEntre(int limite, int limiteBajo){
        boolean completado = false;
        int numero = 0;
        while(!completado){
            Random aleatorio = new Random();
            numero = aleatorio.nextInt(limite + 1);
            if(numero > limiteBajo){
                completado = true;
            }
        }
        return numero;
    }
}