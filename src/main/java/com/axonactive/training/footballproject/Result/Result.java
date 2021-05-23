package com.axonactive.training.footballproject.Result;

import com.axonactive.training.footballproject.match.Match;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Result {

    private Match match;

    private int scoreOfTeamA;

    private int scoreOfTeamB;
}
