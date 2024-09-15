package entity.contractual;

import entity.worker.Worker;

import java.util.List;

public interface IManager extends IContractual {

    List<Worker> getWorkers();
    void addWorker(Worker worker);
    void removeWorker(Worker worker);
    int getWorkerCount();
}
