package storage;

import model.Material;

import java.io.IOException;
import java.util.List;

public class ReadWriteFileExcel implements IReadWriteFIle {
    @Override
    public boolean writeFile(List<Material> materials) throws IOException {
        return false;
    }

    @Override
    public List<Material> readFile() {
        return null;
    }
}
