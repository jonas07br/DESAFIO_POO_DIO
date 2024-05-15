import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;
    public Mentoria(){
        super();
        this.data = LocalDate.now();
    }
    public Mentoria(String titulo,String descricao){
        super(titulo, descricao);
        this.data = LocalDate.now().plusDays(5);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString() {
        return "Mentoria:" + this.getTitulo() + ", descricao:" + this.getDescricao() + ", data:" + data + "\n";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

}
