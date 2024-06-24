package PropertiesOOP;

public class Encapsulation {
	class Person {
		private String ID;
		public String name;
		public String getID() {
			return ID;
		}
		public void setID(String ID) {
			this.ID = ID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
}
