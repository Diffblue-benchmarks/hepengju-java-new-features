package com.mysql.cj.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.mysql.cj.ServerVersion;
import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.exceptions.FeatureNotAvailableException;
import com.mysql.cj.exceptions.RSAException;
import com.mysql.cj.exceptions.SSLParamsException;
import com.mysql.cj.protocol.a.NativeSocketConnection;
import java.io.IOException;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import javax.net.ssl.SSLContext;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExportControlledTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getAcceptedIssuersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ExportControlled.X509TrustManagerWrapper(true, "'.")).getAcceptedIssuers().length);
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ExportControlled.X509TrustManagerWrapper(true, "'.")).getAcceptedIssuers().length);
  }

  @Test
  public void decodeRSAPublicKeyTest() throws RSAException {
    // Arrange, Act and Assert
    thrown.expect(RSAException.class);
    ExportControlled.decodeRSAPublicKey("5.5.45");
  }

  @Test
  public void isSSLEstablishedTest() {
    // Arrange, Act and Assert
    assertFalse(ExportControlled.isSSLEstablished(null));
  }

  @Test
  public void getSSLContextTest() throws SSLParamsException {
    // Arrange, Act and Assert
    thrown.expect(SSLParamsException.class);
    ExportControlled.getSSLContext("5.5.45", "5.5.45", "5.5.45", "5.5.45", "5.5.45", "5.5.45", true, true, "5.5.45",
        null);
  }

  @Test
  public void performTlsHandshakeTest() throws FeatureNotAvailableException, SSLParamsException, IOException {
    // Arrange
    NativeSocketConnection socketConnection = new NativeSocketConnection();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    ExportControlled.performTlsHandshake(null, socketConnection, ServerVersion.parseVersion("5.5.45"));
  }

  @Test
  public void enabledTest() {
    // Arrange, Act and Assert
    assertTrue(ExportControlled.enabled());
  }
}
