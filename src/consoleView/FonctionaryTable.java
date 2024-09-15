package consoleView;

import entity.fonctionary.Fonctionary;
import entity.worker.Worker;

import java.util.ArrayList;
import java.util.List;

public class FonctionaryTable extends WorkerTable {
    /**
     @param dataList Tableau d'objet (instance de class)
     */
    public FonctionaryTable(List<Fonctionary> dataList) {
        super(convertList(dataList));
    }

    // Convertir une liste de Fonctionary en une liste de Worker
    private static List<Worker> convertList(List<Fonctionary> fonctionaryList) {
        return new ArrayList<>(fonctionaryList); // La liste des Fonctionary est compatible avec Worker
    }

}
