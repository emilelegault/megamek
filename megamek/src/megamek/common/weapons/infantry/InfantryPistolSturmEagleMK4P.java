package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.EquipmentTypeLookup;

public class InfantryPistolSturmEagleMK4P extends InfantryWeapon {

    /**
    *
    */
   private static final long serialVersionUID = -3164871600230559641L;

   public InfantryPistolSturmEagleMK4P() {
       super();

       name = "Pistol (Sturm Eagle Mk4P)";
       setInternalName(EquipmentTypeLookup.STURMEAGLEMK4P);
       addLookupName("Sturm Eagle Mk4P");
       ammoType = AmmoType.T_INFANTRY;
       bv = 1;
       tonnage =  0.0013;
       infantryDamage =  0.3;
       infantryRange =  0;
       ammoWeight =  0.00001;
       cost = 145;
       ammoCost =  7;
       shots =  12;
       bursts =  1;
       flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
       rulesRefs = "Shrapnel #3";
       techAdvancement
       .setTechBase(TECH_BASE_IS)
       .setTechRating(RATING_C)
       .setAvailability(RATING_X,RATING_B,RATING_B,RATING_B)
       .setISAdvancement(DATE_NONE, DATE_NONE,2800,DATE_NONE,DATE_NONE)
       .setISApproximate(false, false, true, false, false)
       .setProductionFactions(F_LC);
   }
}