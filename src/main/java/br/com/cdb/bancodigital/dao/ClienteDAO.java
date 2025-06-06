package br.com.cdb.bancodigital.dao;

import br.com.cdb.bancodigital.entity.Cliente;

import java.util.ArrayList;
import java.util.UUID;

public class ClienteDAO {

    // Aqui você pode implementar métodos para manipular os dados do cliente,
    // como salvar, atualizar, excluir e buscar clientes no banco de dados.
    ArrayList<Cliente> listaDeClientes = new ArrayList<>();

    // Exemplo de método para salvar um cliente
    public void addCliente(Cliente cliente) {
        // Geração de UD automático comUUID (mais robusto e único)
        String novoId = UUID.randomUUID().toString();
        // Lógica para salvar o cliente no banco de dados
//        cliente.setId((listaDeClientes.size() + 1) + ""); // Simulando um ID único
        cliente.setId(novoId); // Atribuindo o ID gerado ao cliente
        listaDeClientes.add(cliente);
    }

    // Exemplo de método para buscar um cliente por ID
    public Cliente buscarClientePorId(String id) {
        // Lógica para buscar o cliente no banco de dados
        // Retorne o cliente encontrado ou null se não existir
        for (Cliente cliente : listaDeClientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }

        }
        return null;
    }

    // Outros métodos conforme necessário...
}
