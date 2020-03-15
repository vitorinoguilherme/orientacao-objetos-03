package exercicios;

public class Circulo {
    private Double raio;

    public Circulo(Double raio) {
        this.setRaio(raio);
    }

    public static Circulo criarComRaio(Double raio) {
        return new Circulo(raio);
    }

    public Double calcularArea() {
        return Math.PI * raio * raio;
    }

    public Double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public void setRaio(Double raio) {
        if ( raio <= 0 )
            throw new IllegalArgumentException("Raio deve ser maior que zero.");
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }
}
