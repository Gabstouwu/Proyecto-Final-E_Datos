package Controlador;

import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class TestCLientes_no_usuar {

    public static List<Usuario> listaUsuario= new ArrayList<>();

    //crear Usuario
    public void crearUsuario(Usuario nuevousuario) {

        listaUsuario.add(nuevousuario);
        
        System.out.print(listaUsuario);
    }

    //generardor de contraseñas
    //Guardar en txt
    //vereficar Duplicidad de usuarios
}
