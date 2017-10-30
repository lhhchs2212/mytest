public Class TestThread extends Thread{
	public run(){
		sys.print("TestThread");
	}
	
	private testRun(){
		int i = 0;
		if(i==0){
			sys.print(i);
		}
	}
}