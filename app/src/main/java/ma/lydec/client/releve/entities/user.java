package ma.lydec.client.releve.entities;

/**
 * Created by Oumaima on 25/04/2018.
 */



public class user {


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private Integer id;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String user ;
    private String Password;

    public user(){

    }

    public user(Integer id, String nom, String password) {
        this.id = id;
        this.nom = nom;
       // this.prenom = prenom;
      //  this.adresse = adresse;
      //  this.email = email;

        this.Password =password;
    }








}
