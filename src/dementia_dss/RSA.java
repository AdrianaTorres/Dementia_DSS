/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dementia_dss;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;

/**
 *
 * @author adria
 */
public class RSA {

    public static Map<String, Object> createKeys() {
        try {
            // Create and initialize the key generator:
            KeyPairGenerator keysGenerator = KeyPairGenerator.getInstance("RSA");
            keysGenerator.initialize(2048);

            // Generate the keys:
            KeyPair keyPair = keysGenerator.generateKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            // Put the keys in a Map variable for the method to return them:
            Map<String, Object> keys = new HashMap<String, Object>();
            keys.put("private", privateKey);
            keys.put("public", publicKey);
            return keys;
        } catch (Exception e) {
            System.out.println("The keys weren't generated correctly.");
            return null;
        }
    }

    public static String encryptPassword(String password, PublicKey publicKey) {
        try {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] encryptedPassword = cipher.doFinal(password.getBytes());
            String encryptedPass = Base64.getEncoder().encodeToString(encryptedPassword);
            return encryptedPass;
        } catch (Exception e) {
            System.out.println("The message could not be encrypted.");
            String error = "The message could not be encrypted.";
            return error;
        }

    }

    public static String decryptPassword(String password, PrivateKey privateKey) {
        try {
            Cipher cipher = Cipher.getInstance("RSA");
            System.out.println("He hecho el cipher");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            System.out.println("He hecho el cipher init");
            byte[] decryptedPassword = cipher.doFinal(Base64.getDecoder().decode(password));
            System.out.println("He hecho el byte[]");
            String decryptedPass = new String(decryptedPassword);
            System.out.println("Fiiiin");
            return decryptedPass;
        } catch (Exception e) {
            String error = "The message could not be decrypted.";
            return error;
        }

    }

}
