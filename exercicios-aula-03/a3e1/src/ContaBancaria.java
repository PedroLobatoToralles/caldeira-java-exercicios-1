import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContaBancaria {
    Date data = new Date();
    Date hora = Calendar.getInstance().getTime();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    String dataFormatada = sdf.format(hora);


    public String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    public String horarioAtual;


    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setCpf(String novoCpf){
        this.cpf = novoCpf;
    }

    public void setIdentificadorConta(String novoId){
        this.identificadorConta = novoId;
    }

    public void setBanco(String novoBanco){
        this.banco = novoBanco;
    }

    public String getCpf() {

        return this.cpf;
    }

    public String getIdentificadorConta() {

        return this.identificadorConta;
    }

    public String getBanco() {

        return this.banco;
    }

    public String getEndereco() {

        return this.endereco;
    }

    public double verificarSaldo() {

        return saldo;
    }


    public void saque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Transação concluida");
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void deposito(double valor) {

        this.saldo+= valor;
        System.out.println("Depósito de R$" + valor + " concluído.");
    }

    public void pix(double valor) {
        if(saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Pix realizado com sucesso.");
            System.out.println("R$" + verificarSaldo());
            System.out.println(dataFormatada);
        }else{
            System.out.println("Erro: Saldo insuficiente.");
        }
    }

    public void transferencia(ContaBancaria destino, double valor) {
        Calendar calendar = Calendar.getInstance();
        int horaAtual = calendar.get(Calendar.HOUR_OF_DAY);
        if(horaAtual >= 8 && horaAtual < 19 && this.saldo >= valor){
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferencia de R$" + valor + " concluída.");

        }else if (this.saldo < valor){
            System.out.println("Erro: Saldo insuficiente");
        }else if (horaAtual < 8 || horaAtual > 18){
            System.out.println("Erro: A transferência só pode ser feita entre 8hrs e 19hrs.");
        }
    }



    public void verificarHorario() {

        System.out.println(dataFormatada);
    }

    public void verificarInformacoes() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.identificadorConta);
        System.out.println(this.banco);
        System.out.println(this.endereco);
        System.out.println(this.saldo);
        System.out.println(this.data);
    }

    public void alterarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public void calcularJuros(double taxa) {

    }

    public void fecharConta() {

    }
}
