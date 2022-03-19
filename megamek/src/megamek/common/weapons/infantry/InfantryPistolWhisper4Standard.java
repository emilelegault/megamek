package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.EquipmentTypeLookup;

public class InfantryPistolWhisper4Standard extends InfantryWeapon {

    /**
    *
    */
   private static final long serialVersionUID = -3164871600230559641L;

   public InfantryPistolWhisper4Standard() {
       super();

       name = "Pistol (Whisper-4 (Standard Rounds))";
       setInternalName(EquipmentTypeLookup.WHISPER4STD);
       addLookupName("Whisper-4 (Standard Rounds)");
       ammoType = AmmoType.T_INFANTRY;
       bv = 1;
       tonnage =  0.0012;
       infantryDamage =  0.37;
       infantryRange =  1;
       ammoWeight =  0.00005;
       cost = 650;
       ammoCost =  25;
       shots =  6;
       bursts =  1;
       flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
       rulesRefs = "Shrapnel #3";
       techAdvancement
       .setTechBase(TECH_BASE_IS)
       .setTechRating(RATING_D)
       .setAvailability(RATING_E,RATING_E,RATING_E,RATING_E)
       .setISAdvancement(DATE_NONE, DATE_NONE,2100,DATE_NONE,DATE_NONE)
       .setISApproximate(false, false, true, false, false)
       .setProductionFactions(F_MC);

   }
}