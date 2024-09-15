package consoleView;

import entity.contractual.Contractual;
import entity.personal.Person;

import java.util.List;

public class PersonTable extends Table<Person> {
    public PersonTable(List<Person> dataList) {
        super(dataList);
    }

    @Override
    protected String[] getColumnNames() {
        return new String[] {"Nom", "Prénom", "Date de naissance", "Age"};
    }

    @Override
    protected String[] getValues(Person person) {
        return new String[]{
                person.getLastName(),
                person.getFirstName(),
                person.getDateOfBirth(),
        };
    }
}
