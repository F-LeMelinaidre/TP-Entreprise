package consoleView;

import entity.contractual.Manager;
import entity.worker.Worker;

import java.util.List;

public class ManagerTable extends Table<Manager> {
    public ManagerTable(List<Manager> dataList) {
        super(dataList);
    }

    @Override
    protected String[] getColumnNames() {
        return new String[]{"Nom", "Prénom", "Date de naissance", "Contrat", "Effectif"};
    }

    @Override
    protected String[] getValues(Manager manager) {
        return new String[]{
                manager.getLastName(),
                manager.getFirstName(),
                manager.getDateOfBirth(),
                manager.getContractType().toString(),
                Integer.toString(manager.getWorkerCount())
        };
    }
}
