package com.axonactive.training.footballproject.team;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import com.axonactive.training.footballproject.player.Gender;
import com.axonactive.training.footballproject.player.Player;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamServiceTest {

    Player player1, player2, player3, player4, player5, player6, player7, player8, player9, player10, player11, player12, player13 = new Player();

    Team team, team1;

    TeamService teamService = new TeamService();

    @BeforeEach
    public void setData() {

        team  = new Team();

        teamService = new TeamService();
    }

    @Test
    public void whenGiveValidTeamExpectTeamSizeIncreate() {

        team.getPlayers().add(player1);
        team.getPlayers().add(player2);
        team.getPlayers().add(player3);
        team.getPlayers().add(player4);
        team.getPlayers().add(player5);
        team.getPlayers().add(player6);
        team.getPlayers().add(player7);
        team.getPlayers().add(player8);

        teamService.register(team);
        assertEquals(1, teamService.getTeams().size());
    }

    @Test
    public void whenGiveInvalidTeamExpectIllegalArgumentExceptionIsThrow() {

        team = new Team();

        assertThrows(IllegalArgumentException.class, () -> teamService.register(team));
    }

    @Test
    public void whenGiveTeamsExpectLIstHasTheSameSize() {

        player1 = new Player("name", Gender.FEMALE, "");
        player2 = new Player("name", Gender.FEMALE, "");
        player3 = new Player("name", Gender.FEMALE, "");
        player4 = new Player("name", Gender.FEMALE, "");
        player5 = new Player("name", Gender.FEMALE, "");
        player6 = new Player("name", Gender.FEMALE, "");
        player7 = new Player("name", Gender.FEMALE, "");
        player8 = new Player("name", Gender.FEMALE, "");


        team.getPlayers().add(player1);
        team.getPlayers().add(player2);
        team.getPlayers().add(player3);
        team.getPlayers().add(player4);
        team.getPlayers().add(player5);
        team.getPlayers().add(player6);
        team.getPlayers().add(player7);
        team.getPlayers().add(player8);

        teamService.register(team);

        List<Team> teams = new ArrayList<>();

        teams = teamService.getAllTeam();

        assertEquals(1, teams.size());
    }
}
