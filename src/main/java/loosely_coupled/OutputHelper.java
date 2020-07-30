package loosely_coupled;

public class OutputHelper {
    IOutputGenerator output;
    public void GenOutput(){
        this.output.generateoutput();
    }
    public void setOutput(IOutputGenerator output){
        this.output = output;
    }
}
