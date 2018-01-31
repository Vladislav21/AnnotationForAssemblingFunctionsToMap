package task;

public class IncrementingSpectraPoints implements Algorithm {
    @Override
    public Spectra run(Spectra spectra) {
        Spectra resultSpectra = new Spectra();
        for (Point point : spectra.getPoints()) {
            resultSpectra.getPoints().add(new Point(point.getX() + 1, point.getY() + 1));
        }
        return resultSpectra;
    }
}
