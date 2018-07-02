package proyectoclinicadental;
import java.sql.ResultSet;
public class class_Medicos {
    
    Conexion cn = new Conexion();
    public void insertar(String Nombre,String Apellido,String Tel,String Direccion,String Dui_Med,String NIT) {
        cn.UID("insert into medicos(Nombres_Med,Apellidos_Med,Tel_Med,Direccion_Med,Dui_Med,NIT) values('"+Nombre+"','"+Apellido+"','"+Tel+"','"+Direccion+"','"+Dui_Med+"','"+NIT+"')");
    }

    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(id_Med) FROM medicos"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(id_Med) FROM medicos"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT * FROM medicos"));
    }
    
  public void modificar(String ID,String Nombre,String Apellido,String Tel,String Direccion,String Dui_Med,String NIT) {
        cn.UID("update medicos set Nombres_Med='"+Nombre+"',Apellidos_Med='"+Apellido+"',Tel_Med='"+Tel+"',Direccion_Med='"+Direccion+"',Dui_Med='"+Dui_Med+"',NIT='"+NIT+"' where id_Med='"+ID+"'");
    }
    
    public ResultSet ConsultaporPorCodigo(String ID) {
        return (cn.getValores("SELECT * FROM medicos where id_Med='"+ID+"'"));
    }

    public void eliminar(String ID) {
        cn.UID("DELETE FROM medicos where id_Med='"+ID+"'");
    }
}
