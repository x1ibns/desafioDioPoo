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
                "titulo = " + getTitulo() + " , " +
                "descricao = " + getDescricao() + " , " +
                "cargaHoraria= " +getCargaHoraria() +
                '}';
    }

    @Override
    public double calculaXp() {
        double xp = XP_PADRAO * cargaHoraria;
        return 0;
    }
}
