package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.EquipmentTypeLookup;

public class InfantryPistolAlamo17 extends InfantryWeapon {

    /**
    *
    */
   private static final long serialVersionUID = -3164871600230559641L;

   public InfantryPistolAlamo17() {
       super();

       name = "Pistol (Alamo-17)";
       setInternalName(EquipmentTypeLookup.ALAMO17);
       addLookupName("Alamo17");
       ammoType = AmmoType.T_INFANTRY;
       bv = 1;
       tonnage =  0.001;
       infantryDamage =  0.3;
       infantryRange =  1;
       ammoWeight =  0.00004;
       cost = 250;
       ammoCost =  15;
       shots =  18;
       bursts =  1;
       flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
       rulesRefs = "Shrapnel #3";
       techAdvancement
       .setTechBase(TECH_BASE_IS)
       .setTechRating(RATING_C)
       .setAvailability(RATING_A,RATING_A,RATING_A,RATING_A)
       .setISAdvancement(DATE_NONE, DATE_NONE,2100,DATE_NONE,DATE_NONE)
       .setISApproximate(false, false, true, false, false)
       .setProductionFactions(F_TC);

   }
}