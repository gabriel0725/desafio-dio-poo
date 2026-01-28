/**
 * @author Gabri
 */

package br.com.clark.desafio.dominio;

public class Curso extends Conteudo{


    private int cargaHoraria;


    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso:\n" +
                "  Título: " + getTitulo() + "\n" +
                "  Descrição: " + getDescricao() + "\n" +
                "  Carga horária: " + cargaHoraria + "h";
    }

}
