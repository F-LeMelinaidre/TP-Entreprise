package entity.contractual;

import entity.worker.Worker;
import props.ContractType;
import props.WorkerType;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Contractual implements IManager {

    List<Worker> workersList = new ArrayList<>();

    public Manager(String firstName, String lastName, String dateOfBirth, Integer workerId, ContractType contractType) {
        super(firstName, lastName, dateOfBirth, workerId, WorkerType.RESPONSABLE, contractType);

    }

    @Override
    public List<Worker> getWorkers() {
        return workersList;
    }

    @Override
    public void addWorker(Worker worker) {
        workersList.add(worker);
    }

    @Override
    public void removeWorker(Worker worker) {
        workersList.remove(worker);
    }

    @Override
    public int getWorkerCount() {
        return workersList.size();
    }
}
