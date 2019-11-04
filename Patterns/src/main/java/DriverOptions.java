public class DriverOptions extends AbstractDriverOptions{

    private boolean headlessMode;

    DriverOptions(){

        setHeadlessMode(false);
    }

    DriverOptions(boolean isHeadless){

        setHeadlessMode(isHeadless);
    }

    public void setHeadlessMode(boolean headlessMode) {
        this.headlessMode = headlessMode;
    }

    public boolean getHeadlessMode(){
        return !this.headlessMode;
    }
}
