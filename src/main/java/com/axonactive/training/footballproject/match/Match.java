package com.axonactive.training.footballproject.match;


import com.axonactive.training.footballproject.team.Team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Match {

    private Team teamA;

    private Team teamB;

    public void createMatch(Team teamOne, Team teamTwo) {

        if (teamA.getName().equals(teamB.getName())) {
            this.setTeamA(teamOne);
            this.setTeamB(teamTwo);
        } else
            throw new IllegalArgumentException("Team A must different with TeamB");
    }

}

