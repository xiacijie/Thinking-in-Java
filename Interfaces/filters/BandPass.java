package filters;

public class BandPass extends Filter {
    double lowCutoff, highCutoff;
    public BandPass (double lowCut, double highCut){
        lowCutoff = lowCut;
        highCutoff = highCut;
    }

    public Waveform proces(Waveform input){
        return input;
    }
}
