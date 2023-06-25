package pe.edu.upc.egymbackend.dtos;

public class DocVentaDetVentaDTO {
    private String nameAlumno;
    private String nameProducto;
    private String montoTotal;
    private String fecha;

    public DocVentaDetVentaDTO() {
    }

    public DocVentaDetVentaDTO(String nameAlumno, String nameProducto, String montoTotal, String fecha) {
        this.nameAlumno = nameAlumno;
        this.nameProducto = nameProducto;
        this.montoTotal = montoTotal;
        this.fecha = fecha;
    }

    public String getNameAlumno() {
        return nameAlumno;
    }

    public void setNameAlumno(String nameAlumno) {
        this.nameAlumno = nameAlumno;
    }

    public String getNameProducto() {
        return nameProducto;
    }

    public void setNameProducto(String nameProducto) {
        this.nameProducto = nameProducto;
    }

    public String getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(String montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
