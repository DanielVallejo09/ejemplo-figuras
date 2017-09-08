/**
 * Esta clase es una super clase para representar las caracterisricas
 * comunes de muchas figuras
 * 
 * @autor Daniel Vallejo
 * 
 * 
 */

public class Figura
{
   
    protected float area;
    
    /**
     * constructor de la clase figura
     */
    public Figura()
    {
        area = 0;
    }
    
    /**
     * calcula el area de la figuta
     */
    
    
    public void calcularArea()
    {
         System.out.println("No se de que figura se trata");
    }
    
    public void imprimirArea()
    {
        System.out.println("El area de la figura es:" + area);
    }

}
