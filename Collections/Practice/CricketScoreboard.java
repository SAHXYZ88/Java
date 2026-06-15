import java.util.*;

public class CricketScoreboard {
    public static void main(String []args){
        ArrayList<String> players = new ArrayList<>();
        HashMap<String,Integer> score = new HashMap<>();
        ArrayList<String> toRemove = new ArrayList<>();
        players.add("Dhoni");
        players.add("Rohit");
        players.add("Hardik");

        score.put("Dhoni",120);
        score.put("Rohit",40);
        score.put("Hardik",90);

        int highestScore = 0;
        String highestScorer = "";
        System.out.println("-: Players :- ");
        for(String player : players){
            System.out.println(player + " : " + score.get(player));
            if(score.get(player)>highestScore){
                highestScore = score.get(player);
                highestScorer = player;
            }
        }
        System.out.println("-: Score Board :-");
        System.out.println("Highest Score : " + highestScore);
        System.out.println("Highest Scorer : " + highestScorer);
        System.out.println("-: Players Scored Greater Than 50 :- ");
        for(String player : players){
            if(score.get(player)>50){
                System.out.println(player);
            }
        }
        for(String player : players){
            if(score.get(player)<50){
                toRemove.add(player);
            }
        }
        for(String player : toRemove){
            players.remove(player);
            score.remove(player);
        }
        System.out.println("-: Remaining Players :- ");
        for(String player : players){
            System.out.println(player);
        }

    }
}
