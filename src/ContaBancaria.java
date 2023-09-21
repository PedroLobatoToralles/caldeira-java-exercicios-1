public class ContaBancaria {
    public String nome;
    private String cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    public String horarioAtual;


    public String getCpf() {
        return this.cpf;
    }

    public int getIdentificadorConta() {
        return this.identificadorConta;
    }

    public String getBanco() {
        return this.banco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public double getSaldo() {
        return this.saldo;
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

    }

    public void pix(double valor) {

    }

    public void transferencia(ContaBancaria destino, double valor) {

    }

    public double verificarSaldo() {
        return saldo;
    }

    public void verificarHorario() {

    }

    public void verificarInformacoes() {

    }

    public void alterarEndereco(String novoEndereco) {

    }

    public void calcularJuros(double taxa) {

    }

    public void fecharConta() {

    }
}
