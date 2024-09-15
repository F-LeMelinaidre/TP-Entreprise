package consoleView;

import entity.contractual.Salesperson;

import java.util.List;

public class SalespersonTable extends Table<Salesperson> {

    /**
     @param dataList Tableau d'objet (instance de class)
     */
    public SalespersonTable(List<Salesperson> dataList) {
        super(dataList);
    }

    @Override
    protected String[] getColumnNames() {
        return new String[]{"Nom", "Prénom", "Date de naissance", "Contrat", "Indice", "Commission",
                "Salaire du mois", "Chiffre d'affaire du mois", };
    }

    @Override
    protected String[] getValues(Salesperson salesperson) {
        return new String[]{
                salesperson.getLastName(),
                salesperson.getFirstName(),
                salesperson.getDateOfBirth(),
                salesperson.getContractType().toString(),
                Double.toString(salesperson.getHintValue()),
                Salesperson.COMMISSION_RATE + "%",
                salesperson.getSalary() + "€",
                salesperson.getMonthlySales() + "€"
        };
    }
}
