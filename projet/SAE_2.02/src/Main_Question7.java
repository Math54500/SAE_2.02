public class Main_Question7 {

    public static void main(String[] args) {
        Noeud a = new Noeud("a");
        Noeud b = new Noeud("b");
        Noeud c = new Noeud("c");
        Noeud d = new Noeud("d");
        Noeud e = new Noeud("e");

        GrapheListe q7 = new GrapheListe();

        q7.ajouterNoeud(a);
        q7.ajouterNoeud(b);
        q7.ajouterNoeud(c);
        q7.ajouterNoeud(d);
        q7.ajouterNoeud(e);

        q7.ajouterArc("a","b",12);
        q7.ajouterArc("a","d",87);
        q7.ajouterArc("d","c",10);
        q7.ajouterArc("c","a",19);
        q7.ajouterArc("d","b",23);
        q7.ajouterArc("b","e",11);
        q7.ajouterArc("e","d",43);

        System.out.println(q7.toString());

    }
}
