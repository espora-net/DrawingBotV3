package drawingbot.geom.basic;

import drawingbot.drawing.ObservableDrawingPen;
import drawingbot.geom.GeometryUtils;

import java.awt.geom.Point2D;

public interface IPathElement extends IGeometry {

    void addToPath(boolean addMove, GPath path);

    Point2D getP1();

    Point2D getP2();
}
