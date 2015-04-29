package de.dhbw.socialfunnel.todo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import com.vaadin.server.VaadinService;

public class PWCrypt implements Serializable {
	private static final long serialVersionUID = -5369236816700070453L;

	private static PWCrypt pwc;

	private Key key = null;
	private final String verfahren = "AES";

	private PWCrypt() throws Exception {
		this.key = getKey();
	}

	public static PWCrypt getInstance() throws Exception {
		if (pwc == null) pwc = new PWCrypt();
		return pwc;
	}

	public String encrypt(String input) throws Exception {
		Cipher cipher = Cipher.getInstance(verfahren);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		return new BASE64Encoder().encode(cipher.doFinal(input.getBytes()));
	}

	public String decrypt(String input) throws Exception {
		Cipher cipher = Cipher.getInstance(verfahren);
		cipher.init(Cipher.DECRYPT_MODE, key);
		return new String(cipher.doFinal(new BASE64Decoder().decodeBuffer(input)));
	}

	private SecretKey getKey() {
		try {
			String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
			File key = new File(basepath + "/WEB-INF/lib/key.dat");
			FileInputStream fis = new FileInputStream(key);
			byte[] encodedKey = new byte[(int) key.length()];
			fis.read(encodedKey);
			fis.close();
			return new SecretKeySpec(encodedKey, verfahren);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}