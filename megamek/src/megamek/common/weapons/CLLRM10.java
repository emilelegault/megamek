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
public class CLLRM10 extends LRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -3159588360292537303L;

    /**
     *
     */
    public CLLRM10() {
        super();
        name = "LRM 10";
        setInternalName("CLLRM10");
        addLookupName("Clan LRM-10");
        addLookupName("Clan LRM 10");
        heat = 4;
        rackSize = 10;
        minimumRange = WEAPON_NA;
        tonnage = 2.5f;
        criticals = 1;
        bv = 109;
        cost = 100000;
        shortAV = 6;
        medAV = 6;
        longAV = 6;
        maxRange = RANGE_LONG;
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_CLAN);
        techAdvancement.setClanAdvancement(DATE_NONE, DATE_NONE, 2824);
        techAdvancement.setTechRating(RATING_F);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_B, RATING_B, RATING_X });
    }
}
