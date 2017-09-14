import javax.swing.JFrame;
public class Demo
{
    public void PanelDibujo()
    {
      PanelDibujo panel = new PanelDibujo();
      JFrame ventana = new JFrame();
      ventana.add(panel);
      ventana.setSize(250,250);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ventana.setVisible(true);
      
    }
    
  
    
}