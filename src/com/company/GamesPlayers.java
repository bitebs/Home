package com.company;

import java.util.*;

public class GamesPlayers {
    static Singleton ratingPlayer;

    public static void main(String[] args) {
        ratingPlayer = Singleton.getInstance();


        //makeEvent("Game loss.");
        ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player("alex");
        Player player2 = new Player("alex1");
        Player player3 = new Player("john");
        Player player4 = new Player("john1");
        Player player5 = new Player("jan");
        Player player6 = new Player("jan1");
        Player player7 = new Player("max");
        Player player8 = new Player("max1");
        Player player9 = new Player("sam");
        Player player10 = new Player("sam1");
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);
        players.add(player9);
        players.add(player10);



        for (int i = 0; i < players.size(); i++) {
            //players.forEach(p -> System.out.println(p.getNic()+" "+ p.getInstance()));
            System.out.println(players.get(i) + " " + ratingPlayer.getRating());
        }




        //Game game1 = new Game("Minecraft");

        ArrayList<String> games = new ArrayList<>();
        games.add("minecraft");
        games.add("dota");
        games.add("cs:go");
        games.add("warcraft");
        games.add("star craft");
        games.add("pubg");
        games.add("doom");
        games.add("diablo");
        games.add("witcher");
        games.add("creed");

        for (int i = 0; i < games.size(); i++) {
            //players.forEach(p -> System.out.println(p.getNic()+" "+ p.getInstance()));
            System.out.println("\t "+ i +" - "+ games.get(i));
        }

        makeEvent("Game win.");
        makeEvent("Game loss.");
        System.out.println(player1.getNic() + " " + Singleton.getInstance());



        //System.out.println(game1.getName());

    }


    static void makeEvent(String s) {
        String getNic = new String();
        Player player = new Player(getNic);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game win or loss: (w/l)?");
        String str = scanner.nextLine();
        Event event = new Event(s);
        System.out.println(s);
        if (str.equals("w")) {
            ratingPlayer.incRating();
            System.out.println("rating: " + getNic + " " + ratingPlayer.getRating());
        }

        if (str.equals("l")) {
            ratingPlayer.incRating2();
            System.out.println("rating: " + getNic + " " + ratingPlayer.getRating());
        }


    }

    static class Player {
        String nic;


        public Player(String nic) {
            this.nic = nic;

        }

        public String getNic() {
            return nic;
        }


        @Override
        public String toString() {
            return "Player{" +
                    "nic='" + nic + '\'' +
                    '}';
        }
    }

    static class Game {
        String name;

        public Game(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Singleton {
        private static final Singleton instance = new Singleton();

        public int getRating() {
            return rating;
        }

        private int rating = 0;

        private Singleton() {
            System.out.println("Start a new game");
        }

        public static Singleton getInstance() {
            return instance;
        }

        public void incRating() {
            rating++;
        }

        public void incRating2() {
            rating--;
        }
    }

    static class Event {
        private final String name;

        Event(String name) {
            this.name = name;
        }
    }
}
