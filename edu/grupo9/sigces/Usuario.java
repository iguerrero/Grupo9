package edu.grupo9.sigces;

public abstract class Usuario {
    /**
     * TODO - significa "Por hacer". Y ac�, como ven, hay que hacer TODO.
     * Por empezar, deber�an declarar las variables de clase: Nombre, apellido, dni, etc.
     * Todas las que sean comunes a los tres tipos de Usuario que utiliza esta aplicaci�n:
     * M�dico, Paciente y Admin. Todas aquellas variables que sean espec�ficas de cada rol,
     * por ej., matr�cula y especialidad, van en la clase Medico.
     */

    // Declarar variables de Usuario. Va una de ejemplo.
    String nombre;

    private String apellido;


    // Constructores de la clase. Esto lo hace la IDE

    public Usuario() {

    }

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
    }


    // Getters y Setters de la clase. Estos tambi�n los hace la IDE :)


    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerApellido() { return apellido; }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }
}
