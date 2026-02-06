package javaprogressivo.pooparteii.listacomposicao.exemplos.test;

/*
Você foi selecionado para criar um aplicativo - em Java, claro - para um supermercado.
O que o dono do estabelecimento pediu a funcionalidade "Promoção para você", que funciona da seguinte maneira:
Após as 20h, todos os produtos recebem um desconto de 10%.
Aos sábados e domingos esse desconto vale o dia inteiro.

Ou seja, além de ter uma classe para os produtos do supermercado, você deve criar outra com o horário da compra.
Use a técnica de composition para passar o objeto referente ao horário da compra para o objeto referente ao produto que está sendo comprado. Assim, no objeto produto o preço é calculado com base no horário e dia da semana.

Na sua main, peça o preço do produto, dia da semana e horário da compra (hora, minuto e segundos), e devolva o valor final do produto com base naquele horário.
 */

import javaprogressivo.pooparteii.listacomposicao.exemplos.domain.DiaDaSemana;
import javaprogressivo.pooparteii.listacomposicao.exemplos.domain.HoraMercado;
import javaprogressivo.pooparteii.listacomposicao.exemplos.domain.ProdutoMercado;

public class SupermercadoTest01 {
    public static void main(String[] args) {
        DiaDaSemana dia1 = new DiaDaSemana("Domingo");
        DiaDaSemana dia2 = new DiaDaSemana("Terça-feira");

        HoraMercado hora1 = new HoraMercado(21, 33, 2);
        HoraMercado hora2 = new HoraMercado(19, 12, 9);

        ProdutoMercado tomate = new ProdutoMercado("Tomate italiano", 7);
        ProdutoMercado uva = new ProdutoMercado("Uva Thompson", 9.5);

        tomate.setDia(dia1);
        tomate.setHora(hora1);
        tomate.imprimirCompra();

        System.out.println();

        uva.setDia(dia1);
        uva.setHora(hora2);
        uva.imprimirCompra();

        System.out.println();

        uva.setDia(dia2);
        uva.imprimirCompra();
    }
}
