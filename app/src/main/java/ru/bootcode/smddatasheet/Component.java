package ru.bootcode.smddatasheet;

import androidx.room.*;

import java.util.List;


/*
 * Created by Stepchenkov Sergey on 25.07.2018.
 * Класс описывает структу Компонента
 *
 * Немного избыточен, надо бы почистить после ближайщих тестов
 */
@Entity(tableName = "components")
public class Component {
    @PrimaryKey(autoGenerate = true)
    private long id;                    // идентификатор записи в базе данных

    private String name;               // Наименование Компонента
    private String body;               // Кодировка корпуса
    private String label;               // Маркировка наносимая на SMD
    private String prod;               // Производитель
    private String func;               // Описание (Назначение - Транзистор, Диод...)
    private String datasheet;          // Ссылка(имя файла PDF) на даташит расположенного на сервере
    private int favorite;
    private int islocal;

        public Component(long id, String name, String body, String label, String prod, String func, String datasheet, int favorite, int islocal){
            this.id = id;
            this.name = name;
            this.body = body;
            this.label = label;
            this.prod = prod;
            this.func = func;
            this.datasheet = datasheet;
            this.favorite =favorite;
            this.islocal= islocal;
        }
    /*
    public Component(int id, String body, String label, String func){
        this.id = id;
        this.name = "";
        this.body = body;
        this.label = label;
        this.prod = "";
        this.func = func;
        this.datasheet = "";
    }
*/



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public String getDatasheet() {
        return datasheet;
    }

    public void setDatasheet(String datasheet) {
        this.datasheet = datasheet;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    public int getIslocal() {
        return islocal;
    }

    public void setIslocal(int islocal) {
        this.islocal = islocal;
    }


}
