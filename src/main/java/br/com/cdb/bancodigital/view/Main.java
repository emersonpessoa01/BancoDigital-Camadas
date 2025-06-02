package br.com.cdb.bancodigital.view;

import br.com.cdb.bancodigital.service.ClienteService;

public class Main {
    public static void main(String[] args) {
        // Aqui você pode iniciar a aplicação, criar instâncias de serviços, etc.
        String nome = "João da Silva";
        String cpf = "12345678901"; // Exemplo de CPF válido

        ClienteService clienteService = new ClienteService();

        if(clienteService.addCliente(nome, cpf)) {
            System.out.println("Cliente adicionado com sucesso!");
        } else {
            System.out.println("Erro ao adicionar cliente. Verifique os dados informados.");
        }
    }
    
}
