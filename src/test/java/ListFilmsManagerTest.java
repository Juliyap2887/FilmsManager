import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.ListFilmsManager.ListFilmsManager;
import ru.netology.domain.ListFilms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ListFilmsManagerTest {
    ListFilms film1 = new ListFilms(1, 1, "Бладшот", 100, 1);
    ListFilms film2 = new ListFilms(2, 2, "Вперед", 200, 2);
    ListFilms film3 = new ListFilms(3, 3, "Отель Белград", 150, 3);
    ListFilms film4 = new ListFilms(4, 4, "Джентельмены", 300, 4);
    ListFilms film5 = new ListFilms(5, 5, "Человек-невидимка", 350, 5);
    ListFilms film6 = new ListFilms(6, 6, "Номер один", 500, 6);


    @Test
    public void testFindAll() {
        ListFilmsManager manager = new ListFilmsManager();

        ListFilms[] expected = {};
        ListFilms[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test1FindAll() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);

        ListFilms[] expected = {film1};
        ListFilms[] actual = manager.findAll();

       assertArrayEquals(expected, actual);
    }

    @Test
    public void test2FindAll() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        ListFilms[] expected = {film1, film2, film3};
        ListFilms[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        ListFilms[] expected = {film5, film4, film3, film2, film1};
        ListFilms[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test1FindLast() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);


        ListFilms[] expected = {film4, film3, film2, film1};
        ListFilms[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2FindLast() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);

        ListFilms[] expected = {film6, film5, film4, film3, film2};
        ListFilms[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test4FindAll() {
        ListFilmsManager manager = new ListFilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);

        ListFilms[] expected = {film1, film2, film3, film4, film5, film6};
        ListFilms[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

}
