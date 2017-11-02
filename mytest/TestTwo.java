/** 
     * 重置序列号，从1开始 
     */  
    protected void resetSerialNum() throws Exception {  
        this.serialNum = 1;  
        intervalMax = serialNum + interval;  
        updateStartNum(intervalMax);  
    }  
	
	
	 /** 
     * 是否是最大值 
     * @param num 
     * @return 
     */  
    private boolean isMax(int num) {  
        return num >= maxNum;  
    }  
      
    public int getInterval() {  
        return this.interval;  
    }  
      
    public int getMaxNum() {  
        return this.maxNum;  
    }


		public int getMaxNum() {  
        return this.maxNum;  
    }  
	
	getMyFirstName(){
		return myFirstName;
	}