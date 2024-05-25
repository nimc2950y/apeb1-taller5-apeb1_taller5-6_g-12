package departamentosempresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private String ruc;
    private String direccion;
    private List<Departamento> departamentos;

    public Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", ruc=" + ruc + ", direccion=" + direccion + ", departamentos=" + departamentos + '}';
    }
    

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
    
}
