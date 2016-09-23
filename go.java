class go{
	public static void main(String[] args){
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if((10*i+j)+(10*j+i)==99)
					System.out.println(+i +","+j);
			}
		} 
	}
}