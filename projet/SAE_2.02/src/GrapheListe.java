import java.util.List;

public class GrapheListe implements Graphe{

    private List<String> ensNom;
    private List<Noeud> ensNoeud;

    public List<String> listNoeud(){
        return ensNom;
    }

    public List<Arc> suivants(String n){

    }
}
