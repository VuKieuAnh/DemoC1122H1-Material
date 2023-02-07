package controller;

import model.Material;
import storage.ReadWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MaterialManager {
    //luu tru du lieu
    List<Material> materialList = new ArrayList<>();

    public List<Material> getMaterialList() {
        return materialList;
    }

    public MaterialManager(List<Material> materialList) {
        this.materialList = materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
    }

    //CRUD Material
    public void addNewMaterial(Material material){
//        khong chua hoat dong nhap xuat du lieu
        materialList.add(material);
        try {
            ReadWriteFile.writeFile(materialList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteById(int id){
        materialList.remove(id);
        try {
            ReadWriteFile.writeFile(materialList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public double getDifference(){
        double total = 0;
        for (int i = 0; i < materialList.size(); i++) {
            total+= materialList.get(i).getCost() - materialList.get(i).getRealMoney();
        }
        return total;
    }

}
