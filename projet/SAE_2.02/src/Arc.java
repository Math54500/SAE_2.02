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

    public String getDest() {
        return dest;
    }

    public double getCout() {
        return cout;
    }
}
