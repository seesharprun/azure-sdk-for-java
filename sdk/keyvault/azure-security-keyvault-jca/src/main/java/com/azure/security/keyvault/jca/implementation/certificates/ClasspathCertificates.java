// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.jca.implementation.certificates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import static com.azure.security.keyvault.jca.implementation.utils.CertificateUtil.loadX509CertificateFromFile;
import static com.azure.security.keyvault.jca.implementation.utils.CertificateUtil.loadX509CertificatesFromFile;
import static java.util.logging.Level.INFO;
import static java.util.logging.Level.WARNING;

/**
 * Store certificates loaded from classpath.
 */
public final class ClasspathCertificates implements AzureCertificates {

    /**
     * Stores the logger.
     */
    private static final Logger LOGGER = Logger.getLogger(ClasspathCertificates.class.getName());

    /**
     * Store certificates' alias.
     */
    private final List<String> aliases = new ArrayList<>();

    /**
     * Stores the certificates by alias.
     */
    private final Map<String, Certificate> certificates = new HashMap<>();

    /**
     * Stores the certificate chains by alias.
     */
    private final Map<String, Certificate[]> certificateChains = new HashMap<>();

    /**
     * Stores the certificate keys by alias.
     */
    private final Map<String, Key> certificateKeys = new HashMap<>();

    /**
     * Get certificate aliases.
     * @return certificate aliases
     */
    @Override
    public List<String> getAliases() {
        return aliases;
    }

    /**
     * Get certificates.
     * @return certificates
     */
    @Override
    public Map<String, Certificate> getCertificates() {
        return certificates;
    }

    /**
     * Get certificate chains.
     * @return certificate chains
     */
    @Override
    public Map<String, Certificate[]> getCertificateChains() {
        return certificateChains;
    }

    /**
     * Get certificate keys.
     * @return certificate keys
     */
    @Override
    public Map<String, Key> getCertificateKeys() {
        return certificateKeys;
    }

    /**
     * Add certificate.
     * @param alias certificate alias
     * @param certificate certificate
     */
    public void setCertificateEntry(String alias, Certificate certificate) {
        if (!aliases.contains(alias)) {
            aliases.add(alias);
            certificates.put(alias, certificate);
            certificateChains.put(alias, new Certificate[] { certificate });
        }
    }

    /**
     * Delete certificate info by alias if exits
     * @param alias certificate alias
     */
    @Override
    public void deleteEntry(String alias) {
        aliases.remove(alias);
        certificates.remove(alias);
        certificateKeys.remove(alias);
        certificateChains.remove(alias);
    }

    /**
     * Side-load certificate from classpath.
     */
    public void loadCertificatesFromClasspath() {
        try {
            String[] filenames = getFilenames("/keyvault");
            for (String filename : filenames) {
                try (InputStream inputStream = getClass().getResourceAsStream("/keyvault/" + filename)) {
                    String alias = filename;
                    if (alias != null) {
                        if (alias.lastIndexOf('.') != -1) {
                            alias = alias.substring(0, alias.lastIndexOf('.'));
                        }
                        try {
                            Certificate certificate = loadX509CertificateFromFile(inputStream);
                            setCertificateEntry(alias, certificate);
                            certificateChains.put(alias, loadX509CertificatesFromFile(inputStream));
                            LOGGER.log(INFO, "Side loaded certificate: {0} from: {1}",
                                new Object[] { alias, filename });
                        } catch (CertificateException e) {
                            LOGGER.log(WARNING, "Unable to side-load certificate from: " + filename, e);
                        }
                    }
                }
            }
        } catch (IOException ioe) {
            LOGGER.log(WARNING, "Unable to determine certificates to side-load", ioe);
        }
    }

    /**
     * Get the filenames.
     *
     * @param path the path.
     * @return the filenames.
     * @throws IOException when an I/O error occurs.
     */
    private String[] getFilenames(String path) throws IOException {
        List<String> filenames = new ArrayList<>();
        try (InputStream in = getClass().getResourceAsStream(path)) {
            if (!Objects.isNull(in)) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
                    String resource;
                    while ((resource = br.readLine()) != null) {
                        filenames.add(resource);
                    }
                }
            }
        }
        return filenames.toArray(new String[0]);
    }
}
