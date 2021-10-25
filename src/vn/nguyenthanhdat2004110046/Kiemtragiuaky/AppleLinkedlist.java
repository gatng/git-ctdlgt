package vn.nguyenthanhdat2004110046.Kiemtragiuaky;

import java.net.IDN;

public class AppleLinkedlist {
    Apple2 head = null;
    Apple2 tail = null;

    public AppleLinkedlist(){}
    
     
    void add(int ID, int khoiluong, String color){
        
        Apple2 newApple2 = new Apple2(ID, khoiluong, color, newApple2);


        if(head == null){ 
            head = newApple2;
            tail = newApple2;
        }else{ 
            tail.moi = newApple2;
            tail = newApple2;
        }
    }

    void remve(){

    }
    void print(){
         Apple2 cur =head;

         if(head==null){
             System.out.println("danh sách rỗng");
             return;
         }
         System.out.println("các nút trong danh sách");
         while(cur != null){
             System.out.println(cur.ID);
             System.out.println(cur.khoiluong);
             System.out.println(cur.color);

             cur = cur.moi;  
         }
    }
    void find(){

    }
      
    void push(int new_data) {
        Object new_ID_;
     
    Apple2 newApple2 = new Apple2(new_data); 
  
     
    newApple2.moi = head; 
  
   
    head = newApple2; 
    }

    
}
