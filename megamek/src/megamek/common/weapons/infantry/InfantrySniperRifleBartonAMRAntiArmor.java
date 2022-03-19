package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.EquipmentTypeLookup;

public class InfantrySniperRifleBartonAMRAntiArmor extends InfantryWeapon {

    /**
    *
    */
   private static final long serialVersionUID = -3164871600230559641L;

   public InfantrySniperRifleBartonAMRAntiArmor() {
       super();

       name = "Sniper Rifle (Barton AMR (Anti-Armor))";
       setInternalName(EquipmentTypeLookup.BARTONAMRAA);
       addLookupName("Barton AMR (Anti-Armor)");
       ammoType = AmmoType.T_INFANTRY;
       bv = 1;
       tonnage =  0.014;
       infantryDamage =  0.78;
       infantryRange =  7;
       ammoWeight =  0.014;
       cost = 700;
       ammoCost =  12;
       shots =  8;
       bursts =  1;
       flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC).or(F_INF_ENCUMBER);
       rulesRefs = "Shrapnel #1";
       techAdvancement
       .setTechBase(TECH_BASE_IS)
       .setTechRating(RATING_D)
       .setAvailability(RATING_X,RATING_E,RATING_E,RATING_E)
       .setISAdvancement(DATE_NONE, DATE_NONE,2800,DATE_NONE,DATE_NONE)
       .setISApproximate(false, false, true, false, false)
       .setProductionFactions(F_FS);
   }
}