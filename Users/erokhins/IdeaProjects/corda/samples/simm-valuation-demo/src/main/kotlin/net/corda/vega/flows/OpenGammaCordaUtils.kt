'BigDecimal' @ [22:20] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'it' @ [22:31] ==> value-parameter it: Double defined in net.corda.vega.flows.roundDP.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [22:34] ==> public open fun toString(): String defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'setScale' @ [22:46] ==> public open fun setScale(p0: Int, p1: (RoundingMode..RoundingMode?)): (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaMethodDescriptor]

'decimals' @ [22:55] ==> value-parameter decimals: Int defined in net.corda.vega.flows.roundDP[ValueParameterDescriptorImpl]

'HALF_UP' @ [22:78] ==> enum entry HALF_UP defined in java.math.RoundingMode[FakeCallableDescriptorForObject]

'toDouble' @ [22:87] ==> public open fun toDouble(): Double defined in java.math.BigDecimal[JavaMethodDescriptor]

'roundDP' @ [25:24] ==> public fun roundDP(decimals: Int): (Double) -> Double defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [33:18] ==> <this> defined in net.corda.vega.flows.toCordaCompatible[ReceiverParameterDescriptorImpl]

'ids' @ [33:23] ==> public final val MarketData.ids: (MutableSet<(MarketDataId<*>..MarketDataId<*>?)>..Set<(MarketDataId<*>..MarketDataId<*>?)>?)[MyPropertyDescriptor]

'map' @ [33:27] ==> public inline fun <T, R> Iterable<(MarketDataId<*>..MarketDataId<*>?)>.map(transform: ((MarketDataId<*>..MarketDataId<*>?)) -> Pair<String, (BigDecimal..BigDecimal?)>): List<Pair<String, (BigDecimal..BigDecimal?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.opengamma.strata.data.MarketDataId<*>..com.opengamma.strata.data.MarketDataId<*>?)
    <R> -> Pair<String, (java.math.BigDecimal..java.math.BigDecimal?)>

'this' @ [34:21] ==> <this> defined in net.corda.vega.flows.toCordaCompatible[ReceiverParameterDescriptorImpl]

'getValue' @ [34:26] ==> public open fun <T : (Any..Any?)> getValue(p0: (MarketDataId<out (Any..Any?)>..MarketDataId<out (Any..Any?)>?)): (Any..Any?) defined in com.opengamma.strata.data.MarketData[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'it' @ [34:35] ==> value-parameter it: (MarketDataId<*>..MarketDataId<*>?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[ValueParameterDescriptorImpl]

'when (it) {
            is QuoteId -> it.standardId.toString()
            is FxRateId -> it.pair.toString()
            else -> TODO("Conversion from type $it")
        }' @ [35:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'it' @ [35:15] ==> value-parameter it: (MarketDataId<*>..MarketDataId<*>?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [36:27] ==> value-parameter it: (MarketDataId<*>..MarketDataId<*>?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[ValueParameterDescriptorImpl]

'standardId' @ [36:30] ==> public final val QuoteId.standardId: (StandardId..StandardId?)[MyPropertyDescriptor]

'toString' @ [36:41] ==> @ToString public open fun toString(): String defined in com.opengamma.strata.basics.StandardId[JavaMethodDescriptor]

'it' @ [37:28] ==> value-parameter it: (MarketDataId<*>..MarketDataId<*>?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[ValueParameterDescriptorImpl]

'pair' @ [37:31] ==> public final val FxRateId.pair: (CurrencyPair..CurrencyPair?)[MyPropertyDescriptor]

'toString' @ [37:36] ==> @ToString public open fun toString(): String defined in com.opengamma.strata.basics.currency.CurrencyPair[JavaMethodDescriptor]

'TODO' @ [38:21] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'it' @ [38:49] ==> value-parameter it: (MarketDataId<*>..MarketDataId<*>?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[ValueParameterDescriptorImpl]

'when (value) {
            is FxRate -> BigDecimal.valueOf(value.fxRate(value.pair.base, value.pair.counter))
            is Double -> BigDecimal.valueOf(value)
            else -> TODO("Conversion from $value")
        }' @ [39:14] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (BigDecimal..BigDecimal?), entry1: (BigDecimal..BigDecimal?), entry2: (BigDecimal..BigDecimal?)): (BigDecimal..BigDecimal?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (java.math.BigDecimal..java.math.BigDecimal?)

'value' @ [39:20] ==> val value: (Any..Any?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[LocalVariableDescriptor]

'valueOf' @ [40:37] ==> public open fun valueOf(p0: Double): (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaMethodDescriptor]

'value' @ [40:45] ==> val value: (Any..Any?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[LocalVariableDescriptor]

'fxRate' @ [40:51] ==> public open fun fxRate(p0: (Currency..Currency?), p1: (Currency..Currency?)): Double defined in com.opengamma.strata.basics.currency.FxRate[JavaMethodDescriptor]

'value' @ [40:58] ==> val value: (Any..Any?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[LocalVariableDescriptor]

'pair' @ [40:64] ==> public final val FxRate.pair: (CurrencyPair..CurrencyPair?)[MyPropertyDescriptor]

'base' @ [40:69] ==> public final val CurrencyPair.base: (Currency..Currency?)[MyPropertyDescriptor]

'value' @ [40:75] ==> val value: (Any..Any?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[LocalVariableDescriptor]

'pair' @ [40:81] ==> public final val FxRate.pair: (CurrencyPair..CurrencyPair?)[MyPropertyDescriptor]

'counter' @ [40:86] ==> public final val CurrencyPair.counter: (Currency..Currency?)[MyPropertyDescriptor]

'valueOf' @ [41:37] ==> public open fun valueOf(p0: Double): (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaMethodDescriptor]

'value' @ [41:45] ==> val value: (Any..Any?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[LocalVariableDescriptor]

'TODO' @ [42:21] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'value' @ [42:44] ==> val value: (Any..Any?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[LocalVariableDescriptor]

'toMap' @ [44:7] ==> public fun <K, V> Iterable<Pair<String, (BigDecimal..BigDecimal?)>>.toMap(): Map<String, (BigDecimal..BigDecimal?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (java.math.BigDecimal..java.math.BigDecimal?)

'CordaMarketData' @ [45:12] ==> public constructor CordaMarketData(valuationDate: LocalDate, values: Map<String, BigDecimal>) defined in net.corda.vega.analytics.CordaMarketData[ClassConstructorDescriptorImpl]

'this' @ [45:44] ==> <this> defined in net.corda.vega.flows.toCordaCompatible[ReceiverParameterDescriptorImpl]

'valuationDate' @ [45:49] ==> public final val MarketData.valuationDate: (LocalDate..LocalDate?)[MyPropertyDescriptor]

'values' @ [45:73] ==> val values: Map<String, (BigDecimal..BigDecimal?)> defined in net.corda.vega.flows.toCordaCompatible[LocalVariableDescriptor]

'InitialMarginTriple' @ [53:47] ==> public constructor InitialMarginTriple(first: Double, second: Double, third: Double) defined in net.corda.vega.analytics.InitialMarginTriple[ClassConstructorDescriptorImpl]

'invoke' @ [53:67] ==> public abstract operator fun invoke(p1: Double): Double defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [53:84] ==> <this> defined in net.corda.vega.flows.toCordaCompatible[ReceiverParameterDescriptorImpl]

'first' @ [53:89] ==> public final val first: Double defined in net.corda.vega.analytics.InitialMarginTriple[PropertyDescriptorImpl]

'invoke' @ [53:97] ==> public abstract operator fun invoke(p1: Double): Double defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [53:114] ==> <this> defined in net.corda.vega.flows.toCordaCompatible[ReceiverParameterDescriptorImpl]

'second' @ [53:119] ==> public final val second: Double defined in net.corda.vega.analytics.InitialMarginTriple[PropertyDescriptorImpl]

'invoke' @ [53:128] ==> public abstract operator fun invoke(p1: Double): Double defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [53:145] ==> <this> defined in net.corda.vega.flows.toCordaCompatible[ReceiverParameterDescriptorImpl]

'third' @ [53:150] ==> public final val third: Double defined in net.corda.vega.analytics.InitialMarginTriple[PropertyDescriptorImpl]

'of' @ [59:43] ==> public open fun of(p0: (MutableList<out (CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>..List<(CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>?)): (CurrencyParameterSensitivities..CurrencyParameterSensitivities?) defined in com.opengamma.strata.market.param.CurrencyParameterSensitivities[JavaMethodDescriptor]

'this' @ [59:46] ==> <this> defined in net.corda.vega.flows.toCordaCompatible[ReceiverParameterDescriptorImpl]

'sensitivities' @ [59:51] ==> public final val CurrencyParameterSensitivities.sensitivities: (ImmutableList<(CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>..ImmutableList<(CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>?)[MyPropertyDescriptor]

'map' @ [59:65] ==> public inline fun <T, R> Iterable<(CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>.map(transform: ((CurrencyParameterSensitivity..CurrencyParameterSensitivity?)) -> (CurrencyParameterSensitivity..CurrencyParameterSensitivity?)): List<(CurrencyParameterSensitivity..CurrencyParameterSensitivity?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.opengamma.strata.market.param.CurrencyParameterSensitivity..com.opengamma.strata.market.param.CurrencyParameterSensitivity?)
    <R> -> (com.opengamma.strata.market.param.CurrencyParameterSensitivity..com.opengamma.strata.market.param.CurrencyParameterSensitivity?)

'sensitivity' @ [60:9] ==> value-parameter sensitivity: (CurrencyParameterSensitivity..CurrencyParameterSensitivity?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[ValueParameterDescriptorImpl]

'metaBean' @ [60:21] ==> public open fun metaBean(): (CurrencyParameterSensitivity.Meta..CurrencyParameterSensitivity.Meta?) defined in com.opengamma.strata.market.param.CurrencyParameterSensitivity[JavaMethodDescriptor]

'builder' @ [60:32] ==> public open fun builder(): (BeanBuilder<out (CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>..BeanBuilder<out (CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>?) defined in com.opengamma.strata.market.param.CurrencyParameterSensitivity.Meta[JavaMethodDescriptor]

'set' @ [61:18] ==> public abstract operator fun set(p0: (String..String?), p1: (Any..Any?)): (BeanBuilder<out (CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>..BeanBuilder<out (CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>?) defined in org.joda.beans.BeanBuilder[JavaMethodDescriptor]

'sensitivity' @ [61:40] ==> value-parameter sensitivity: (CurrencyParameterSensitivity..CurrencyParameterSensitivity?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[ValueParameterDescriptorImpl]

'marketDataName' @ [61:52] ==> public final val CurrencyParameterSensitivity.marketDataName: (MarketDataName<*>..MarketDataName<*>?)[MyPropertyDescriptor]

'set' @ [62:18] ==> public abstract operator fun set(p0: (String..String?), p1: (Any..Any?)): (BeanBuilder<out (CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>..BeanBuilder<out (CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>?) defined in org.joda.beans.BeanBuilder[JavaMethodDescriptor]

'sensitivity' @ [62:43] ==> value-parameter sensitivity: (CurrencyParameterSensitivity..CurrencyParameterSensitivity?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[ValueParameterDescriptorImpl]

'parameterMetadata' @ [62:55] ==> public final val CurrencyParameterSensitivity.parameterMetadata: (ImmutableList<(ParameterMetadata..ParameterMetadata?)>..ImmutableList<(ParameterMetadata..ParameterMetadata?)>?)[MyPropertyDescriptor]

'set' @ [63:18] ==> public abstract operator fun set(p0: (String..String?), p1: (Any..Any?)): (BeanBuilder<out (CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>..BeanBuilder<out (CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>?) defined in org.joda.beans.BeanBuilder[JavaMethodDescriptor]

'of' @ [63:43] ==> @FromString public open fun of(p0: (String..String?)): (Currency..Currency?) defined in com.opengamma.strata.basics.currency.Currency[JavaMethodDescriptor]

'sensitivity' @ [63:46] ==> value-parameter sensitivity: (CurrencyParameterSensitivity..CurrencyParameterSensitivity?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[ValueParameterDescriptorImpl]

'currency' @ [63:58] ==> public final val CurrencyParameterSensitivity.currency: (Currency..Currency?)[MyPropertyDescriptor]

'code' @ [63:67] ==> public final val Currency.code: (String..String?)[MyPropertyDescriptor]

'serialize' @ [63:73] ==> public fun <T : Any> (Currency..Currency?).serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<(Currency..Currency?)> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> (com.opengamma.strata.basics.currency.Currency..com.opengamma.strata.basics.currency.Currency?)

'deserialize' @ [63:85] ==> public inline fun <reified T : Any> SerializedBytes<(Currency..Currency?)>.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): (Currency..Currency?) defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> (com.opengamma.strata.basics.currency.Currency..com.opengamma.strata.basics.currency.Currency?)

'set' @ [64:18] ==> public abstract operator fun set(p0: (String..String?), p1: (Any..Any?)): (BeanBuilder<out (CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>..BeanBuilder<out (CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>?) defined in org.joda.beans.BeanBuilder[JavaMethodDescriptor]

'sensitivity' @ [64:37] ==> value-parameter sensitivity: (CurrencyParameterSensitivity..CurrencyParameterSensitivity?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[ValueParameterDescriptorImpl]

'sensitivity' @ [64:49] ==> public final val CurrencyParameterSensitivity.sensitivity: (DoubleArray..DoubleArray?)[MyPropertyDescriptor]

'map' @ [64:61] ==> public final fun map(p0: ((Double) -> Double..((Double) -> Double)?)): (DoubleArray..DoubleArray?) defined in com.opengamma.strata.collect.array.DoubleArray[MyFunctionDescriptor]

'invoke' @ [64:67] ==> public abstract operator fun invoke(p1: Double): Double defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [64:84] ==> value-parameter it: Double defined in net.corda.vega.flows.toCordaCompatible.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [65:18] ==> public abstract fun build(): (CurrencyParameterSensitivity..CurrencyParameterSensitivity?) defined in org.joda.beans.BeanBuilder[JavaMethodDescriptor]

'of' @ [73:32] ==> public open fun of(p0: (MutableIterable<(CurrencyAmount..CurrencyAmount?)>..Iterable<(CurrencyAmount..CurrencyAmount?)>?)): (MultiCurrencyAmount..MultiCurrencyAmount?) defined in com.opengamma.strata.basics.currency.MultiCurrencyAmount[JavaMethodDescriptor]

'this' @ [73:35] ==> <this> defined in net.corda.vega.flows.toCordaCompatible[ReceiverParameterDescriptorImpl]

'amounts' @ [73:40] ==> public final val MultiCurrencyAmount.amounts: (ImmutableSortedSet<(CurrencyAmount..CurrencyAmount?)>..ImmutableSortedSet<(CurrencyAmount..CurrencyAmount?)>?)[MyPropertyDescriptor]

'map' @ [73:48] ==> public inline fun <T, R> Iterable<(CurrencyAmount..CurrencyAmount?)>.map(transform: ((CurrencyAmount..CurrencyAmount?)) -> (CurrencyAmount..CurrencyAmount?)): List<(CurrencyAmount..CurrencyAmount?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.opengamma.strata.basics.currency.CurrencyAmount..com.opengamma.strata.basics.currency.CurrencyAmount?)
    <R> -> (com.opengamma.strata.basics.currency.CurrencyAmount..com.opengamma.strata.basics.currency.CurrencyAmount?)

'of' @ [73:69] ==> public open fun of(p0: (Currency..Currency?), p1: Double): (CurrencyAmount..CurrencyAmount?) defined in com.opengamma.strata.basics.currency.CurrencyAmount[JavaMethodDescriptor]

'of' @ [73:81] ==> @FromString public open fun of(p0: (String..String?)): (Currency..Currency?) defined in com.opengamma.strata.basics.currency.Currency[JavaMethodDescriptor]

'it' @ [73:84] ==> value-parameter it: (CurrencyAmount..CurrencyAmount?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[ValueParameterDescriptorImpl]

'currency' @ [73:87] ==> public final val CurrencyAmount.currency: (Currency..Currency?)[MyPropertyDescriptor]

'code' @ [73:96] ==> public final val Currency.code: (String..String?)[MyPropertyDescriptor]

'serialize' @ [73:102] ==> public fun <T : Any> (Currency..Currency?).serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<(Currency..Currency?)> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> (com.opengamma.strata.basics.currency.Currency..com.opengamma.strata.basics.currency.Currency?)

'deserialize' @ [73:114] ==> public inline fun <reified T : Any> SerializedBytes<(Currency..Currency?)>.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): (Currency..Currency?) defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> (com.opengamma.strata.basics.currency.Currency..com.opengamma.strata.basics.currency.Currency?)

'invoke' @ [73:129] ==> public abstract operator fun invoke(p1: Double): Double defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [73:147] ==> value-parameter it: (CurrencyAmount..CurrencyAmount?) defined in net.corda.vega.flows.toCordaCompatible.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [73:150] ==> public final val CurrencyAmount.amount: Double[MyPropertyDescriptor]

