package entity.worker;

import entity.contractual.Salesperson;
import entity.personal.Person;
import props.ContractType;
import props.Hint;
import props.WorkerType;

public class Worker extends Person implements IWorker {

    protected static final int BASIC_SALARY = 1383;
    protected ContractType contractType;
    protected WorkerType workerType;
    protected Hint hint;
    protected double hintValue;

    public Worker(String firstName, String lastName, String dateOfBirth, Integer workerId, WorkerType workerType,
                  ContractType contractType) {

        super(firstName, lastName, dateOfBirth);

        this.workerType     = workerType;
        this.contractType   = contractType;
        this.hint           = this.workerType.getHint();
        this.hintValue      = this.hint.getValue();

        this.validate();
    }

    @Override
    public void validate() {
        if (this.workerType == WorkerType.INTERIMAIRE || this.workerType == WorkerType.FONCTIONNAIRE) {
            logger.error(
                    "\u001B[31mTentative de création d'un employé Contractual avec un type " + this.workerType + " : \u001B[0m" + this.lastName + " " + this.firstName);

            this.contractType = (this.workerType == WorkerType.INTERIMAIRE) ? ContractType.CDD : ContractType.CDI;
            this.setWorkerType(WorkerType.INVALIDE);
        }
    }

    @Override
    public int getWorkerId() {
        return 0;
    }

    @Override
    public WorkerType getWorkerType() {
        return this.workerType;
    }

    @Override
    public void setWorkerType(WorkerType workerType) {
        this.workerType = workerType;
    }

    @Override
    public ContractType getContractType() {
        return this.contractType;
    }

    @Override
    public String getContractName() {
        return this.contractType.getName();
    }


    @Override
    public Hint getHint() {
        return this.hint;
    }

    @Override
    public double getHintValue() {
        return this.hintValue;
    }
    @Override
    public double getSalary() {
        return this.calculateSalary();
    }

    @Override
    public double calculateSalary() {
        double hint = this.workerType.getHint().getValue();
        return (double) Math.round((BASIC_SALARY * hint) * 100) / 100;
    }

}

