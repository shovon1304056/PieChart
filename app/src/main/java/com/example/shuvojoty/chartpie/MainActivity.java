package com.example.shuvojoty.chartpie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int values[]={154,129};
    String part[]={"used","free"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupPiechart();
    }

    private void setupPiechart() {
        //generate list
        List<PieEntry> pieEntries = new ArrayList<>();
        for(int i =0;i<values.length;i++)
        {
            pieEntries.add(new PieEntry(values[i],part[i]));
        }
        PieDataSet dataSet= new PieDataSet(pieEntries,"this is chart");

        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        PieData data = new PieData(dataSet);

        //getting chart
        PieChart chart=(PieChart) findViewById(R.id.chart);
        chart.setData(data);


        chart.animateY(1000);

        chart.invalidate();


    }
}
