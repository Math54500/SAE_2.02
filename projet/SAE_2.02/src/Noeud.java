import java.awt.*;
import java.util.ArrayList;

public class Noeud {

    private String nom ;
    private List adj ;

    Noeud(String n){
        this.nom = n;
        this.adj = new List();
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
}
