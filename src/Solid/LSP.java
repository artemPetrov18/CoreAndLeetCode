package Solid;

public class LSP {
    /*
    * Принцип подстановки Барбары Лисков - суть принцыпа в том что наследующия сущность должна виполнять все
    * методи родителе без измений их. Тоесть не выкидывать ошибку
    *
    *
    *
    *
    *
    *
    * */

}

/*
class DataBase{
    void write(){}
    void read(){}
    void jointables(){}
}

class MySQLDatabase extends DataBase{
    @Override
    void write() {
        super.write();
    }

    @Override
    void read() {
        super.read();
    }

    @Override
    void jointables() {
        super.jointables();
    }
}
class MongoDBDatabase extends DataBase{
    @Override
    void write() {
        super.write();
    }

    @Override
    void read() {
        super.read();
    }

    @Override
    void jointables() {              // не по солид
        throw new Error("nety tabliz");
    }
}
*/
class DataBase{                 // Проблема реешна путьм создания еще одного класа
    void write(){}
    void read(){}

}
class SQLDataBase extends DataBase{
    void write(){}
    void read(){}
    void jointables(){}
}

class NOSQLDataBase extends DataBase{
    void write(){}
    void read(){}
    void createIndex(){}
}




class MySQLDatabase extends SQLDataBase{
    @Override
    void write() {
        super.write();
    }

    @Override
    void jointables() {
        super.jointables();
    }

    @Override
    void read() {
        super.read();
    }


}
class MongoDBDatabase extends NOSQLDataBase{
    @Override
    void write() {
        super.write();
    }

    @Override
    void read() {
        super.read();
    }

    @Override
    void createIndex() {
        super.createIndex();
    }
}
