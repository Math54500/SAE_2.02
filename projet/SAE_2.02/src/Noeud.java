import java.util.ArrayList;
import java.util.List;

public class Noeud {

    private String nom ;
    private List<Arc> adj ;

    Noeud(String n){
        this.nom = n;
        this.adj = new ArrayList<Arc>();
    }

    public boolean equals(Noeud o){
        if (o.nom == this.nom){
            return true;
        }else{
            return false;
        }
    }

    public void ajouterArc(String destination,double cout){
        Arc a = new Arc(destination,cout);
        adj.add(a);
    }

    public String donnerToutLesArc(){
        String rep = " ";
        for (int i = 0 ; i < adj.size() ; i++){
            rep += adj.get(i).getDest() + "(" + adj.get(i).getCout() + ")";
        }
        return rep;
    }

    public String getNom() {
        return nom;
    }

    public List<Arc> getAdj() {
        return adj;
    }
}
