package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.EquipmentTypeLookup;

public class InfantryPistolMomoDeBaoyingStandard extends InfantryWeapon {

    /**
    *
    */
   private static final long serialVersionUID = -3164871600230559641L;

   public InfantryPistolMomoDeBaoyingStandard() {
       super();

       name = "Pistol (Momo De Baoying (Standard))";
       setInternalName(EquipmentTypeLookup.MOMODEBAOYINGSTD);
       addLookupName("Momo De Baoying (Standard)");
       ammoType = AmmoType.T_INFANTRY;
       bv = 1;
       tonnage =  0.0011;
       infantryDamage =  0.44;
       infantryRange =  1;
       ammoWeight =  0.000001;
       cost = 275;
       ammoCost =  10;
       shots =  10;
       bursts =  1;
       flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
       rulesRefs = "Shrapnel #3";
       techAdvancement
       .setTechBase(TECH_BASE_IS)
       .setTechRating(RATING_D)
       .setAvailability(RATING_X,RATING_E,RATING_E,RATING_F)
       .setISAdvancement(DATE_NONE, DATE_NONE,2800,DATE_NONE,DATE_NONE)
       .setISApproximate(false, false, true, false, false)
       .setProductionFactions(F_CC);

   }
}