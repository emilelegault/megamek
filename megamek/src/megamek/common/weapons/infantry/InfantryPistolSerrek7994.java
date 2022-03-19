package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.EquipmentTypeLookup;

public class InfantryPistolSerrek7994 extends InfantryWeapon {

    /**
    *
    */
   private static final long serialVersionUID = -3164871600230559641L;

   public InfantryPistolSerrek7994() {
       super();

       name = "Pistol (Serrek 7994)";
       setInternalName(EquipmentTypeLookup.SERREK7994);
       addLookupName("Serrek 7994");
       ammoType = AmmoType.T_INFANTRY;
       bv = 1;
       tonnage =  0.0009;
       infantryDamage =  0.18;
       infantryRange =  1;
       ammoWeight =  0.000004;
       cost = 300;
       ammoCost =  15;
       shots =  20;
       bursts =  3;
       flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
       rulesRefs = "Shrapnel #3";
       techAdvancement
       .setTechBase(TECH_BASE_IS)
       .setTechRating(RATING_C)
       .setAvailability(RATING_X,RATING_C,RATING_B,RATING_B)
       .setISAdvancement(DATE_NONE, DATE_NONE,2800,DATE_NONE,DATE_NONE)
       .setISApproximate(false, false, true, false, false)
       .setProductionFactions(F_FS);

   }
}