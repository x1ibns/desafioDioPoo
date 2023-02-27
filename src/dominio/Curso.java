package dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo = " + getTitulo() +
                "descricao = " + getDescricao() +
                "cargaHoraria= " + cargaHoraria +
                '}';
    }

    @Override
    public double calculaXp() {
        return 0;
    }
}
