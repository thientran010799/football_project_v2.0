package com.axonactive.training.footballproject.player;

import com.axonactive.training.footballproject.team.Team;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Player {

    private String name;

    private Gender gender;

    private String socialInsuranceNumber;

    public boolean isWorkForCompany() {
        return (Team.COMPANY_SOCIAL_INSURANCE_NUMBER.equals(this.socialInsuranceNumber));
    }
}
