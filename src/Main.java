public class Main {
    public static void main(String[] args){
        System.out.println("++++Sistema Bancário++++");

        //objetos
        Conta contaJoao = new Conta(
                10254,
                "joao123",
                100.0,
                "João"
        );

        //imprimir dados das contas
        contaJoao.imprimir();

    }
}
