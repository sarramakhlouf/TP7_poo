public class AssietteRonde extends Assiette
{
    double rayon;
    AssietteRonde(int annee, double ray)
    {
        super (annee);
        this.rayon = ray;
    }
    double calculerSurface() {
        return 3.14 * rayon * rayon;
    }
    
}