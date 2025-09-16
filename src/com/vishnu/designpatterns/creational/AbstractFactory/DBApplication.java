package com.vishnu.designpatterns.creational.AbstractFactory;

public class DBApplication {
    private Connection connection;
    private Command command;

    public DBApplication(DBFactory factory) {
        this.connection = factory.createConnection();
        this.command = factory.createCommand();
    }

    public void run() {
        connection.connect();
        command.execute("SELECT * FROM users");
    }

    public static void main(String[] args) {
        DBFactory factory;

        String db = "Oracle"; // could come from config
        if (db.equals("MySQL")) {
            factory = new MySQLFactory();
        } else {
            factory = new OracleFactory();
        }

        DBApplication app = new DBApplication(factory);
        app.run();
    }
}

