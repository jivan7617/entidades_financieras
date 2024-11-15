package conector;

import java.sql.Connection;
import static java.sql.DriverManager.*;

public class conexion {
    String bd = "entidades_financieras";//"entidades_financieras"
    String url = "jdbc:mysql://localhost:3306/" ;
    String user = "root";
    String password = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cnn;

    public conexion() {

    }
    public conexion(String bd) {
        this.bd = bd;
    }


    public Connection conectar() {
        try {
            Class.forName(driver);
            cnn = getConnection(url+ bd, user, password);
            System.out.println("La BD " + this.bd + " conectada exitosamente" );
        } catch (Exception ex) {
            System.out.println("Error al conectar BD: " + this.bd + ", " + ex.getMessage());
        }
        return cnn;
    }

    public void desconectar() {
        try {
            if (cnn!= null && !cnn.isClosed()) {
                cnn.close();
                System.out.println("Conexión a BD "+ this.bd + " cerrada");
            }
        } catch (Exception ex) {
            System.out.println("Error al desconectar BD: " + ex.getMessage());
        }
    }


    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Connection getCx() {
        return cnn;
    }

    public void setCx(Connection cnn) {
        this.cnn = cnn;
    }

}