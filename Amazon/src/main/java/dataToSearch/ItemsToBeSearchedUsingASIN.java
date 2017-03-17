package dataToSearch;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by Sachin on 09-01-2017.
 */
public class ItemsToBeSearchedUsingASIN {
    DataReader dataReader = new DataReader();
    public String [] getData() throws IOException{
        String path = System.getProperty("user.dir")+"/data/AmazonTestSearchUsingASIN.xls";
        String [] output = dataReader.colReader(path,1);

        return output;
    }
    public String [] getAssertData() throws IOException{
            String path = System.getProperty("user.dir")+"/data/AmazonTestSearchUsingASIN.xls";
            String [] output = dataReader.colReader(path,2);

            return output;
    }
    public String [] getDepartment() throws IOException{
        String path = System.getProperty("user.dir")+"/data/AmazonTestSearchUsingASIN.xls";
        String [] output = dataReader.colReader(path,3);

        return output;
    }

}
