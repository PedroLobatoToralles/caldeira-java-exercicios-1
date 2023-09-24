public class Main {
    public static void main(String[] args) {

        ContaBancaria contabancaria = new ContaBancaria();
        ContaBancaria contabancaria2 = new ContaBancaria();

        contabancaria.deposito(500);
        contabancaria.transferencia(contabancaria2, 200);
        contabancaria.setNome("Pedro Lobato Toralles");
        contabancaria.setCpf("047.562.5440-47");
        contabancaria.setIdentificadorConta("1132431");
        contabancaria.setBanco("123124");
        contabancaria.alterarEndereco("Av. Bento Gonçalves, 1515");
        contabancaria.verificarHorario();

    }
}