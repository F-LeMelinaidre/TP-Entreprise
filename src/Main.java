import consoleView.ContractualTable;
import consoleView.Menu;
import consoleView.SalespersonTable;
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

        /*Menu menu = new Menu();
        ArrayList<String> choix = new ArrayList<String>();
        choix.add("Sale");
        choix.add("Contract");
        choix.add("Manager");
        choix.add("Salesperson");
        Menu.getChoix(choix);*/

        Worker w1 = new Contractual("Jean", "Bon", "12/04/1976", null, WorkerType.ADMINISTRATIF, ContractType.CDI);
        Worker w2 = new Worker("Yves", "Rogne", "23/06/1985", null, WorkerType.FONCTIONNAIRE, ContractType.CDD);
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
        WorkerTable workerTableau = new WorkerTable(workers);
        workerTableau.render();

        List<Salesperson> salespersons = new ArrayList<>();
        salespersons.add(sp4);
        SalespersonTable salespersonTable = new SalespersonTable(salespersons);
        salespersonTable.render();

        Contractual c1 = (Contractual) w1;

        List<Contractual> contractual = new ArrayList<>();
        contractual.add(c1);
        contractual.add(sp4);
        contractual.add(m5);
        ContractualTable contractualTableau = new ContractualTable(contractual);
        contractualTableau.render();

    }
}