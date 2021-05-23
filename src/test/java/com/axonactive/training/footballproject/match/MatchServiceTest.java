package com.axonactive.training.footballproject.match;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.axonactive.training.footballproject.team.Team;
import org.junit.jupiter.api.Test;

public class MatchServiceTest {

    Team teamA, teamB, teamC;

    List<Team> teams = new ArrayList<>();

    MatchService matchService = new MatchService();

    @Test
    public void whenGiveTeamsExpectMatches() {

        teams.add(teamA);
        teams.add(teamB);
        teams.add(teamC);
        matchService.createMatches(teams);

        assertEquals(3, matchService.getMatches().size());
    }
}
