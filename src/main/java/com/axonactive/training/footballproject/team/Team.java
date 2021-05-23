package com.axonactive.training.footballproject.team;

import java.util.ArrayList;
import java.util.List;

import com.axonactive.training.footballproject.player.Player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Team {

    public static final String COMPANY_SOCIAL_INSURANCE_NUMBER = "";

    public static final int MAXIMUN_SIZE = 12;

    public static final int MINIMUN_SIZE = 7;

    private String name;

    private int score;

    private List<Player> players = new ArrayList<>();

    public boolean isEnoughPlayer() {
        return (this.getPlayers().size() < MINIMUN_SIZE);
    }

    public void addPlayer(Player player) {
        if (players.size() < Team.MAXIMUN_SIZE) {
            if (player.isWorkForCompany()) {
                players.add(player);
            } else
                throw new IllegalArgumentException("This player do not work for this company");
        } else
            throw new IllegalArgumentException("Size of team is max");
    }

}

