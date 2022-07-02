//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//public class StructuresGUI extends Application implements EventHandler<ActionEvent> {
//
//	public static void main(String[] args) {
//		launch(args);
//	}
//
//	@Override
//	public void start(Stage primaryStage) {
//
//		try {
//			GridPane grPane = new GridPane();
//			grPane.setPadding(new Insets(10, 10, 10, 10));// create gap between Nodes
//			grPane.setVgap(8);
//			grPane.setHgap(10);
////			grPane.setAlignment(Pos.CENTER);
//			grPane.setStyle("-fx-background-color: #DCDCDC;");
//
//			primaryStage.setTitle("Date Structures");
//
//			Scene scene = new Scene(grPane, 900, 900);
//
//			Label valuelb = new Label("Value");
//			GridPane.setConstraints(valuelb, 0, 0);
//			valuelb.setFont(new Font(15));
//			valuelb.setStyle("-fx-font-weight: bold");
//
//			TextField valueTe = new TextField();
//			GridPane.setConstraints(valueTe, 0, 1);
//			valueTe.setFont(new Font(15));
//			valueTe.setMaxWidth(50);
//
//			Label indexlb = new Label("Index");
//			GridPane.setConstraints(indexlb, 0, 2);
//			indexlb.setFont(new Font(15));
//			indexlb.setStyle("-fx-font-weight: bold");
//
//			TextField indexTe = new TextField();
//			GridPane.setConstraints(indexTe, 0, 3);
//			indexTe.setFont(new Font(15));
//			indexTe.setMaxWidth(50);
//
//			Button insertBt = new Button("Insert");
//			GridPane.setConstraints(insertBt, 0, 4);
//			insertBt.setMaxWidth(Double.MAX_VALUE);
//			insertBt.setMinHeight(33);
//
//			Button deleteBt = new Button("Delete");
//			GridPane.setConstraints(insertBt, 0, 5);
//			deleteBt.setMaxWidth(Double.MAX_VALUE);
//			deleteBt.setMinHeight(33);
//
//			Button findBt = new Button("Find");
//			GridPane.setConstraints(insertBt, 0, 6);
//			findBt.setMaxWidth(Double.MAX_VALUE);
//			findBt.setMinHeight(33);
//
//			grPane.getChildren().addAll(valuelb, valueTe, indexlb, indexTe, insertBt, deleteBt, findBt);
//
//			primaryStage.setScene(scene);
//			primaryStage.show();
//
//		}
//
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	@Override
//	public void handle(ActionEvent arg0) {
//		// TODO Auto-generated method stub
//
//	}
//}
