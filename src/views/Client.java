package views;

import controller.MaterialManager;
import model.Material;
import model.Meat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static List<Material> materials = new ArrayList<>();
    public static MaterialManager ka = new MaterialManager(materials);

    public static void main(String[] args) {
        //menu
        //1. tao moi
        //2. xoa
        //0. thoat
        //3. hien thi danh sach
        //4. tinh chenh lech
        System.out.println("Chenh lech la "+ ka.getDifference());

        ka.addNewMaterial(
                createNewMaterial()
                );
    }

    public static Material createNewMaterial(){
//        nhap xuat du lieu
//        1. thit, 2. Bot
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao id....");
        return new Meat();
    }
}
