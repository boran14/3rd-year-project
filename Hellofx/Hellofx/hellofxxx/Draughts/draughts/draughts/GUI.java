package draughts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.*;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class GUI extends Application {
	private static Draughts g;
	public Pane p;
	public Pane pane;
	public Scene scene1;
	public Scene scene2;
	public Stage window;
	public Button originButton;
	public Button destinationButton;
	public TextField origin;
	public TextField destination;
	Alert alert;
	Button SaveButton;
	public int count = 0;
	public int x = 0;
	public int y = 0;
	public double s = 75; // side of rectangle
	FileInputStream inputstream_initial;
	Image image;
	public ArrayList<ArrayList<Rectangle>> rectangles = new ArrayList<ArrayList<Rectangle>>();
	public ArrayList<ArrayList<Circle>> circles = new ArrayList<ArrayList<Circle>>();
	public ArrayList<ArrayList<Image>> imagess = new ArrayList<ArrayList<Image>>();
	public ArrayList<Image> images = new ArrayList<Image>();
	public ArrayList<Circle> possiblePoints = new ArrayList<Circle>();
	ArrayList<ArrayList<Integer>> moveable = new ArrayList<ArrayList<Integer>>();
	CheckInput ch = new CheckInput();
	EventHandler<MouseEvent> eventHandler;
	EventHandler<MouseEvent> eventHandler1;
	EventHandler<MouseEvent> eventHandler2;
	public boolean isSelected = false;
	public Piece selectedPiece;
	ImageView selectedMen;
	public ArrayList<ArrayList<Integer>> eatable = new ArrayList<ArrayList<Integer>>();
	// public int turn_count;

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;

		pane = new Pane();
		try {
			pane.setBackground(new Background(
					new BackgroundImage(
							new Image("https://images4.alphacoders.com/109/1094711.jpg"),
							BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
							new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
							new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
		} catch (Exception e) {
			e.printStackTrace();
		}
		pane.setId("pane");
		Button buttonNew = new Button("New Draughts");
		buttonNew.setLayoutX(200);
		buttonNew.setLayoutY(30);
		buttonNew.setOnAction(e -> {
			try {
				g = new Draughts();

			} catch (Exception e1) {
				e1.printStackTrace();
			}

			RenderBoard();

			window.setTitle("Draughts");
			window.setScene(scene2);

			Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
			window.setX((screenBounds.getWidth() - window.getWidth()) / 2);
			window.setY((screenBounds.getHeight() - window.getHeight()) / 2);

			// playGame();
		});

		Button buttonLoad = new Button("Load Draughts");
		buttonLoad.setLayoutX(200);
		buttonLoad.setLayoutY(120);
		buttonLoad.setOnAction(e -> {
			try {
				Load l = new Load("SavedGame.txt");
				g = l.getLoad();

			} catch (Exception e1) {
				e1.printStackTrace();
			}

			RenderBoard();

			window.setTitle("Draughts");
			setSceneGame();
		});

		// Create a scene and place it in the stage
		Menu menu = new Menu("Options");
		Menu submenu = new Menu("Draughts");
		MenuItem menuItem1 = new MenuItem("New Draughts");
		menuItem1.setOnAction(e -> {
			try {
				g = new Draughts();

			} catch (Exception e1) {
				e1.printStackTrace();
			}

			RenderBoard();

			window.setTitle("Draughts");
			window.setScene(scene2);

			Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
			window.setX((screenBounds.getWidth() - window.getWidth()) / 2);
			window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
		});
		MenuItem menuItem2 = new MenuItem("Load Draughts");
		menuItem2.setOnAction(e -> {
			try {
				Load l = new Load("SavedGame.txt");
				g = l.getLoad();

			} catch (Exception e1) {
				e1.printStackTrace();
			}

			RenderBoard();

			window.setTitle("Draughts");
			setSceneGame();
		});
		submenu.getItems().add(menuItem1);
		submenu.getItems().add(menuItem2);
		menu.getItems().add(submenu);
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu);
		VBox vBox = new VBox(menuBar);
		pane.getChildren().add(vBox);
		scene1 = new Scene(pane, 500, 500);
		window.setTitle("Menu");
		window.setScene(scene1); // Place in scene in the stage
		window.show();

	}

	private void setSceneGame() {
		window.setScene(scene2);

		Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
		window.setX((screenBounds.getWidth() - window.getWidth()) / 2);
		window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
	}

	private void playGame() {

	}

	private void RenderBoard() {
		// Create a GridPane
		try {
			// GridPane pane = new GridPane();
			p = new Pane();

			// Create 100 rectangles and add to pane
			count = 0;
			x = 0;
			y = 0;
			s = 75; // side of rectangles
			// For Black tiles
			inputstream_initial = new FileInputStream(
					System.getProperty("user.dir")
							+ "/Hellofx/hellofxxx/Draughts/draughts/guielements/black_tilee.jpg");
			image = new Image(inputstream_initial);
			images.add(image);

			// For White tiles
			inputstream_initial = new FileInputStream(
					System.getProperty("user.dir")
							+ "/Hellofx/hellofxxx/Draughts/draughts/guielements/white_tilee.jpg");
			image = new Image(inputstream_initial);
			images.add(image);

			inputstream_initial = new FileInputStream(
					System.getProperty("user.dir")
							+ "/Hellofx/hellofxxx/Draughts/draughts/guielements/blackk_tile.png");
			image = new Image(inputstream_initial);
			images.add(image);

			inputstream_initial = new FileInputStream(
					System.getProperty("user.dir") + "/Hellofx/hellofxxx/Draughts/draughts/guielements/white_men.png");
			image = new Image(inputstream_initial);
			images.add(image);

			inputstream_initial = new FileInputStream(
					System.getProperty("user.dir") + "/Hellofx/hellofxxx/Draughts/draughts/guielements/white_king.png");
			image = new Image(inputstream_initial);
			images.add(image);

			inputstream_initial = new FileInputStream(
					System.getProperty("user.dir") + "/Hellofx/hellofxxx/Draughts/draughts/guielements/black_king.png");
			image = new Image(inputstream_initial);
			images.add(image);

			for (int i = 0; i < 10; i++) {
				ArrayList<Image> line = new ArrayList<Image>();
				for (int j = 0; j < 10; j++) {
					// Rectangle r = new Rectangle();
					if (count % 2 == 0) {
						ImageView imageView = new ImageView(images.get(1));
						imageView.setX(x);
						imageView.setY(y);
						p.getChildren().add(imageView);
						// r.setFill(Color.GRAY);
					}

					else if (count % 2 == 1) {
						ImageView imageView = new ImageView(images.get(0));
						imageView.setX(x);
						imageView.setY(y);
						p.getChildren().add(imageView);
					}
					x = x + 75;
					count++;
				}
				imagess.add(line);
				y = y + 75;
				x = 0;
				count++;
			}

			double x = 2.5;
			double y = 2.5;

			for (int i = 0; i < 10; i++) {
				ArrayList<Circle> line = new ArrayList<Circle>();
				for (int j = 0; j < 10; j++) {

					if (g.b.hasPiece(i, j)) {
						if (g.b.getPiece(i, j).colour == Colour.WHITE
								&& g.b.getPiece(i, j).getSymbol().equals("\u2655")) {
							ImageView imageView = new ImageView(images.get(3));
							imageView.setX(x);
							imageView.setY(y);
							eventHandler = new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent e) {
									double x = imageView.getX();
									double y = imageView.getY();
									x = (x - 2.5) / 75;
									y = (y - 2.5) / 75;
									int i0 = (int) y;
									int j0 = (int) x;

									if (g.getTurnColor() == Colour.WHITE) {

										moveable = g.b.getPiece(i0, j0).computeMoveableCoordinates(i0, j0, g.b);
										selectedPiece = g.b.getPiece(i0, j0);
										selectedMen = imageView;
										if (isSelected) {
											for (int i = 0; i < possiblePoints.size(); i++) {
												p.getChildren().remove(possiblePoints.get(i));
											}
										}

										for (int i = 0; i < moveable.size(); i++) {
											Circle circle = new Circle(10, Color.GREEN);
											circle.setCenterX((moveable.get(i).get(1) * 75) + 37.5);
											circle.setCenterY((moveable.get(i).get(0) * 75) + 37.5);
											circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler1);
											// circle.addEventFilter(MouseEvent.MOUSE_ENTERED, eventHandler2);
											isSelected = true;
											possiblePoints.add(circle);
											p.getChildren().add(circle);
										}
									}

								}
							};

							eventHandler1 = new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent e) {
									Object c = e.getSource();
									Circle circle = (Circle) c;

									double x = circle.getCenterX();
									double y = circle.getCenterY();

									x = (x - 37.5) / 75;
									y = (y - 37.5) / 75;

									int i1 = (int) y;
									int j1 = (int) x;

									double x0 = selectedMen.getX();
									double y0 = selectedMen.getY();
									x0 = (x0 - 2.5) / 75;
									y0 = (y0 - 2.5) / 75;
									int i0 = (int) y0;
									int j0 = (int) x0;
									try {

										boolean isValidMove = movePieces(reverseInputs(i0, j0), reverseInputs(i1, j1));

										if (isValidMove) {
											for (int i = 0; i < possiblePoints.size(); i++) {
												p.getChildren().remove(possiblePoints.get(i));
											}
											RenderBoard();
											setSceneGame();
										} else if (!isValidMove) {
											RenderBoard();
											setSceneGame();
											alert = new Alert(AlertType.NONE,
													g.getTurnColor().toString() + " WON!", ButtonType.FINISH);
											alert.setTitle("Game Over!");
											alert.showAndWait();
											window.setTitle("Menu");
											window.setScene(scene1); // Place in scene in the stage

										}
									} catch (Exception e1) {
										e1.printStackTrace();
									}

								}
							};

							eventHandler2 = new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent e) {
									Object c = e.getSource();
									Circle circle = (Circle) c;

									double x = circle.getCenterX();
									double y = circle.getCenterY();

									x = (x - 37.5) / 75;
									y = (y - 37.5) / 75;

									int i1 = (int) y;
									int j1 = (int) x;

									double x0 = selectedMen.getX();
									double y0 = selectedMen.getY();
									x0 = (x0 - 2.5) / 75;
									y0 = (y0 - 2.5) / 75;
									int i0 = (int) y0;
									int j0 = (int) x0;

									try {

										for (int i = 0; i < moveable.size(); i++) {
											Circle circle2 = new Circle(10, Color.GREEN);
											circle.setCenterX((moveable.get(i).get(1) * 75) + 37.5);
											circle.setCenterY((moveable.get(i).get(0) * 75) + 37.5);
											circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler1);
											// circle.hoverProperty().addListener((observable, oldValue, newValue) -> {

											// });

											// circle.addEventFilter(MouseEvent.MOUSE_ENTERED, eventHandler2);
											isSelected = true;
											possiblePoints.add(circle2);
											p.getChildren().add(circle2);
										}

										eatable = g.b.getPiece(i0, j0).getEatableCoordinates(
												g.b.getPiece(i0, j0).getToEatCoordinates(), i1, j1);

										for (int i = 0; i < eatable.size(); i++) {
											Circle circle1 = new Circle(10, Color.RED);
											circle.setCenterX((eatable.get(i).get(1) * 75) + 37.5);
											circle.setCenterY((eatable.get(i).get(0) * 75) + 37.5);

											// isSelected = true;
											p.getChildren().add(circle1);
										}

										RenderBoard();
										setSceneGame();

									} catch (Exception e1) {
										e1.printStackTrace();
									}

								}
							};

							// Registering the event filter
							imageView.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
							p.getChildren().add(imageView);
						} else if (g.b.getPiece(i, j).colour == Colour.BLACK
								&& g.b.getPiece(i, j).getSymbol().equals("\u265B")) {
							ImageView imageView = new ImageView(images.get(2));
							imageView.setX(x);
							imageView.setY(y);
							eventHandler = new EventHandler<MouseEvent>() {

								@Override
								public void handle(MouseEvent e) {
									double x = imageView.getX();
									double y = imageView.getY();
									x = (x - 2.5) / 75;
									y = (y - 2.5) / 75;
									int i0 = (int) y;
									int j0 = (int) x;

									if (g.getTurnColor() == Colour.BLACK) {

										moveable = g.b.getPiece(i0, j0).computeMoveableCoordinates(i0, j0, g.b);
										selectedPiece = g.b.getPiece(i0, j0);
										selectedMen = imageView;
										if (isSelected) {
											for (int i = 0; i < possiblePoints.size(); i++) {
												p.getChildren().remove(possiblePoints.get(i));
											}
										}
										for (int i = 0; i < moveable.size(); i++) {
											Circle circle = new Circle(10, Color.GREEN);
											circle.setCenterX((moveable.get(i).get(1) * 75) + 37.5);
											circle.setCenterY((moveable.get(i).get(0) * 75) + 37.5);
											circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler1);
											// circle.addEventFilter(MouseEvent.MOUSE_ENTERED, eventHandler2);
											isSelected = true;
											possiblePoints.add(circle);
											p.getChildren().add(circle);
										}
									}

								}
							};

							eventHandler1 = new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent e) {
									Object c = e.getSource();
									Circle circle = (Circle) c;

									double x = circle.getCenterX();
									double y = circle.getCenterY();

									x = (x - 37.5) / 75;
									y = (y - 37.5) / 75;

									int i1 = (int) y;
									int j1 = (int) x;

									double x0 = selectedMen.getX();
									double y0 = selectedMen.getY();
									x0 = (x0 - 2.5) / 75;
									y0 = (y0 - 2.5) / 75;
									int i0 = (int) y0;
									int j0 = (int) x0;
									try {

										boolean isValidMove = movePieces(reverseInputs(i0, j0), reverseInputs(i1, j1));

										if (isValidMove) {
											// for(int i = 0; i<possiblePoints.size(); i++){
											// p.getChildren().remove(possiblePoints.get(i));
											// }
											RenderBoard();
											setSceneGame();
										} else if (!isValidMove) {
											RenderBoard();
											setSceneGame();
											alert = new Alert(AlertType.NONE,
													g.getTurnColor().toString() + " WON!", ButtonType.FINISH);
											alert.setTitle("Game Over!");
											alert.showAndWait();
											window.setTitle("Menu");
											window.setScene(scene1); // Place in scene in the stage

										}
									} catch (Exception e1) {
										e1.printStackTrace();
									}

								}
							};

							eventHandler2 = new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent e) {
									Object c = e.getSource();
									Circle circle = (Circle) c;

									double x = circle.getCenterX();
									double y = circle.getCenterY();

									x = (x - 37.5) / 75;
									y = (y - 37.5) / 75;

									int i1 = (int) y;
									int j1 = (int) x;

									double x0 = selectedMen.getX();
									double y0 = selectedMen.getY();
									x0 = (x0 - 2.5) / 75;
									y0 = (y0 - 2.5) / 75;
									int i0 = (int) y0;
									int j0 = (int) x0;

									try {

										for (int i = 0; i < moveable.size(); i++) {
											Circle circle2 = new Circle(10, Color.GREEN);
											circle.setCenterX((moveable.get(i).get(1) * 75) + 37.5);
											circle.setCenterY((moveable.get(i).get(0) * 75) + 37.5);
											circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler1);
											// circle.hoverProperty().addListener((observable, oldValue, newValue) -> {

											// });

											// circle.addEventFilter(MouseEvent.MOUSE_ENTERED, eventHandler2);
											isSelected = true;
											possiblePoints.add(circle2);
											p.getChildren().add(circle2);
										}

										eatable = g.b.getPiece(i0, j0).getEatableCoordinates(
												g.b.getPiece(i0, j0).getToEatCoordinates(), i1, j1);

										for (int i = 0; i < eatable.size(); i++) {
											Circle circle1 = new Circle(10, Color.RED);
											circle.setCenterX((eatable.get(i).get(1) * 75) + 37.5);
											circle.setCenterY((eatable.get(i).get(0) * 75) + 37.5);

											// isSelected = true;
											p.getChildren().add(circle1);
										}

										RenderBoard();
										setSceneGame();

									} catch (Exception e1) {
										e1.printStackTrace();
									}

								}
							};

							imageView.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
							p.getChildren().add(imageView);
						} else if (g.b.getPiece(i, j).colour == Colour.WHITE
								&& g.b.getPiece(i, j).getSymbol().equals("\u2656"))

						{
							ImageView imageView = new ImageView(images.get(4));
							imageView.setX(x);
							imageView.setY(y);
							eventHandler = new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent e) {
									double x = imageView.getX();
									double y = imageView.getY();
									x = (x - 2.5) / 75;
									y = (y - 2.5) / 75;
									int i0 = (int) y;
									int j0 = (int) x;

									if (g.getTurnColor() == Colour.WHITE) {

										moveable = g.b.getPiece(i0, j0).computeMoveableCoordinates(i0, j0, g.b);
										selectedPiece = g.b.getPiece(i0, j0);
										selectedMen = imageView;
										if (isSelected) {
											for (int i = 0; i < possiblePoints.size(); i++) {
												p.getChildren().remove(possiblePoints.get(i));
											}
										}
										for (int i = 0; i < moveable.size(); i++) {
											Circle circle = new Circle(10, Color.GREEN);
											circle.setCenterX((moveable.get(i).get(1) * 75) + 37.5);
											circle.setCenterY((moveable.get(i).get(0) * 75) + 37.5);
											circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler1);
											// circle.addEventFilter(MouseEvent.MOUSE_ENTERED, eventHandler2);
											isSelected = true;
											possiblePoints.add(circle);
											p.getChildren().add(circle);
										}
									}

								}
							};

							eventHandler1 = new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent e) {
									Object c = e.getSource();
									Circle circle = (Circle) c;

									double x = circle.getCenterX();
									double y = circle.getCenterY();

									x = (x - 37.5) / 75;
									y = (y - 37.5) / 75;

									int i1 = (int) y;
									int j1 = (int) x;

									double x0 = selectedMen.getX();
									double y0 = selectedMen.getY();
									x0 = (x0 - 2.5) / 75;
									y0 = (y0 - 2.5) / 75;
									int i0 = (int) y0;
									int j0 = (int) x0;
									try {

										boolean isValidMove = movePieces(reverseInputs(i0, j0), reverseInputs(i1, j1));

										if (isValidMove) {
											// for(int i = 0; i<possiblePoints.size(); i++){
											// p.getChildren().remove(possiblePoints.get(i));
											// }
											RenderBoard();
											setSceneGame();
										} else if (!isValidMove) {
											RenderBoard();
											setSceneGame();
											alert = new Alert(AlertType.NONE,
													g.getTurnColor().toString() + " WON!", ButtonType.FINISH);
											alert.setTitle("Game Over!");
											alert.showAndWait();
											window.setTitle("Menu");
											window.setScene(scene1); // Place in scene in the stage

										}
									} catch (Exception e1) {
										e1.printStackTrace();
									}

								}
							};

							eventHandler2 = new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent e) {
									Object c = e.getSource();
									Circle circle = (Circle) c;

									double x = circle.getCenterX();
									double y = circle.getCenterY();

									x = (x - 37.5) / 75;
									y = (y - 37.5) / 75;

									int i1 = (int) y;
									int j1 = (int) x;

									double x0 = selectedMen.getX();
									double y0 = selectedMen.getY();
									x0 = (x0 - 2.5) / 75;
									y0 = (y0 - 2.5) / 75;
									int i0 = (int) y0;
									int j0 = (int) x0;

									try {

										for (int i = 0; i < moveable.size(); i++) {
											Circle circle2 = new Circle(10, Color.GREEN);
											circle.setCenterX((moveable.get(i).get(1) * 75) + 37.5);
											circle.setCenterY((moveable.get(i).get(0) * 75) + 37.5);
											circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler1);
											// circle.hoverProperty().addListener((observable, oldValue, newValue) -> {

											// });

											// circle.addEventFilter(MouseEvent.MOUSE_ENTERED, eventHandler2);
											isSelected = true;
											possiblePoints.add(circle2);
											p.getChildren().add(circle2);
										}

										eatable = g.b.getPiece(i0, j0).getEatableCoordinates(
												g.b.getPiece(i0, j0).getToEatCoordinates(), i1, j1);

										for (int i = 0; i < eatable.size(); i++) {
											Circle circle1 = new Circle(10, Color.RED);
											circle.setCenterX((eatable.get(i).get(1) * 75) + 37.5);
											circle.setCenterY((eatable.get(i).get(0) * 75) + 37.5);

											// isSelected = true;
											p.getChildren().add(circle1);
										}

										RenderBoard();
										setSceneGame();

									} catch (Exception e1) {
										e1.printStackTrace();
									}

								}
							};

							imageView.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
							p.getChildren().add(imageView);
						} else if (g.b.getPiece(i, j).colour == Colour.BLACK
								&& g.b.getPiece(i, j).getSymbol().equals("\u265C")) {
							ImageView imageView = new ImageView(images.get(5));
							imageView.setX(x);
							imageView.setY(y);
							eventHandler = new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent e) {
									double x = imageView.getX();
									double y = imageView.getY();
									x = (x - 2.5) / 75;
									y = (y - 2.5) / 75;
									int i0 = (int) y;
									int j0 = (int) x;

									if (g.getTurnColor() == Colour.BLACK) {

										moveable = g.b.getPiece(i0, j0).computeMoveableCoordinates(i0, j0, g.b);
										selectedPiece = g.b.getPiece(i0, j0);
										selectedMen = imageView;
										if (isSelected) {
											for (int i = 0; i < possiblePoints.size(); i++) {
												p.getChildren().remove(possiblePoints.get(i));
											}
										}
										for (int i = 0; i < moveable.size(); i++) {
											Circle circle = new Circle(10, Color.GREEN);
											circle.setCenterX((moveable.get(i).get(1) * 75) + 37.5);
											circle.setCenterY((moveable.get(i).get(0) * 75) + 37.5);
											circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler1);
											// circle.hoverProperty().addListener((observable, oldValue, newValue) -> {

											// });

											// circle.addEventFilter(MouseEvent.MOUSE_ENTERED, eventHandler2);
											isSelected = true;
											possiblePoints.add(circle);
											p.getChildren().add(circle);
										}
									}

								}
							};

							eventHandler1 = new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent e) {
									Object c = e.getSource();
									Circle circle = (Circle) c;

									double x = circle.getCenterX();
									double y = circle.getCenterY();

									x = (x - 37.5) / 75;
									y = (y - 37.5) / 75;

									int i1 = (int) y;
									int j1 = (int) x;

									double x0 = selectedMen.getX();
									double y0 = selectedMen.getY();
									x0 = (x0 - 2.5) / 75;
									y0 = (y0 - 2.5) / 75;
									int i0 = (int) y0;
									int j0 = (int) x0;
									try {

										boolean isValidMove = movePieces(reverseInputs(i0, j0), reverseInputs(i1, j1));

										if (isValidMove) {
											// for(int i = 0; i<possiblePoints.size(); i++){
											// p.getChildren().remove(possiblePoints.get(i));
											// }
											RenderBoard();
											setSceneGame();
										} else if (!isValidMove) {
											RenderBoard();
											setSceneGame();
											alert = new Alert(AlertType.NONE,
													g.getTurnColor().toString() + " WON!", ButtonType.FINISH);
											alert.setTitle("Game Over!");
											alert.showAndWait();
											window.setTitle("Menu");
											window.setScene(scene1); // Place in scene in the stage

										}
									} catch (Exception e1) {
										e1.printStackTrace();
									}

								}
							};

							eventHandler2 = new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent e) {
									Object c = e.getSource();
									Circle circle = (Circle) c;

									double x = circle.getCenterX();
									double y = circle.getCenterY();

									x = (x - 37.5) / 75;
									y = (y - 37.5) / 75;

									int i1 = (int) y;
									int j1 = (int) x;

									double x0 = selectedMen.getX();
									double y0 = selectedMen.getY();
									x0 = (x0 - 2.5) / 75;
									y0 = (y0 - 2.5) / 75;
									int i0 = (int) y0;
									int j0 = (int) x0;

									try {

										for (int i = 0; i < moveable.size(); i++) {
											Circle circle2 = new Circle(10, Color.GREEN);
											circle.setCenterX((moveable.get(i).get(1) * 75) + 37.5);
											circle.setCenterY((moveable.get(i).get(0) * 75) + 37.5);
											circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler1);
											// circle.hoverProperty().addListener((observable, oldValue, newValue) -> {

											// });

											// circle.addEventFilter(MouseEvent.MOUSE_ENTERED, eventHandler2);
											isSelected = true;
											possiblePoints.add(circle2);
											p.getChildren().add(circle2);
										}

										eatable = g.b.getPiece(i0, j0).getEatableCoordinates(
												g.b.getPiece(i0, j0).getToEatCoordinates(), i1, j1);

										for (int i = 0; i < eatable.size(); i++) {
											Circle circle1 = new Circle(10, Color.RED);
											circle.setCenterX((eatable.get(i).get(1) * 75) + 37.5);
											circle.setCenterY((eatable.get(i).get(0) * 75) + 37.5);

											// isSelected = true;
											p.getChildren().add(circle1);
										}

										RenderBoard();
										setSceneGame();

									} catch (Exception e1) {
										e1.printStackTrace();
									}

								}
							};
							imageView.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
							p.getChildren().add(imageView);
						}

					}

					x = x + 75;
				}
				y = y + 75;
				x = 2.5;
				circles.add(line);
			}

			double layoutY = 0;
			SaveButton = new Button("Save Draughts");
			SaveButton.setLayoutX(10 * 76);
			SaveButton.setLayoutY(layoutY);
			SaveButton.setOnAction(e -> {
				try {
					new Save(getGame());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			});

			Menu menu = new Menu("Options");
			Menu submenu = new Menu("Draughts");
			MenuItem menuItem1 = new MenuItem("New Draughts");
			menuItem1.setOnAction(e -> {
				try {
					g = new Draughts();

				} catch (Exception e1) {
					e1.printStackTrace();
				}

				RenderBoard();

				window.setTitle("Draughts");
				window.setScene(scene2);

				Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
				window.setX((screenBounds.getWidth() - window.getWidth()) / 2);
				window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
			});
			MenuItem menuItem2 = new MenuItem("Load Draughts");
			menuItem2.setOnAction(e -> {
				try {
					Load l = new Load("SavedGame.txt");
					g = l.getLoad();

				} catch (Exception e1) {
					e1.printStackTrace();
				}

				RenderBoard();

				window.setTitle("Draughts");
				setSceneGame();
			});

			Label label1 = new Label("Turn: " + g.getTurnColor().toString());
			label1.setLayoutX(10 * 76);
			label1.setLayoutY(layoutY + 2 * 35);

			Label label2 = new Label("Turn No: " + g.b.getTurnNo());
			label2.setLayoutX(10 * 76);
			label2.setLayoutY(layoutY + 3 * 35);
			submenu.getItems().add(menuItem1);
			submenu.getItems().add(menuItem2);
			menu.getItems().add(submenu);
			MenuBar menuBar = new MenuBar();
			menuBar.getMenus().add(menu);
			menuBar.setLayoutX(10 * 76);
			menuBar.setLayoutY(layoutY + 1 * 35);
			menuBar.setId("menubar-button");
			// menuBar.setStyle("-fx-background-color: #555555; -fx-border-radius: 4px;");

			p.getChildren().addAll(menuBar, SaveButton, label1, label2);

			scene2 = new Scene(p);
			// scene2.getStylesheets().add(System.getProperty("user.dir") +
			// "/Draughts/chess/guielements/application.css");
			// SaveButton.getStyleClass().add("my-rect");
			// scene2.getStylesheets().add(System.getProperty("user.dir") +
			// "/Draughts/chess/guielements/application.css");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private boolean movePieces(String origin, String destination) throws Exception {
		try {
			boolean currentStatus = g.play(origin, destination);
			System.out.println(currentStatus);
			return currentStatus;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public String reverseInputs(int x, int y) {
		String revertedInput = "";
		x = x + 1;
		y = y + 97;
		char ch = (char) y;
		revertedInput += String.valueOf(x) + String.valueOf(ch);

		return revertedInput;
	}

	public static void main(String args[]) throws Exception {
		// gui = new GUI(args);
		// GUI.launch(args);
		launch(args);
		// BufferedReader originDebug = new BufferedReader(new
		// InputStreamReader(System.in));
		// String originDebu = originDebug.readLine();

		// if(originDebu.equalsIgnoreCase("New")){
		// g = new Draughts();
		// launch(args);
		// }

		// else if(originDebu.equalsIgnoreCase("Load")){
		// BufferedReader originDebug1 = new BufferedReader(new
		// InputStreamReader(System.in));
		// String originDebu1 = originDebug1.readLine();
		// try {
		// Load l = new Load("SavedGame.txt");
		// g = l.getLoad();
		// System.out.println("Load Successful");
		// launch(args);
		// g.play();
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }

		// }
	}

	public Draughts getGame() {
		return g;
	}

	public void setGame(Draughts g) {
		this.g = g;
	}

	public CheckerBoard getGameBoard() {
		return g.b;
	}

}
