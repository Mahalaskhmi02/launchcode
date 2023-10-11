import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class SalesAndCodingChart extends Application {

    @Override
    public void start(Stage stage) {
       
        CategoryAxis salesXAxis = new CategoryAxis();
        NumberAxis salesYAxis = new NumberAxis();
        BarChart<String, Number> salesBarChart = new BarChart<>(salesXAxis, salesYAxis);
        salesBarChart.setTitle("Monthly Sales");
        salesBarChart.setLegendVisible(false);

        
        CategoryAxis codingXAxis = new CategoryAxis();
        NumberAxis codingYAxis = new NumberAxis();
        LineChart<String, Number> codingLineChart = new LineChart<>(codingXAxis, codingYAxis);
        codingLineChart.setTitle("Monthly Coding Activity");

        XYChart.Series<String, Number> salesSeries = new XYChart.Series<>();
        salesSeries.getData().add(new XYChart.Data<>("January", 250));
        salesSeries.getData().add(new XYChart.Data<>("February", 240));
        salesSeries.getData().add(new XYChart.Data<>("March", 70));
        salesSeries.getData().add(new XYChart.Data<>("April", 230));
        

        XYChart.Series<String, Number> codingSeries = new XYChart.Series<>();
        codingSeries.getData().add(new XYChart.Data<>("January", 150));
        codingSeries.getData().add(new XYChart.Data<>("February", 160));
        codingSeries.getData().add(new XYChart.Data<>("March", 10));
        codingSeries.getData().add(new XYChart.Data<>("April", 30));
        
        salesBarChart.getData().add(salesSeries);
        codingLineChart.getData().add(codingSeries);

       
        Scene scene = new Scene(salesBarChart, 800, 600);
        scene.getStylesheets().add(getClass().getResource("chartStyles.css").toExternalForm());

        
        stage.setTitle("Sales and Coding Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
