package logical;

public class ReverseString {

	public static void main(String[] args) {

         String s="ABCD";
         
      /*   String rev="";
         
        int lastindex = s.length()-1;
          System.out.println(lastindex);     
    
         for(int i=lastindex;i>=0;i--) {
        	 
        	    rev=rev+s.charAt(i);
        	
         }
         System.out.print(rev);
*/
         
         
    //by using array
   /*      
         char a[]=s.toCharArray();
         
          int lastindex = a.length-1;
          
          String rev="";
          
          for(int i=lastindex;i>=0;i--) {
        	   rev =rev+a[i];
          }
        
             
			System.out.print(rev);
         
	*/		
			
  //by using StringBuffer
			
	//		StringBuffer sb=new StringBuffer(s);
			
		//	System.out.println(sb.reverse());
         
     
//by using stringBuilder
			
			StringBuilder sb=new StringBuilder(s);
			
			System.out.println(sb.reverse());
			
         
	}
	

         
         
         
	
	
	
}
