
/* MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
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
 * Created on Sep 25, 2004
 *
 */
package megamek.common.weapons;

import megamek.common.AmmoType;
import megamek.common.TechAdvancement;

/**
 * @author Jay Lawson
 */
public class ISMassDriverLight extends MassDriverWeapon {
    /**
     * 
     */
    private static final long serialVersionUID = 8756042527483383101L;

    /**
     * 
     */
    public ISMassDriverLight() {
        super();
        this.name = "Light Mass Driver";
        this.setInternalName(this.name);
        this.addLookupName("LightMassDriver");
        this.heat = 30;
        this.damage = 60;
        this.ammoType = AmmoType.T_LMASS;
        this.shortRange = 12;
        this.mediumRange = 24;
        this.longRange = 40;
        this.tonnage = 100000;
        this.bv = 0;
        this.cost = 500000000;
        this.shortAV = 60;
        this.medAV = 60;
        this.longAV = 60;
        this.maxRange = RANGE_LONG;
        
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(2715, DATE_NONE, DATE_NONE);
        techAdvancement.setTechRating(RATING_D);
        techAdvancement.setAvailability( new int[] { RATING_E, RATING_F, RATING_E, RATING_X });
    }
}
