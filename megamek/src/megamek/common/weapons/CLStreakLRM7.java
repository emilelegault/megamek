/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
package megamek.common.weapons;

import megamek.common.TechAdvancement;

/**
 * @author Sebastian Brocks
 */
public class CLStreakLRM7 extends StreakLRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 5240577239366457930L;

    /**
     *
     */
    public CLStreakLRM7() {
        super();
        name = "Streak LRM 7";
        setInternalName("CLStreakLRM7");
        addLookupName("Clan Streak LRM-7");
        addLookupName("Clan Streak LRM 7");
        heat = 0;
        rackSize = 7;
        shortRange = 7;
        mediumRange = 14;
        longRange = 21;
        extremeRange = 28;
        tonnage = 2.5f;
        criticals = 1;
        bv = 120;
        cost = 105000;
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_CLAN);
        techAdvancement.setClanAdvancement(3065, DATE_NONE, 3079);
        techAdvancement.setTechRating(RATING_F);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_F, RATING_X });
    }
}
