package kaiki.lucas.javacore.Eblocosinicializacao.test;

import kaiki.lucas.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }


    }
}
