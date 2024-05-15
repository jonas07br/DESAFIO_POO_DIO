public abstract class Conteudo {
    protected static final double XP_PADRAO = 10;

    private String titulo;
    private String descricao;
    
    public Conteudo(){
        this.titulo = "TITULO";
        this.descricao = "DESCRIÇAO";
    }

    public Conteudo(String titulo,String descricao){
        this.titulo=titulo;
        this.descricao=descricao;
    }

    public abstract double calcularXp();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

}
