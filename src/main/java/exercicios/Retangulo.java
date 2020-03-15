package exercicios;

public class Retangulo {
    private Double altura;
    private Double base;

    public Retangulo(Double altura, Double base) {
        this.setAltura(altura);
        this.setBase(base);
    }

    public static Retangulo criarComBaseAltura(Double altura, Double base) {
        return new Retangulo(altura, base);
    }

    public void setAltura(Double altura) {
        if( altura <= 0 )
            throw new IllegalArgumentException("Altura deve ser maior que zero");
        this.altura = altura;
    }

    public void setBase(Double base) {
        if( base <= 0 )
            throw new IllegalArgumentException("Base deve ser maior que zero");
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getBase() {
        return base;
    }

    public Double calcularArea() {
        return altura * base;
    }

    public Double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
