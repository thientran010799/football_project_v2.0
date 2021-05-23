package com.axonactive.training.footballproject.player;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class GenderTest {

    @Test
    public void whenGiveGenderOfPlayerExpectValueOfThisGender() {

        Player player = new Player();
        player.setGender(Gender.FEMALE);
        assertEquals(0, player.getGender().getValue());
    }
}
