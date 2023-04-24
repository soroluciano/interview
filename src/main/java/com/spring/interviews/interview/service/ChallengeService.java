package com.spring.interviews.interview.service;

import com.spring.interviews.interview.model.Challenge;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChallengeService {

    public List<Challenge> getFilteredChallengeListByLevel(String level) {
        List<Challenge> challenges = getChallenges();
        List<Challenge> filteredChallenges;
        filteredChallenges = challenges.stream().filter(challenge -> challenge.getLevel() == level).collect(Collectors.toList());
        return filteredChallenges;
    }

    private List<Challenge> getChallenges() {
        List<Challenge> challenges = new ArrayList<>();

        Challenge challenge = new Challenge();
        challenge.setId("1");
        challenge.setName("Rock Paper Scissor");
        challenge.setLevel("Hard");
        //simulation of database read
        challenges.add(challenge);
        challenge = new Challenge();
        challenge.setId("2");
        challenge.setName("Tic tac toe");
        challenge.setLevel("Easy");
        challenges.add(challenge);

        challenge = new Challenge();
        challenge.setId("3");
        challenge.setName("Battle Royal");
        challenge.setLevel("Hard");
        challenges.add(challenge);

        return challenges;
    }
}
