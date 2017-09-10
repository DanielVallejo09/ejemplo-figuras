public class cuadrado extends Figura
{
    private float lado;
    
    public cuadrado(float iniLado)
    {
        lado = iniLado;
    }
    
    @Override
    public void calcularArea()
    {
        area = lado * lado;
    }
    
    @Override
    public void calculaPerimetro()
    {
        perimetro = lado * 4;
    }
}