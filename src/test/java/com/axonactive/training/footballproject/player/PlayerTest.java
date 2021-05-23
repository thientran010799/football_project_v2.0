package com.axonactive.training.footballproject.player;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PlayerTest {
    
    Player player = new Player();

    @Test
    public void whenGivePlayerWorkForCompanyExpectTrue() {
        player.setSocialInsuranceNumber("");
         assertTrue(player.isWorkForCompany());
    }

    @Test
    public void whenGivePlayerNotWorkForCompanyExpectTrue() {
        player.setSocialInsuranceNumber("1");
        assertFalse(player.isWorkForCompany());
    }
}
