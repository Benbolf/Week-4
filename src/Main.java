
    
		
		//Question 1// 
         int[] ages = {3, 9, 23, 64, 2, 8, 28,93};
		int lengthOfArr = ages.length;
		lengthOfArr = newAges.length;
		newAges[lengthOfArr - 1] = 100;
		difference = Math.abs(newAges[lengthOfArr - lengthOfArr] - newAges[lengthOfArr - 1]);
		System.out.println("The Average = " + difference);
		int sum = 0;
		for (int i = 0; i < newAges.length; i++) {
			sum += newAges[i];
		}
		double average = sum / lengthOfArr;
		System.out.println("The average age in newAges = " + average );
		
		
		//Question 2//
		 
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		average = sum / names.length;
		System.out.println("The average number of letters per name in names[] = " + average );
		
		String allNames = "";
		for (int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println(allNames);
		
		//Question 3//
		
		System.out.println("Use array[arr.length-1] to access the last element inside an array");
		
		//Question 4//
		
		System.out.println("Use array[0] to access the first element inside an array");
		
		//Question 5//
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
		}
		
		//Question 6//
		
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println("The sum of length of names in nameLengths[] = " + sum);
		
		//Question 7//
		
		System.out.println(duplicateWord("Hello", 3));
		
		//Question 8//
		
		
        int firstName = "Clark";
        int lastName = "Kent";
        getFullName = (firstName + " "  + lastName);
		System.out.println(getFullName("Clark", "Kent"));
		
		
		//Question 9//
		
		System.out.println("checkIfSumGreaterThan100() returns => " + checkIfSumGreaterThan100());
		
		
		//Question 10
	  
		
		double[] doubleArr = {0.1, 1.0, 236.4592, 1000.1};
		double[] emptyDoubleArr = {};
		System.out.println("getAverageOfDoubleArr() returns => " + getAverageOfDoubleArr(doubleArr));
		System.out.println("double[] to getAverageOfDoubleArr() returns => " + getAverageOfDoubleArr(emptyDoubleArr));
		
		//Question 11//
		
		double[] anotherDoubleArr = {2.2, 3.3, 4.4, 5.5};
		System.out.println("isFirstArrAvgGreater returns => " + isFirstArrAvgGreater(doubleArr, anotherDoubleArr));
		
		
		//Question 12//
		
		
	     int milesTillEmpty = 20;
	     when  milesTillempty =< (20);
	     System.out.println( "Get more gas now.");
	     
		
		
		
		
		
		
		