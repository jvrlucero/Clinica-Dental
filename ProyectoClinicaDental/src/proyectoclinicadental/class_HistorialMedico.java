
package proyectoclinicadental;

import java.sql.ResultSet;


public class class_HistorialMedico {
    
    Conexion cn = new Conexion();
    public void insertar(int id_Cli,String HistorialMedico,String TratamientoMedico,String FechaIniTrat,String FechaFinTrat) {
        cn.UID("insert into historialm_clientes(id_Cli,HistorialMedico,TratamientoMedico,FechaIniTrat,FechaFinTrat) values('"+id_Cli+"','"+HistorialMedico+"','"+TratamientoMedico+"','"+FechaIniTrat+"','"+FechaFinTrat+"')");
    }
    public ResultSet ListaClientes() {
        return (cn.getValores("select Nombres_Cli, Apellidos_Cli  from clientes order by id_Cli"));
    }
    
}
