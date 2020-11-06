package javaSerializable;

import data.Position;

import java.io.*;

public class DeSerialisation {

    public static void main(String[] args) {
        // on simplifie le code en retirant la gestion des exceptions
        File fichier = new File("position.ser");

        // ouverture d'un flux sur un fichier
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichier))) {

            // désérialization de l'objet
            Position p = (Position) ois.readObject();
            System.out.println(p);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
