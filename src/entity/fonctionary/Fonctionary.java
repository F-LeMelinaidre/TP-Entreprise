package entity.fonctionary;

import entity.worker.Worker;
import props.ContractType;
import props.WorkerType;

public class Fonctionary extends Worker {

    public Fonctionary(String firstName, String lastName, String dateOfBirth, Integer workerId) {
        super(firstName, lastName, dateOfBirth, workerId, WorkerType.FONCTIONNAIRE, ContractType.CDI);
    }
}
