package entity.contractual;

import entity.sale.Sale;
import entity.worker.Worker;
import props.ContractType;
import props.WorkerType;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Salesperson extends Contractual implements ISalesperson {

    protected static final double COMMISSION_RATE = 1.0;
    List<Sale> salesList = new ArrayList<>();

    public Salesperson(String firstName, String lastName, String dateOfBirth, Integer workerId,
                       ContractType contractType) {
        super(firstName, lastName, dateOfBirth, workerId, WorkerType.COMMERCIAL, contractType);

    }


    @Override
    public List<Sale> getSales() { return this.salesList; }

    @Override
    public void addSale(Sale sale) { this.salesList.add(sale); }

    @Override
    public int getTotalSales() { return this.salesList.size(); }

    @Override
    public double getMonthlySales() {
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH);
        int year = now.get(Calendar.YEAR);

        double sumMonthlySales = 0.0;
        for (Sale sale : this.salesList) {
            Calendar saleDate = sale.getSaleDate();
            int saleMonth = saleDate.get(Calendar.MONTH);
            int saleYear = saleDate.get(Calendar.YEAR);

            if (saleMonth == month && saleYear == year) {
                sumMonthlySales += sale.getSum();
            }
        }
        return sumMonthlySales;
    }

    @Override
    public double calculateSalary() {

        double commission = Math.round((this.getMonthlySales() * (COMMISSION_RATE/100)) * 100) / 100;

        return (double) BASIC_SALARY + commission;
    }
}
