package entity.interim;

import entity.worker.IWorker;

public interface IInterim extends IWorker {

    String getInterimCompany();
    void setInterimCompany(String interimCompany);

}
