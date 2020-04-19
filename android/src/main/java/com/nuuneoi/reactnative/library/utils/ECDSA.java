package com.nuuneoi.reactnative.library.utils;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class ECDSA {

    public static KeyPair generateKeyPair() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC");
        ECGenParameterSpec ecSpec = new ECGenParameterSpec("prime256v1");
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        keyGen.initialize(ecSpec, random);
        KeyPair pair = keyGen.generateKeyPair();
        return pair;
    }

    public static PublicKey getPublicKey(byte[] pk) throws NoSuchAlgorithmException, InvalidKeySpecException {
        EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(pk);
        KeyFactory kf = KeyFactory.getInstance("EC");
        PublicKey pub = kf.generatePublic(publicKeySpec);
        return pub;
    }

    public static PrivateKey getPrivateKey(byte[] privk) throws NoSuchAlgorithmException, InvalidKeySpecException {
        EncodedKeySpec privateKeySpec = new X509EncodedKeySpec(privk);
        KeyFactory kf = KeyFactory.getInstance("EC");
        PrivateKey privateKey = kf.generatePrivate(privateKeySpec);
        return privateKey;
    }
}