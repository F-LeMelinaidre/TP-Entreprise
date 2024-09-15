package entity.contractual;

import entity.sale.Sale;

import java.util.List;

public interface ISalesperson extends IContractual {

    List<Sale> getSales();
    void addSale(Sale sale);
    int getTotalSales();
    double getMonthlySales();

}
