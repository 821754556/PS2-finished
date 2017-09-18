package base;

public class MyInteger {
	private int iValue;
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	
	}

	public int getIvalue() {
		return iValue;
	}

	public void setIvalue(int iValue) {
		this.iValue = iValue;
	}
	public boolean isEven() {
	if(iValue%2==0)
		return true;
	else
		return false;
	}
	
    public static boolean isEven(int iValue) {
    	MyInteger myInt = new MyInteger(iValue);
    	 
    	return myInt.isEven();
    }
    public boolean isOdd() {

    	return !isEven();
    }
   public boolean isEquals(int iValue) {
	   if(this.iValue == iValue)
          return true;
	   else
		   return false;

   }
   public boolean isPrime() {
	   
	   for (int i=2;i<iValue;i=i+1) {
		   if(iValue%i == 0) {
			   return false;
		   }
	   }
	   return true;
   }
   public static boolean isOdd(int iValue) {
	   MyInteger myInt = new MyInteger(iValue);
	   return myInt.isOdd();
   }
   public static boolean isPrime(int iValue) {
	   MyInteger myInt = new MyInteger(iValue);
	   return myInt.isPrime();
   }
   public static boolean isEven(MyInteger x) {
	   return x.isEven();
   }
   public static boolean isOdd(MyInteger x) {
	   return x.isOdd();
   }

   public static boolean isPrime(MyInteger x) {
	   return x.isPrime();
   }

  public boolean equals(int lol) {
	  if (lol == iValue) {
		  return true;
	  }
	  else {
		  return false;
	  }
	  
  }

  public boolean equals(MyInteger lol) {
	  return equals(lol.getIvalue());
  }
}


