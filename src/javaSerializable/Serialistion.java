package javaSerializable;

import data.Position;

import java.io.*;

public class Serialistion {
    public static void main(String[] args) {
        // dans une méthode main
        File fichier = new File("position.ser");

        // création d'un objet à sérializer
        Position position = new Position(1, 2);

        // ouverture d'un flux sur un fichier
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichier))) {

            // sérialization de l'objet
            oos.writeObject(position);

            System.out.println(fichier.exists());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
