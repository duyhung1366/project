

public class bai22 {
    //Viết chương trình in ra tổng của 10 số chẵn đầu tiên (sử dụng vòng lặp for hoặc while).
    public static void main(String[] args) {
        int result = 0 ; 
        for(int i = 1; i<= 10; i++){ 
            result += i*2 ;
        }
        System.out.println("tong cua 10 so chan dau tien la : " + result);
    }
}
