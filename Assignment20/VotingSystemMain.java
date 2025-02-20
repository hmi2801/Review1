package Bridgelabz_2113100011.Assignment20;

import java.util.*;

class VotingSystem {
    private Map<String, Integer> voteMap = new HashMap<>();
    private LinkedHashMap<String, Integer> linkedVoteMap = new LinkedHashMap<>();
    private TreeMap<String, Integer> sortedVoteMap = new TreeMap<>();

    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        linkedVoteMap.put(candidate, linkedVoteMap.getOrDefault(candidate, 0) + 1);
        sortedVoteMap.put(candidate, sortedVoteMap.getOrDefault(candidate, 0) + 1);
    }

    public void displayVotes() {
        System.out.println("Votes (Unordered - HashMap): " + voteMap);
        System.out.println("Votes (Insertion Order - LinkedHashMap): " + linkedVoteMap);
        System.out.println("Votes (Sorted - TreeMap): " + sortedVoteMap);
    }

    public void displayWinner() {
        String winner = Collections.max(voteMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Winner: " + winner + " with " + voteMap.get(winner) + " votes");
    }
}

public class VotingSystemMain {
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");
        system.castVote("Bob");
        system.castVote("Alice");

        system.displayVotes();
        system.displayWinner();
    }
}

