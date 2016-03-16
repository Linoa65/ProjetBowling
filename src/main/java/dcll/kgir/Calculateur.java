package dcll.kgir;

/**
 * Created by 21101843 on 16/03/2016.
 */
public class Calculateur {
    private String scores;
    public Calculateur(String s){
        this.scores=s;
    }

    public int nbQuilleTombee(int pos){
        if (this.scores.charAt(pos) == 'X'){
            return 10;
        }
        else if (this.scores.charAt(pos) == '/'){
            return 10-scores.charAt(pos-1);
        }
        else if (this.scores.charAt(pos) == '_'){
            return 0;
        }
        else{
            return this.scores.charAt(pos);
        }
    }

    public int strike(int pos){
        if (pos < this.scores.length()-2){
            return 10+nbQuilleTombee(pos+1)+nbQuilleTombee(pos+2);
        }
        else if (pos == this.scores.length()-2){
            return 10+nbQuilleTombee(pos+1);
        }
        else{
            return 10;
        }
    }

    public int spare(int pos){
        if (pos < this.scores.length()-1){
            return 10+nbQuilleTombee(pos+1);
        }
        else {
            return 10;
        }
    }

    public int calculScore (){
        int score = 0;
        for (int i=0; i<this.scores.length(); i++){

        }
        return score;
    }
}
