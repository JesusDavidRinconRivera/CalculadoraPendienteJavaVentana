package Vista;

import javax.swing.*;

public class ConfiguracionCampoTexto {
    private JTextField campo1, campo2, campo3, campo4;

    public ConfiguracionCampoTexto() {
        campo1 = new JTextField();
        campo2 = new JTextField();
        campo3 = new JTextField();
        campo4 = new JTextField();
    }

    public JPanel crearPanelCampoTexto() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        
     panel.add(campo1);

        
        panel.add(campo2);

        panel.add(campo3);

      
        panel.add(campo4);

        return panel;
    }

    public JTextField getCampo1() {
        return campo1;
    }

    public JTextField getCampo2() {
        return campo2;
    }

    public JTextField getCampo3() {
        return campo3;
    }

    public JTextField getCampo4() {
        return campo4;
    }
}
