package task;

public class AddingSpectraPointsToTwo implements Algorithm {

    @Override
    public Spectra run(Spectra spectra) {
        Spectra resultSpectra = new Spectra();
        for (Point point : spectra.getPoints()) {
            resultSpectra.getPoints().add(new Point(point.getX() + 2, point.getY() + 2));
        }
        return resultSpectra;
    }

}
