package vista;

import javax.swing.*;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.Date;

public class Vista {
    private String documento;
    private String primer_nombre;
    private String segundo_nombre;
    private String primer_apellido;
    private String segundo_apellido;


    //new Date();
    //DateFormat formato = new SimpleDateFormat("YYYY/MM/DD");
   // Date fecha_naciimiiento = formato.parse(formato.format(new Date()));

    public void vista(){
        documento = JOptionPane.showInputDialog("digite el documento");
        primer_nombre = JOptionPane.showInputDialog("digite el primer nombre");
        segundo_nombre = JOptionPane.showInputDialog("digite el segundo nombre");
        primer_apellido = JOptionPane.showInputDialog("digite el primer apellido");
        segundo_apellido = JOptionPane.showInputDialog("digite el segundo apellido");
    }
}
