package views;

import controller.MaterialManager;
import model.Bot;
import model.Material;
import model.Meat;
import storage.ReadWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static List<Material> materials = ReadWriteFile.readFile();

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
//        System.out.println(materials);
//        ka.addNewMaterial(new Bot());
//        System.out.println(materials);
        System.out.println(materials);
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
