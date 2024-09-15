package entity.worker;

import entity.personal.IPerson;
import props.ContractType;
import props.Hint;
import props.WorkerType;

public interface IWorker extends IPerson {

    void validate();
    int getWorkerId();

    WorkerType getWorkerType();
    void setWorkerType(WorkerType workerType);

    ContractType getContractType();

    String getContractName();
    Hint getHint();
    double getHintValue();
    double getSalary();
    double calculateSalary();
}
