package ordersJDBC;

public class StringSQL {
    private String fieldOne;
    private String fieldTwo;
    private String table;
    private String valueOne;
    private String valueTwo;

    public StringSQL(String fieldOne, String fieldTwo, String table, String valueOne, String valueTwo) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
        this.table = table;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public StringSQL() {
    }
    public String getText(){
        String sql = "INSERT INTO "+table+ " ("+fieldOne+", "+fieldTwo+" ) VALUES ("+valueOne+", "+valueTwo+");";
        System.out.println(sql);
        return sql;
    }
}
