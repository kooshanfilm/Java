/* Terminalogy :
	Constant: 
		the Value that never change.

	Final :
		when you add final to the constant variable 
	 this make sure that nobody is able to change it 

	Static:
		Let you to access to specific methods or fileds without 
		the need to creat an instance.*/

public class Constructors {
	
	 
	public static final int Max_Pez = 12;
	private String mcharactername ;
	private int mPezcount ;


	public Constructors(String characterName){
		mcharactername = characterName;
		mPezcount = 0 ;
	}
	public boolean dispense(){
		boolean wasDispensed = false;
		if (!isEmpty()){
			mPezcount--;
			wasDispensed = true;
		}
		return wasDispensed;
	}

	public String getcharactername{
		return mcharactername;
	}

	public boolean isEmpty(){
		return mPezcount == 0;
		
	}
	// when a  function doesn't return any data
	// we user Void 
	public void load(){
		mPezcount = Max_Pez;

	}
}

