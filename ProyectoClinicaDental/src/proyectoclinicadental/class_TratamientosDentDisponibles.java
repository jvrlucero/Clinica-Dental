package proyectoclinicadental;

import java.sql.ResultSet;

public class class_TratamientosDentDisponibles {
    Conexion cn = new Conexion();
    public void insertar(String nuevo) {
        cn.UID("insert into tratamientosdentales (TratamientoDental) value ('"+nuevo+"')");
    }
    public ResultSet ListaTratamientos() {
        return (cn.getValores("SELECT TratamientoDental FROM tratamientosdentales order by id_TD;"));
    }
}
