package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Execution (
  execID: String,
orderID: Option[String],
clOrdID: Option[String],
clOrdLinkID: Option[String],
account: Option[Number],
symbol: Option[String],
side: Option[String],
lastQty: Option[Number],
lastPx: Option[Double],
underlyingLastPx: Option[Double],
lastMkt: Option[String],
lastLiquidityInd: Option[String],
simpleOrderQty: Option[Double],
orderQty: Option[Number],
price: Option[Double],
displayQty: Option[Number],
stopPx: Option[Double],
pegOffsetValue: Option[Double],
pegPriceType: Option[String],
currency: Option[String],
settlCurrency: Option[String],
execType: Option[String],
ordType: Option[String],
timeInForce: Option[String],
execInst: Option[String],
contingencyType: Option[String],
exDestination: Option[String],
ordStatus: Option[String],
triggered: Option[String],
workingIndicator: Option[Boolean],
ordRejReason: Option[String],
simpleLeavesQty: Option[Double],
leavesQty: Option[Number],
simpleCumQty: Option[Double],
cumQty: Option[Number],
avgPx: Option[Double],
commission: Option[Double],
tradePublishIndicator: Option[String],
multiLegReportingType: Option[String],
text: Option[String],
trdMatchID: Option[String],
execCost: Option[Number],
execComm: Option[Number],
homeNotional: Option[Double],
foreignNotional: Option[Double],
transactTime: Option[DateTime],
timestamp: Option[DateTime]
)