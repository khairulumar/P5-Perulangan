public class ExContinueLabel {

    public static void main (String[] args){
        outerLoop:
        for (int i=0; i<5; i++){
            for ( int j=0; j<5; j++){
                //massage1
                System.out.println("Inside for(j) Loop");
                if (j==2) continue outerLoop;
            }
            //massage2
            System.out.println("Inside for(i) Loop");
        } 
    }
}