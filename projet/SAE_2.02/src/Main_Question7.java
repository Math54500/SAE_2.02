public class Main_Question7 {

    public static void main(String[] args) {
        Noeud a = new Noeud("A");
        Noeud b = new Noeud("B");
        Noeud c = new Noeud("C");
        Noeud d = new Noeud("D");
        Noeud e = new Noeud("E");

        GrapheListe q7 = new GrapheListe();

        q7.ajouterNoeud(a);
        q7.ajouterNoeud(b);
        q7.ajouterNoeud(c);
        q7.ajouterNoeud(d);
        q7.ajouterNoeud(e);

        q7.ajouterArc("A","B",12);
        q7.ajouterArc("A","D",87);
        q7.ajouterArc("D","C",10);
        q7.ajouterArc("C","A",19);
        q7.ajouterArc("D","B",23);
        q7.ajouterArc("B","E",11);
        q7.ajouterArc("E","D",43);

    }
}
