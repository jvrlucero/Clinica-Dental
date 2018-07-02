package proyectoclinicadental;

import java.sql.ResultSet;

public class class_Salas {
    Conexion cn = new Conexion();
    public void insertar(String Nombre) {
        cn.UID("insert into salas(Nombre_Sala) value('"+Nombre+"')");
    }
    public void modificar(String ID, String Nombre){
        cn.UID("Update salas set Nombre_Sala='"+Nombre+"' where id_Sala='"+ID+"'");
    }
    public ResultSet LlenarListadeSalas() {
        return (cn.getValores("select Nombre_Sala from salas"));
    }
}
