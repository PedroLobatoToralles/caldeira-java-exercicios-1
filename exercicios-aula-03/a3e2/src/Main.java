public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();

        circulo.definirRaio(4);
        circulo.calcularArea();
        System.out.println(circulo.area);
        circulo.calcularCircunferencia();
        System.out.println(circulo.circunferencia);
    }
}