public class cuadrado extends Figura
{
    private float lado;
    
    public cuadrado(int x, int y,float iniLado)
    {
        super (x,y);
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
    
    @Override
    public String toString()
    {
        String info = "lado:" + lado;
        return info;
    }
}