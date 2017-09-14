/**
 * Esta clase representa objeto circulo con un radio
 * @d
 */
public class Circulo extends Figura
{
    
    private float radio;
    
    
    public Circulo(int x, int y ,float unRadio)
    {
        super (x,y); //tiene que ser siempre la primera instruccion del const
        radio = unRadio;
    }
    
    @Override
    public void calcularArea()
    {
        area = 3.14f * radio * radio; //La f es para decirle al compilador que es float
    }
    
    @Override
    public void calculaPerimetro()
    {
        perimetro = 2*3.14F*radio;
    }  
    
    public void imprime()
    {
        System.out.println("circulo en las posicion x = " + super.dimeX());
        System.out.println("circulo en las posicion y = " + super.dimeY());
    }
}