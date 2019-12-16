package com.mysql.cj.protocol.x;

import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;
import com.mysql.cj.protocol.ProtocolEntity;
import com.mysql.cj.protocol.ProtocolEntityFactory;
import com.mysql.cj.xdevapi.UpdateResultBuilder;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResultMessageListenerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
//failed_compile @Test
//  public void processMessageTest() {
//    // Arrange
//    ResultMessageListener<Object> resultMessageListener = new ResultMessageListener<Object>(null,
//        new UpdateResultBuilder<Object>(), null);
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    resultMessageListener.processMessage(new XMessage(new XMessage(new XMessage(null))));
//  }
}
