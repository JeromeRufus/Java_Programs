package selfassement;

public class ObjectReturn {
	
	public  Profeesor objectreturn() {
		Student ref = new Student();
		ref.setProfessor(new Profeesor());
		Profeesor obj = ref.getProfeesor();
		obj.setName("lijo");
		obj.setSubject("java");
		return obj;
		
		
	}

}
