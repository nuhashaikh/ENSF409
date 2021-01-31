import java.util.Arrays;

public class ObjectCopying {

    public static void main(String[] args) throws CloneNotSupportedException{

        Animal horse1 = new Animal("Horse","Equidae","Chordata","Blaze");
        String[] horse1Skills = new String[]{"Jumping", "Dressage"};
        horse1.setAnimalSkills(horse1Skills);
        horse1.setRider("Alex", 4321, 30);
        
		System.out.println("Original Horse1");
        System.out.println("Name: " + horse1.getAnimalName());
		String[] skills1 = horse1.getAnimalSkills();
        //System.out.println("Skills: " + Arrays.toString(skills1));
        horse1.printAnimalSkills();
		System.out.println("Rider: " + horse1.getRider().getRiderName());
		
        Animal horse2 = (Animal)horse1.clone();
        horse2.setAnimalName("Thunder");
        horse2.setRider("Taylor", 1234, 25);
        String [] horse2Skills = new String[]{"Racing"};
        horse2.setAnimalSkills(horse2Skills);
        
	System.out.println();
	System.out.println("Horse1");
        System.out.println("Name: " + horse1.getAnimalName());
	skills1 = horse1.getAnimalSkills();
        //System.out.println("Skills: " + Arrays.toString(skills1));
        horse1.printAnimalSkills();		
        System.out.println("Rider: " + horse1.getRider().getRiderName());
	System.out.println("Horse2");
        System.out.println("Name: " + horse2.getAnimalName());
	String [] skills2 = horse2.getAnimalSkills();
        //System.out.println("Skills: " + Arrays.toString(skills2));
        horse2.printAnimalSkills();		
        System.out.println("Rider: " + horse2.getRider().getRiderName());
		
    }   
}


class Animal implements Cloneable{
        private String animalSpecies;
        private String animalFamily;        
        private String animalPhylum;
        private String animalName;
        private Rider animalRider = new Rider();
	private AnimalSkill[] skills = new AnimalSkill[10];

        public Animal(){
            
        }
                
        public Animal(String animalSpecies, String animalFamily, String animalPhylum, String animalName)
        {
            this.animalSpecies = animalSpecies;
            this.animalFamily = animalFamily;
            this.animalPhylum = animalPhylum;
            this.animalName = animalName;
        }
		
	public Object clone() throws CloneNotSupportedException{
       	    Animal copy = (Animal)super.clone();
            copy.animalRider = (Rider)animalRider.clone();
            return copy;
        }		

        public void setAnimalPhylum(String animalPhylum)
        {
            this.animalPhylum = animalPhylum;
        }

        public void setAnimalFamily(String animalFamily)
        {
            this.animalFamily = animalFamily;
        }

        public void setAnimalSpecies(String animalSpecies)
        {
            this.animalSpecies = animalSpecies;
        }

        public void setAnimalName(String animalName)
        {
            this.animalName = animalName;
        }
        
        public void setRider(String name, int regNumber, int age)
        {
            this.animalRider.setRiderName(name);
            this.animalRider.setRiderRegNumber(regNumber);
            this.animalRider.setAge(age);
            
        }

        public void setAnimalSkills(String[] skills)
        {
		this.skills = new AnimalSkill[10];
		
		for (String tmpSkill : skills) {
			var skillObject = new AnimalSkill();
			skillObject.setAnimalSkill(tmpSkill);
			this.addAnimalSkills(skillObject);			
		}
        }


	public void setAnimalSkills(String skill, String level) {
		var skillObject = new AnimalSkill();
		skillObject.setAnimalSkill(skill);
		skillObject.setAnimalSkillLevel(level);
		this.addAnimalSkills(skillObject);			
	}

	private void addAnimalSkills(AnimalSkill object) {
		// Add this skill to the next empty slot in the array
		AnimalSkill[] array = getAnimalSkillsEnhanced();
		for(int i = 0; i < array.length; i++) {
	    		if(array[i] == null) {
			        array[i] = object;
			        return;
	    		}
	    	}
		throw new IllegalStateException("Maximum of 10 skills");
	}


        public String[] getAnimalSkills()
        {
		AnimalSkill[] array = getAnimalSkillsEnhanced();

      		String[] returnArray = new String[10];
		for(int i = 0; i< array.length; i++) {
			if(array[i] != null) {
				returnArray[i] = array[i].getAnimalSkill();
			} else {
				break;
			}
		}
		return returnArray;
        }

		
        public void printAnimalSkills()
        {
            String[] skillArray = this.getAnimalSkills();
            StringBuilder printSkills = new StringBuilder();
            
            for(int i = 0; i < skillArray.length; i++){
                if(skillArray[i] != null){
                    printSkills.append(skillArray[i] + ", ");
                }
            }
            
            if(printSkills.charAt(printSkills.length()-1) == ' '){
                printSkills.delete(printSkills.length()-2, printSkills.length()-1);
            }
           
            System.out.println(printSkills.toString());
        }
		

        private AnimalSkill[] getAnimalSkillsEnhanced()
	{
		return skills;
	}

        public String getAnimalPhylum() {
            return animalPhylum;
        }

        public String getAnimalFamily() {
            return animalFamily;
        }

        public String getAnimalSpecies() {
            return animalSpecies;
        }

        public String getAnimalName() {
            return animalName;
        }
        
        public Rider getRider(){
            return animalRider;
        }
        
}

class Rider implements Cloneable{
        private String riderName;
        private int riderRegNumber;
        private int age;
        
        public Rider(){
            
        }
                
        public Rider(String riderName, int riderRegNumber, int age)
        {
            this.riderName = riderName;
            this.riderRegNumber = riderRegNumber;
            this.age = age;
        }
		
		public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }

        public void setRiderName(String riderName)
        {
            this.riderName = riderName;
        }
        
        public void setRiderRegNumber(int riderRegNumber)
        {
            this.riderRegNumber = riderRegNumber;
        }
        
        public void setAge(int age)
        {
            this.age = age;
        }
        
        public String getRiderName() {
            return riderName;
        }

        public int getRiderRegNumber() {
            return riderRegNumber;
        }

        public int getAge() {
            return age;
        }      
}

class AnimalSkill implements Cloneable {
	private String skill;
	private String level;

	public AnimalSkill(String skill, String level) {
		this.skill = skill;
		this.level = level;
	}

	public AnimalSkill() {
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void setAnimalSkill(String skill) {
		this.skill = skill;
	}

	public void setAnimalSkillLevel(String level) {
		this.level = level;
	}

	public String getAnimalSkillLevel() {
		return this.level;
	}

	public String getAnimalSkill() {
		return this.skill;
	}

}  
