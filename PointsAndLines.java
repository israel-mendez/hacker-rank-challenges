class LineList implements ListOfLines {
    private Vector<Line> list_of_lines;

    LineList(Vector<Line> lines) {
        this.list_of_lines = lines;
    }

    public Vector<Line> getLinesFromStartingPoint(Point p) {
        Vector<Line> startingLines = new Vector<Line>();
        for (Line line : list_of_lines) {
            if (line.getStart().getX() == p.getX() && line.getStart().getY() == p.getY()) {
                startingLines.add(line);
            }
        }
        return startingLines;
    }

    public Line getLineWithMaxLength() {
        Line maxLine = list_of_lines.get(0);
        for (Line line : list_of_lines) {
            if (line.getLineLength() > maxLine.getLineLength()) {
                maxLine = line;
            }
        }
        return maxLine;
    }
}