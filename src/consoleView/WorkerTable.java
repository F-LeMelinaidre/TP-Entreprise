package consoleView;

import entity.contractual.Contractual;
import entity.worker.Worker;

import java.util.List;

public class WorkerTable extends Table<Worker> {
    public WorkerTable(List<Worker> dataList) {
        super(dataList);
    }

    @Override
    protected String[] getColumnNames() {
        return new String[]{"Nom", "Prénom", "Date de naissance", "Categorie", "Contrat", "Indice", "Salaire"};
    }

    @Override
    protected String[] getValues(Worker worker) {
        return new String[]{
                worker.getLastName(),
                worker.getFirstName(),
                worker.getDateOfBirth(),
                worker.getWorkerType().toString(),
                worker.getContractType().toString(),
                Double.toString(worker.getHintValue()),
                worker.getSalary() + " €",
        };
    }
}
