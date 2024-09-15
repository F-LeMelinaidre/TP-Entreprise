package entity.interim;

import entity.worker.Worker;
import props.ContractType;
import props.WorkerType;

public class Interim extends Worker implements IInterim {

    private String interimCompany;

    public Interim(String firstName, String lastName, String dateOfBirth, Integer workerId, String interimCompany) {
        super(firstName, lastName, dateOfBirth, workerId, WorkerType.INTERIMAIRE, ContractType.CDD);

        this.interimCompany = interimCompany;
    }

    @Override
    public String getInterimCompany() {
        return this.interimCompany;
    }

    @Override
    public void setInterimCompany(String interimCompany) {
        this.interimCompany = interimCompany;
    }
}
