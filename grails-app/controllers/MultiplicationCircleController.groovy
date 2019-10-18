class MultiplicationCircleController {

    def index(MultiplicationCircleModel circleModel) {
        circleModel.lines = []

        for(int i = 0; i< circleModel.segmentCount; i++) {
            circleModel.lines.add( new Line (
                x1: xValueOf(circleModel.radius, i, circleModel.segmentCount),
                y1: yValueOf(circleModel.radius, i, circleModel.segmentCount),
                x2: xValueOf(circleModel.radius, i * circleModel.tableBase, circleModel.segmentCount),
                y2: yValueOf(circleModel.radius, i * circleModel.tableBase, circleModel.segmentCount)
            ))
        }
        render view:"show", model:[circleInstance: circleModel]
    }

    private static double arc(int segment, int segmentCount) {
        2 * Math.PI * segment / segmentCount
    }
    def xValueOf(int radius, int segment, int segmentCount) {
        return radius + Math.cos(arc(segment, segmentCount)) * radius
    }
    def yValueOf(int radius, int segment, int segmentCount) {
        return radius + Math.sin(arc(segment, segmentCount)) * radius
    }
}

class MultiplicationCircleModel {
    int radius = 200
    int segmentCount = 10
    int tableBase = 2

    List<Line> lines = Collections.EMPTY_LIST
}

class Line {
    double x1, y1, x2, y2
}
