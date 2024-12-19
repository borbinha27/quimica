public class Metal {
    private String nome;
    private double potencial;

    public Metal(String nome, double potencial) {
        this.nome = nome;
        this.potencial = potencial;
    }

    public String get_nome() {
        return nome;
    }

    public double get_potencial() {
        return potencial;
    }
}