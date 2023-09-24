import java.lang.Math;
public class Circulo {

    public double raio;
    public double area;
    public double circunferencia;
    public double diametro;

    public double calcularArea() {
        area = Math.PI * (this.raio * this.raio);
        return area;
    }

    public double calcularCircunferencia() {
        circunferencia = 2 * Math.PI * this.raio;
        return circunferencia;
    }

    public void definirRaio(double novoRaio) {
        if(novoRaio > 0) {
            this.raio = novoRaio;
        }else {
            System.out.println("É preciso fornecer um raio positivo!");
        }
    }

    public double getRaio(){
        return this.raio;
    }

    public boolean verificarIguais(Circulo circulo2){
        if(this.raio == circulo2.raio){
            return true;
        }else{
            return false;
        }
    }

    public double calcularDiametro(){
        diametro = this.raio * 2;
        return diametro;
    }

}

//ver2
