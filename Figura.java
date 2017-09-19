/**
 * Esta clase es una super clase para representar las caracterisricas
 * comunes de muchas figuras
 * 
 * @autor Daniel Vallejo
 * 
 * 
 */

abstract public class Figura
{
   
    protected float area;
    protected float perimetro;
    private int posx; //posicion en x
    private int posy; //posicion en y
    
    /**
     * constructor de la clase figura
     */
    public Figura(int x, int y)
    {
        area = 0;
        perimetro = 0;
        posx = x;
        posy = y;
    }
    
    /**
     * calcula el area de la figuta
     */
    abstract public void calcularArea();
   
    
    public void imprimirArea()
    {
        System.out.println("El area de la figura es:" + area);
    }
    
    public void calculaPerimetro()
    {
        System.out.println("El perimetro de la figura es:" + perimetro);
    }
    
      public int dimeX()
    {
        return posx;
    }
    
     public int dimeY()
    {
        return posy;
    }
    
    @Override
    public String toString()
    {
        String Informacion = "Area:" + area; 
        return Informacion;
    }

}
