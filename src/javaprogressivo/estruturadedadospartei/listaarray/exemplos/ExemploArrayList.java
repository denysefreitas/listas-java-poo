package javaprogressivo.estruturadedadospartei.listaarray.exemplos;

import java.util.ArrayList;
import java.util.Arrays;

public class ExemploArrayList {
    public static void main(String[] args){
        ArrayList<String> jogadores = new ArrayList<String> ();

        jogadores.add("Kaio Jorge");
        System.out.print( "Adicionando o jogador 'Kaio Jorge': " );
        System.out.println(Arrays.toString(jogadores.toArray()));

        jogadores.add("Matheus Pereira");
        System.out.print( "Adicionando o jogador 'Matheus Pereira': " );
        System.out.println(Arrays.toString(jogadores.toArray()));

        jogadores.add("Keny Arroyo");
        System.out.print( "Adicionando o jogador 'Keny Arroyo': " );
        System.out.println(Arrays.toString(jogadores.toArray()));

        jogadores.add("Kaiki Bruno");
        System.out.print( "Adicionando o jogador 'Kaiki Bruno': " );
        System.out.println(Arrays.toString(jogadores.toArray()));

        System.out.print( "Quem está na índice 0: " );
        System.out.println(jogadores.getFirst());

        System.out.print("Adicionando Lucas Romero onde estava o Kaiki Bruno: ");
        jogadores.add( jogadores.indexOf("Kaiki Bruno"), "Lucas Romero");
        System.out.println( Arrays.toString( jogadores.toArray() ) );

        System.out.print( "Número de elementos na lista: " );
        System.out.println( jogadores.size() );

        System.out.print( "Removendo o Keny Arroyo: " );
        jogadores.remove("Keny Arroyo");
        System.out.println( Arrays.toString( jogadores.toArray() ) );

        System.out.print( "Removendo tudo: " );
        jogadores.clear();
        System.out.println( Arrays.toString( jogadores.toArray() ) );
    }
}
