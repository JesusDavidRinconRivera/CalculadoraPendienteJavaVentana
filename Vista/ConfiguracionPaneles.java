package Vista;

import javax.swing.*;
import java.awt.*;
public class ConfiguracionPaneles extends JFrame {
    public ConfiguracionPaneles() {
        ConfiguracionCampoTexto configuracionCampoTexto = new ConfiguracionCampoTexto();
        JPanel panelVerde = configuracionCampoTexto.crearPanelCampoTexto();
        panelVerde.setBackground(Color.decode("#434343"));

        // Agregar los campos de texto desde ConfiguracionCampoTexto
        JPanel panelCampos = new ConfiguracionCampoTexto().crearPanelCampoTexto();
        panelVerde.add(panelCampos);

        // Crear el botón y pasarlo al panel rojo
        JTextField campo1 = configuracionCampoTexto.getCampo1();
        JTextField campo2 = configuracionCampoTexto.getCampo2();
        JTextField campo3 = configuracionCampoTexto.getCampo3();
        JTextField campo4 = configuracionCampoTexto.getCampo4();
        ConfiguracionBoton configuracionBoton = new ConfiguracionBoton(campo1, campo2, campo3, campo4);
        JButton boton = configuracionBoton.getBoton();
        JPanel panelRojo = new JPanel();
        panelRojo.setBackground(Color.decode("#434343"));
        panelRojo.setLayout(null);
        panelRojo.add(boton);

        JPanel panelRosa = new JPanel();
        panelRosa.setBackground(Color.PINK);

        JPanel panelAzul = new JPanel();
        panelAzul.setBackground(Color.BLUE);

        getContentPane().setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        // Panel verde
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        c.weightx = 0.2;
        c.weighty = 0.8;
        c.fill = GridBagConstraints.BOTH;
        getContentPane().add(panelVerde, c);

        // Panel rojo
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0.2;
        c.weighty = 0.2;
        c.fill = GridBagConstraints.BOTH;
        getContentPane().add(panelRojo, c);

        // Panel rosa
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0.8;
        c.weighty = 0.8;
        c.fill = GridBagConstraints.BOTH;
        getContentPane().add(panelRosa, c);

        // Panel azul
        c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0.8;
        c.weighty = 0.2;
        c.fill = GridBagConstraints.BOTH;
        getContentPane().add(panelAzul, c);
    }
}
