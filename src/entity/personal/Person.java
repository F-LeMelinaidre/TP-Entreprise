package entity.personal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import entity.contractual.Contractual;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person implements IPerson {

    protected static final Logger logger = LogManager.getLogger(Contractual.class);
    protected String lastName;
    protected String firstName;
    protected Calendar dateOfBirth = Calendar.getInstance();
    protected Integer age; // Integer permet une valeur Null

    public Person(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = this.parseDate(dateOfBirth);

    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getDateOfBirth() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dateOfBirth.getTime());
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = this.parseDate(dateOfBirth);
    }

    @Override
    public int getAge() {
        if (this.age == null) this.age = this.calculateAge();
        return this.age;
    }

    /**
     * Calcul l'âge en fonction de la date courante
     * @return age
     */
    private int calculateAge() {
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - this.dateOfBirth.get(Calendar.YEAR);

        // Si le mois de la date courante est inférieur à la date de naissance
        // Ou le mois de la date courante est égale à la date de naissance et le jour de la date courante est inférieur au jours de naissance,
        // on retranche une année
        if (today.get(Calendar.MONTH) > today.get(Calendar.MONTH) ||
           (today.get(Calendar.MONTH) == today.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) < today.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }
        return age;
    }

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
