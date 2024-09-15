package props;

/**
 * Catégorise les différent type d'employé
 */
public enum WorkerType {
    INTERIMAIRE(null),
    ADMINISTRATIF(Hint.ADMINISTRATIF),
    COMMERCIAL(Hint.COMMERCIAL),
    FONCTIONNAIRE(Hint.FONCTIONNAIRE),
    RESPONSABLE(Hint.RESPONSABLE),
    INVALIDE(null);

    private final Hint hint;

    WorkerType(Hint hint) {
        this.hint = hint;
    }

    public Hint getHint() {
        return (hint != null) ? hint : Hint.DEFAULT;
    }
}
