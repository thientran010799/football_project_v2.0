package com.axonactive.training.footballproject.team;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamService {

    private List<Team> teams = new ArrayList<>();

    public void register(Team team) {
        if (team.isEnoughPlayer()) {
            teams.add(team);
        }
        else throw new IllegalArgumentException("Your team is not enough player");
    }

    public List<Team> getAllTeam(){
        return this.teams;
    }
}
