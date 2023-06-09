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
        return n.getAdj();
    }

    public void ajouterNoeud(Noeud n){
        ensNom.add(n.getNom());
        ensNoeud.add(n);
    }

    public void ajouterArc(String depart, String destination, double cout){
        boolean trouvedep = false;
        int i = 0;
        while((!trouvedep)&&(i < ensNoeud.size())){
            if (((ensNoeud.get(i)).getNom()).equals(depart)){
                trouvedep = true;
            }else {
                i ++;
            }
        }
        boolean trouvedes = false;
        int j = 0;
        while((!trouvedes)&&(j < ensNoeud.size())){
            if (((ensNoeud.get(j)).getNom()).equals(destination)){
                trouvedes = true;
            }else {
                j ++;
            }
        }
        if ((trouvedes)&&(trouvedep)){
            (ensNoeud.get(i)).ajouterArc(destination,cout);
        }
    }

    @Override
    public String toString() {
        String rep = "";
        for (int i = 0; i < ensNom.size(); i ++){
            rep += ensNom.get(i) + "->" + ensNoeud.get(i).donnerToutLesArc() + "\n";
        }
        return rep;
    }
    
    public String toGraphViz(){
        String graph = "digraph "  +"{"  + "\n";
        for (int i = 0 ; i < ensNom.size() ; i ++){
            for (int j = 0 ; j < ensNoeud.get(i).getAdj().size() ; j ++){
                graph += ensNom.get(i) + "->" + ensNoeud.get(i).getAdj().get(j).getDest()
                        + " LABEL = " + ensNoeud.get(i).getAdj().get(j).getCout()  + "] \n";
            }
        }
        graph += "}";
        return graph;
    }
}
