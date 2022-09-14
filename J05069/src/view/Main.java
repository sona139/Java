/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Club> clubs = new ArrayList<>();
        Map<String, Club> mapClub = new HashMap<>();
        for (int i = 0; i < n; i++) {
            clubs.add(new Club(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
            mapClub.put(clubs.get(i).getClubID(), clubs.get(i));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Match> matchs = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            matchs.add(new Match(sc.next(), Integer.parseInt(sc.next())));
            String matchId = matchs.get(i-1).getMatchId();
            String stt = Integer.toString(i);
            matchs.get(i-1).setClub(mapClub.get(matchId.substring(1, matchId.length()-stt.length())));
        }
        matchs.forEach(System.out::println);
    }
}

class Club {
    private String clubID;
    private String clbName;
    private int price;

    public Club() {
    }

    public Club(String clubID, String clbName, int price) {
        this.clubID = clubID;
        this.clbName = clbName;
        this.price = price;
    }

    public String getClubID() {
        return clubID;
    }

    public void setClubID(String clubID) {
        this.clubID = clubID;
    }

    public String getClbName() {
        return clbName;
    }

    public void setClbName(String clbName) {
        this.clbName = clbName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Match {
    private String matchId;
    private int nums;
    private Club club;

    public Match() {
    }

    public Match(String matchId, int nums) {
        this.matchId = matchId;
        this.nums = nums;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return matchId + " " + club.getClbName() + " " + club.getPrice()*nums;
    }
}