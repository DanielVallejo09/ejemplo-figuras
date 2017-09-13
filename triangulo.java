public class triangulo extends Figura
{
    private float base;
    private float altura;
    
    
    public triangulo(float iniBase, float iniAltura)
    {
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
}
