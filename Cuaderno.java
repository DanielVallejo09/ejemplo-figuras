import java.util.ArrayList;
/**
 * Un cuaderno contiene muchas figuras
 * @Autor Daniel Vallejo
 * @Version 13-sep-2017
 */

public class Cuaderno
{
    
   private ArrayList<Figura> figuras;
  
   public Cuaderno()
   {
     figuras = new ArrayList<Figura>();
     //OJO: si se puede figuras = new Figura[100];
     //OJO: no se puede figura f = new figura();
   }
   
   /**
    * Agrega una figura al cuaderno
    * @param unaFigura es la figura que se agrega al cuaderno
    */
   public void agregaFigura(Figura unaFigura)
   {
     figuras.add(unaFigura);  
   }
   
   public void calculaAreas()
   {
       for(int i = 0; i<figuras.size(); i++)
       {
        figuras.get(i).calcularArea();   
       }
   }
   
   public void imprimeArea()
   {
       for(int i = 0; i<figuras.size(); i++)
       {
        figuras.get(i).imprimirArea();   
       }
   }
   

}