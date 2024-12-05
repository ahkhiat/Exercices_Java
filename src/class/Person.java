
public class Person
{
    private String nom;
    private String prenom;
    private int age;

    public Person(String nom, String prenom, int age)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Nom: " + this.nom + ", prenom: " + this.prenom + " ,age: " + this.age;
    }


}