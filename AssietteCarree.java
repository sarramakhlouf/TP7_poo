public class AssietteCarree extends Assiette 
{
    double cote;
    AssietteCarree(int annee, double cotee)
    {
        super(annee);
        this.cote = cotee;
    }
    double calculerSurface()
    {
        return cote * cote ;
    }
    double calculerValeur() 
    {return 5*super.calculerValeur();}
}