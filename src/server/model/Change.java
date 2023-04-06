package server.model;

import java.util.Map;

public class Change {
    private int[][] deletedData;
    private Map<int[][], Object> addedData;

    public Change(int[][] deletedData, Map<int[][], Object> addedData) {
        this.deletedData = deletedData;
        this.addedData = addedData;
    }

    public int[][] getDeletedData() {
        return deletedData;
    }

    public void setDeletedData(int[][] deletedData) {
        this.deletedData = deletedData;
    }

    public Map<int[][], Object> getAddedData() {
        return addedData;
    }

    public void setAddedData(Map<int[][], Object> addedData) {
        this.addedData = addedData;
    }
}
