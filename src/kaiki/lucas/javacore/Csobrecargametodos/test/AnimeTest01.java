package kaiki.lucas.javacore.Csobrecargametodos.test;

import kaiki.lucas.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12);
//        anime.init("Akudama Drive", "TV", 12,"Ação");
        anime.imprime();
    }
}
