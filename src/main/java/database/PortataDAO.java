package database;


import java.util.ArrayList;

/**
 * L'interfaccia PortataDAO definisce i metodi per accedere e gestire le portate nel database.
 *
 * @param <T> il tipo di oggetto Portata o una sua sottoclasse
 */
public interface PortataDAO<T> {

    /**
     * Trova una portata nel database dato il suo ID.
     *
     * @param id l'ID della portata da trovare
     * @return l'oggetto portata corrispondente all'ID, o null se non trovato
     */
    T findById(Integer id);

    /**
     * Restituisce tutte le portate presenti nel database.
     *
     * @return un ArrayList contenente tutte le portate presenti nel database
     */
    ArrayList<T> findAll();

    /**
     * Inserisce una nuova portata nel database.
     *
     * @param portata l'oggetto portata da inserire nel database
     */
    void inserisci(T portata);

    /**
     * Aggiorna i dati di una portata nel database.
     *
     * @param portata l'oggetto portata da aggiornare nel database
     */
    void aggiorna(T portata);

    /**
     * Elimina una portata dal database dato il suo ID.
     *
     * @param id l'ID della portata da eliminare
     */
    void elimina(Integer id);
}