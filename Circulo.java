/**
 * Esta clase representa objeto circulo con un radio
 * @d
 */
public class Circulo extends Figura
{
    
    private float radio;
    
    
    public Circulo(float unRadio)
    {
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
}