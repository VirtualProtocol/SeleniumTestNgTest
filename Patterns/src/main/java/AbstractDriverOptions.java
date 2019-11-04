public abstract class AbstractDriverOptions
{
    private boolean headlessMode;

    public void setHeadlessMode(boolean isHeadless)
    {
        this.headlessMode = isHeadless;
    }

    public boolean getHeadlessMode()
    {
        return this.headlessMode;
    }
}
