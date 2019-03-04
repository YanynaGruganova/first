package by.bntu.fitr.povt.javaLabs.lab10.model.entity;


public class Magaz {

	private String name;
	private Sweetness[] magaz;
	
	 public Magaz(){}

	 public Magaz(String name, Sweetness... magaz) {
	        this.name = name;
	        this.magaz = magaz;
	    }
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sweetness[] getmagaz() {
        return magaz;
    }

	public void setmagaz(Sweetness[] magaz) {
        this.magaz = magaz;
    }

	@Override
	public String toString() {
		StringBuilder msg=new StringBuilder("List of sweetness:\n");
		
		for (int i=0;i<magaz.length;i++) {
			msg.append(magaz[i]).append("\n");
		}
		return msg.toString();
		//return "Magaz [magaz=" + Arrays.toString(magaz) + ", count=" + count + "]";
	}
	
	public void add(Sweetness sweetness){
		Sweetness[] newArray = new Sweetness[magaz.length + 1];

        System.arraycopy(magaz, 0, newArray , 0, magaz.length);
        newArray [magaz.length] = sweetness;

        magaz = newArray ;
    }
	
	public void remove(Sweetness sweetness){
        if (isAtMagaz(sweetness)){
        	Sweetness[] newArray = new Sweetness[magaz.length - 1];

            for (int i = 0, j = 0; i < magaz.length; i++, j++){
                if (!(sweetness.equals(magaz[i]))){
                	newArray [j] = magaz[i];
                } else {
                    j--;
                }
            }
            magaz = newArray ;
        }
    }
	
	 public boolean isAtMagaz(Sweetness sweetness){
	        if (sweetness == null){
	            return false;
	        }

	        for (Sweetness sweetness1 : magaz){
	            if (sweetness.equals(sweetness1)){
	                return true;
	            }
	        }
	        return false;
	    }
	 
	 public void replaceByIndex(Sweetness sweetness, int index){
	        if (sweetness == null || (index > magaz.length - 1 || index < 0)){
	            return;
	        }

	        magaz[index] = sweetness;
	    }
}
