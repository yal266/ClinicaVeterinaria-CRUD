package Conexion;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class ConexionSQL {
	
    protected Connection conector = null;
	
    public abstract void conectar();
	
    public Connection getConector() {
	return conector;
    }
        
    public void desconectar() throws SQLException  {
	conector.close();
    }
}