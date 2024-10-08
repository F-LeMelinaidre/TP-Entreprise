package consoleView;

import entity.contractual.Contractual;

import java.util.List;

public class ContractualTable extends Table<Contractual> {
    public ContractualTable(List<Contractual> dataList) {
        super(dataList);
    }

    @Override
    protected String[] getColumnNames() {
        return new String[] {"Identifiant", "Nom", "Prénom", "Date de naissance", "Categorie", "Contrat"};
    }

    @Override
    protected String[] getValues(Contractual contractual) {
        return new String[]{
                Long.toString(contractual.getId()),
                contractual.getLastName(),
                contractual.getFirstName(),
                contractual.getDateOfBirth(),
                contractual.getWorkerType().toString(),
                contractual.getContractType().toString()
        };
    }
}
