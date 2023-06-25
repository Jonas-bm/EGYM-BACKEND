package pe.edu.upc.egymbackend.dtos;

public class ProductoAlumnoDTO {
    private String nameAlumno;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int productosCount;

    public ProductoAlumnoDTO() {
    }
    public ProductoAlumnoDTO(String nameAlumno, String apellidoPaterno, String apellidoMaterno, int productosCount) {
        this.nameAlumno = nameAlumno;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.productosCount = productosCount;
    }
    public String getNameAlumno() {
        return nameAlumno;
    }
    public void setNameAlumno(String nameAlumno) {
        this.nameAlumno = nameAlumno;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getProductosCount() {
        return productosCount;
    }
    public void setProductosCount(int productosCount) {
        this.productosCount = productosCount;
    }
}
