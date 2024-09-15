package consoleView;

import asset.DoubleTableBorder;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static enum Direction {TOP, MIDDLE, BOTTOM}
    private static enum Justify {LEFT, CENTER, RIGHT}

    private static Scanner sc = null;
    private static int width;
    private static int padding = 1;


    public Menu() {
        super();
    }

    private static Scanner getInstance() {
        if (sc == null) {
            sc = new Scanner(System.in);
        }
        return sc;
    }

    public static void fermer() {
        sc.close();
        sc=null;
    }

    public static int getChoix(ArrayList<String> lines){
        width = getMaxWidth(lines);

        int nbChoix = lines.size();
        int choix = 0;

        StringBuilder topSeparator = createSeparator(width, Direction.TOP);

        
        try{
            // L'instruction try/catch permet de gérer les fonctionnements anormaux d'une application.
            // Le corps du try correspond au fonctionnement normal

            System.out.println("-------------------");
            for (int i = 0; i < nbChoix; i++) {
                System.out.println(i+" : "+lines.get(i));
            }
            System.out.println(nbChoix+" : Quitter");
            System.out.println("-------------------");
            do{
                System.out.println("saisissez votre choix");
                choix = lireInt();
            }while (choix<0 || choix>nbChoix);

        }catch(InputMismatchException e) {
            // Le corps du catch correspond au fonctionnement anormal : l'exception qui a été détectée
            // ici : InputMismatchException = il est possible que le caractère frappé au clavier ne soit pas un entier.
            // Dans ce cas, on demande une nouvelle saisie.
            System.out.println("choix non possible");
            return Menu.getChoix(lines);
        }
        if (choix==nbChoix) {
            choix = -1;
        }
        return choix;
    }

    private static StringBuilder createSeparator(int width, Direction direction) {
        StringBuilder sb = new StringBuilder();

        sb.append(getBorderSymbol(direction, "left"));
        sb.append(getBorderSymbol(direction, "middle").repeat(width));
        sb.append(getBorderSymbol(direction, "right"));
        
        return sb;
    }

    private static StringBuilder createLine(int width , String txt , Justify justify) {
        StringBuilder sb = new StringBuilder();

        if (txt.length()>width) { width = txt.length(); }


        if (justify==Justify.CENTER) {
            padding++;
            padding += width - txt.length();
            int paddingLeft = padding / 2;
            int paddingRight = padding - paddingLeft;
        }





        sb.append(DoubleTableBorder.V.getSymbol());

        sb.append(String.format("%-" + width + "s", " " + txt + " "));

        sb.append(DoubleTableBorder.V.getSymbol());

        return sb;
    }

    private static int getMaxWidth(ArrayList<String> lines) {

        int maxWidth = 0;

        for (String line : lines) {
            int width = line.length();
            if (width > maxWidth) {
                maxWidth = width;
            }
        }
        return maxWidth;
    }

    /**
     * Affiche simplement un message dans la console
     * @param msg contient le message à afficher
     */
    public static void afficheMsg(String msg){
        System.out.println(msg);
    }

    public static int lireInt() {
        int rep = getInstance().nextInt();
        getInstance().nextLine(); // manger le retour à la ligne
        return rep;
    }

    /**
     * Permet de lire une chaine de caractères frappée au clavier
     * @return une chaine lue
     */
    public static String lireString(){
        String rep =getInstance().nextLine();
        return rep;
    }


    /**
     *
     * @param direction Represente la position de la bordure Haute Central ou Basse
     * @param position Represente les extremités de la cellule
     * @return
     */
    private static String getBorderSymbol(Direction direction, String position) {
        switch (direction) {
            case TOP:
                return switch (position) {
                    case "left" -> DoubleTableBorder.TOP_LEFT.getSymbol();
                    case "middle" -> DoubleTableBorder.MIDDLE_TOP.getSymbol();
                    case "right" -> DoubleTableBorder.TOP_RIGHT.getSymbol();
                    default -> DoubleTableBorder.H.getSymbol();
                };
            case MIDDLE:
                return switch (position) {
                    case "left" -> DoubleTableBorder.MIDDLE_LEFT.getSymbol();
                    case "middle" -> DoubleTableBorder.MIDDLE.getSymbol();
                    case "right" -> DoubleTableBorder.MIDDLE_RIGHT.getSymbol();
                    default -> DoubleTableBorder.H.getSymbol();
                };
            case BOTTOM:
                return switch (position) {
                    case "left" -> DoubleTableBorder.BOTTOM_LEFT.getSymbol();
                    case "middle" -> DoubleTableBorder.MIDDLE_BOTTOM.getSymbol();
                    case "right" -> DoubleTableBorder.BOTTOM_RIGHT.getSymbol();
                    default -> DoubleTableBorder.H.getSymbol();
                };
            default:
                return DoubleTableBorder.H.getSymbol();
        }
    }
}
