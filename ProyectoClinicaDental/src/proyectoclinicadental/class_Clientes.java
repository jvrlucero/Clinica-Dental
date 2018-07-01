
package proyectoclinicadental;

import java.sql.ResultSet;
public class class_Clientes {
    Conexion cn = new Conexion();
    
    
    public void insertar(String Nombre,String Apellido,String Tel,String Direccion,String Edad) {
        cn.UID("insert into clientes(Nombres_Cli,Apellidos_Cli,Tel_Cli,Direccion_Cli,Edad_Cli) values('"+Nombre+"','"+Apellido+"','"+Tel+"','"+Direccion+"','"+Edad+"')");
    }
    
    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(id_Cli) FROM clientes"));
    }
    
    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(id_Cli) FROM clientes"));
    }
    
    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT * FROM clientes"));
    }
    
    public void modificar(String ID,String Nombre,String Apellido,String Tel,String Direccion,String Edad) {
        cn.UID("update clientes set Nombres_Cli='"+Nombre+"',Apellidos_Cli='"+Apellido+"',Tel_Cli='"+Tel+"',Direccion_Cli='"+Direccion+"',Edad_Cli='"+Edad+"' where id_Cli='"+ID+"'");
    }
    
    public ResultSet ConsultaporPorCodigo(String ID) {
        return (cn.getValores("SELECT * FROM clientes where id_Cli='"+ID+"'"));
    }
    
    public void eliminar(String ID) {
        cn.UID("DELETE FROM clientes where id_Cli='"+ID+"'");
    }

}
