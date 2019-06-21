package org.apache.commons.statistics.regression.stored;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.stream.Stream;

import org.apache.commons.statistics.regression.util.array.ArrayUtils;
import org.junit.Test;

public class RegressionDataLoaderTest {
    
    private double[] yData3n = new double[] { 10, 11, 12 };
    private double[] yData4n = new double[] { 10, 11, 12, 13 };
    
    
//    private double[][] xData3p4n = new double[][] { { -5, -4, -3 }, { -2, -1, -0 }, { 1, 2, 3 }, { 4, 5, 7 } };
    private double[][] xData3p4n = new double[][] { { -2, -1, 0 }, { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    private double[][] xData2p3n = new double[][] { { 1, 2 }, { 3, 4 }, { 5, 7 } };
    private double[][] xData2p2n = new double[][] { { 1, 2 }, { 3, 4 } };

  

    @Test
    public void newSampleDataTest() {
        RegressionDataLoader data = new RegressionDataLoader();
        data.newSampleData(yData4n, xData3p4n);

        // Printing the testing arrays, before and after wrapped inside a
        // StatisticsMatrix object
//        ArrayUtils.printArrayWithStreams(yData);
//        ArrayUtils.printArrayWithStreams(xData);
//        ArrayUtils.printArrayWithStreams(ArrayUtils.matrixToArray1D(data.getInputData().getYData()));
//        ArrayUtils.printArrayWithStreams(ArrayUtils.matrixToArray2D(data.getInputData().getXData()));

        assertEquals(data.getInputData().getYData().get(1), 11, 0);
        assertEquals(data.getInputData().getXData().get(0, 0), -2, 0);
        assertEquals(data.getInputData().getXData().get(1, 1), 2, 0);

        assertTrue(Arrays.equals(ArrayUtils.matrixToArray1D(data.getInputData().getYData()), yData4n));
        assertArrayEquals(ArrayUtils.matrixToArray2D(data.getInputData().getXData()), xData3p4n);

    }

    @Test
    public void newYDataTest() {

    }

    @Test
    public void newXDataTest() {

    }

}
