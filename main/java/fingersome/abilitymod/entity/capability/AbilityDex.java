package fingersome.abilitymod.entity.capability;

public class AbilityDex implements IAbilityScore {

	public int abilityID = 1; 
	public int abilityMagnitude = 10;
		
		@Override
		public void setAbilityScore(int score) {
			this.abilityMagnitude = score;
		}

		@Override
		public int getAbilityID() {
			return abilityID;
		}
		
		@Override
		public int getAbilityScore() {
			return abilityMagnitude;
		}

		@Override
		public String getAbilityName() {
		
			return "Dexterity";
			
		}



}