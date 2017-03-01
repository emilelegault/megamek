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
public class ISMRM10IOS extends MRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 1980690855716987710L;

    /**
     *
     */
    public ISMRM10IOS() {
        super();

        name = "MRM 10 (I-OS)";
        setInternalName(name);
        addLookupName("IOS MRM-10");
        addLookupName("ISMRM10 (IOS)");
        addLookupName("IS MRM 10 (IOS)");
        heat = 4;
        rackSize = 10;
        shortRange = 3;
        mediumRange = 8;
        longRange = 15;
        extremeRange = 16;
        tonnage = 2.5f;
        criticals = 2;
        bv = 11;
        flags = flags.or(F_ONESHOT);
        cost = 40000;
        shortAV = 6;
        medAV = 6;
        maxRange = RANGE_MED;
        rulesRefs = "327, TO";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(3056, 3076, 3085);
        techAdvancement.setTechRating(RATING_C);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_E, RATING_D });
    }
}
