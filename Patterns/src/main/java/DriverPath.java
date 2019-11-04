public class DriverPath extends AbstractDriverPath{

    private String filePath;

    DriverPath(){
        setFilePath(getDriverPath());
    }

    DriverPath(String driverPath){
        setFilePath(driverPath);
    }

    String getFilePath() {
        return filePath;
    }

    private void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
