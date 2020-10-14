package fr.hamza;

import java.util.ArrayList;

public class Agence {
    String nomAgence;
    String lieu;
    int nbVehicule;
    ArrayList<Vehicule> vehiculeStocks;


    //Constructor
    public Agence(String lieu) {
        this.nomAgence = "Jaipasdevoiture";
        this.lieu = lieu;
        this.vehiculeStocks = new ArrayList<Vehicule>();
    }

    public void addVehicule(Vehicule vehicule) {
        this.vehiculeStocks.add(vehicule);
    }

    public void louerVehicule(Client client, Vehicule vehicule) {
        vehicule.isLouee = true;
        vehicule.locataire = client;
        System.out.println("La voiture " + vehicule.marque + " a été louée à " + client.nom);
    }

    public void listerLesVehiculesLibre(){
        String liste = "Voitures libres à " + this.lieu +" : ";

        //pour chaque bagnole du vehiculeStock
        for (Vehicule i : this.vehiculeStocks) {
            if(i.isLouee == false){
                liste += i.marque + ", ";
            }
        }
        System.out.println(liste);
    }

    public static void main(String[] args) { 

        Agence rennesAgence = new Agence("Rennes");
        Agence brestAgence = new Agence("Brest");
        Agence nantesAgence = new Agence("Nantes");

        Client hamza = new Client("Hamza");
        Client joseph = new Client("Joseph");
        Client elodie = new Client("Elodie");

        Vehicule ginoCar = new Vehicule("GinoPouet", "Rouge", 15);
        Vehicule renault = new Vehicule("Renault", "Bleu", 80);
        Vehicule teslHamza = new Vehicule("teslHamza", "Noir", 0);

        rennesAgence.addVehicule(ginoCar);
        brestAgence.addVehicule(renault);
        nantesAgence.addVehicule(teslHamza);

        
        rennesAgence.listerLesVehiculesLibre();
        brestAgence.listerLesVehiculesLibre();
        nantesAgence.listerLesVehiculesLibre();
        
        rennesAgence.louerVehicule(hamza, ginoCar);
        nantesAgence.louerVehicule(elodie, teslHamza);
        brestAgence.louerVehicule(joseph, renault);

        System.out.println("Véhicule " + ginoCar.marque + " " + rennesAgence.lieu);
    }
}
