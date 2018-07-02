package proyectoclinicadental;

import java.sql.ResultSet;

public class class_Factura {
    Conexion cn = new Conexion();
    public void insertar(int id_Cita,int id_HistDClient,String OtrosDetalles,String costo,String Fecha_facturacion) {
        cn.UID("insert into facturas(id_Cita,id_HistDClient,OtrosDetalles,costo,Fecha_facturacion) values('"+id_Cita+"','"+id_HistDClient+"','"+OtrosDetalles+"','"+costo+"','"+Fecha_facturacion+"')");
    }    
    public ResultSet ListaHistClientes() {
        return (cn.getValores("select id_HistDClient from historiald_clientes order by id_Cli"));
    }
    public ResultSet ListaCitas() {
        return (cn.getValores("select id_Cita from citas order by  id_Cita"));
    }
}
