
package clase3;

/**
 * La clase Mascota permite almacenar los datos de mascotas
 * @author Eduardo
 */
public class Mascota {
    private String nombre;
    private int edad;
    private String raza;

    public Mascota() {
        nombre = "--";
        raza = "--";
    }

    public Mascota(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return nombre + ", edad=" + edad + ", raza=" + raza;
    }
    
    public String comer(String comida, float cant){
        return" comiendo " + cant + " grs de " + comida;
    }
    
}
