package ru.netology.ListFilmsManager;

import ru.netology.domain.ListFilms;

public class ListFilmsManager {
    private ListFilms[] films = new ListFilms[0];
    private int limit;

    public ListFilmsManager() {
        this.limit = 5;
    }

    public ListFilmsManager(int limit) {
        this.limit = limit;
    }

    public void add(ListFilms film) {
        ListFilms[] tmp = new ListFilms[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        this.films = tmp;
    }

    public ListFilms[] findAll() {
        return films;
    }

    public ListFilms[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        ListFilms[] answer = new ListFilms[resultLength];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = films[films.length - 1 - i];
        }
        return answer;
    }
}
