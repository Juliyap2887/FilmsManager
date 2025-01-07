package ru.netology.ListFilmsManager;

import ru.netology.domain.ListFilms;

public class Main {
    public static void main(String[] args) {
        ListFilms film1 = new ListFilms(1, 1, "Бладшот", 100, 1);
        ListFilms film2 = new ListFilms(2, 2, "Вперед", 200, 2);
        ListFilms film3 = new ListFilms(3, 3, "Отель Белград", 150, 3);
        ListFilms film4 = new ListFilms(4, 4, "Джентельмены", 300, 4);
        ListFilms film5 = new ListFilms(5, 5, "Человек-невидимка", 350, 5);

        ListFilmsManager manager = new ListFilmsManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        ListFilms[] all = manager.findLast();

    }
}