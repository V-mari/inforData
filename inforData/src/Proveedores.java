import java.util.List;

public class Proveedores{
  int nif;
    String


    String

  public Proveedores(int nif,
                     java.lang.String string,
                     java.lang.String direccion,
                     List<cant_prod_prop> cant_prod_prop,
                     java.lang.String nombre_prov,
                     java.lang.String primerApellido,
                     java.lang.String segundoApellido,
                     java.lang.String email,
                     java.lang.String telefono,
                     int celular,
                     List<productos> productos,
                     List<empresas> empresas) {

    this.nif = nif;String = string;
    this.direccion = direccion;
    this.cant_prod_prop = cant_prod_prop;
    this.nombre_prov = nombre_prov;
    this.primerApellido = primerApellido;
    this.segundoApellido = segundoApellido;
    this.email = email;
    this.telefono = telefono;
    this.celular = celular;
    this.productos = productos;
    this.empresas = empresas;
  }


  //metodo constructor


private String direccion;
  private List<cant_prod_prop> cant_prod_prop;
  private String nombre_prov;
  private String primerApellido;
  private String segundoApellido;
  private String email;
  private String telefono;
  private int celular;
  private List<Productos> productos;
  private List<empresa> empresas;

  public int getNif() {
    return nif;
  }

  public void setNif(int nif) {
    this.nif = nif;
  }

  public java.lang.String getString() {
    return String;
  }

  public void setString(java.lang.String string) {
    String = string;
  }

  public java.lang.String getDireccion() {
    return direccion;
  }

  public void setDireccion(java.lang.String direccion) {
    this.direccion = direccion;
  }

  public List<cant_prod_prop> getCant_prod_prop() {
    return cant_prod_prop;
  }

  public void setCant_prod_prop(List<cant_prod_prop> cant_prod_prop) {
    this.cant_prod_prop = cant_prod_prop;
  }

  public java.lang.String getNombre_prov() {
    return nombre_prov;
  }

  public void setNombre_prov(java.lang.String nombre_prov) {
    this.nombre_prov = nombre_prov;
  }

  public java.lang.String getPrimerApellido() {
    return primerApellido;
  }

  public void setPrimerApellido(java.lang.String primerApellido) {
    this.primerApellido = primerApellido;
  }

  public java.lang.String getSegundoApellido() {
    return segundoApellido;
  }

  public void setSegundoApellido(java.lang.String segundoApellido) {
    this.segundoApellido = segundoApellido;
  }

  public java.lang.String getEmail() {
    return email;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  public java.lang.String getTelefono() {
    return telefono;
  }

  public void setTelefono(java.lang.String telefono) {
    this.telefono = telefono;
  }

  public int getCelular() {
    return celular;
  }

  public void setCelular(int celular) {
    this.celular = celular;
  }

  public List<Productos> getProductos() {
    return productos;
  }

  public void setProductos(List<Productos> productos) {
    this.productos = productos;
  }

  public List<empresa> getEmpresas() {
    return empresas;
  }

  public void setEmpresas(List<empresa> empresas) {
    this.empresas = empresas;
  }

}
