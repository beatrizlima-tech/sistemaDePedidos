package repositories;

import entities.Pedido;
import interfaces.PedidoRepository;

import java.io.PrintWriter;

public class PedidoRepositoryXML implements PedidoRepository {

    @Override
    public void exportar(Pedido pedido) throws Exception{

        var printWriter = new PrintWriter("pedido_" + pedido.getId() + "xml");

    // Escrever o cabeçalho do arquivo XML
    printWriter.write("<?xml version='1.0' encoding='UTF-8'?>");

    // Monstrando a estrutura de TAGS do XML
    printWriter.write("<pedido>");

        printWriter.write("<id>" + pedido.getId() + "</id>");
        printWriter.write("<data>" + pedido.getData() + "</data>");
        printWriter.write("<status>" + pedido.getStatus() + "</status>");

        printWriter.write("<cliente>");
            printWriter.write("<nome>" + pedido.getCliente().getNome() + "</nome>");
        printWriter.write("</cliente>");

    printWriter.write("<produtos>");
        for(var produto: pedido.getProdutos()){
            printWriter.write("<produto>");
                printWriter.write("<nome>" + produto.getNome() + "</nome>");
                printWriter.write("<preco>" + produto.getPreco() + "</preco>");
        printWriter.write("</produto>");

        }

    printWriter.write("</produtos>");

        printWriter.write("</pedido>");

        //Fechando o arquivo
        printWriter.close();

    }

}
