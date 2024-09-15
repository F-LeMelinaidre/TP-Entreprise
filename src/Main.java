import consoleView.WorkerTable;
import entity.contractual.Contractual;
import entity.contractual.Manager;
import entity.contractual.Salesperson;
import entity.sale.Sale;
import entity.worker.Worker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import props.ContractType;
import props.WorkerType;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*Person p1 = new Person("pierre-henry jean ", "Bon", "12/04/1976");
        Person p2 = new Person("Yves", "Rogne", "23/06/1985");
        Person p3 = new Person("Claire", "Hyères", "16/11/1978");
        Person p4 = new Person("André", "Céouver", "23/01/2001");
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        PersonTable personTableau = new PersonTable(persons);
        personTableau.render();*/

        Worker w1 = new Worker("Jean", "Bon", "12/04/1976", null, WorkerType.ADMINISTRATIF, ContractType.CDI);
        Worker w2 = new Worker("Yves", "Rogne", "23/06/1985", null, WorkerType.FONCTIONNAIRE, ContractType.CDD);
        Worker w3 = new Worker("Claire", "Hyères", "16/11/1978", null, WorkerType.INTERIMAIRE, ContractType.CDI);
        Worker w4 = new Salesperson("André", "Céouver", "23/01/2001", null, ContractType.CDI);
        Worker w5 = new Manager("Jean-Marie", "Deuz", "09/07/1992", null, ContractType.CDI);


        Manager m5 = (Manager) w5;
        m5.addWorker(w2);
        m5.addWorker(w3);

        Salesperson sp4 = (Salesperson) w4;
        sp4.addSale(new Sale("12/09/2024", "Truc", 5, 120));
        sp4.addSale(new Sale("08/09/2024", "Bidule", 50, 60));
        sp4.addSale(new Sale("02/09/2024", "Chose", 300, 30));

        List<Worker> workers = new ArrayList<>();
        workers.add(w1);
        workers.add(w2);
        workers.add(w3);
        workers.add(w4);
        workers.add(w5);
        WorkerTable workerTableau = new WorkerTable(workers);
        workerTableau.render();

        /*Contractual c1 = new Contractual("Jean", "Bon", "12/04/1976", null, WorkerType.ADMINISTRATIF, ContractType.CDI);
        Contractual c2 = new Contractual("Yves", "Rogne", "23/06/1985", null, WorkerType.FONCTIONNAIRE, ContractType.CDD);
        Contractual c3 = new Contractual("Claire", "Hyères", "16/11/1978", null, WorkerType.INTERIMAIRE, ContractType.CDI);
        Contractual c4 = new Contractual("André", "Céouver", "23/01/2001", null, WorkerType.COMMERCIAL, ContractType.CDI);
        List<Contractual> contractual = new ArrayList<>();
        contractual.add(c1);
        contractual.add(c2);
        contractual.add(c3);
        contractual.add(c4);
        ContractualTable contractualTableau = new ContractualTable(contractual);
        contractualTableau.render();*/

    }
}