package database;

import portate.Portata;

import java.util.ArrayList;

public interface PortataDAO<T> {
    T findById(Integer id);
    ArrayList<T> findAll();
    void inserisci(T portata);
    void aggiorna(T portata);
    void elimina(Integer id);
}
