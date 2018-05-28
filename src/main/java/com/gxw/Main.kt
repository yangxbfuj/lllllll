package com.gxw

import javafx.application.Application
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import javafx.scene.layout.HBox
import javafx.scene.layout.StackPane
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import javafx.scene.text.Text
import javafx.stage.Stage

class Main : Application() {

    companion object {
        fun main(args: Array<String>) {
            Application.launch()
        }
    }

    override fun start(primaryStage: Stage) {
        primaryStage.title = "Gxw"
//        val root = StackPane()
//        primaryStage.scene = Scene(root, 300.0, 250.0)
        val grid = GridPane()
        grid.alignment = Pos.CENTER
        grid.hgap = 10.0
        grid.vgap = 10.0
        grid.padding = Insets(25.0)
        val scene = Scene(grid, 300.0, 275.0)
        primaryStage.scene = scene
        val sceneTitle = Text("Welcome")
        sceneTitle.font = Font.font("Tahoma", FontWeight.NORMAL, 20.0)
        grid.add(sceneTitle, 0, 0, 2, 1)
        val userName = Label("User Name:")
        grid.add(userName, 0, 1)
        val userTextField = TextField()
        grid.add(userTextField, 1, 1)
        val pw = Label("Password:")
        grid.add(pw, 0, 2)
        val pwBox = PasswordField()
        grid.add(pwBox, 1, 2)
//        grid.isGridLinesVisible = true
        val btn = Button("Sign in")
        val hbBtn = HBox(10.0)
        hbBtn.alignment = Pos.BOTTOM_RIGHT
        hbBtn.children.add(btn)
        grid.add(hbBtn, 1, 4)
        val actionTarget = Text()
        grid.add(actionTarget, 1, 6)
        btn.setOnAction { actionTarget.text = "user : ${userTextField.text}  password : ${pwBox.text}" }
        primaryStage.show()
    }
} 