package me.alura.bytebank;

class Main {
    public static void main(String[] args) {

        /*Conta conta = new Conta(1337, 23334);
        conta.deposita(200);
        System.out.println("Saldo: " + conta.getSaldo());
        conta.setAgencia(570);
        System.out.println("Agencia: " + conta.getAgencia());
        System.out.println("o total de contas é: " + Conta.getTotal());*/

        /*Funcionario cleber = new Funcionario();
        cleber.setNome("Cleber Junior");
        cleber.setCpf("223.456.789-00");
        cleber.setSalario(2000.0);

        System.out.println(cleber.getNome());
        System.out.println(cleber.getBonificacao());*/

        Gerente gerente = new Gerente();
        gerente.setSalario(5000);
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getBonificacao());
    }
}
