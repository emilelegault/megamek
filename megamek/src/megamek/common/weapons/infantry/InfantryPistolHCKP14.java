package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.EquipmentTypeLookup;

public class InfantryPistolHCKP14 extends InfantryWeapon {

    /**
    *
    */
   private static final long serialVersionUID = -3164871600230559641L;

   public InfantryPistolHCKP14() {
       super();

       name = "Pistol (HCK P-14)";
       setInternalName(EquipmentTypeLookup.HCKP14);
       addLookupName("HCK P-14");
       ammoType = AmmoType.T_INFANTRY;
       bv = 1;
       tonnage =  0.0012;
       infantryDamage =  0.07;
       infantryRange =  0;
       ammoWeight =  0.00004;
       cost = 130;
       ammoCost =  5;
       shots =  8;
       bursts =  1;
       flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
       rulesRefs = "Shrapnel #3";
       techAdvancement
       .setTechBase(TECH_BASE_IS)
       .setTechRating(RATING_C)
       .setAvailability(RATING_X,RATING_D,RATING_D,RATING_D)
       .setISAdvancement(DATE_NONE, DATE_NONE,2800,DATE_NONE,DATE_NONE)
       .setISApproximate(false, false, true, false, false)
       .setProductionFactions(F_LC);

   }
}