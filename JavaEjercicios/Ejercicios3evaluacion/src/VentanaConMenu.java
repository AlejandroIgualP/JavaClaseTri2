import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class VentanaConMenu extends JFrame {
    public VentanaConMenu(){
        setTitle("Ventana Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
    }

    public static void main(String[] args) {
        VentanaConMenu ventanaConMenu = new VentanaConMenu();
        ventanaConMenu.setVisible(true);

    }
}
