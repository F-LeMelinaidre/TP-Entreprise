package entity.contractual;

import entity.worker.Worker;
import props.ContractType;
import props.Hint;
import props.WorkerType;

public class Contractual extends Worker implements IContractual {

    public Contractual(String firstName, String lastName, String dateOfBirth, Integer workerId, WorkerType workerType, ContractType contractType) {
        super(firstName, lastName, dateOfBirth, workerId, workerType, contractType);

    }

}
