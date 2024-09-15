package entity.sale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Sale {

    protected static final Logger logger = LogManager.getLogger(Sale.class);
    protected Calendar saleDate = Calendar.getInstance();
    protected String name;
    protected int quantity;
    protected double price;
    protected double sum;

    public Sale(String saleDate, String name, int quantity, double price) {
        this.saleDate = this.parseDate(saleDate);
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.sum = this.price * this.quantity;
    }

    public Calendar getSaleDate() { return this.saleDate; }

    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.saleDate.getTime());
    }
    public String getName() { return this.name; }
    public int getQuantity() { return this.quantity; }
    public double getPrice() { return this.price; }
    public double getSum() { return this.sum; }

    /**
     *
     * @param date date au format dd/mm/yyyy
     * @return Calendar objet
     */
    private Calendar parseDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(sdf.parse(date));
        } catch (ParseException e) {
            logger.error("\u001B[31mFormat de date invalide ! Format attendu dd/mm/yyyy\u001B[0m");
        }
        return calendar;
    }
}
