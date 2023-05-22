import java.util.List;

public interface Graphe {

    public List<String> listNoeud();

    public List<Arc> suivants(Noeud n);
}
