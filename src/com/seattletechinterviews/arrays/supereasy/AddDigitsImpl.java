package com.seattletechinterviews.arrays.supereasy;

public class AddDigitsImpl implements AddDigits{
	public int addDigits(int num){
	       // put number into String to get length
	       String numberStr = String.valueOf(num);
	       int sum = 0;

	       if(numberStr.length() == 1){
	           return Integer.parseInt(numberStr);
	       }
	       // put String into int array
	       int [] numberArr = new int[numberStr.length()];
	       for (int i = 0; i < numberArr.length; i++){
	           numberArr[i] = Character.getNumericValue(numberStr.charAt(i));
	       }

	       // add each int to the next one
	       for (int j = 0; j < numberArr.length; j++){
	           sum += numberArr[j];
	       }
	       if (String.valueOf(sum).length() > 1) {
	           return addDigits(sum);
	       }

	       return sum;

	   }
	
	public static void main(String args[]){
		int x =380;
		AddDigitsImpl impl = new AddDigitsImpl();
		System.out.println(impl.addDigits(x));
	}

}
