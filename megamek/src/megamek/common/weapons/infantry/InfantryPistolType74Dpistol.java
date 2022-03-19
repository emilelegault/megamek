package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.EquipmentTypeLookup;

public class InfantryPistolType74Dpistol extends InfantryWeapon {

    /**
    *
    */
   private static final long serialVersionUID = -3164871600230559641L;

   public InfantryPistolType74Dpistol() {
       super();

       name = "Pistol (Type 74D Pistol)";
       setInternalName(EquipmentTypeLookup.TYPE74D);
       addLookupName("Type 74D Pistol");
       ammoType = AmmoType.T_INFANTRY;
       bv = 1;
       tonnage =  0.0007;
       infantryDamage =  0.3;
       infantryRange =  0;
       ammoWeight =  0.000015;
       cost = 140;
       ammoCost =  6;
       shots =  11;
       bursts =  1;
       flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
       rulesRefs = "Shrapnel #3";
       techAdvancement
       .setTechBase(TECH_BASE_IS)
       .setTechRating(RATING_D)
       .setAvailability(RATING_C,RATING_C,RATING_C,RATING_C)
       .setISAdvancement(DATE_NONE, DATE_NONE,2100,DATE_NONE,DATE_NONE)
       .setISApproximate(false, false, true, false, false)
       .setProductionFactions(F_CC);

   }
}