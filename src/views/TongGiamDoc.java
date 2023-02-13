package views;

public class TongGiamDoc {
//    1. private constructor

    private TongGiamDoc() {
    }

//2. Tạo 1 instance static
    private static TongGiamDoc instance;
//3. Viết phương thức getInstance

    public static TongGiamDoc getInstance(){
        if (instance == null){
            instance = new TongGiamDoc();
        }
        return instance;
    }

    public void duyetLuong(){

    }

    public static void main(String[] args) {

    }
}
