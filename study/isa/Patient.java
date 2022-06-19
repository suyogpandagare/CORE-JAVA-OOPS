package study.isa;

import study.hasa.MyDate;

public class Patient extends Person{

	private String bloodGroup;
	private String bloodPressure;
	private int heartRate;
	
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Patient)
		{
			Patient tmp = (Patient)obj;
			if(this.bloodGroup.equals(tmp.bloodGroup) &&
				this.bloodPressure.equals(tmp.bloodPressure)
				&& this.heartRate == tmp.heartRate 
				&& this.getName().equals(tmp.getName()) 
				&& this.getDob().equals(tmp.getDob()))
				return true;
			else
				return false;
		}
		return false;
		
	}
	
	public Patient()
	{
		
	}
	
	public Patient(String bg, String bp, int hr, String name, MyDate dob )
	{
		super(name, dob);
		this.bloodGroup = bg;
		this.bloodPressure = bp;
		this.heartRate = hr;
	}
	
	
	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public int getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	//WE R OVERRIDING DEFAULT TOSTRING
	public String toString()
	{
       String str = " ";
       str += super.toString()+"Blood Group = "+bloodGroup+" Blood Pressure = "+bloodPressure+" Heart Rate = "+heartRate;
       return str;
	}
}
