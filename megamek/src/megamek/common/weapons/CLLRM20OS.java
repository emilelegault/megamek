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
public class CLLRM20OS extends LRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 1725628953852049901L;

    /**
     *
     */
    public CLLRM20OS() {
        super();
        name = "LRM 20 (OS)";
        setInternalName("CLLRM20 (OS)");
        addLookupName("Clan OS LRM-20");
        addLookupName("Clan LRM 20 (OS)");
        heat = 6;
        rackSize = 20;
        minimumRange = WEAPON_NA;
        tonnage = 5.5f;
        criticals = 4;
        bv = 44;
        flags = flags.or(F_ONESHOT);
        cost = 125000;
        shortAV = 12;
        medAV = 12;
        longAV = 12;
        maxRange = RANGE_LONG;

        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_CLAN);
        techAdvancement.setClanAdvancement(DATE_NONE, DATE_NONE, 2824);
        techAdvancement.setTechRating(RATING_F);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_B, RATING_B, RATING_X });
    }
}
