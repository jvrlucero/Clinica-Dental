package proyectoclinicadental;

import java.sql.ResultSet;

public class class_Citas {
    Conexion cn = new Conexion();
    public void insertar(int id_Med,int id_Cli,int id_Sala,String Fecha) {
        cn.UID("insert into citas(id_Med,id_Cli,id_Sala,Fecha_Cita) values ('"+id_Med+"','"+id_Cli+"','"+id_Sala+"','"+Fecha+"')");
    }
    public ResultSet ListaClientes() {
        return (cn.getValores("select Nombres_Cli from clientes order by id_Cli"));
    }
    public ResultSet ListaDentistas() {
        return (cn.getValores("select Nombres_Med from medicos order by id_Med"));
    }
    public ResultSet ListaSalas() {
        return (cn.getValores("select Nombre_Sala from salas order by id_Sala"));
    }
    
}
