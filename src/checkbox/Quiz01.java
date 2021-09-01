package checkbox;

import java.util.*;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Quiz01 extends Application{
	@Override
	public void start(Stage primaryStage) { 
		BorderPane borderPane = new BorderPane();
				
		HBox hboxTop = new HBox(20); //중간 라인의 패딩 20
		hboxTop.setPadding(new Insets(10,10,10,280));

		ArrayList<Label> lb = new ArrayList<>();
		lb.add(new Label("홈"));
		lb.add(new Label("사회"));
		lb.add(new Label("경제"));
		lb.add(new Label("국제"));
		lb.add(new Label("문화"));
		hboxTop.getChildren().addAll(lb);
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(20));
		TextField tf01 = new TextField();
		tf01.setPrefSize(100, 20);
		TextField tf02 = new TextField();
		tf02.setPrefSize(100, 20);
		Button bt03 = new Button("로그인");
		bt03.setPrefSize(60, 50);
		FlowPane flowBt03 = new FlowPane(bt03);
		flowBt03.setMaxSize(0, 0);
		flowBt03.setAlignment(Pos.CENTER);
		grid.getChildren().addAll(tf01,tf02);
		grid.setConstraints(tf01,0,0);//아이디
		grid.setConstraints(tf02,0,1);//비밀번호
		grid.add(flowBt03, 1,0,1,2);//로그인
		
		VBox vboxLeft = new VBox(10); 
		vboxLeft.setPadding(new Insets(10,10,10,10));
		
		ArrayList<Label> lb01 = new ArrayList<>();
		lb01.add(new Label("카테고리"));
		lb01.add(new Label("노트북/pc"));
		lb01.add(new Label("자동차용품"));
		lb01.add(new Label("휴대폰"));
		lb01.add(new Label("캐핑/낚시"));
		
		vboxLeft.getChildren().addAll(lb01);
		
		VBox vboxCenter = new VBox(10);
		vboxCenter.setMaxSize(500, 220);
		
		ArrayList<FlowPane> flowList = new ArrayList<>();
		
		flowList.add(new FlowPane(new Label("ID  "),new TextField()));
		flowList.add(new FlowPane(new Label("PW "),new TextField()));
		
		RadioButton rb1 = new RadioButton("여\t");
		RadioButton rb2 = new RadioButton("남");
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		rb1.setSelected(true);

		flowList.add(new FlowPane(rb1,rb2));

		CheckBox chk1 = new CheckBox("게임\t");
		CheckBox chk2 = new CheckBox("공부");

		flowList.add(new FlowPane(chk1,chk2));
		flowList.add(new FlowPane(new Label("하고 싶은 말")));
		TextArea ta = new TextArea();
		ta.setPrefSize(200, 50);
		flowList.add( new FlowPane(ta));

		vboxCenter.getChildren().addAll(flowList);
		
		
		borderPane.setTop(hboxTop);
		borderPane.setCenter(vboxCenter);
		borderPane.setLeft(vboxLeft);
		borderPane.setRight(grid);
		
		primaryStage.setTitle("Quiz3");
		primaryStage.setScene(new Scene(borderPane,500,300)); //배경 크기 설정
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}