import javax.swing.JPanel;
import java.awt.Graphics;
public class PanelDibujo extends JPanel
{
    private Cuaderno cuadernoFiguras;
    
    public PanelDibujo(Cuaderno unCuaderno)
    {
        cuadernoFiguras = unCuaderno;
    }
    
    @Override
    public void paintComponent(Graphics unGrafico)
    {
        System.out.println("voy a dibujar las figuras");
    }
}
