/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
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
/*
 * Created on Sep 7, 2005
 *
 */
package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.TechAdvancement;

/**
 * @author Ben Grills
 */
public class InfantryGrenadeRAGWeapon extends InfantryWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -3164871600230559641L;

    public InfantryGrenadeRAGWeapon() {
        super();

        name = "Grenade (Rocket-Assisted)";
        setInternalName(name);
        addLookupName("InfantryRAG");
        addLookupName("InfantryRPG");
        addLookupName("Rocket Assisted Grenade");
        ammoType = AmmoType.T_NA;
        cost = 50;
        bv = 0.92;
        flags = flags.or(F_NO_FIRES).or(F_BALLISTIC).or(F_INF_SUPPORT);
        infantryDamage = 0.30;
        infantryRange = 1;
        rulesRefs =" 273, TM";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(3057, 3065, 3085);
        techAdvancement.setTechRating(RATING_C);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_D, RATING_C });
    }
}
