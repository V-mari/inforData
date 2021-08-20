public class altaTecnologia extends discosD {
    private java.lang.String paisOrigen;
    private java.lang.Date fechaFab;
    private java.lang.String empresaFab;
    private java.lang.String nombreAt;
    private java.lang.String direccion;
    private java.lang.int cantidadEmpleados;

// metodo constructor


    public altaTecnologia(String capacidad, String paisOrigen, java.lang.Date fechaFab, String empresaFab, String nombreAt, String direccion, int cantidadEmpleados) {
        super(capacidad);
        this.paisOrigen = paisOrigen;
        this.fechaFab = fechaFab;
        this.empresaFab = empresaFab;
        this.nombreAt = nombreAt;
        this.direccion = direccion;
        this.cantidadEmpleados = cantidadEmpleados;
    }
}
