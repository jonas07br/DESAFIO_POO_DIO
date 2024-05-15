import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString() {
        return "Mentoria:" + this.getTitulo() + ", descricao:" + this.getDescricao() + ", data:" + data + "";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

}
