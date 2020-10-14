package fr.hamza ;

public class Vehicule {
    String marque;
    String couleur;
    int nivCarburant;
    int carburantMax;
    boolean isLouee;
    Client locataire;
    boolean isOnTheReserve;

    public void remplir() {
        if(this.nivCarburant == this.carburantMax){
            System.out.println("Le pompiste est un gino fuyez");
        } else {
            this.nivCarburant = this.carburantMax;
            System.out.println("La " +  this.marque + "a été remplie par un Gino :(");
        }
    }
    
    public void checkerReserve(){
        if(this.nivCarburant <= 15){
            System.err.println("Vous etes en reserve allez voir gino : " + this.marque);
        }
    }

    public Vehicule(String marque, String couleur, int nivCarburant) {
        this.marque = marque;
        this.couleur = couleur;
        
        this.isLouee = false;
        
        this.nivCarburant = nivCarburant;
        this.carburantMax = 100;
        this.isOnTheReserve = false;
        
        this.checkerReserve();
    }

}
