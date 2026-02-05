package repositories;

import entities.Pedido;
import interfaces.PedidoRepository;

import java.io.PrintWriter;

public class PedidoRepositoryTXT implements PedidoRepository {

    @Override
    public void exportar(Pedido pedido) throws Exception{

        var printWriter = new PrintWriter
                ("pedido_" + pedido.getId() + ".txt");

    // Escrevendo os dados dos pedidos
    printWriter.println("\nID do pedido: " + pedido.getId());
    printWriter.println("\nData: " + pedido.getData());
    printWriter.println("\nStatus: " + pedido.getStatus());

    printWriter.println("\nCliente: " + pedido.getCliente().getNome());
    printWriter.write("\nProdutos:");
    // Percorrer a lista de pedidos do cliente (FOREACH)
    for(var produto: pedido.getProdutos()){
       printWriter.write("\n\t Nome: " + produto.getNome());
       printWriter.write("\n\t Preço: " + produto.getPreco());
    }

    printWriter.close();

    }
}
