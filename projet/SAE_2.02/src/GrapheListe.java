import java.util.ArrayList;
import java.util.List;

public class GrapheListe implements Graphe{

    private List<String> ensNom;
    private List<Noeud> ensNoeud;

    GrapheListe(){
        ensNom = new ArrayList<String>();
        ensNoeud = new ArrayList<Noeud>();
    }

    public List<String> listNoeud(){
        return ensNom;
    }

    public List<Arc> suivants(Noeud n){
        return n.donnerToutLesArc();
    }

    public void ajouterArc(String depart, String destination, double cout){
        if ((this.ensNom.contains(depart))&&(this.ensNom.contains(destination))){
            int inddep = this.ensNoeud.indexOf(depart);
            this.ensNoeud.get(inddep).ajouterArc(destination,cout);
        }

    }
}
