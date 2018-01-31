package task;

public class MultiplyingSpectraPointsToFive implements Algorithm {
    @Override
    public Spectra run(Spectra spectra) {
        Spectra resultSpectra = new Spectra();
        for (Point point : spectra.getPoints()) {
            resultSpectra.getPoints().add(new Point((point.getX()) * 5, (point.getY()) * 5));
        }
        return resultSpectra;
    }
}
