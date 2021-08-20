import java.util.List;

public class Productos {
    int codigo;
    String modelo;
    List<Proveedores> proveedores;
    //method constructor


    public Productos(int codigo,
                     String modelo,
                     List<Proveedores> proveedores) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.proveedores = proveedores;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Proveedores> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedores> proveedores) {
        this.proveedores = proveedores;
    }
}
