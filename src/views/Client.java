package views;

import controller.MaterialManager;
import model.Bot;
import model.Material;
import model.Meat;
import storage.IReadWriteFIle;
import storage.ReadWriteFile;
import storage.ReadWriteFileExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static IReadWriteFIle readWriteFIle = new ReadWriteFileExcel();
    public static List<Material> materials = readWriteFIle.readFile();

//    static {
//        try {
//            materials = ReadWriteFile.readFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static MaterialManager ka = new MaterialManager(materials);

    public static void main(String[] args) {
        TongGiamDoc w1 = TongGiamDoc.getInstance();
        TongGiamDoc w2 = TongGiamDoc.getInstance();
        w2.duyetLuong();
        w1.duyetLuong();
        System.out.println(w1.hashCode());
        System.out.println(w2.hashCode());
    }

    public static int giaithua1(int n){
        int r = 1;
        for (int i = 2; i < n; i++) {
            r*=i;
        }
        return r;
    }

    public static int giaithua2(int n){
        if (n<=1) return 1;
        return n*giaithua2(n-1);
    }

//    n!= n*(n-1)!

    public static Material createNewMaterial(){
//        nhap xuat du lieu
//        1. thit, 2. Bot
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao id....");
        return new Meat();
    }


}
