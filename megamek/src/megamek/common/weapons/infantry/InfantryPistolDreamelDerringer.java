package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.EquipmentTypeLookup;

public class InfantryPistolDreamelDerringer extends InfantryWeapon {

    /**
    *
    */
   private static final long serialVersionUID = -3164871600230559641L;

   public InfantryPistolDreamelDerringer() {
       super();

       name = "Pistol (Dreamel J-4 Derringer)";
       setInternalName(EquipmentTypeLookup.DERRINGER);
       addLookupName("Dreamel J-4 Derringer");
       ammoType = AmmoType.T_INFANTRY;
       bv = 1;
       tonnage =  0.0002;
       infantryDamage =  0.15;
       infantryRange =  0;
       ammoWeight =  0.000001;
       cost = 60;
       ammoCost =  5;
       shots =  2;
       bursts =  1;
       flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
       rulesRefs = "Shrapnel #3";
       techAdvancement
       .setTechBase(TECH_BASE_IS)
       .setTechRating(RATING_C)
       .setAvailability(RATING_B,RATING_C,RATING_B,RATING_B)
       .setISAdvancement(DATE_NONE, DATE_NONE,2100,DATE_NONE,DATE_NONE)
       .setISApproximate(false, false, true, false, false)
       .setProductionFactions(F_FW);


   }
}