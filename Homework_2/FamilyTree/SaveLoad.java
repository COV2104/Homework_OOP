class SaveLoad {
    GeoTree tree;
    public SaveLoad(GeoTree geoTree) {
        tree = geoTree;
    }

    
    public GeoTree load(String fileName) {
        // Считываем данные из файла fileName
        // и записываем данные в GeoTree tree
        return this.tree;
    }

    
    public boolean save(String fileName) {
        boolean result = false;
        // Записываем данные из GeoTree tree
        // в файл с именем fileName
        // и возвращаем результат записи
        return result;
    }
}