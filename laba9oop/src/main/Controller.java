package main;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class Controller {
    @FXML private  Label maxmin;
    @FXML private Label sum;
    @FXML private Label arsum;
    @FXML private TextField cField;
    @FXML private Label countf;
    @FXML private TextField aField;
    @FXML private TextField bField;
    private Calculate calculate;

    public void initialize() {calculate = new Calculate();}

    public void exit() {
        Platform.exit();
    }

    public void about() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Первая графа - a. Вторая графа - b. Третья графа - шаг");
        alert.setTitle("О программе");
        alert.setHeaderText("");
        alert.show();
    }


    public void calsum() {
        double a = Double.parseDouble(aField.getText());
        double b = Double.parseDouble(bField.getText());
        double step = Double.parseDouble(cField.getText());
        int count = calculate.distanceTo(a,b,step);
        countf.setText(String.format("Шаг решения: %d", count));
        ArrayList<Point> list = calculate.getXY(a, b, step);
        Point max = calculate.foundmax(list);
        Point min = calculate.foundmin(list);
        maxmin.setText(String.format("Максимальное: x = %f, y = %f, минимальное: x = %f, y = %f", max.getX(), max.getY(), min.getX(), min.getY()));
        double sum1 = calculate.sum(list);
        sum.setText(String.format("Сумма значений функций: %f", sum1));
        double sred = sum1/list.size();
        arsum.setText(String.format("Среднее: %f", sred));
    }

}
