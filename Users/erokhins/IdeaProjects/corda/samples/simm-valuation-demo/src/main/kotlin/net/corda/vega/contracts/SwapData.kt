'_notional' @ [30:84] ==> value-parameter _notional: BigDecimal defined in net.corda.vega.contracts.FixedLeg.<init>[ValueParameterDescriptorImpl]

'BUY' @ [30:135] ==> enum entry BUY defined in com.opengamma.strata.product.common.BuySell[FakeCallableDescriptorForObject]

'-' @ [35:87] ==> @InlineOnly public operator inline fun BigDecimal.unaryMinus(): BigDecimal defined in kotlin[DeserializedSimpleFunctionDescriptor]

'_notional' @ [35:88] ==> value-parameter _notional: BigDecimal defined in net.corda.vega.contracts.FloatingLeg.<init>[ValueParameterDescriptorImpl]

'SELL' @ [35:139] ==> enum entry SELL defined in com.opengamma.strata.product.common.BuySell[FakeCallableDescriptorForObject]

'CordaSerializable' @ [40:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'if (party == buyer.second) FixedLeg(notional) else FloatingLeg(notional)' @ [54:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Leg, elseBranch: Leg): Leg[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Leg

'party' @ [54:20] ==> value-parameter party: AbstractParty defined in net.corda.vega.contracts.SwapData.getLegForParty[ValueParameterDescriptorImpl]

'buyer' @ [54:29] ==> public final val buyer: Pair<String, PublicKey> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'second' @ [54:35] ==> public final val second: PublicKey defined in kotlin.Pair[DeserializedPropertyDescriptor]

'FixedLeg' @ [54:43] ==> public constructor FixedLeg(_notional: BigDecimal, notional: BigDecimal = ..., buySell: BuySell = ...) defined in net.corda.vega.contracts.FixedLeg[ClassConstructorDescriptorImpl]

'notional' @ [54:52] ==> public final val notional: BigDecimal defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'FloatingLeg' @ [54:67] ==> public constructor FloatingLeg(_notional: BigDecimal, notional: BigDecimal = ..., buySell: BuySell = ...) defined in net.corda.vega.contracts.FloatingLeg[ClassConstructorDescriptorImpl]

'notional' @ [54:79] ==> public final val notional: BigDecimal defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'getTrade' @ [58:16] ==> private final fun getTrade(buySell: BuySell, party: Pair<String, PublicKey>): SwapTrade defined in net.corda.vega.contracts.SwapData[SimpleFunctionDescriptorImpl]

'BUY' @ [58:33] ==> enum entry BUY defined in com.opengamma.strata.product.common.BuySell[FakeCallableDescriptorForObject]

'Pair' @ [58:38] ==> public constructor Pair<out A, out B>(first: String, second: PublicKey) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> PublicKey

'buyer' @ [58:52] ==> public final val buyer: Pair<String, PublicKey> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'second' @ [58:58] ==> public final val second: PublicKey defined in kotlin.Pair[DeserializedPropertyDescriptor]

'getTrade' @ [62:16] ==> private final fun getTrade(buySell: BuySell, party: Pair<String, PublicKey>): SwapTrade defined in net.corda.vega.contracts.SwapData[SimpleFunctionDescriptorImpl]

'SELL' @ [62:33] ==> enum entry SELL defined in com.opengamma.strata.product.common.BuySell[FakeCallableDescriptorForObject]

'Pair' @ [62:39] ==> public constructor Pair<out A, out B>(first: String, second: PublicKey) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> PublicKey

'seller' @ [62:53] ==> public final val seller: Pair<String, PublicKey> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'second' @ [62:60] ==> public final val second: PublicKey defined in kotlin.Pair[DeserializedPropertyDescriptor]

'builder' @ [66:35] ==> public open fun builder(): (TradeInfoBuilder..TradeInfoBuilder?) defined in com.opengamma.strata.product.TradeInfo[JavaMethodDescriptor]

'id' @ [67:18] ==> public open fun id(p0: (StandardId..StandardId?)): (TradeInfoBuilder..TradeInfoBuilder?) defined in com.opengamma.strata.product.TradeInfoBuilder[JavaMethodDescriptor]

'of' @ [67:32] ==> public open fun of(p0: (String..String?), p1: (String..String?)): (StandardId..StandardId?) defined in com.opengamma.strata.basics.StandardId[JavaMethodDescriptor]

'id' @ [67:35] ==> public final val id: Pair<String, String> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'first' @ [67:38] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'id' @ [67:45] ==> public final val id: Pair<String, String> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'second' @ [67:48] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'addAttribute' @ [68:18] ==> public open fun <T : (Any..Any?)> addAttribute(p0: (TradeAttributeType<(String..String?)>..TradeAttributeType<(String..String?)>?), p1: (String..String?)): (TradeInfoBuilder..TradeInfoBuilder?) defined in com.opengamma.strata.product.TradeInfoBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'DESCRIPTION' @ [68:50] ==> public final val DESCRIPTION: (TradeAttributeType<(String..String?)>..TradeAttributeType<(String..String?)>?) defined in com.opengamma.strata.product.TradeAttributeType[JavaPropertyDescriptor]

'description' @ [68:63] ==> public final val description: String defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'counterparty' @ [69:18] ==> public open fun counterparty(p0: (StandardId..StandardId?)): (TradeInfoBuilder..TradeInfoBuilder?) defined in com.opengamma.strata.product.TradeInfoBuilder[JavaMethodDescriptor]

'of' @ [69:42] ==> public open fun of(p0: (String..String?), p1: (String..String?)): (StandardId..StandardId?) defined in com.opengamma.strata.basics.StandardId[JavaMethodDescriptor]

'party' @ [69:45] ==> value-parameter party: Pair<String, PublicKey> defined in net.corda.vega.contracts.SwapData.getTrade[ValueParameterDescriptorImpl]

'first' @ [69:51] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'party' @ [69:58] ==> value-parameter party: Pair<String, PublicKey> defined in net.corda.vega.contracts.SwapData.getTrade[ValueParameterDescriptorImpl]

'second' @ [69:64] ==> public final val second: PublicKey defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toBase58String' @ [69:71] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'build' @ [70:18] ==> public open fun build(): (TradeInfo..TradeInfo?) defined in com.opengamma.strata.product.TradeInfoBuilder[JavaMethodDescriptor]

'getSwapConvention' @ [72:16] ==> private final fun getSwapConvention(name: String): FixedIborSwapConvention defined in net.corda.vega.contracts.SwapData[SimpleFunctionDescriptorImpl]

'convention' @ [72:34] ==> public final val convention: String defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'createTrade' @ [72:46] ==> public open fun createTrade(p0: (LocalDate..LocalDate?), p1: (Tenor..Tenor?), p2: (BuySell..BuySell?), p3: Double, p4: Double, p5: (ReferenceData..ReferenceData?)): (SwapTrade..SwapTrade?) defined in com.opengamma.strata.product.swap.type.FixedIborSwapConvention[JavaMethodDescriptor]

'startDate' @ [72:58] ==> public final val startDate: LocalDate defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'TENOR_4Y' @ [72:75] ==> public final val TENOR_4Y: (Tenor..Tenor?) defined in com.opengamma.strata.basics.date.Tenor[JavaPropertyDescriptor]

'buySell' @ [72:85] ==> value-parameter buySell: BuySell defined in net.corda.vega.contracts.SwapData.getTrade[ValueParameterDescriptorImpl]

'notional' @ [72:94] ==> public final val notional: BigDecimal defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'toDouble' @ [72:103] ==> public open fun toDouble(): Double defined in java.math.BigDecimal[JavaMethodDescriptor]

'fixedRate' @ [72:115] ==> public final val fixedRate: BigDecimal defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'toDouble' @ [72:125] ==> public open fun toDouble(): Double defined in java.math.BigDecimal[JavaMethodDescriptor]

'standard' @ [72:151] ==> public open fun standard(): (ReferenceData..ReferenceData?) defined in com.opengamma.strata.basics.ReferenceData[JavaMethodDescriptor]

'toBuilder' @ [73:18] ==> public open fun toBuilder(): (SwapTrade.Builder..SwapTrade.Builder?) defined in com.opengamma.strata.product.swap.SwapTrade[JavaMethodDescriptor]

'info' @ [74:18] ==> public open fun info(p0: (TradeInfo..TradeInfo?)): (SwapTrade.Builder..SwapTrade.Builder?) defined in com.opengamma.strata.product.swap.SwapTrade.Builder[JavaMethodDescriptor]

'tradeInfo' @ [74:23] ==> val tradeInfo: (TradeInfo..TradeInfo?) defined in net.corda.vega.contracts.SwapData.getTrade[LocalVariableDescriptor]

'build' @ [75:18] ==> public open fun build(): (SwapTrade..SwapTrade?) defined in com.opengamma.strata.product.swap.SwapTrade.Builder[JavaMethodDescriptor]

'when (name) {
            "USD_FIXED_6M_LIBOR_3M" -> FixedIborSwapConventions.USD_FIXED_6M_LIBOR_3M
            "EUR_FIXED_1Y_EURIBOR_3M" -> FixedIborSwapConventions.EUR_FIXED_1Y_EURIBOR_3M
            "EUR_FIXED_1Y_EURIBOR_6M" -> FixedIborSwapConventions.EUR_FIXED_1Y_EURIBOR_6M
            "USD_FIXED_1Y_LIBOR_3M" -> FixedIborSwapConventions.USD_FIXED_1Y_LIBOR_3M
            "GBP_FIXED_1Y_LIBOR_3M" -> FixedIborSwapConventions.GBP_FIXED_1Y_LIBOR_3M
            "GBP_FIXED_6M_LIBOR_6M" -> FixedIborSwapConventions.GBP_FIXED_6M_LIBOR_6M
            "GBP_FIXED_3M_LIBOR_3M" -> FixedIborSwapConventions.GBP_FIXED_3M_LIBOR_3M
            "CHF_FIXED_1Y_LIBOR_3M" -> FixedIborSwapConventions.CHF_FIXED_1Y_LIBOR_3M
            "CHF_FIXED_1Y_LIBOR_6M" -> FixedIborSwapConventions.CHF_FIXED_1Y_LIBOR_6M
            "JPY_FIXED_6M_TIBORJ_3M" -> FixedIborSwapConventions.JPY_FIXED_6M_TIBORJ_3M
            "JPY_FIXED_6M_LIBOR_6M" -> FixedIborSwapConventions.JPY_FIXED_6M_LIBOR_6M
            else -> throw IllegalArgumentException("Unknown swap convention: $name")
        }' @ [79:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FixedIborSwapConvention, entry1: FixedIborSwapConvention, entry2: FixedIborSwapConvention, entry3: FixedIborSwapConvention, entry4: FixedIborSwapConvention, entry5: FixedIborSwapConvention, entry6: FixedIborSwapConvention, entry7: FixedIborSwapConvention, entry8: FixedIborSwapConvention, entry9: FixedIborSwapConvention, entry10: FixedIborSwapConvention, entry11: FixedIborSwapConvention): FixedIborSwapConvention[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FixedIborSwapConvention

'name' @ [79:22] ==> value-parameter name: String defined in net.corda.vega.contracts.SwapData.getSwapConvention[ValueParameterDescriptorImpl]

'USD_FIXED_6M_LIBOR_3M' @ [80:65] ==> public final val USD_FIXED_6M_LIBOR_3M: (FixedIborSwapConvention..FixedIborSwapConvention?) defined in com.opengamma.strata.product.swap.type.FixedIborSwapConventions[JavaPropertyDescriptor]

'EUR_FIXED_1Y_EURIBOR_3M' @ [81:67] ==> public final val EUR_FIXED_1Y_EURIBOR_3M: (FixedIborSwapConvention..FixedIborSwapConvention?) defined in com.opengamma.strata.product.swap.type.FixedIborSwapConventions[JavaPropertyDescriptor]

'EUR_FIXED_1Y_EURIBOR_6M' @ [82:67] ==> public final val EUR_FIXED_1Y_EURIBOR_6M: (FixedIborSwapConvention..FixedIborSwapConvention?) defined in com.opengamma.strata.product.swap.type.FixedIborSwapConventions[JavaPropertyDescriptor]

'USD_FIXED_1Y_LIBOR_3M' @ [83:65] ==> public final val USD_FIXED_1Y_LIBOR_3M: (FixedIborSwapConvention..FixedIborSwapConvention?) defined in com.opengamma.strata.product.swap.type.FixedIborSwapConventions[JavaPropertyDescriptor]

'GBP_FIXED_1Y_LIBOR_3M' @ [84:65] ==> public final val GBP_FIXED_1Y_LIBOR_3M: (FixedIborSwapConvention..FixedIborSwapConvention?) defined in com.opengamma.strata.product.swap.type.FixedIborSwapConventions[JavaPropertyDescriptor]

'GBP_FIXED_6M_LIBOR_6M' @ [85:65] ==> public final val GBP_FIXED_6M_LIBOR_6M: (FixedIborSwapConvention..FixedIborSwapConvention?) defined in com.opengamma.strata.product.swap.type.FixedIborSwapConventions[JavaPropertyDescriptor]

'GBP_FIXED_3M_LIBOR_3M' @ [86:65] ==> public final val GBP_FIXED_3M_LIBOR_3M: (FixedIborSwapConvention..FixedIborSwapConvention?) defined in com.opengamma.strata.product.swap.type.FixedIborSwapConventions[JavaPropertyDescriptor]

'CHF_FIXED_1Y_LIBOR_3M' @ [87:65] ==> public final val CHF_FIXED_1Y_LIBOR_3M: (FixedIborSwapConvention..FixedIborSwapConvention?) defined in com.opengamma.strata.product.swap.type.FixedIborSwapConventions[JavaPropertyDescriptor]

'CHF_FIXED_1Y_LIBOR_6M' @ [88:65] ==> public final val CHF_FIXED_1Y_LIBOR_6M: (FixedIborSwapConvention..FixedIborSwapConvention?) defined in com.opengamma.strata.product.swap.type.FixedIborSwapConventions[JavaPropertyDescriptor]

'JPY_FIXED_6M_TIBORJ_3M' @ [89:66] ==> public final val JPY_FIXED_6M_TIBORJ_3M: (FixedIborSwapConvention..FixedIborSwapConvention?) defined in com.opengamma.strata.product.swap.type.FixedIborSwapConventions[JavaPropertyDescriptor]

'JPY_FIXED_6M_LIBOR_6M' @ [90:65] ==> public final val JPY_FIXED_6M_LIBOR_6M: (FixedIborSwapConvention..FixedIborSwapConvention?) defined in com.opengamma.strata.product.swap.type.FixedIborSwapConventions[JavaPropertyDescriptor]

'IllegalArgumentException' @ [91:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'name' @ [91:79] ==> value-parameter name: String defined in net.corda.vega.contracts.SwapData.getSwapConvention[ValueParameterDescriptorImpl]

