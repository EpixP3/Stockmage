package com.f4pl0.stockmageandroid;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GraphView graph = (GraphView) findViewById(R.id.graphview);
        DataPoint[] points = new DataPoint[100];
        for (int i = 0; i < points.length; i++) {
            points[i] = new DataPoint(i, Math.sin(i*0.5));
        }
        
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(points);
        series.setColor(Color.GREEN);
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(-150);
        graph.getViewport().setMaxY(150);
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(4);
        graph.getViewport().setMaxX(80);
        graph.getViewport().setScalable(true);
        graph.getViewport().setScalableY(true);
        graph.addSeries(series);

    }
}
