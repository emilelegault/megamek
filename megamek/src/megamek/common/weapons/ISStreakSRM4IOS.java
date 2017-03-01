/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 */
package megamek.common.weapons;

import megamek.common.TechAdvancement;

/**
 * @author Sebastian Brocks
 */
public class ISStreakSRM4IOS extends StreakSRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -8651111887714823028L;

    /**
     *
     */
    public ISStreakSRM4IOS() {
        super();
        name = "Streak SRM 4 (I-OS)";
        setInternalName("ISStreakSRM4IOS");
        addLookupName("ISStreakSRM4 (IOS)"); // mtf
        addLookupName("IS Streak SRM 4 (IOS)"); // tdb
        addLookupName("IOS Streak SRM-4"); // mep
        heat = 3;
        rackSize = 4;
        shortRange = 3;
        mediumRange = 6;
        longRange = 9;
        extremeRange = 12;
        tonnage = 2.5f;
        criticals = 1;
        flags = flags.or(F_NO_FIRES).or(F_ONESHOT);
        bv = 12;
        cost = 72000;
        shortAV = 8;
        maxRange = RANGE_SHORT;
        rulesRefs = "230, TM";;
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(3056, 3071, DATE_NONE);
        techAdvancement.setTechRating(RATING_B);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_F, RATING_E });
    }
}
