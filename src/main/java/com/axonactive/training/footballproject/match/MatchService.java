package com.axonactive.training.footballproject.match;

import java.util.ArrayList;
import java.util.List;

import com.axonactive.training.footballproject.team.Team;

import lombok.Getter;
@Getter
public class MatchService {
    private List<Match> matches = new ArrayList<>();

    public void createMatches(List<Team> teams) {
        for (int i = 0; i < (teams.size() - 1); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                Match match = new Match();
                match.setTeamA(teams.get(i));
                match.setTeamA(teams.get(j));
                matches.add(match);
            }
        }
    }

}
