import consoleView.*;
import entity.contractual.Contractual;
import entity.contractual.Manager;
import entity.contractual.Salesperson;
import entity.fonctionary.Fonctionary;
import entity.personal.Person;
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

        /*Menu menu = new Menu();
        ArrayList<String> choix = new ArrayList<String>();
        choix.add("Sale");
        choix.add("Contract");
        choix.add("Manager");
        choix.add("Salesperson");
        Menu.getChoix(choix);*/

        Worker w1 = new Contractual("Jean", "Bon", "12/04/1976", null, WorkerType.ADMINISTRATIF, ContractType.CDI);
        Worker w2 = new Fonctionary("Yves", "Rogne", "23/06/1985", null);
        Worker w3 = new Worker("Claire", "Hyères", "16/11/1978", null, WorkerType.INTERIMAIRE, ContractType.CDI);
        Worker w4 = new Salesperson("André", "Céouver", "23/01/2001", null, ContractType.CDI);
        Worker w5 = new Manager("Jean-Marie", "Deuz", "09/07/1992", null, ContractType.CDI);
        Worker w6 = new Contractual("Kelly", "Dyaute", "23/02/1982", null, WorkerType.FONCTIONNAIRE, ContractType.CDD);


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
        workers.add(w6);
        WorkerTable workerTable = new WorkerTable(workers);
        System.out.println("Tableau des employés");
        workerTable.render();

        List<Salesperson> salespersons = new ArrayList<>();
        salespersons.add(sp4);
        SalespersonTable salespersonTable = new SalespersonTable(salespersons);
        System.out.println("Tableau des commerciaux");
        salespersonTable.render();

        Contractual c1 = (Contractual) w1;

        List<Contractual> contractual = new ArrayList<>();
        contractual.add(c1);
        contractual.add(sp4);
        contractual.add(m5);
        ContractualTable contractualTable = new ContractualTable(contractual);
        System.out.println("Tableau des contractuels");
        contractualTable.render();

        Fonctionary f1 = (Fonctionary) w2;

        List<Fonctionary> fonctionaries = new ArrayList<>();
        fonctionaries.add(f1);
        FonctionaryTable fonctionaryTable = new FonctionaryTable(fonctionaries);
        System.out.println("Tableau des fonctionnaires");
        fonctionaryTable.render();



        List<Manager> manager = new ArrayList<>();
        manager.add(m5);
        ManagerTable managerTable = new ManagerTable(manager);
        System.out.println("Tableau des managers");
        managerTable.render();

        List<Person> persons = new ArrayList<>();
        persons.add(w1);
        persons.add(w2);
        persons.add(w3);
        persons.add(w4);
        persons.add(w5);
        persons.add(w6);
        PersonTable personTable = new PersonTable(persons);
        System.out.println("Tableau du personnel");
        personTable.render();

    }
}