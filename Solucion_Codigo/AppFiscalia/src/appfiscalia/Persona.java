package appfiscalia;

class Persona {
    private String nombre;
    private int edad;
    private String ocupacion;
    private String rol;

    public Persona(String nombre, int edad, String ocupacion, String rol) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Ocupación: " + ocupacion + ", Rol: " + rol;
    }
}