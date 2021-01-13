
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *"mongodb+srv://KevinAdmin:<Kevin1>@cluster0.5k69f.mongodb.net/ejemplo1?retryWrites=true&w=majority");
 * @author Kevin Manjarrez
 */
public class ConexionAtlas extends MongoClient {
   
    public ConexionAtlas (MongoClientURI direccionConexion){
        super(direccionConexion);
    }

}
