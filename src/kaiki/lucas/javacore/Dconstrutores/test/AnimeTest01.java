package kaiki.lucas.javacore.Dconstrutores.test;

import kaiki.lucas.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12,"Ação", "Production IG");

        anime.imprime();
    }
}
