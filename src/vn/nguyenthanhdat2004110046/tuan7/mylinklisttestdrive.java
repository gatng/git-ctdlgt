package vn.nguyenthanhdat2004110046.tuan7;

public class mylinklisttestdrive {
    public static void main(String[] args) {
       mylinkedlist myLinkedList = new  mylinkedlist();
        myLinkedList.add(4);
        myLinkedList.add(8);
        myLinkedList.add(5);
        System.out.println("danh sách ban đầu");
        myLinkedList.print();

        System.out.println("Sau khi thêm 1 nút vào cuối : 7");
        myLinkedList.add(9);
        myLinkedList.print();

        System.out.println("Sau khi thêm vào đầu danh sách : 8");
        myLinkedList.addHead(5);
        myLinkedList.print();

        System.out.println("Thêm vào trước số cần tìm trong danh sách : thêm 7 trước 4");
        myLinkedList.addAfter(3,7);
        myLinkedList.print();

        System.out.println("xóa nút đầu danh sách");
        myLinkedList.deleteHead();
        myLinkedList.print();

        System.out.println("xóa cuối danh sách");
        myLinkedList.deleteTail();
        myLinkedList.print();

        System.out.println("xóa vị số bất kỳ trong danh sách:  4");
        myLinkedList.delete(4);
        myLinkedList.print();

        System.out.println("sửa số 8 thành số 1");
        myLinkedList.fix(8, 1);
        myLinkedList.print();
    }
}
