package storage;

import model.Material;

import java.io.IOException;
import java.util.List;

public interface IReadWriteFIle {
    boolean writeFile(List<Material> materials) throws IOException;
    List<Material> readFile();
}
