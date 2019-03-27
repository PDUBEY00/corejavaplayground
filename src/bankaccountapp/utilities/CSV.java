package bankaccountapp.utilities;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    public static List<String[]> readCsvFile(String file){
        List<String[]> dataCsv = new LinkedList<>();
        String dataRow = null;
        String[] dataColumn;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            while((dataRow = br.readLine()) != null){
                dataColumn = dataRow.split(",");
                dataCsv.add(dataColumn);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataCsv;
    }
}
