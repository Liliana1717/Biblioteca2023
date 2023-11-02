import java.util.ArrayList;

public class Usuario {

    private String dni;
    private String nombre;
    private String apellidos;
    private String  telefono;
private ArrayList<Prestamos>prestamos;
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Prestamos> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamos> prestamos) {
        this.prestamos = prestamos;
    }
}
