import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener{

    private JButton[] buttonsNumbers;
    private JButton[] buttonsOperations;
    private JTextField texto;
    private String operando1;
    private String operacion;
    private boolean ultimo;

    public Calculadora() {

        //JFrame frame = new JFrame("Calculadora");
        this.setTitle("Calculadora");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        panel1.setLayout(new GridLayout (1,1));
        panel2.setLayout(new GridLayout (4,4));
        panel3.setLayout(new GridLayout (3,2));

        texto = new JTextField();
        texto.setSize(150,150);
        Font font1 = new Font("Calibri", Font.BOLD, 28);
        texto.setFont(font1);
        texto.setEditable(false);
        panel1.add(texto);
        this.add(panel1,BorderLayout.NORTH);


        creaBotones(panel2, this);
        this.add(panel2,BorderLayout.CENTER);

        creaBotonesOperaciones(panel3,this);
        this.add(panel3,BorderLayout.EAST);

        /*try {
            // Set cross-platform Java L&F (also called "Metal")
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }*/


    }

    private void creaBotonesOperaciones(JPanel panel3, Calculadora calculadora) {

        buttonsOperations = new JButton[5];
        buttonsOperations[0] = new JButton("*");
        buttonsOperations[1] = new JButton("/");
        buttonsOperations[2] = new JButton("+");
        buttonsOperations[3] = new JButton("-");
        buttonsOperations[4] = new JButton("=");

        for (int i = 0; i < buttonsOperations.length; i++) {
            panel3.add(buttonsOperations[i]);
            buttonsOperations[i].addActionListener((ActionListener) calculadora);
        }

    }

    private void creaBotones(JPanel panel, JFrame ventana) {
        buttonsNumbers = new JButton[10];
        for (int i = 9; i >= 0; i--) {
            buttonsNumbers[i] = new JButton(Integer.toString(i));
            panel.add(buttonsNumbers[i]);
            buttonsNumbers[i].addActionListener((ActionListener) ventana);
        }
    }

    public void actionPerformed (ActionEvent e){
        //Obtener el boton presionado:
        JButton boton = (JButton) e.getSource();
        String textoDelBoton = boton.getText();
        System.out.println(textoDelBoton);
        //Si se presiona un numero, tendré que escribirlo en el TextField
        if (textoDelBoton.matches("[0-9]")) {
            if (ultimo) {
                texto.setText(textoDelBoton);
                this.ultimo = false;
            } else {
                texto.setText(texto.getText() + textoDelBoton);
            }
        }
        //Si se presiona un operador (+-*/) --> Calcular
        else if (textoDelBoton.matches("[+\\-*/]")) {
            this.ultimo = false;
            operando1 = texto.getText();
            texto.setText(operando1 + textoDelBoton);
            operacion = textoDelBoton;
            System.out.println(operando1 + operacion);
        } else if (textoDelBoton.equals("=")) {
            //guardarme el numero de la pantalla.
            String operando2 = texto.getText();
            this.ultimo = true;
            operando2 = operando2.replace(operando1 + operacion, "");
            System.out.println(operando2);
            texto.setText("");
            int resultado = 0;
            if (operacion.equals("+")) {
                resultado = Integer.parseInt(operando1) + Integer.parseInt(operando2);
                texto.setText("" + resultado);
            }
            else if (operacion.equals("-")){
                resultado = Integer.parseInt(operando1) - Integer.parseInt(operando2);
                texto.setText("" + resultado);
            }else  if (operacion.equals("*")){
                resultado = Integer.parseInt(operando1) * Integer.parseInt(operando2);
                texto.setText("" + resultado);
            }else  if (operacion.equals("/")){
                resultado = Integer.parseInt(operando1) / Integer.parseInt(operando2);
                texto.setText("" + resultado);
            }

        }
    }

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);

    }
}