package entity.contractual;

import props.ContractType;
import props.WorkerType;

public class Salesperson extends Contractual implements ISalesperson {
    public Salesperson(String firstName, String lastName, String dateOfBirth, Integer workerId, ContractType contractType) {
        super(firstName, lastName, dateOfBirth, workerId, WorkerType.COMMERCIAL, contractType);
    }

}
