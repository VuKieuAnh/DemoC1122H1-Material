package storage;

import model.Material;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static boolean writeFile(List<Material> materials) throws IOException {
        File file = new File("material.dat");
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream fos = new ObjectOutputStream(os);
        fos.writeObject(materials);
        fos.close();
        os.close();
        return true;
    }

    public static List<Material> readFile()  {
        File file = new File("material.dat");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(inputStream);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (objectInputStream != null) {

                List<Material> list = null;
                try {
                    list = (List<Material>) objectInputStream.readObject();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
                return list;
            }
            else {
                return new ArrayList<>();
            }
        }

    }
}
