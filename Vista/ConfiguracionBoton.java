package Vista;
import javax.swing.*;

public class ConfiguracionBoton {
    private JButton boton;
    private JTextField campo1;
    private JTextField campo2;
    private JTextField campo3;
    private JTextField campo4;

    public ConfiguracionBoton(JTextField campo1, JTextField campo2, JTextField campo3, JTextField campo4) {
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.campo4 = campo4;
        boton = new JButton("Calcular");
        boton.setBounds(10, 10, 80, 30);
        boton.addActionListener(e -> {
            // Obtener los datos de los JtextField y mostrarlos por consola
            String valor1 = campo1.getText();
            String valor2 = campo2.getText();
            String valor3 = campo3.getText();
            String valor4 = campo4.getText();
            System.out.println(valor1 + " " + valor2 + " " + valor3 + " " + valor4);
        });
    }

    public JButton getBoton() {
        return boton;
    }
}
