'viewingParty' @ [32:19] ==> value-parameter viewingParty: Party defined in net.corda.vega.api.toView[ValueParameterDescriptorImpl]

'owningKey' @ [32:32] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'buyer' @ [32:45] ==> public final val buyer: Pair<String, PublicKey> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'second' @ [32:51] ==> public final val second: PublicKey defined in kotlin.Pair[DeserializedPropertyDescriptor]

'if (isBuyer) toFixedLeg() else toFloatingLeg()' @ [33:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SwapTrade, elseBranch: SwapTrade): SwapTrade[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SwapTrade

'isBuyer' @ [33:21] ==> val isBuyer: Boolean defined in net.corda.vega.api.toView[LocalVariableDescriptor]

'toFixedLeg' @ [33:30] ==> public final fun toFixedLeg(): SwapTrade defined in net.corda.vega.contracts.SwapData[SimpleFunctionDescriptorImpl]

'toFloatingLeg' @ [33:48] ==> public final fun toFloatingLeg(): SwapTrade defined in net.corda.vega.contracts.SwapData[SimpleFunctionDescriptorImpl]

'getLegForParty' @ [34:15] ==> public final fun getLegForParty(party: AbstractParty): Leg defined in net.corda.vega.contracts.SwapData[SimpleFunctionDescriptorImpl]

'viewingParty' @ [34:30] ==> value-parameter viewingParty: Party defined in net.corda.vega.api.toView[ValueParameterDescriptorImpl]

'SwapDataView' @ [35:15] ==> public constructor SwapDataView(id: String, product: String, tradeDate: LocalDate, effectiveDate: LocalDate, maturityDate: LocalDate, currency: String, buySell: BuySell, notional: BigDecimal, IM: Double? = ..., MTM: Double? = ..., margined: Boolean = ..., marginedText: String = ...) defined in net.corda.vega.api.SwapDataView[ClassConstructorDescriptorImpl]

'id' @ [36:13] ==> public final val id: Pair<String, String> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'second' @ [36:16] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'tradeDate' @ [38:13] ==> public final val tradeDate: LocalDate defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'startDate' @ [39:13] ==> public final val startDate: LocalDate defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'endDate' @ [40:13] ==> public final val endDate: LocalDate defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'trade' @ [41:13] ==> val trade: SwapTrade defined in net.corda.vega.api.toView[LocalVariableDescriptor]

'product' @ [41:19] ==> public final val SwapTrade.product: (Swap..Swap?)[MyPropertyDescriptor]

'legs' @ [41:27] ==> public final val Swap.legs: (ImmutableList<(SwapLeg..SwapLeg?)>..ImmutableList<(SwapLeg..SwapLeg?)>?)[MyPropertyDescriptor]

'first' @ [41:32] ==> public fun <T> List<(SwapLeg..SwapLeg?)>.first(): (SwapLeg..SwapLeg?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.opengamma.strata.product.swap.SwapLeg..com.opengamma.strata.product.swap.SwapLeg?)

'currency' @ [41:40] ==> public final val SwapLeg.currency: (Currency..Currency?)[MyPropertyDescriptor]

'code' @ [41:49] ==> public final val Currency.code: (String..String?)[MyPropertyDescriptor]

'leg' @ [42:13] ==> val leg: Leg defined in net.corda.vega.api.toView[LocalVariableDescriptor]

'buySell' @ [42:17] ==> public abstract val buySell: BuySell defined in net.corda.vega.contracts.Leg[PropertyDescriptorImpl]

'notional' @ [43:13] ==> public final val notional: BigDecimal defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'portfolio' @ [44:9] ==> value-parameter portfolio: Portfolio? = ... defined in net.corda.vega.api.toView[ValueParameterDescriptorImpl]

'portfolio' @ [44:30] ==> value-parameter portfolio: Portfolio? = ... defined in net.corda.vega.api.toView[ValueParameterDescriptorImpl]

'swaps' @ [44:40] ==> public final val swaps: List<SwapData> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'filter' @ [44:46] ==> public inline fun <T> Iterable<SwapData>.filter(predicate: (SwapData) -> Boolean): List<SwapData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SwapData

'it' @ [44:55] ==> value-parameter it: SwapData defined in net.corda.vega.api.toView.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [44:58] ==> public final val id: Pair<String, String> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'second' @ [44:61] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'sdv' @ [44:71] ==> val sdv: SwapDataView defined in net.corda.vega.api.toView[LocalVariableDescriptor]

'id' @ [44:75] ==> public final val id: String defined in net.corda.vega.api.SwapDataView[PropertyDescriptorImpl]

'any' @ [44:80] ==> public fun <T> Iterable<SwapData>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SwapData

'sdv' @ [45:9] ==> val sdv: SwapDataView defined in net.corda.vega.api.toView[LocalVariableDescriptor]

'margined' @ [45:13] ==> public final var margined: Boolean defined in net.corda.vega.api.SwapDataView[PropertyDescriptorImpl]

'sdv' @ [46:9] ==> val sdv: SwapDataView defined in net.corda.vega.api.toView[LocalVariableDescriptor]

'marginedText' @ [46:13] ==> public final var marginedText: String defined in net.corda.vega.api.SwapDataView[PropertyDescriptorImpl]

'sdv' @ [47:9] ==> val sdv: SwapDataView defined in net.corda.vega.api.toView[LocalVariableDescriptor]

'IM' @ [47:13] ==> public final var IM: Double? defined in net.corda.vega.api.SwapDataView[PropertyDescriptorImpl]

'ZERO' @ [47:29] ==> public final val ZERO: (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaPropertyDescriptor]

'toDouble' @ [47:34] ==> public open fun toDouble(): Double defined in java.math.BigDecimal[JavaMethodDescriptor]

'presentValue' @ [48:13] ==> value-parameter presentValue: MultiCurrencyAmount? = ... defined in net.corda.vega.api.toView[ValueParameterDescriptorImpl]

'presentValue' @ [49:26] ==> value-parameter presentValue: MultiCurrencyAmount? = ... defined in net.corda.vega.api.toView[ValueParameterDescriptorImpl]

'amounts' @ [49:39] ==> public final val MultiCurrencyAmount.amounts: (ImmutableSortedSet<(CurrencyAmount..CurrencyAmount?)>..ImmutableSortedSet<(CurrencyAmount..CurrencyAmount?)>?)[MyPropertyDescriptor]

'first' @ [49:47] ==> public open fun first(): (CurrencyAmount..CurrencyAmount?) defined in com.google.common.collect.ImmutableSortedSet[JavaMethodDescriptor]

'amount' @ [49:55] ==> public final val CurrencyAmount.amount: Double[MyPropertyDescriptor]

'sdv' @ [50:13] ==> val sdv: SwapDataView defined in net.corda.vega.api.toView[LocalVariableDescriptor]

'MTM' @ [50:17] ==> public final var MTM: Double? defined in net.corda.vega.api.SwapDataView[PropertyDescriptorImpl]

'if (isBuyer)
                amount
            else
                -amount' @ [50:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Double?, elseBranch: Double?): Double?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Double?

'isBuyer' @ [50:27] ==> val isBuyer: Boolean defined in net.corda.vega.api.toView[LocalVariableDescriptor]

'amount' @ [51:17] ==> val amount: Double defined in net.corda.vega.api.toView[LocalVariableDescriptor]

'-' @ [53:17] ==> public final operator fun unaryMinus(): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'amount' @ [53:18] ==> val amount: Double defined in net.corda.vega.api.toView[LocalVariableDescriptor]

'IM' @ [55:13] ==> value-parameter IM: InitialMarginTriple? = ... defined in net.corda.vega.api.toView[ValueParameterDescriptorImpl]

'sdv' @ [56:13] ==> val sdv: SwapDataView defined in net.corda.vega.api.toView[LocalVariableDescriptor]

'IM' @ [56:17] ==> public final var IM: Double? defined in net.corda.vega.api.SwapDataView[PropertyDescriptorImpl]

'IM' @ [56:22] ==> value-parameter IM: InitialMarginTriple? = ... defined in net.corda.vega.api.toView[ValueParameterDescriptorImpl]

'third' @ [56:25] ==> public final val third: Double defined in net.corda.vega.analytics.InitialMarginTriple[PropertyDescriptorImpl]

'sdv' @ [59:12] ==> val sdv: SwapDataView defined in net.corda.vega.api.toView[LocalVariableDescriptor]

