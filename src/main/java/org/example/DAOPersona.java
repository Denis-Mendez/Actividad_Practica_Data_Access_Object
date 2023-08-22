package org.example;

import oracle.jdbc.OracleDatabaseMetaData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOPersona {
    private static final String CUENTA_PERSONAS = "SELECT COUNT (ID_PERSONA) AS CUENTA FROM PERSONA";
    public static int cuentaPersonas() {
        int cuenta = 0;
        try {
            PreparedStatement statement = DatabaseManager.getConnection().prepareStatement(CUENTA_PERSONAS);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                cuenta = resultado.getInt("CUENTA");
            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        return cuenta;
    }
}
