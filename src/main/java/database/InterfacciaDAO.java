package database;


import java.util.ArrayList;

/**
 * L'interfaccia definisce i metodi per accedere e gestire gli item nel database.
 */
public interface InterfacciaDAO<T> {

    /**
     * Trova una item nel database dato il suo ID.
     *
     * @param id l'ID dell'item da trovare
     * @return l'oggetto corrispondente all'ID, o null se non trovato
     */
    T findById(Integer id);

    /**
     * Restituisce tutti gli oggetti presenti nel database.
     *
     * @return un ArrayList contenente tutte gli oggetti presenti nel database
     */
    ArrayList<T> findAll();

    /**
     * Inserisce un nuovo item nel database.
     *
     * @param portata l'oggetto da inserire nel database
     */
    void inserisci(T portata);

    /**
     * Aggiorna i dati di un item nel database.
     *
     * @param portata l'oggetto da aggiornare nel database
     */
    void aggiorna(T portata);

    /**
     * Elimina una oggetto dal database dato il suo ID.
     *
     * @param id l'ID dell'oggetto da eliminare
     */
    void elimina(Integer id);
}