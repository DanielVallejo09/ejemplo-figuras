public class triangulo extends Figura
{
    private float base;
    private float altura;
    private float lado1;
    private float lado2;
    
    public triangulo(float iniBase, float iniAltura,float iniLado1,float iniLado2)
    {
        base = iniBase;
        altura = iniAltura;
        lado1 = iniLado1;
        lado2 = iniLado2;
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
        if ( base == altura )
        {
          perimetro = 3 * base;  
        }
        else
            if(base != lado1 && lado1 == lado2)
            {
                perimetro = 2 * base * lado1;
            }
            else
                if(base != lado1 && lado1 != lado2)
                {
                    perimetro = base + lado1 + lado2;
                }
    }
}
