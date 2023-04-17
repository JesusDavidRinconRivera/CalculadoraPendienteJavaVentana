package Vista;

import java.awt.*;
import javax.swing.*;

public class ConfiguracionVentana extends JFrame {
  public ConfiguracionVentana() {
    setVisible(true);
    setTitle("Calculadora de Pendiente");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize();
    setSize(screenSize);
    setLocationRelativeTo(null);
    ConfiguracionPaneles paneles = new ConfiguracionPaneles();
    add(paneles.getContentPane());
    
  }     
}
