package modelo;

public class Expensa {

    private int idExpensa;
    private Departamento departamento;
    private int mes;
    private int anio;
    private double monto;
    private boolean pagado;

    public Expensa() {
    }

    public Expensa(int idExpensa, Departamento departamento, int mes, int anio, double monto, boolean pagado) {
        this.idExpensa = idExpensa;
        this.departamento = departamento;
        this.mes = mes;
        this.anio = anio;
        this.monto = monto;
        this.pagado = pagado;
    }

    public int getIdExpensa() {
        return idExpensa;
    }

    public void setIdExpensa(int idExpensa) {
        this.idExpensa = idExpensa;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

}
