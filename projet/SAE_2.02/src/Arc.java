public class Arc {

    String dest;
    double cout;

    Arc(String d, double c){
        this.dest = d;
        if (c > 0){
            this.cout = c;
        }else {
            this.cout = 0;
        }
    }
}
