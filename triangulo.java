public class triangulo extends Figura
{
    private float base;
    private float altura;
    
    
    public triangulo(int x, int y,float iniBase, float iniAltura)
    {
        super (x,y);
        base = iniBase;
        altura = iniAltura;
    }
    
    @Override
    public void calcularArea()
    {
        area = (base * altura);
        area = area/2;
    }
    
    @Override
    public void calculaPerimetro()
    {
       
          perimetro = 3 * base; 
    }
    
    @Override
    public String toString()
    {
        String info = "base:" + base;
        return info;
    }
}
