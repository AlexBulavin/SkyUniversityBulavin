package com.example.skyunivercitybulavin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var recipeImage: ImageView

    var drawableSelection: Int = R.drawable.device_350x600
    var selector: Int = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar

        // Set the action bar title, subtitle and elevation
        actionBar!!.title = "Все рецепты"
        actionBar.subtitle = "Выберте тип рецепта"
        actionBar.elevation = 4.0F

        recipeImage = findViewById(R.id.recipe_image)
        recipeImage.setOnClickListener{takeRecipe()}
    }
    // 1 Хлеб,
    // 2 Каша,
    // 3 Десерты,
    // 4 Напитки,
    // 5 Варенье,
    // 6 Осн. блюдо,
    // 7 Пицца и пироги,
    // 8 Салаты
    private fun takeRecipe() {
        //Динамическая смена рецептов по клику на картинке внутри каждого раздела.

        val randomInt = Random().nextInt(8)
        val recipeName = when (randomInt) {
            0 -> "Название рецепта 1"
            1 -> "Название рецепта 2"
            2 -> "Название рецепта 3"
            3 -> "Название рецепта 4"
            4 -> "Название рецепта 5"
            5 -> "Название рецепта 6"
            6 -> "Название рецепта 7"
            7 -> "Название рецепта 8"
            8 -> "Название рецепта 9"
            9 -> "Название рецепта 10"
            10 -> "Название рецепта 11"
            
            else -> "Рецепт не найден"
        }
        val RecipeDescriptionSelector = when (randomInt) {
            0 -> getString(R.string.description_0)
            1 -> getString(R.string.description_1)
            2 -> getString(R.string.description_2)
            3 -> getString(R.string.description_3)
            4 -> getString(R.string.description_4)
            5 -> getString(R.string.description_5)
            6 -> getString(R.string.description_6)
            7 -> getString(R.string.description_7)
            8 -> getString(R.string.description_8)
            9 -> getString(R.string.description_9)
            10 -> getString(R.string.description_10)


            else -> "Описание не найдено"
        }
//            recipeImage.setImageDrawable(Drawable.createFromPath(drawableResource))
//        var  resourceId: Int = this.getResources().getIdentifier(drawableResource, "id", this.getPackageName())
        when (selector) {
            1 -> drawableSelection = when (randomInt) {
                    0-> R.drawable.bread_350x600_2
                    1-> R.drawable.bread_350x600_3
                    2-> R.drawable.bread_350x600_9
                    3-> R.drawable.bread_350x600_10
                    4-> R.drawable.bread_350x600_11
                    5-> R.drawable.bread_350x600_12
                    6-> R.drawable.bread_350x600_25
                    7-> R.drawable.bread_350x600_37
                    8-> R.drawable.bread_350x600_38

                    else -> R.drawable.bread_350x600_3
                }
            2 -> drawableSelection = when (randomInt) {
                    0-> R.drawable.cereal_oatmel_350x600_22
                    1-> R.drawable.cereal_oatmel_350x600_22

                    else -> R.drawable.cereal_oatmel_350x600_22
            }
            3 -> drawableSelection = when (randomInt) {
            0-> R.drawable.desserts_350x600_27
            1-> R.drawable.desserts_350x600_40
            2-> R.drawable.desserts_350x600_42

            else -> R.drawable.desserts_350x600_27
        }
            4 -> drawableSelection = when (randomInt) {
            0-> R.drawable.drinks_350x600_21
            1-> R.drawable.drinks_350x600_39

            else -> R.drawable.drinks_350x600_21
        }
            5 -> drawableSelection = when (randomInt) {
            0-> R.drawable.jam_350x600_8
            1-> R.drawable.jam_350x600_17
            2-> R.drawable.jam_350x600_18
            3-> R.drawable.jam_350x600_19
            4-> R.drawable.jam_350x600_20
            5-> R.drawable.jam_350x600_26

            else -> R.drawable.jam_350x600_8
        }
            6 -> drawableSelection = when (randomInt) {
            0-> R.drawable.main_course_350x600
            1-> R.drawable.main_course_350x600_23
            2-> R.drawable.main_course_350x600_24
            3-> R.drawable.main_course_350x600_28
            4-> R.drawable.main_course_350x600_30
            5-> R.drawable.main_course_350x600_31
            6-> R.drawable.main_course_350x600_32
            7-> R.drawable.main_course_350x600_34
            8-> R.drawable.main_course_350x600_41

            else -> R.drawable.main_course_350x600
        }
            7 -> drawableSelection = when (randomInt) {
            0-> R.drawable.pie_pizza_350x600_13
            1-> R.drawable.pie_pizza_350x600_14
            2-> R.drawable.pie_pizza_350x600_15
            3-> R.drawable.pie_pizza_350x600_16
            4-> R.drawable.pie_pizza_350x600_35
            5-> R.drawable.pie_pizza_350x600_36

            else -> R.drawable.pie_pizza_350x600_13
        }
            8 -> drawableSelection = when (randomInt) {
            0-> R.drawable.salads_350x600_5
            1-> R.drawable.salads_350x600_6
            2-> R.drawable.salads_350x600_7
            3-> R.drawable.salads_350x600_29

            else -> R.drawable.salads_350x600_5
        }
            1000-> drawableSelection = when (randomInt) {
                0-> R.drawable.model_1_350x600
                1-> R.drawable.device_350x600
                2-> R.drawable.model_350x600_52
                4-> R.drawable.model_350x600_53
                5-> R.drawable.model_350x600_54
                6-> R.drawable.model_350x600_55
                7-> R.drawable.model_350x600_56
                8-> R.drawable.model_350x600_57
                9-> R.drawable.model_350x600_58
                10-> R.drawable.model_350x600_59
                11-> R.drawable.model_350x600_60

                else -> R.drawable.model_350x600_61
            }
        else -> drawableSelection = R.drawable.device_350x600
        }

        recipeImage.setImageResource(drawableSelection) //(resourceId)
        getSupportActionBar()?.setSubtitle(recipeName)
        textView.setText(Html.fromHtml(RecipeDescriptionSelector))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle presses on the action bar menu items

        when (item.itemId) {
            R.id.action_settings -> {
                drawableSelection = R.drawable.device_350x600
                selector = 1000
                getSupportActionBar()?.setTitle("Все рецепты")
                getSupportActionBar()?.setSubtitle("Выберте тип рецепта")
                recipeImage.setImageResource(drawableSelection)
                return true
            }
            R.id.action_select_bread -> {
                selector = 1
                getSupportActionBar()?.setTitle("Хлеб")
                recipeImage.setImageResource(drawableSelection)
                return true
            }
            R.id.action_select_cereal_oatmel -> {
                selector = 2
                getSupportActionBar()?.setTitle("Каши")
                recipeImage.setImageResource(drawableSelection)
                return true
            }
            R.id.action_select_desserts -> {
                selector = 3
                getSupportActionBar()?.setTitle("Десерты")
                recipeImage.setImageResource(drawableSelection)
                return true
            }
            R.id.action_select_drinks -> {
                selector = 4
                getSupportActionBar()?.setTitle("Напитки")
                recipeImage.setImageResource(drawableSelection)
                return true
            }
            R.id.action_select_jam -> {
                selector = 5
                getSupportActionBar()?.setTitle("Варенье")
                recipeImage.setImageResource(drawableSelection)
                return true
            }
            R.id.action_select_main_course -> {
                selector = 6
                getSupportActionBar()?.setTitle("Основное блюдо")
                recipeImage.setImageResource(drawableSelection)
                return true
            }
            R.id.action_select_pie_pizza-> {
                selector = 7
                getSupportActionBar()?.setTitle("Пироги и Пицца")
                recipeImage.setImageResource(drawableSelection)
                return true
            }
            R.id.action_select_salads -> {
                selector = 8
                getSupportActionBar()?.setTitle("Салаты")
                recipeImage.setImageResource(drawableSelection)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
