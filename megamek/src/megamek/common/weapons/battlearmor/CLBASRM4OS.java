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
package megamek.common.weapons.battlearmor;

import megamek.common.TechAdvancement;
import megamek.common.weapons.SRMWeapon;


/**
 * @author Sebastian Brocks
 */
public class CLBASRM4OS extends SRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -6513977729364835643L;

    /**
     *
     */
    public CLBASRM4OS() {
        super();
        name = "SRM 4 (OS)";
        setInternalName("CLBASRM4 (OS)");
        addLookupName("Clan BA OS SRM-4");
        addLookupName("Clan BA SRM 4 (OS)");
        addLookupName("CLBASRM4OS");
        heat = 3;
        rackSize = 4;
        shortRange = 3;
        mediumRange = 6;
        longRange = 9;
        extremeRange = 12;
        tonnage = .080f;
        criticals = 3;
        bv = 8;
        flags = flags.or(F_NO_FIRES).or(F_BA_WEAPON).or(F_ONESHOT).andNot(F_MECH_WEAPON).andNot(F_TANK_WEAPON).andNot(F_AERO_WEAPON).andNot(F_PROTO_WEAPON);
        cost = 10000;
        shortAV = 2;
        maxRange = RANGE_SHORT;
		rulesRefs = "261, TM";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_CLAN);
        techAdvancement.setClanAdvancement(2860, 2868, 2870);
        techAdvancement.setTechRating(RATING_F);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_D, RATING_C, RATING_B });
    }
}
