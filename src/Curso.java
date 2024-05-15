public class Curso extends Conteudo {
    
    private int cargaHoraria=0;

    public Curso(){
        super();
        this.cargaHoraria=0;
    }
    public Curso(String titulo,String descricao,int cargaHoraria){
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String toString() {
        return "Curso: " + this.getTitulo() + "; cargaHoraria:" + cargaHoraria + "; descricao:" + this.getDescricao()+ ".";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
