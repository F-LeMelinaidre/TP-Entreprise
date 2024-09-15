package props;

/**
 * Défini l'indice de salaire suivant la catégorie de l'employé
 */
public enum Hint {
    ADMINISTRATIF(1.15),
    COMMERCIAL(1),
    FONCTIONNAIRE(1.3),
    RESPONSABLE(1.5),
    DEFAULT(1);

    private final double value;

    Hint(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
