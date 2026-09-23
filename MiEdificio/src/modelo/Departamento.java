package modelo;

public class Departamento {

    private int idDepartamento;
    private int piso;
    private String letra;
    private String vecino;

    public Departamento() {
    }

    public Departamento(int idDepartamento, int piso, String letra, String vecino) {
        this.idDepartamento = idDepartamento;
        this.piso = piso;
        this.letra = letra;
        this.vecino = vecino;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getVecino() {
        return vecino;
    }

    public void setVecino(String vecino) {
        this.vecino = vecino;
    }

    @Override
    public String toString() {
        return piso + "°" + letra + " - " + vecino;
    }

}
