package org.apereo.cas.configuration.model.core.web.security;

import org.apereo.cas.configuration.support.RequiresModule;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;

/**
 * This is {@link HttpWebRequestProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.3.0
 */
@RequiresModule(name = "cas-server-core-web", automated = true)
public class HttpWebRequestProperties implements Serializable {
    private static final long serialVersionUID = -4711604991237695091L;
    /**
     * Control and specify the encoding for all http requests.
     */
    private String encoding = StandardCharsets.UTF_8.name();
    /**
     * Whether specified encoding should be forced for every request.
     * Whether the specified encoding is supposed to
     * override existing request and response encodings
     */
    private boolean forceEncoding = true;

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(final String encoding) {
        this.encoding = encoding;
    }

    public boolean isForceEncoding() {
        return forceEncoding;
    }

    public void setForceEncoding(final boolean forceEncoding) {
        this.forceEncoding = forceEncoding;
    }
}
