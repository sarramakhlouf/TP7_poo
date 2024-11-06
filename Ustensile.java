public abstract class Ustensile {
    int annee;
    Ustensile(int year) 
    {this.annee = year;}
    double calculerValeur()
    {
        int age = 2024 - annee;
        if (age > 50) {return age-50;}
        else {return 0;}
    }
}