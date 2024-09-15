package props;

/**
 * Différent type de contract disponible
 */
public enum ContractType {

    CDI("Contrat à durée indéterminée"),
    CDD("Contrat à durée déterminée"),
    INTERIM("Contrat interimaire"),
    PRO("Contrat de professionnalisation"),
    APPRENTISSAGE("Contrat d'apprentissage");

    private final String name;

    ContractType(String Name) {
        this.name = Name;
    }

    public String getName() {
        return name;
    }

}
