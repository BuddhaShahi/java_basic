public class callByReference {


    int data = 50;
     void changes(callByReference cd){

        cd.data = cd.data + 100;

     }
     public static void main(String[] args) {
        
        callByReference op = new callByReference();

        System.out.println(" before change"+op.data);
        op.changes(op);
        System.out.println("after change"+ op.data);
     }


    
}
