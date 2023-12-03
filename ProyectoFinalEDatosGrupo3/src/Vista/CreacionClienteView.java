package Vista;

import Modelo.Cliente;
import javax.swing.JOptionPane;

public class CreacionClienteView {

    static CreacionCliente creacionCliente = new CreacionCliente();

    public static void mostrarMenuClientes() {
        MenuClienteView menu = new MenuClienteView();

        JOptionPane.showMessageDialog(null, menu);
    }

    public static Cliente crearClienteView() {

        JOptionPane.showMessageDialog(null, creacionCliente);

        String nombre = creacionCliente.getNombreField().getText();
        String apellido = creacionCliente.getjTextField2().getText();
        int cedula = Integer.parseInt(creacionCliente.getjTextField3());
        String correo = creacionCliente.getjTextField4().getText();
        int telf = Integer.parseInt(creacionCliente.getjTextField5());

        Cliente nuevoCliente = new Cliente(nombre, apellido, cedula, correo, telf);
        return nuevoCliente;
    }
}
