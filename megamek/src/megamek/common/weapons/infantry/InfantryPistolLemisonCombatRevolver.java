package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.EquipmentTypeLookup;

public class InfantryPistolLemisonCombatRevolver extends InfantryWeapon {

    /**
    *
    */
   private static final long serialVersionUID = -3164871600230559641L;

   public InfantryPistolLemisonCombatRevolver() {
       super();

       name = "Pistol (Lemison Combat Revolver)";
       setInternalName(EquipmentTypeLookup.LEMISON);
       addLookupName("Lemison Combat Revolver");
       ammoType = AmmoType.T_INFANTRY;
       bv = 1;
       tonnage =  0.0016;
       infantryDamage =  0.37;
       infantryRange =  0;
       ammoWeight =  0.000025;
       cost = 120;
       ammoCost =  7;
       shots =  8;
       bursts =  1;
       flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
       rulesRefs = "Shrapnel #3";
       techAdvancement
       .setTechBase(TECH_BASE_IS)
       .setTechRating(RATING_C)
       .setAvailability(RATING_X,RATING_C,RATING_B,RATING_B)
       .setISAdvancement(DATE_NONE, DATE_NONE,2800,DATE_NONE,DATE_NONE)
       .setISApproximate(false, false, true, false, false)


       .setProductionFactions(F_FW);


   }
}