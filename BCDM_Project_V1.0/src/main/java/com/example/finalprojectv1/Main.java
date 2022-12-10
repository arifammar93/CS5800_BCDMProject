package com.example.finalprojectv1;


import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;


//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        /// ****** WE ARE IMPORTING THE DATA BASE HERE ******
        /// *************************************************
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1234,"Noah", "123 Highland Ave Pomona CA 91010","Student"));
        customers.add(new Customer(5678,"Mark", "222 Myrtle Drive Monrovia CA 89052","Professor"));

        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("Cheese Burger Combo", 123, 9.75,LocalDate.now()));
        dishes.add(new Dish("Burrito Combo", 456, 12.25,LocalDate.now()));


        List<Order> orders = new ArrayList<>();
        orders.add(new Order(dishes, 19.5,1234, LocalDate.now(), true));
        /// *************************************************



        Order currentOrderArray = new Order(new ArrayList<Dish>(), 0.0, 0, LocalDate.now(), false);

        /// ****** Creating the HomePage ******

        Image userPageImage = new Image("file:billybronco.png");
        ImageView userPageView = new ImageView();
        userPageView.setImage(userPageImage);
        userPageView.setFitHeight(250);
        userPageView.setFitWidth(250);

        Image userPageImage2 = new Image("file:selectedLogo.png");
        ImageView userPageView2 = new ImageView();
        userPageView2.setImage(userPageImage2);
        userPageView2.setFitHeight(250);
        userPageView2.setFitWidth(250);

        HBox Root = new HBox();
        Root.setAlignment(Pos.CENTER);
        Label AppTitle = new Label("Bronco Centerpointe Dining Management");
        AppTitle.setStyle("-fx-font-size: 24px; -fx-text-fill: white;-fx-font-weight: bold;");

        Button RegisterUser = new Button("Register User");
        RegisterUser.setMinWidth(200);
        Button AddFoodBev = new Button("Add Food / Beverage");
        AddFoodBev.setMinWidth(200);
        Button PlaceOrder = new Button("Place Order");
        PlaceOrder.setMinWidth(200);
        Button Insights = new Button("Insights");
        Insights.setMinWidth(200);



        VBox HomePageButtons = new VBox(RegisterUser,AddFoodBev,PlaceOrder,Insights);
        HomePageButtons.setAlignment(Pos.CENTER);
        HomePageButtons.setSpacing(20);

        HBox ImageAndButtons = new HBox(userPageView2,HomePageButtons, userPageView);
        ImageAndButtons.setAlignment(Pos.CENTER);
        ImageAndButtons.setSpacing(50);

        VBox HomePage = new VBox(AppTitle,ImageAndButtons);
        HomePage.setStyle("-fx-background-color: linear-gradient(to bottom, #228c22, #6a5acd);");
        HomePage.setMinWidth(900);
        HomePage.setAlignment(Pos.CENTER);
        HomePage.setSpacing(20);
        RegisterUser.styleProperty().bind(Bindings.when(RegisterUser.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        AddFoodBev.styleProperty().bind(Bindings.when(AddFoodBev.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        Insights.styleProperty().bind(Bindings.when(Insights.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        PlaceOrder.styleProperty().bind(Bindings.when(PlaceOrder.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));

        Root.getChildren().add(HomePage);


        Button ReturnHome = new Button("Return");
        ReturnHome.setMinWidth(150);
        Button ReturnHome2 = new Button("Return");
        ReturnHome2.setMinWidth(150);
        Button ReturnHome3 = new Button("Return");
        ReturnHome3.setMinWidth(150);
        Button ReturnHome4 = new Button("Return");
        ReturnHome4.setMinWidth(150);
        Button ReturnHome5 = new Button("Return");
        ReturnHome5.setMinWidth(150);
        /// ***********************************

        /// ****** Creating the Register User Page ******
        Image regUserImage = new Image("file:1946429.png");
        ImageView regUserImageView = new ImageView();
        regUserImageView.setImage(regUserImage);
        regUserImageView.setFitHeight(100);
        regUserImageView.setFitWidth(100);

        Label NameLabel = new Label("Name");
        NameLabel.setMinWidth(100);
        Label IDLabel = new Label("User ID");
        IDLabel.setMinWidth(100);
        Label AddressLabel = new Label("Address");
        AddressLabel.setMinWidth(100);
        Label TypeLabel = new Label("Type");
        TypeLabel.setMinWidth(100);
        TextField NameField = new TextField();
        TextField IDField = new TextField();
        TextField AddressField = new TextField();
        ComboBox TypeBox = new ComboBox();
        TypeBox.getItems().addAll(
                "Student",
                "Professor"
        );
        TypeBox.getSelectionModel().selectFirst();

        Button CreateUser = new Button("Create");
        CreateUser.setMinWidth(150);

        Button DeleteUser = new Button("Delete");
        DeleteUser.setMinWidth(150);
        Button UpdateUser = new Button("Update");
        UpdateUser.setMinWidth(150);

        NameLabel.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        IDLabel.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        AddressLabel.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        TypeLabel.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        ReturnHome.styleProperty().bind(Bindings.when(ReturnHome.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        CreateUser.styleProperty().bind(Bindings.when(CreateUser.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        UpdateUser.styleProperty().bind(Bindings.when(UpdateUser.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        DeleteUser.styleProperty().bind(Bindings.when(DeleteUser.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));


        HBox NameHBox = new HBox(NameLabel,NameField);
        HBox UserIDHBox = new HBox(IDLabel,IDField);
        HBox AddressHBox = new HBox(AddressLabel, AddressField);
        HBox TypeHBox = new HBox(TypeLabel,TypeBox);
        HBox UserCreationHBox = new HBox(ReturnHome, CreateUser, UpdateUser, DeleteUser);
        UserCreationHBox.setAlignment(Pos.CENTER);

        VBox UserRegFieldsBox = new VBox(UserIDHBox,NameHBox,AddressHBox,TypeHBox);
        UserRegFieldsBox.setSpacing(20);
        VBox userfieldspictureBlankSpace = new VBox();
        userfieldspictureBlankSpace.setMinWidth(400);
        HBox UserFieldsPicture = new HBox(UserRegFieldsBox, userfieldspictureBlankSpace,regUserImageView);

        VBox BlankSpace = new VBox();
        BlankSpace.setMinHeight(100);

        VBox UserRegistrationPage = new VBox(UserFieldsPicture,BlankSpace,UserCreationHBox);
        UserRegistrationPage.setPadding(new Insets(50));
        UserCreationHBox.setSpacing(20);
        UserRegistrationPage.setSpacing(20);
        UserRegistrationPage.setStyle("-fx-background-color: linear-gradient(to bottom, #228c22, #6a5acd);");
        UserRegistrationPage.setMinWidth(900);
        /// *********************************************

        /// ****** Creating the Add Food / Beverage Page ******
        Image regItemImage = new Image("file:333344.png");
        ImageView regItemImageView = new ImageView();
        regItemImageView.setImage(regItemImage);
        regItemImageView.setFitHeight(100);
        regItemImageView.setFitWidth(100);

        Label ItemLabel = new Label("Item Name");
        ItemLabel.setMinWidth(100);
        Label ItemIDLabel = new Label("Item ID");
        ItemIDLabel.setMinWidth(100);
        Label PriceLabel = new Label("Price");
        PriceLabel.setMinWidth(100);
        Label Datelabel = new Label("Date");
        Datelabel.setMinWidth(100);
        TextField ItemField = new TextField();
        TextField ItemIDField = new TextField();
        TextField PriceField = new TextField();
        DatePicker DateField = new DatePicker(LocalDate.now());

        Button CreateItem = new Button("Create");
        CreateItem.setMinWidth(150);
        Button DeleteItem = new Button("Delete");
        DeleteItem.setMinWidth(150);
        Button UpdateItem = new Button("Update");
        UpdateItem.setMinWidth(150);

        HBox ItemHBox = new HBox(ItemLabel,ItemField);
        HBox ItemIDHBox = new HBox(ItemIDLabel,ItemIDField);
        HBox PriceHBox = new HBox(PriceLabel, PriceField);
        HBox DateHBox = new HBox(Datelabel,DateField);
        HBox ItemCreationHBox = new HBox(ReturnHome2, CreateItem, UpdateItem, DeleteItem);
        ItemCreationHBox.setAlignment(Pos.CENTER);

        VBox ItemRegFieldsBox = new VBox(ItemIDHBox,ItemHBox,PriceHBox,DateHBox);
        ItemRegFieldsBox.setSpacing(20);
        VBox itemfieldspictureBlankSpace = new VBox();
        itemfieldspictureBlankSpace.setMinWidth(400);
        HBox ItemFieldsPicture = new HBox(ItemRegFieldsBox, itemfieldspictureBlankSpace, regItemImageView);

        VBox BlankSpace2 = new VBox();
        BlankSpace2.setMinHeight(100);

        VBox ItemRegistrationPage = new VBox(ItemFieldsPicture,BlankSpace2,ItemCreationHBox);
        ItemRegistrationPage.setPadding(new Insets(50));
        ItemCreationHBox.setSpacing(20);
        ItemRegistrationPage.setSpacing(20);

        ItemRegistrationPage.setStyle("-fx-background-color: linear-gradient(to bottom, #228c22, #6a5acd);");
        ItemRegistrationPage.setMinWidth(900);
        ItemLabel.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        ItemIDLabel.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        PriceLabel.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        Datelabel.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        CreateItem.styleProperty().bind(Bindings.when(CreateItem.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        ReturnHome2.styleProperty().bind(Bindings.when(ReturnHome2.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        UpdateItem.styleProperty().bind(Bindings.when(UpdateItem.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        DeleteItem.styleProperty().bind(Bindings.when(DeleteItem.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        /// ***************************************************

        /// ****** Creating Order Page ******
        Label CustomerIDLabel = new Label("Customer ID");
        CustomerIDLabel.setMinWidth(100);
        TextField CustomerIDField = new TextField();
        Label CurrentOrderLabel = new Label("Current Order");
        Label TotalLabel = new Label("Total $");
        Label TotalPrice = new Label("0.0");
        ListView DishSelection = new ListView();
        DishSelection.setMaxHeight(200);
        ListView DishPrice = new ListView();
        DishPrice.setMaxHeight(200);
        DishPrice.setMouseTransparent( true );
        DishPrice.setFocusTraversable( false );

        ListView currentOrder = new ListView();
        currentOrder.setMaxHeight(150);


        for(int i = 0; i<dishes.size();i++){
            DishSelection.getItems().add(dishes.get(i).getName());
            DishPrice.getItems().add(dishes.get(i).getPrice());
        }
        DishSelection.getSelectionModel().selectFirst();

        Button AddToOrder = new Button("Add");
        AddToOrder.setMinWidth(150);
        Button DeleteFromOrder = new Button("Delete");
        DeleteFromOrder.setMinWidth(150);
        Button PlaceOrderButton = new Button("Place Order");
        PlaceOrderButton.setMinWidth(150);

        HBox totalBox = new HBox(TotalLabel, TotalPrice);
        totalBox.setSpacing(10);
        HBox customerBox = new HBox(CustomerIDLabel, CustomerIDField);
        HBox dishselectionBox = new HBox(DishSelection, DishPrice);
        VBox currentOrderBox = new VBox(CurrentOrderLabel,currentOrder, totalBox);
        currentOrderBox.setSpacing(20);
        VBox CustomerSelectionBox = new VBox(customerBox, dishselectionBox);
        CustomerSelectionBox.setSpacing(20);
        HBox OrderCreationBodyBox = new HBox(CustomerSelectionBox, currentOrderBox);
        OrderCreationBodyBox.setSpacing(20);
        HBox orderCreationBox = new HBox(ReturnHome3, AddToOrder, DeleteFromOrder, PlaceOrderButton);
        orderCreationBox.setAlignment(Pos.CENTER);
        orderCreationBox.setSpacing(20);
        VBox OrderCreatePage = new VBox(OrderCreationBodyBox, orderCreationBox);
        OrderCreatePage.setSpacing(20);
        OrderCreatePage.setPadding(new Insets(50));

        OrderCreatePage.setStyle("-fx-background-color: linear-gradient(to bottom, #228c22, #6a5acd);");
        OrderCreatePage.setMinWidth(900);
        CustomerIDLabel.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        CurrentOrderLabel.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        TotalLabel.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        TotalPrice.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        ReturnHome3.styleProperty().bind(Bindings.when(ReturnHome3.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        AddToOrder.styleProperty().bind(Bindings.when(AddToOrder.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        DeleteFromOrder.styleProperty().bind(Bindings.when(DeleteFromOrder.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        PlaceOrderButton.styleProperty().bind(Bindings.when(PlaceOrderButton.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        /// *********************************

        /// ****** Creating the Insights Page ******
        Label InsightsIndex = new Label("Index");
        InsightsIndex.setMinWidth(100);
        InsightsIndex.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        Label InsightsDate = new Label("Date");
        InsightsDate.setMinWidth(250);
        InsightsDate.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        Label InsightsCustomer = new Label("Customer");
        InsightsCustomer.setMinWidth(150);
        InsightsCustomer.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        Label InsightsTotal = new Label("Order Total");
        InsightsTotal.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        InsightsTotal.setMinWidth(150);
        Label StatusLabel = new Label("Status");
        StatusLabel.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        StatusLabel.setMinWidth(100);


        ListView  InsightsIndexView = new ListView();
        InsightsIndexView.setMaxWidth(100);
        InsightsIndexView.setMaxHeight(300);
        InsightsIndexView.setMouseTransparent( true );InsightsIndexView.setFocusTraversable( false );
        ListView  InsightsDateView = new ListView();
        InsightsDateView.setMaxWidth(250);
        InsightsDateView.setMaxHeight(300);
        InsightsDateView.setMouseTransparent( true );InsightsDateView.setFocusTraversable( false );
        ListView  InsightsCustomerView = new ListView();
        InsightsCustomerView.setMaxWidth(150);
        InsightsCustomerView.setMaxHeight(300);
        InsightsCustomerView.setMouseTransparent( true );InsightsCustomerView.setFocusTraversable( false );
        ListView  InsightsTotalView = new ListView();
        InsightsTotalView.setMaxWidth(150);
        InsightsTotalView.setMaxHeight(300);
        InsightsTotalView.setMouseTransparent( true );InsightsTotalView.setFocusTraversable( false );
        ListView  OrderStatusView = new ListView();
        OrderStatusView.setMaxWidth(100);
        OrderStatusView.setMaxHeight(300);
        OrderStatusView.setMouseTransparent( true );OrderStatusView.setFocusTraversable( false );

        for(int i = 0; i<orders.size();i++){
            InsightsIndexView.getItems().add(InsightsIndexView.getItems().size() + 1);
            InsightsDateView.getItems().add(orders.get(i).getDate());
            InsightsCustomerView.getItems().add(orders.get(i).getUserID());
            InsightsTotalView.getItems().add("$ " + orders.get(i).getTotal());
            if(orders.get(i).getStatus()){
                OrderStatusView.getItems().add("Completed");
            } else{
                OrderStatusView.getItems().add("In Progress");
            }
        }

        HBox listViews = new HBox(InsightsIndexView, InsightsDateView,InsightsCustomerView,InsightsTotalView,OrderStatusView);
        HBox listLabels = new HBox(InsightsIndex, InsightsDate,InsightsCustomer,InsightsTotal,StatusLabel);
        VBox InsightsPage = new VBox(listLabels, listViews, ReturnHome4);
        InsightsPage.setAlignment(Pos.CENTER);
        InsightsPage.setSpacing(20);

        InsightsPage.setPadding(new Insets(50));

        InsightsPage.setStyle("-fx-background-color: linear-gradient(to bottom, #228c22, #6a5acd);");
        InsightsPage.setMinWidth(900);
        ReturnHome4.styleProperty().bind(Bindings.when(ReturnHome4.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        InsightsIndex.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        InsightsDate.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        InsightsCustomer.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        InsightsTotal.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        /// ****************************************

        /// ****** Receipt Page ******
        Image image = new Image("file:image.png");
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setFitHeight(50);
        imageView.setFitWidth(50);

        Label ReceiptUser = new Label("");
        Label ReceiptDate = new Label("");

        VBox useranddate = new VBox(ReceiptUser,ReceiptDate);
        VBox pictureBox = new VBox(imageView);
        VBox receiptBlankSpace = new VBox();
        receiptBlankSpace.setMinWidth(325);

        HBox userdatepicture = new HBox(useranddate, receiptBlankSpace,pictureBox);


        ListView ReceiptDishes = new ListView();
        ReceiptDishes.setMaxHeight(225);
        ReceiptDishes.setMouseTransparent( true );ReceiptDishes.setFocusTraversable( false );
        ListView ReceiptPrices = new ListView();
        ReceiptPrices.setMaxHeight(225);
        ReceiptPrices.setMouseTransparent( true );ReceiptPrices.setFocusTraversable( false );
        Label ReceiptTotalLabel = new Label("Total: ");
        Label ReceiptTotal = new Label("");
        Label ReceiptDiscountLabel = new Label("Discount: ");
        Label ReceiptDiscount = new Label("");
        Label ReceiptDiscountTotalLabel = new Label("Discounted Total: ");
        Label ReceiptDiscountTotal = new Label("");

        Button PrintReceipt = new Button("Print");
        PrintReceipt.setMinWidth(150);

        HBox dishprice = new HBox(ReceiptDishes,ReceiptPrices);
        HBox ReceiptTotalBox = new HBox(ReceiptTotalLabel, ReceiptTotal);
        HBox ReceiptDiscountBox = new HBox(ReceiptDiscountLabel,ReceiptDiscount);
        HBox ReceiptDiscountTotalBox = new HBox(ReceiptDiscountTotalLabel, ReceiptDiscountTotal);
        HBox ReceiptPageButtons = new HBox(PrintReceipt);


        VBox ReceiptPageBorder = new VBox(userdatepicture , dishprice, ReceiptTotalBox, ReceiptDiscountBox,ReceiptDiscountTotalBox);
        VBox ReceiptPage = new VBox(ReceiptPageBorder, ReceiptPageButtons);
        ReceiptPage.setAlignment(Pos.CENTER);
        ReceiptPage.setSpacing(10);
        ReceiptPage.setPadding(new Insets(20));

        Font monoFont = Font.font("Monospaced", 18);
        ReceiptPageBorder.setMaxWidth(496);
        ReceiptPageBorder.setStyle("-fx-background-color: white;");
        ReceiptPage.setStyle("-fx-background-color: linear-gradient(to bottom, #228c22, #6a5acd);");
        ReceiptPage.setMinWidth(900);

        ReceiptDate.setFont(monoFont);
        ReceiptDiscountLabel.setFont(monoFont);
        ReceiptUser.setFont(monoFont);
        ReceiptTotalLabel.setFont(monoFont);
        ReceiptTotal.setFont(monoFont);
        ReceiptDishes.setStyle("-fx-font: 14px Monospaced;");
        ReceiptPrices.setStyle("-fx-font: 14px Monospaced;");

        ReceiptDiscount.setFont(monoFont);
        ReceiptDiscountTotal.setFont(monoFont);
        ReceiptDiscountTotalLabel.setFont(monoFont);
        PrintReceipt.styleProperty().bind(Bindings.when(PrintReceipt.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));
        /// **************************
        /// ******Creating Web App******
        Label StatusPageIndex = new Label("Index");
        StatusPageIndex.setMinWidth(100);
        StatusPageIndex.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        Label StatusPageDate = new Label("Date");
        StatusPageDate.setMinWidth(250);
        StatusPageDate.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        Label StatusPageCustomer = new Label("Customer");
        StatusPageCustomer.setMinWidth(150);
        StatusPageCustomer.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        Label StatusPageTotal = new Label("Order Total");
        StatusPageTotal.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        StatusPageTotal.setMinWidth(150);
        Label StatusPageLabel = new Label("Status");
        StatusPageLabel.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        StatusPageLabel.setMinWidth(100);


        ListView  StatusPageIndexView = new ListView();
        StatusPageIndexView.setMaxWidth(100);
        StatusPageIndexView.setMaxHeight(300);
        StatusPageIndexView.getSelectionModel().selectFirst();
        ListView  StatusPageDateView = new ListView();
        StatusPageDateView.setMaxWidth(250);
        StatusPageDateView.setMaxHeight(300);
        StatusPageDateView.setMouseTransparent( true );StatusPageDateView.setFocusTraversable( false );
        ListView  StatusPageCustomerView = new ListView();
        StatusPageCustomerView.setMaxWidth(150);
        StatusPageCustomerView.setMaxHeight(300);
        StatusPageCustomerView.setMouseTransparent( true );StatusPageCustomerView.setFocusTraversable( false );
        ListView  StatusPageTotalView = new ListView();
        StatusPageTotalView.setMaxWidth(150);
        StatusPageTotalView.setMaxHeight(300);
        StatusPageTotalView.setMouseTransparent( true );StatusPageTotalView.setFocusTraversable( false );
        ListView  StatusPageStatusView = new ListView();
        StatusPageStatusView.setMaxWidth(100);
        StatusPageStatusView.setMaxHeight(300);
        StatusPageStatusView.setMouseTransparent( true );StatusPageStatusView.setFocusTraversable( false );

        for(int i = 0; i<orders.size();i++){
            StatusPageIndexView.getItems().add(StatusPageIndexView.getItems().size() + 1);
            StatusPageDateView.getItems().add(orders.get(i).getDate());
            StatusPageCustomerView.getItems().add(orders.get(i).getUserID());
            StatusPageTotalView.getItems().add("$ " + orders.get(i).getTotal());
            CheckBox toAdd = new CheckBox();
            toAdd.setSelected(true);
            StatusPageStatusView.getItems().add(toAdd);

        }
        Button setStatus = new Button("Change Status");
        setStatus.setMinWidth(150);
        setStatus.styleProperty().bind(Bindings.when(setStatus.hoverProperty())
                .then("-fx-background-color: white;-fx-text-fill: #1e3f5a;")
                .otherwise("-fx-background-color: #1e3f5a;-fx-text-fill: white;"));

        HBox StatusPagelistViews = new HBox(StatusPageIndexView, StatusPageDateView,StatusPageCustomerView,StatusPageTotalView,StatusPageStatusView);
        HBox StatusPagelistLabels = new HBox(StatusPageIndex, StatusPageDate,StatusPageCustomer,StatusPageTotal,StatusPageLabel);
        VBox StatusPageInsightsPage = new VBox(StatusPagelistLabels, StatusPagelistViews, setStatus);
        StatusPageInsightsPage.setAlignment(Pos.CENTER);
        StatusPageInsightsPage.setSpacing(20);

        StatusPageInsightsPage.setPadding(new Insets(50));

        StatusPageInsightsPage.setStyle("-fx-background-color: linear-gradient(to bottom, #228c22, #6a5acd);");
        StatusPageInsightsPage.setMinWidth(900);
        StatusPageIndex.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        StatusPageDate.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        StatusPageCustomer.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        StatusPageTotal.setStyle("-fx-font-size: 18px;-fx-text-fill: white;-fx-font-weight: bold;");
        ///*****************************
        RegisterUser.setOnAction(event -> {
            Root.getChildren().clear();
            Root.getChildren().add(UserRegistrationPage);
            primaryStage.setTitle("User Registration");
        });
        AddFoodBev.setOnAction(event -> {
            Root.getChildren().clear();
            Root.getChildren().add(ItemRegistrationPage);
            primaryStage.setTitle("Add Food / Beverage");
        });
        PlaceOrder.setOnAction(event->{
            Root.getChildren().clear();
            Root.getChildren().add(OrderCreatePage);
            primaryStage.setTitle("Order");
        });
        Insights.setOnAction(event->{
            Root.getChildren().clear();
            Root.getChildren().add(InsightsPage);
            primaryStage.setTitle("Insights");
        });



        ReturnHome.setOnAction(event -> {
            Root.getChildren().clear();
            Root.getChildren().add(HomePage);
            primaryStage.setTitle("Home Screen");
        });
        ReturnHome2.setOnAction(event -> {
            Root.getChildren().clear();
            Root.getChildren().add(HomePage);
            primaryStage.setTitle("Home Screen");
        });
        ReturnHome3.setOnAction(event -> {
            Root.getChildren().clear();
            Root.getChildren().add(HomePage);
            primaryStage.setTitle("Home Screen");
        });
        ReturnHome4.setOnAction(event -> {
            Root.getChildren().clear();
            Root.getChildren().add(HomePage);
            primaryStage.setTitle("Home Screen");
        });
        ReturnHome5.setOnAction(event -> {
            Root.getChildren().clear();
            Root.getChildren().add(HomePage);
            primaryStage.setTitle("Home Screen");
        });

        /// Buttons on User Registration Page START
        CreateUser.setOnAction(event ->{
            String inputName = NameField.getText();
            String inputID = IDField.getText();
            String inputAddress = AddressField.getText();
            String inputType = (String) TypeBox.getValue();
            // check to see if any fields are blank
            if(inputName.equals("") || inputID.equals("") || inputAddress.equals("")){
                displayError("Please Fill Out All Fields");
            }
            // check to see if input ID is numeric
            else if(!isNumeric(inputID)){
                displayError("Please Correct the ID");
            }
            // check to see if item id exist
            else if(check(customers, inputID)){
                displayError("User ID Already Exist");
            } else{
                //ADD to our database here //Ammar
                // Had trouble getting heibernate to work with java
//                Configuration configuration = new Configuration().configure();
//                configuration.addAnnotatedClass(Customer.class);
//                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
//                SessionFactory factory = configuration.buildSessionFactory(builder.build());
//                Session session = factory.openSession();
//
//                Customer tempCustomer = new Customer( Integer.parseInt(inputID),inputName, inputAddress,inputType);
//
//                session.beginTransaction();
//                session.save(tempCustomer);
//                session.getTransaction().commit();
//                session.close();

                System.out.println(customers.get(customers.size()-1).getName());
                //ADD to our database here
                customers.add(new Customer( Integer.parseInt(inputID),inputName, inputAddress,inputType));
                System.out.println(" USER ADDED ID: " + Integer.parseInt(inputID) + " NAME: " + inputName + " ADDRESS: " + inputAddress + " TYPE: " + inputType );
            }


        });
        UpdateUser.setOnAction(event -> {
            String inputName = NameField.getText();
            String inputID = IDField.getText();
            String inputAddress = AddressField.getText();
            String inputType = (String) TypeBox.getValue();
            //check to see if user id exist to update
            if(!check(customers,inputID)) {
                displayError("User ID does not Exist");
            }
            // check to see if anything wrong with id field
            else if(!isNumeric(inputID)){
                displayError("Please correct User ID");
            }
            //check to see if any fields are blank
            else if (inputName.equals("") || inputAddress.equals("")) {
                displayError("Please fill out all fields");

            } else {
                //****UPDATED to our database here****
                System.out.println(" USER UPDATED ID: " + Integer.parseInt(inputID) + " NAME: " + inputName + " ADDRESS: " + inputAddress + " TYPE: " + inputType);
            }
        });
        DeleteUser.setOnAction(event -> {
            String inputID = IDField.getText();
            //check to see if user id exist to update
            if(!check(customers,inputID)) {
                displayError("User ID does not Exist");
            }
            //check to see if any fields are blank
            else if (!isNumeric(inputID)) {
                displayError("Please Correct User ID");
            } else {
                //****UPDATED to our database here****
                System.out.println(" USER DELETED WITH ID: " + Integer.parseInt(inputID));
            }
        });
        /// Buttons on User Registration Page END


        /// Buttons on Add Food / Beverage Page START
        CreateItem.setOnAction(event ->{
            String inputItem = ItemField.getText();
            String inputItemID = ItemIDField.getText();
            String inputPrice = PriceField.getText();
            LocalDate inputDate = DateField.getValue();
            // check to see if any fields are blank
            if(inputItem.equals("") || inputItemID.equals("") || inputPrice.equals("")){
                displayError("Please Fill Out All Fields");
            }
            // check to see if input price is numeric
            else if(!isNumeric(inputPrice)){
                displayError("Please Correct the Price");
            }
            // check to see if item id is numeric
            else if(!isNumeric(inputItemID)){
                displayError("Please Correct the Item ID");
            }
            // check to see if item id exist
            else if(checkitems(dishes, inputItemID)){
                displayError("Item ID Already Exist");
            }
            else{
                //ADD to our database here
                dishes.add(new Dish(inputItem, Integer.parseInt(inputItemID),Double.parseDouble(inputPrice),inputDate));
                System.out.println(" ITEM ADDED ID: " + Integer.parseInt(inputItemID) + " ITEM: " + inputItem + " PRICE: " + Double.parseDouble(inputPrice) + " DATE: " + inputDate );
                DishPrice.getItems().add( Double.parseDouble(inputPrice));
                DishSelection.getItems().add(inputItem);
            }


        });
        UpdateItem.setOnAction(event -> {
            String inputItem = ItemField.getText();
            String inputItemID = ItemIDField.getText();
            String inputPrice = PriceField.getText();
            LocalDate inputDate = DateField.getValue();
            // check to see if any fields are blank
            if(inputItem.equals("") || inputItemID.equals("") || inputPrice.equals("")){
                displayError("Please Fill Out All Fields");
            }
            // check to see if input price is numeric
            else if(!isNumeric(inputPrice)){
                displayError("Please Correct the Price");
            }
            // check to see if item id is numeric
            else if(!isNumeric(inputItemID)){
                displayError("Please Correct the Item ID");
            }
            // check to see if item id exist
            else if(!checkitems(dishes, inputItemID)){
                displayError("Item ID Doesn't Exist");
            }
            else{
                //UPDATE to our database here
                System.out.println(" ITEM UPDATED ID: " + Integer.parseInt(inputItemID) + " ITEM: " + inputItem + " PRICE: " + Double.parseDouble(inputPrice) + " DATE: " + inputDate );
            }
        });
        DeleteItem.setOnAction(event -> {
            String inputID = ItemIDField.getText();
            //check to see if user id exist to update
            if(!checkitems(dishes,inputID)) {
                displayError("User ID does not Exist");
            }
            //check to see if any fields are blank
            else if (!isNumeric(inputID)) {
                displayError("Please Correct Item ID");
            } else {
                //****UPDATED to our database here****
                System.out.println(" ITEM DELETED WITH ID: " + Integer.parseInt(inputID));
            }
        });
        /// Buttons on Add Food / Beverage Page END

        /// Buttons on Order Page START
        AddToOrder.setOnAction(event ->{
            // add to order page boxes
            currentOrderArray.addToCart(dishes.get(DishSelection.getSelectionModel().getSelectedIndex()));
            currentOrder.getItems().add(DishSelection.getSelectionModel().getSelectedItem());
            TotalPrice.setText("" + currentOrderArray.getTotal());

            // add to receipt page boxes
            ReceiptDishes.getItems().add(DishSelection.getSelectionModel().getSelectedItem());
            ReceiptPrices.getItems().add(dishes.get(DishSelection.getSelectionModel().getSelectedIndex()).getPrice());
            ReceiptTotal.setText("" + currentOrderArray.getTotal());


        });

        DeleteFromOrder.setOnAction(event ->{
            if(currentOrder.getSelectionModel().isEmpty())
                displayError("Please Add Or Select an Item");
            else {
                // delete from order page
                currentOrderArray.deleteFromCart((String) currentOrder.getSelectionModel().getSelectedItem());
                currentOrder.getItems().remove(currentOrder.getSelectionModel().getSelectedIndex());
                TotalPrice.setText("" + currentOrderArray.getTotal());

                //delete from receipt page
                ReceiptDishes.getItems().remove(currentOrder.getSelectionModel().getSelectedIndex());
                ReceiptPrices.getItems().remove(currentOrder.getSelectionModel().getSelectedIndex());
                ReceiptTotal.setText("" + currentOrderArray.getTotal());
            }
        });

        PlaceOrderButton.setOnAction(event->{
            String inputID = CustomerIDField.getText();
            if(!check(customers,inputID)) {
                displayError("User ID does not Exist");
            }
            // check to see if anything wrong with id field
            else if(!isNumeric(inputID)){
                displayError("Please correct User ID");
            } else if(currentOrder.getItems().isEmpty()){
                displayError("Please Add Or Select an Item");
            }else {
                // THis should be done with key look up
                Boolean isStudent = false;
                for(int i = 0; i<customers.size();i++){
                    if(customers.get(i).getID() == Integer.parseInt(inputID)) {
                        ReceiptUser.setText(customers.get(i).getName());
                        if(customers.get(i).getCustomerType().equals("Student")){
                            isStudent = true;
                        }
                    }
                }
                ReceiptDate.setText(currentOrderArray.getDate().toString());
                currentOrderArray.setUserID(Integer.parseInt(inputID));
                if(isStudent){
                    ReceiptDiscount.setText("10%");
                    double roundVal = Math.round((Double.parseDouble(ReceiptTotal.getText()) * .9) * 100.0) / 100.0;
                    ReceiptDiscountTotal.setText("" + roundVal);
                } else{
                    ReceiptDiscount.setText("20%");
                    double roundVal = Math.round((Double.parseDouble(ReceiptTotal.getText()) * .8) * 100.0) / 100.0;
                    ReceiptDiscountTotal.setText("" + roundVal);
                }

                Root.getChildren().clear();
                Root.getChildren().add(ReceiptPage);
                primaryStage.setTitle("Receipt");
            }
        });
        PrintReceipt.setOnAction(event->{
            // add this order to our order array or database
            orders.add(new Order(currentOrderArray.getCart(), currentOrderArray.getTotal(), currentOrderArray.getUserID(), currentOrderArray.getDate(), false));

            //add to our insights from array or database
            InsightsIndexView.getItems().add(InsightsIndexView.getItems().size()+1);
            InsightsDateView.getItems().add(currentOrderArray.getDate());
            InsightsCustomerView.getItems().add(currentOrderArray.getUserID());
            InsightsTotalView.getItems().add("$ " + currentOrderArray.getTotal());
            if(currentOrderArray.getStatus()){
                OrderStatusView.getItems().add("Completed");
            } else{
                OrderStatusView.getItems().add("In Progress");
            }
            //add to our webapp
            StatusPageIndexView.getItems().add(StatusPageIndexView.getItems().size()+1);
            StatusPageDateView.getItems().add(currentOrderArray.getDate());
            StatusPageCustomerView.getItems().add(currentOrderArray.getUserID());
            StatusPageTotalView.getItems().add("$ " + currentOrderArray.getTotal());
            CheckBox toadd = new CheckBox();
            toadd.setSelected(false);
            StatusPageStatusView.getItems().add(toadd);

            // Reset our current order
            currentOrderArray.setCart(new ArrayList<Dish>());
            currentOrderArray.setTotal(0.0);
            currentOrderArray.setUserID(0);
            currentOrderArray.setDate(LocalDate.now());

            ReceiptDishes.getItems().clear();
            ReceiptPrices.getItems().clear();

            currentOrder.getItems().clear();
            TotalPrice.setText("0.0");
            // go back to home page
            Root.getChildren().clear();
            Root.getChildren().add(HomePage);
            primaryStage.setTitle("Home Screen");
        });
        /// Buttons on Order Page END

        /// STATUS Page Start
        setStatus.setOnAction(event->{
            StatusPageStatusView.getItems().remove(StatusPageIndexView.getSelectionModel().getSelectedIndex());
            orders.get(StatusPageIndexView.getSelectionModel().getSelectedIndex()).setStatus(!orders.get(StatusPageIndexView.getSelectionModel().getSelectedIndex()).getStatus());

            CheckBox toadd = new CheckBox();
            toadd.setSelected(orders.get(StatusPageIndexView.getSelectionModel().getSelectedIndex()).getStatus());
            StatusPageStatusView.getItems().add(StatusPageIndexView.getSelectionModel().getSelectedIndex(),toadd);

            OrderStatusView.getItems().remove(StatusPageIndexView.getSelectionModel().getSelectedIndex());
            if(orders.get(StatusPageIndexView.getSelectionModel().getSelectedIndex()).getStatus()) {
                OrderStatusView.getItems().add(StatusPageIndexView.getSelectionModel().getSelectedIndex(),"Completed");
            } else{
                OrderStatusView.getItems().add(StatusPageIndexView.getSelectionModel().getSelectedIndex(),"In Progress");
            }
        });
        /// Status Page End



        Scene secondScene = new Scene(StatusPageInsightsPage,800,300);
        Stage secondStage = new Stage();
        secondStage.setTitle("Status Page");
        secondStage.setResizable(false);
        secondStage.setScene(secondScene);
        secondStage.show();

        Scene scene = new Scene(Root,900,450);
        primaryStage.setTitle("Home Screen");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public boolean check(List<Customer> customerList, String idc){
        int idcheck;
        if(isNumeric(idc))
            idcheck = Integer.parseInt(idc);
        else
            return true;

            for(int i = 0; i<customerList.size(); i++){
                if(customerList.get(i).getID() == idcheck){
                    return true;
                }
            }
        return false;
    }

    public void displayError(String displaymessage){
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setHeaderText("Input not valid");
        errorAlert.setContentText(displaymessage);
        errorAlert.showAndWait();
    }
    public boolean checkitems(List<Dish> dishList, String idc){
        int idcheck;
        if(isNumeric(idc))
            idcheck = Integer.parseInt(idc);
        else
            return true;

        for(int i = 0; i<dishList.size(); i++){
            if(dishList.get(i).getID() == idcheck){
                return true;
            }
        }
        return false;
    }
    public boolean isNumeric(String strNum) {
        if (strNum == null || strNum.equals("")) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}