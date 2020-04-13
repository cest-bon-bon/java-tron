package org.tron.core.services.interfaceOnPBFT.http.PBFT;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tron.core.services.http.GetTransactionByIdServlet;
import org.tron.core.services.interfaceOnPBFT.WalletOnPBFT;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j(topic = "API")
public class GetTransactionByIdOnPBFTServlet
    extends GetTransactionByIdServlet {

  @Autowired
  private WalletOnPBFT walletOnPBFT;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    walletOnPBFT.futureGet(() -> super.doGet(request, response));
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) {
    walletOnPBFT.futureGet(() -> super.doPost(request, response));
  }
}