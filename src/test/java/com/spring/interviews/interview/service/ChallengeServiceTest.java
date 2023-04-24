package com.spring.interviews.interview.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ChallengeServiceTest {

    @InjectMocks
    private ChallengeService challengeService;

    @Test
    public void whenChallengeLevelIsHardGetTwoChallenges(){
        assertEquals(2,challengeService.getFilteredChallengeListByLevel("Hard").size());
    }

    @Test
    public void whenChallengeLevelIsEasyGetOneChallenge(){
        assertEquals(1,challengeService.getFilteredChallengeListByLevel("Easy").size());
    }
}