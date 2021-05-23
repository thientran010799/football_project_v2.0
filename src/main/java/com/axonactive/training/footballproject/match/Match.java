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

}

