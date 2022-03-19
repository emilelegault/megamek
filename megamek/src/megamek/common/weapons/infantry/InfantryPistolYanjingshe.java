package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.EquipmentTypeLookup;

public class InfantryPistolYanjingshe extends InfantryWeapon {

    /**
    *
    */
   private static final long serialVersionUID = -3164871600230559641L;

   public InfantryPistolYanjingshe() {
       super();

       name = "Pistol (Ya Njingshe)";
       setInternalName(EquipmentTypeLookup.YANJINGSHE);
       addLookupName("Ya Njingshe");
       ammoType = AmmoType.T_INFANTRY;
       bv = 1;
       tonnage =  0.001;
       infantryDamage =  0.37;
       infantryRange =  1;
       ammoWeight =  0.000004;
       cost = 300;
       ammoCost =  15;
       shots =  15;
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