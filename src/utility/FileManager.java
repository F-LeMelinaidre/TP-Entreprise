package utility;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Function;

public class FileManager<T> {

    private Path path;
    private String fileName;
    private Function<T, String> toRecordFunction;
    private Function<String, T> fromRecordFunction;

    /**
     * Constructeur pour la lecture et l'écriture
     * @param path                  Chemin du repertoire
     * @param fileName              Nom du fichier
     * @param toRecordFunction      Méthode de class pour convertir un objet en chaîne de caratères
     *                              en concaténant ses propriétés.
     *                              Definir à null pour la lecture
     * @param fromRecordFunction    Méthode de class pour convertir une chaîne de caratères
     *                              en Objet.
     *                              Definir à null pour l'écriture
     */
    public FileManager(String path, String fileName, Function<String, T> toRecordFunction, Function<T, String> fromRecordFunction) {
        this.path = Paths.get(path);
        this.fileName = fileName;
        this.toRecordFunction = (Function<T, String>) toRecordFunction;
        this.fromRecordFunction = (Function<String, T>) fromRecordFunction;
    }
}
