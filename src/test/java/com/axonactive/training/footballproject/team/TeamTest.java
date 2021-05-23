package com.axonactive.training.footballproject.team;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.axonactive.training.footballproject.player.Gender;
import com.axonactive.training.footballproject.player.Player;

import org.junit.jupiter.api.Test;

public class TeamTest {

    Player player1, player2, player3, player4, player5, player6, player7, player8, player9, player10, player11, player12, player13 = new Player();
    Team team  = new Team();

    @Test
    public void whenGiveTeamHasEnoughPlayerExpectTrue() {

        team.getPlayers().add(player1);
        team.getPlayers().add(player2);
        team.getPlayers().add(player3);
        team.getPlayers().add(player4);
        team.getPlayers().add(player5);
        team.getPlayers().add(player6);
        team.getPlayers().add(player7);
        team.getPlayers().add(player8);

        assertTrue(team.isEnoughPlayer());
    }

    @Test
    public void whenGiveTeamHasNotEnoughPlayerExpectFalse() {

        team.getPlayers().add(player1);
        team.getPlayers().add(player2);
        team.getPlayers().add(player3);
        team.getPlayers().add(player4);
        team.getPlayers().add(player5);

        assertFalse(team.isEnoughPlayer());
    }

    @Test
    public void whenGivePlayerWorkForCompanyAndTeamSizeIsNotMaximunExpectTeamSizeIncreate() {
        player1 = new Player("Messi", Gender.MALE, "");
        team = new Team();
        team.addPlayer(player1);
        assertEquals(1, team.getPlayers().size());
    }

    @Test
    public void whenGivePlayerWorkForCompanyAndTeamSizeIsMaximunExpectIllegalArgumentExceptionIsThrow() {

        player13 = new Player("Messi", Gender.MALE, "");

        team = new Team();
        team.getPlayers().add(player1);
        team.getPlayers().add(player2);
        team.getPlayers().add(player3);
        team.getPlayers().add(player4);
        team.getPlayers().add(player5);
        team.getPlayers().add(player6);
        team.getPlayers().add(player7);
        team.getPlayers().add(player8);
        team.getPlayers().add(player9);
        team.getPlayers().add(player10);
        team.getPlayers().add(player11);
        team.getPlayers().add(player12);

        assertThrows(IllegalArgumentException.class, () -> team.addPlayer(player13));
    }

    @Test
    public void whenGivePlayerNotWorkForCompanyAndTeamSizeIsNotMaximunExpectIllegalArgumentExceptionIsThrow() {

        player13 = new Player("Messi", Gender.MALE, "1");

        team = new Team();
        team.getPlayers().add(player1);
        team.getPlayers().add(player2);
        team.getPlayers().add(player3);
        team.getPlayers().add(player4);
        team.getPlayers().add(player5);
        team.getPlayers().add(player6);
        team.getPlayers().add(player7);


        assertThrows(IllegalArgumentException.class, () -> team.addPlayer(player13));
    }
}
