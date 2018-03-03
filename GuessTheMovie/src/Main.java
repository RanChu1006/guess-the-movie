/**
 * Create by zfr on 15/2/2018
 * Finished on 16/2/2018
 * GuessTheMovie
 * 1.read the movie.txt 2.random select a movie 3.replace movie title to ****  4.user input a char
 * 5.judge the title contains char or not  6.yes show, no save char  7.10 score
 */

//import java.util.Iterator;

public class Main {
    public static void main(String [] args) throws Exception{
        Game game = new Game("movies.txt");
        game.getRandomMovie();
        System.out.println("You are guessing:"+game.showHiddenMovie().toString());
        int guessCount = 10;
        game.guessMovie(guessCount);

        /*for (int i=0;i<movies.length;i++){
            System.out.println("movies"+i+":"+movies[i]);
        }
        for (String li:list){
            //System.out.println(li);
        }
        for(int i=0;i<list.size();i++){
            //System.out.println("movie["+i+"]:"+list.get(i));
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
    }
}
