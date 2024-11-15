import conector.conexion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello ");
        conexion con = new conexion("entidades_financieras");
        con.conectar();
        con.desconectar();
    }

}