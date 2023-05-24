package database;

import portate.Portata;

import java.util.ArrayList;

public interface PortataDAO<T> {
    T findById(int id);
    ArrayList<T> findAll();
    void inserisci(T portata);
    void aggiorna(T portata);
    void elimina(int id);
}
