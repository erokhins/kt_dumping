'state' @ [32:25] ==> value-parameter state: PortfolioState defined in net.corda.vega.api.PortfolioApiUtils.createValuations[ValueParameterDescriptorImpl]

'valuation' @ [32:31] ==> public final val valuation: PortfolioValuation? defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'if (portfolio.trades.isNotEmpty()) {
            portfolio.swaps.first().toView(ownParty).currency
        } else {
            ""
        }' @ [34:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'portfolio' @ [34:28] ==> value-parameter portfolio: Portfolio defined in net.corda.vega.api.PortfolioApiUtils.createValuations[ValueParameterDescriptorImpl]

'trades' @ [34:38] ==> public final val trades: List<IRSState> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'isNotEmpty' @ [34:45] ==> @InlineOnly public inline fun <T> Collection<IRSState>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IRSState

'portfolio' @ [35:13] ==> value-parameter portfolio: Portfolio defined in net.corda.vega.api.PortfolioApiUtils.createValuations[ValueParameterDescriptorImpl]

'swaps' @ [35:23] ==> public final val swaps: List<SwapData> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'first' @ [35:29] ==> public fun <T> List<SwapData>.first(): SwapData defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SwapData

'toView' @ [35:37] ==> public fun SwapData.toView(viewingParty: Party, portfolio: Portfolio? = ..., presentValue: MultiCurrencyAmount? = ..., IM: InitialMarginTriple? = ...): SwapDataView defined in net.corda.vega.api in file SwapDataView.kt[SimpleFunctionDescriptorImpl]

'ownParty' @ [35:44] ==> private final val ownParty: Party defined in net.corda.vega.api.PortfolioApiUtils[PropertyDescriptorImpl]

'currency' @ [35:54] ==> public final val currency: String defined in net.corda.vega.api.SwapDataView[PropertyDescriptorImpl]

'portfolio' @ [40:26] ==> value-parameter portfolio: Portfolio defined in net.corda.vega.api.PortfolioApiUtils.createValuations[ValueParameterDescriptorImpl]

'trades' @ [40:36] ==> public final val trades: List<IRSState> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'size' @ [40:43] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'valuation' @ [41:26] ==> val valuation: PortfolioValuation defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'marketData' @ [41:36] ==> public final val marketData: CordaMarketData defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'values' @ [41:47] ==> public final val values: Map<String, BigDecimal> defined in net.corda.vega.analytics.CordaMarketData[PropertyDescriptorImpl]

'map' @ [41:54] ==> public inline fun <K, V, R> Map<out String, BigDecimal>.map(transform: (Map.Entry<String, BigDecimal>) -> Pair<String, BigDecimal>): List<Pair<String, BigDecimal>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> BigDecimal
    <R> -> Pair<String, BigDecimal>

'it' @ [41:60] ==> value-parameter it: Map.Entry<String, BigDecimal> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [41:63] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'replace' @ [41:67] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [41:96] ==> value-parameter it: Map.Entry<String, BigDecimal> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [41:99] ==> public abstract val value: BigDecimal defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'toMap' @ [41:107] ==> public fun <K, V> Iterable<Pair<String, BigDecimal>>.toMap(): Map<String, BigDecimal> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> BigDecimal

'marketData' @ [42:42] ==> val marketData: Map<String, BigDecimal> defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'filter' @ [42:53] ==> public inline fun <K, V> Map<out String, BigDecimal>.filter(predicate: (Map.Entry<String, BigDecimal>) -> Boolean): Map<String, BigDecimal> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> BigDecimal

'!' @ [42:62] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [42:63] ==> value-parameter it: Map.Entry<String, BigDecimal> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [42:66] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'contains' @ [42:70] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [42:86] ==> public inline fun <K, V, R> Map<out String, BigDecimal>.map(transform: (Map.Entry<String, BigDecimal>) -> Triple<String, String, BigDecimal>): List<Triple<String, String, BigDecimal>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> BigDecimal
    <R> -> Triple<String, String, BigDecimal>

'Triple' @ [42:98] ==> public constructor Triple<out A, out B, out C>(first: String, second: String, third: BigDecimal) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> String
    <out C> -> BigDecimal

'it' @ [42:105] ==> value-parameter it: Map.Entry<String, BigDecimal> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [42:108] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'split' @ [42:112] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [42:127] ==> value-parameter it: Map.Entry<String, BigDecimal> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [42:130] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'split' @ [42:134] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [42:160] ==> value-parameter it: Map.Entry<String, BigDecimal> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [42:163] ==> public abstract val value: BigDecimal defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'yieldCurveCurrenciesValues' @ [43:23] ==> val yieldCurveCurrenciesValues: List<Triple<String, String, BigDecimal>> defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'groupBy' @ [43:50] ==> public inline fun <T, K> Iterable<Triple<String, String, BigDecimal>>.groupBy(keySelector: (Triple<String, String, BigDecimal>) -> String): Map<String, List<Triple<String, String, BigDecimal>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Triple<String, String, BigDecimal>
    <K> -> String

'it' @ [43:60] ==> value-parameter it: Triple<String, String, BigDecimal> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [43:63] ==> public final val first: String defined in kotlin.Triple[DeserializedPropertyDescriptor]

'grouped' @ [44:25] ==> val grouped: Map<String, List<Triple<String, String, BigDecimal>>> defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'map' @ [44:33] ==> public inline fun <K, V, R> Map<out String, List<Triple<String, String, BigDecimal>>>.map(transform: (Map.Entry<String, List<Triple<String, String, BigDecimal>>>) -> Pair<String, Map<String, List<Triple<String, String, BigDecimal>>>>): List<Pair<String, Map<String, List<Triple<String, String, BigDecimal>>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<Triple<String, String, BigDecimal>>
    <R> -> Pair<String, Map<String, List<Triple<String, String, BigDecimal>>>>

'it' @ [44:39] ==> value-parameter it: Map.Entry<String, List<Triple<String, String, BigDecimal>>> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [44:42] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [44:49] ==> value-parameter it: Map.Entry<String, List<Triple<String, String, BigDecimal>>> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [44:52] ==> public abstract val value: List<Triple<String, String, BigDecimal>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'groupBy' @ [44:58] ==> public inline fun <T, K> Iterable<Triple<String, String, BigDecimal>>.groupBy(keySelector: (Triple<String, String, BigDecimal>) -> String): Map<String, List<Triple<String, String, BigDecimal>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Triple<String, String, BigDecimal>
    <K> -> String

'v' @ [44:73] ==> value-parameter v: Triple<String, String, BigDecimal> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [44:75] ==> public final val second: String defined in kotlin.Triple[DeserializedPropertyDescriptor]

'toMap' @ [44:86] ==> public fun <K, V> Iterable<Pair<String, Map<String, List<Triple<String, String, BigDecimal>>>>>.toMap(): Map<String, Map<String, List<Triple<String, String, BigDecimal>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Map<String, List<Triple<String, String, BigDecimal>>>

'subgroups' @ [46:33] ==> val subgroups: Map<String, Map<String, List<Triple<String, String, BigDecimal>>>> defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'mapValues' @ [46:43] ==> public inline fun <K, V, R> Map<out String, Map<String, List<Triple<String, String, BigDecimal>>>>.mapValues(transform: (Map.Entry<String, Map<String, List<Triple<String, String, BigDecimal>>>>) -> SortedMap<String, Double>): Map<String, SortedMap<String, Double>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Map<String, List<Triple<String, String, BigDecimal>>>
    <R> -> SortedMap<String, Double>

'it' @ [46:55] ==> value-parameter it: Map.Entry<String, Map<String, List<Triple<String, String, BigDecimal>>>> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [46:58] ==> public abstract val value: Map<String, List<Triple<String, String, BigDecimal>>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'mapValues' @ [46:64] ==> public inline fun <K, V, R> Map<out String, List<Triple<String, String, BigDecimal>>>.mapValues(transform: (Map.Entry<String, List<Triple<String, String, BigDecimal>>>) -> Double): Map<String, Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<Triple<String, String, BigDecimal>>
    <R> -> Double

'it' @ [46:76] ==> value-parameter it: Map.Entry<String, List<Triple<String, String, BigDecimal>>> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [46:79] ==> public abstract val value: List<Triple<String, String, BigDecimal>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'third' @ [46:88] ==> public final val third: BigDecimal defined in kotlin.Triple[DeserializedPropertyDescriptor]

'toDouble' @ [46:94] ==> public open fun toDouble(): Double defined in java.math.BigDecimal[JavaMethodDescriptor]

'toSortedMap' @ [46:107] ==> public fun <K : Comparable<String>, V> Map<out String, Double>.toSortedMap(): SortedMap<String, Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K : Comparable<K>> -> String
    <V> -> Double

'mapOf' @ [48:27] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Any>): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'to' @ [49:17] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [50:17] ==> public infix fun <A, B> String.to(that: List<Map<String, (Any..Any?)>>): Pair<String, List<Map<String, (Any..Any?)>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<Map<String, (kotlin.Any..kotlin.Any?)>>

'completeSubgroups' @ [50:29] ==> val completeSubgroups: Map<String, SortedMap<String, Double>> defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'get' @ [50:47] ==> public abstract operator fun get(key: String): SortedMap<String, Double>? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'filter' @ [50:60] ==> public inline fun <K, V> Map<out (String..String?), (Double..Double?)>.filter(predicate: (Map.Entry<(String..String?), (Double..Double?)>) -> Boolean): Map<(String..String?), (Double..Double?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (kotlin.Double..kotlin.Double?)

'!' @ [50:69] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [50:70] ==> value-parameter it: Map.Entry<(String..String?), (Double..Double?)> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [50:73] ==> public abstract val key: (String..String?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'contains' @ [50:77] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [50:98] ==> public inline fun <K, V, R> Map<out (String..String?), (Double..Double?)>.map(transform: (Map.Entry<(String..String?), (Double..Double?)>) -> Map<String, (Any..Any?)>): List<Map<String, (Any..Any?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (kotlin.Double..kotlin.Double?)
    <R> -> Map<String, (kotlin.Any..kotlin.Any?)>

'mapOf' @ [51:21] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, (Any..Any?)>): Map<String, (Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (kotlin.Any..kotlin.Any?)

'to' @ [52:29] ==> public infix fun <A, B> String.to(that: (String..String?)): Pair<String, (String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.String..kotlin.String?)

'it' @ [52:40] ==> value-parameter it: Map.Entry<(String..String?), (Double..Double?)> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [52:43] ==> public abstract val key: (String..String?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'to' @ [53:29] ==> public infix fun <A, B> String.to(that: (Double..Double?)): Pair<String, (Double..Double?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.Double..kotlin.Double?)

'it' @ [53:39] ==> value-parameter it: Map.Entry<(String..String?), (Double..Double?)> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [53:42] ==> public abstract val value: (Double..Double?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'mapOf' @ [58:23] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Any>): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'to' @ [59:17] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [60:17] ==> public infix fun <A, B> String.to(that: List<Map<String, (Any..Any?)>>): Pair<String, List<Map<String, (Any..Any?)>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<Map<String, (kotlin.Any..kotlin.Any?)>>

'completeSubgroups' @ [60:29] ==> val completeSubgroups: Map<String, SortedMap<String, Double>> defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'get' @ [60:47] ==> public abstract operator fun get(key: String): SortedMap<String, Double>? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'filter' @ [60:60] ==> public inline fun <K, V> Map<out (String..String?), (Double..Double?)>.filter(predicate: (Map.Entry<(String..String?), (Double..Double?)>) -> Boolean): Map<(String..String?), (Double..Double?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (kotlin.Double..kotlin.Double?)

'it' @ [60:69] ==> value-parameter it: Map.Entry<(String..String?), (Double..Double?)> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [60:72] ==> public abstract val key: (String..String?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'contains' @ [60:76] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [60:97] ==> public inline fun <K, V, R> Map<out (String..String?), (Double..Double?)>.map(transform: (Map.Entry<(String..String?), (Double..Double?)>) -> Map<String, (Any..Any?)>): List<Map<String, (Any..Any?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (kotlin.Double..kotlin.Double?)
    <R> -> Map<String, (kotlin.Any..kotlin.Any?)>

'mapOf' @ [61:21] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, (Any..Any?)>): Map<String, (Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (kotlin.Any..kotlin.Any?)

'to' @ [62:29] ==> public infix fun <A, B> String.to(that: (String..String?)): Pair<String, (String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.String..kotlin.String?)

'it' @ [62:40] ==> value-parameter it: Map.Entry<(String..String?), (Double..Double?)> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [62:43] ==> public abstract val key: (String..String?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'to' @ [63:29] ==> public infix fun <A, B> String.to(that: (Double..Double?)): Pair<String, (Double..Double?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.Double..kotlin.Double?)

'it' @ [63:39] ==> value-parameter it: Map.Entry<(String..String?), (Double..Double?)> defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [63:42] ==> public abstract val value: (Double..Double?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'valuation' @ [68:38] ==> val valuation: PortfolioValuation defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'totalSensivities' @ [68:48] ==> public final val totalSensivities: CurrencyParameterSensitivities defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'sensitivities' @ [68:65] ==> public final val CurrencyParameterSensitivities.sensitivities: (ImmutableList<(CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>..ImmutableList<(CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>?)[MyPropertyDescriptor]

'map' @ [68:79] ==> public inline fun <T, R> Iterable<(CurrencyParameterSensitivity..CurrencyParameterSensitivity?)>.map(transform: ((CurrencyParameterSensitivity..CurrencyParameterSensitivity?)) -> Pair<(MarketDataName<*>..MarketDataName<*>?), Map<(String..String?), (Double..Double?)>>): List<Pair<(MarketDataName<*>..MarketDataName<*>?), Map<(String..String?), (Double..Double?)>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.opengamma.strata.market.param.CurrencyParameterSensitivity..com.opengamma.strata.market.param.CurrencyParameterSensitivity?)
    <R> -> Pair<(com.opengamma.strata.data.MarketDataName<*>..com.opengamma.strata.data.MarketDataName<*>?), Map<(kotlin.String..kotlin.String?), (kotlin.Double..kotlin.Double?)>>

'it' @ [68:85] ==> value-parameter it: (CurrencyParameterSensitivity..CurrencyParameterSensitivity?) defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'marketDataName' @ [68:88] ==> public final val CurrencyParameterSensitivity.marketDataName: (MarketDataName<*>..MarketDataName<*>?)[MyPropertyDescriptor]

'it' @ [68:106] ==> value-parameter it: (CurrencyParameterSensitivity..CurrencyParameterSensitivity?) defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'parameterMetadata' @ [68:109] ==> public final val CurrencyParameterSensitivity.parameterMetadata: (ImmutableList<(ParameterMetadata..ParameterMetadata?)>..ImmutableList<(ParameterMetadata..ParameterMetadata?)>?)[MyPropertyDescriptor]

'map' @ [68:127] ==> public inline fun <T, R> Iterable<(ParameterMetadata..ParameterMetadata?)>.map(transform: ((ParameterMetadata..ParameterMetadata?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.opengamma.strata.market.param.ParameterMetadata..com.opengamma.strata.market.param.ParameterMetadata?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [68:133] ==> value-parameter it: (ParameterMetadata..ParameterMetadata?) defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'label' @ [68:136] ==> public final val ParameterMetadata.label: (String..String?)[MyPropertyDescriptor]

'zip' @ [68:144] ==> public infix fun <T, R> Iterable<(String..String?)>.zip(other: Iterable<(Double..Double?)>): List<Pair<(String..String?), (Double..Double?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> (kotlin.Double..kotlin.Double?)

'it' @ [68:148] ==> value-parameter it: (CurrencyParameterSensitivity..CurrencyParameterSensitivity?) defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'sensitivity' @ [68:151] ==> public final val CurrencyParameterSensitivity.sensitivity: (DoubleArray..DoubleArray?)[MyPropertyDescriptor]

'toList' @ [68:163] ==> public open fun toList(): (MutableList<(Double..Double?)>..List<(Double..Double?)>?) defined in com.opengamma.strata.collect.array.DoubleArray[JavaMethodDescriptor]

'toMap' @ [68:173] ==> public fun <K, V> Iterable<Pair<(String..String?), (Double..Double?)>>.toMap(): Map<(String..String?), (Double..Double?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (kotlin.Double..kotlin.Double?)

'toMap' @ [68:183] ==> public fun <K, V> Iterable<Pair<(MarketDataName<*>..MarketDataName<*>?), Map<(String..String?), (Double..Double?)>>>.toMap(): Map<(MarketDataName<*>..MarketDataName<*>?), Map<(String..String?), (Double..Double?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.opengamma.strata.data.MarketDataName<*>..com.opengamma.strata.data.MarketDataName<*>?)
    <V> -> Map<(kotlin.String..kotlin.String?), (kotlin.Double..kotlin.Double?)>

'InitialMarginView' @ [70:33] ==> public constructor InitialMarginView(baseCurrency: String, post: Map<String, Double>, call: Map<String, Double>, agreed: Boolean) defined in net.corda.vega.api.PortfolioApiUtils.InitialMarginView[ClassConstructorDescriptorImpl]

'currency' @ [71:32] ==> val currency: String defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'mapOf' @ [72:24] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Double>): Map<String, Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Double

'to' @ [73:25] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'valuation' @ [73:35] ==> val valuation: PortfolioValuation defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'margin' @ [73:45] ==> public final val margin: InitialMarginTriple defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'first' @ [73:52] ==> public final val first: Double defined in net.corda.vega.analytics.InitialMarginTriple[PropertyDescriptorImpl]

'to' @ [74:25] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'to' @ [75:25] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'to' @ [76:25] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'to' @ [77:25] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'valuation' @ [77:36] ==> val valuation: PortfolioValuation defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'margin' @ [77:46] ==> public final val margin: InitialMarginTriple defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'first' @ [77:53] ==> public final val first: Double defined in net.corda.vega.analytics.InitialMarginTriple[PropertyDescriptorImpl]

'mapOf' @ [79:24] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Double>): Map<String, Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Double

'to' @ [80:25] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'valuation' @ [80:35] ==> val valuation: PortfolioValuation defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'margin' @ [80:45] ==> public final val margin: InitialMarginTriple defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'first' @ [80:52] ==> public final val first: Double defined in net.corda.vega.analytics.InitialMarginTriple[PropertyDescriptorImpl]

'to' @ [81:25] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'to' @ [82:25] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'to' @ [83:25] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'to' @ [84:25] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'valuation' @ [84:36] ==> val valuation: PortfolioValuation defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'margin' @ [84:46] ==> public final val margin: InitialMarginTriple defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'first' @ [84:53] ==> public final val first: Double defined in net.corda.vega.analytics.InitialMarginTriple[PropertyDescriptorImpl]

'ValuationsView' @ [88:16] ==> public constructor ValuationsView(businessDate: LocalDate, portfolio: Map<String, Any>, marketData: Map<String, Any>, sensitivities: Map<String, Any>, initialMargin: PortfolioApiUtils.InitialMarginView, confirmation: Map<String, Any>) defined in net.corda.vega.api.PortfolioApiUtils.ValuationsView[ClassConstructorDescriptorImpl]

'now' @ [89:42] ==> public open fun now(): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'mapOf' @ [90:29] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Any>): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'to' @ [91:25] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'tradeCount' @ [91:37] ==> val tradeCount: Int defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'to' @ [92:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'currency' @ [92:43] ==> val currency: String defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'to' @ [93:25] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'tradeCount' @ [93:35] ==> val tradeCount: Int defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'to' @ [94:25] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [95:25] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [96:25] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [97:25] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'tradeCount' @ [97:36] ==> val tradeCount: Int defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'to' @ [98:25] ==> public infix fun <A, B> String.to(that: Boolean): Pair<String, Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Boolean

'mapOf' @ [100:30] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Any>): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'to' @ [101:25] ==> public infix fun <A, B> String.to(that: Map<String, Any>): Pair<String, Map<String, Any>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Map<String, Any>

'yieldCurves' @ [101:42] ==> val yieldCurves: Map<String, Any> defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'to' @ [102:25] ==> public infix fun <A, B> String.to(that: Map<String, Any>): Pair<String, Map<String, Any>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Map<String, Any>

'fixings' @ [102:38] ==> val fixings: Map<String, Any> defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'to' @ [103:25] ==> public infix fun <A, B> String.to(that: Boolean): Pair<String, Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Boolean

'mapOf' @ [105:33] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Any>): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'to' @ [105:39] ==> public infix fun <A, B> String.to(that: Map<(MarketDataName<*>..MarketDataName<*>?), Map<(String..String?), (Double..Double?)>>): Pair<String, Map<(MarketDataName<*>..MarketDataName<*>?), Map<(String..String?), (Double..Double?)>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Map<(com.opengamma.strata.data.MarketDataName<*>..com.opengamma.strata.data.MarketDataName<*>?), Map<(kotlin.String..kotlin.String?), (kotlin.Double..kotlin.Double?)>>

'processedSensitivities' @ [105:51] ==> val processedSensitivities: Map<(MarketDataName<*>..MarketDataName<*>?), Map<(String..String?), (Double..Double?)>> defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'to' @ [106:25] ==> public infix fun <A, B> String.to(that: List<Map<String, (Any..Any?)>>): Pair<String, List<Map<String, (Any..Any?)>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<Map<String, (kotlin.Any..kotlin.Any?)>>

'valuation' @ [106:39] ==> val valuation: PortfolioValuation defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'currencySensitivies' @ [106:49] ==> public final val currencySensitivies: MultiCurrencyAmount defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'amounts' @ [106:69] ==> public final val MultiCurrencyAmount.amounts: (ImmutableSortedSet<(CurrencyAmount..CurrencyAmount?)>..ImmutableSortedSet<(CurrencyAmount..CurrencyAmount?)>?)[MyPropertyDescriptor]

'toList' @ [106:77] ==> public fun <T> Iterable<(CurrencyAmount..CurrencyAmount?)>.toList(): List<(CurrencyAmount..CurrencyAmount?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.opengamma.strata.basics.currency.CurrencyAmount..com.opengamma.strata.basics.currency.CurrencyAmount?)

'map' @ [106:86] ==> public inline fun <T, R> Iterable<(CurrencyAmount..CurrencyAmount?)>.map(transform: ((CurrencyAmount..CurrencyAmount?)) -> Map<String, (Any..Any?)>): List<Map<String, (Any..Any?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.opengamma.strata.basics.currency.CurrencyAmount..com.opengamma.strata.basics.currency.CurrencyAmount?)
    <R> -> Map<String, (kotlin.Any..kotlin.Any?)>

'mapOf' @ [107:29] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, (Any..Any?)>): Map<String, (Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (kotlin.Any..kotlin.Any?)

'to' @ [108:37] ==> public infix fun <A, B> String.to(that: (String..String?)): Pair<String, (String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.String..kotlin.String?)

'it' @ [108:51] ==> value-parameter it: (CurrencyAmount..CurrencyAmount?) defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'currency' @ [108:54] ==> public final val CurrencyAmount.currency: (Currency..Currency?)[MyPropertyDescriptor]

'code' @ [108:63] ==> public final val Currency.code: (String..String?)[MyPropertyDescriptor]

'to' @ [109:37] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'it' @ [109:49] ==> value-parameter it: (CurrencyAmount..CurrencyAmount?) defined in net.corda.vega.api.PortfolioApiUtils.createValuations.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [109:52] ==> public final val CurrencyAmount.amount: Double[MyPropertyDescriptor]

'to' @ [112:25] ==> public infix fun <A, B> String.to(that: Boolean): Pair<String, Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Boolean

'initialMarginView' @ [114:33] ==> val initialMarginView: PortfolioApiUtils.InitialMarginView defined in net.corda.vega.api.PortfolioApiUtils.createValuations[LocalVariableDescriptor]

'mapOf' @ [115:32] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Any>): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'to' @ [116:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'state' @ [116:35] ==> value-parameter state: PortfolioState defined in net.corda.vega.api.PortfolioApiUtils.createValuations[ValueParameterDescriptorImpl]

'hash' @ [116:41] ==> public fun ContractState.hash(): SecureHash defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]

'toString' @ [116:48] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'to' @ [117:25] ==> public infix fun <A, B> String.to(that: Boolean): Pair<String, Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Boolean

'if (state.buyer == ownParty as AbstractParty) state.swap.toFloatingLeg() else state.swap.toFloatingLeg()' @ [129:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SwapTrade, elseBranch: SwapTrade): SwapTrade[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SwapTrade

'state' @ [129:25] ==> value-parameter state: IRSState defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[ValueParameterDescriptorImpl]

'buyer' @ [129:31] ==> public final val buyer: AbstractParty defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'ownParty' @ [129:40] ==> private final val ownParty: Party defined in net.corda.vega.api.PortfolioApiUtils[PropertyDescriptorImpl]

'state' @ [129:67] ==> value-parameter state: IRSState defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[ValueParameterDescriptorImpl]

'swap' @ [129:73] ==> public final val swap: SwapData defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'toFloatingLeg' @ [129:78] ==> public final fun toFloatingLeg(): SwapTrade defined in net.corda.vega.contracts.SwapData[SimpleFunctionDescriptorImpl]

'state' @ [129:99] ==> value-parameter state: IRSState defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[ValueParameterDescriptorImpl]

'swap' @ [129:105] ==> public final val swap: SwapData defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'toFloatingLeg' @ [129:110] ==> public final fun toFloatingLeg(): SwapTrade defined in net.corda.vega.contracts.SwapData[SimpleFunctionDescriptorImpl]

'trade' @ [130:24] ==> val trade: SwapTrade defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'product' @ [130:30] ==> public final val SwapTrade.product: (Swap..Swap?)[MyPropertyDescriptor]

'legs' @ [130:38] ==> public final val Swap.legs: (ImmutableList<(SwapLeg..SwapLeg?)>..ImmutableList<(SwapLeg..SwapLeg?)>?)[MyPropertyDescriptor]

'first' @ [130:43] ==> public inline fun <T> Iterable<(SwapLeg..SwapLeg?)>.first(predicate: ((SwapLeg..SwapLeg?)) -> Boolean): (SwapLeg..SwapLeg?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.opengamma.strata.product.swap.SwapLeg..com.opengamma.strata.product.swap.SwapLeg?)

'it' @ [130:51] ==> value-parameter it: (SwapLeg..SwapLeg?) defined in net.corda.vega.api.PortfolioApiUtils.createTradeView.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [130:54] ==> public final val SwapLeg.type: (SwapLegType..SwapLegType?)[MyPropertyDescriptor]

'FIXED' @ [130:74] ==> enum entry FIXED defined in com.opengamma.strata.product.swap.SwapLegType[FakeCallableDescriptorForObject]

'trade' @ [131:27] ==> val trade: SwapTrade defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'product' @ [131:33] ==> public final val SwapTrade.product: (Swap..Swap?)[MyPropertyDescriptor]

'legs' @ [131:41] ==> public final val Swap.legs: (ImmutableList<(SwapLeg..SwapLeg?)>..ImmutableList<(SwapLeg..SwapLeg?)>?)[MyPropertyDescriptor]

'first' @ [131:46] ==> public inline fun <T> Iterable<(SwapLeg..SwapLeg?)>.first(predicate: ((SwapLeg..SwapLeg?)) -> Boolean): (SwapLeg..SwapLeg?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.opengamma.strata.product.swap.SwapLeg..com.opengamma.strata.product.swap.SwapLeg?)

'it' @ [131:54] ==> value-parameter it: (SwapLeg..SwapLeg?) defined in net.corda.vega.api.PortfolioApiUtils.createTradeView.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [131:57] ==> public final val SwapLeg.type: (SwapLegType..SwapLegType?)[MyPropertyDescriptor]

'FIXED' @ [131:77] ==> enum entry FIXED defined in com.opengamma.strata.product.swap.SwapLegType[FakeCallableDescriptorForObject]

'fixedLeg' @ [132:25] ==> val fixedLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'calculation' @ [132:34] ==> public final val RateCalculationSwapLeg.calculation: (RateCalculation..RateCalculation?)[MyPropertyDescriptor]

'floatingLeg' @ [133:28] ==> val floatingLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'calculation' @ [133:40] ==> public final val RateCalculationSwapLeg.calculation: (RateCalculation..RateCalculation?)[MyPropertyDescriptor]

'rpc' @ [134:45] ==> value-parameter rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[ValueParameterDescriptorImpl]

'partyFromKey' @ [134:49] ==> public abstract fun partyFromKey(key: PublicKey): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'state' @ [134:62] ==> value-parameter state: IRSState defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[ValueParameterDescriptorImpl]

'buyer' @ [134:68] ==> public final val buyer: AbstractParty defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'owningKey' @ [134:74] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'state' @ [134:88] ==> value-parameter state: IRSState defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[ValueParameterDescriptorImpl]

'buyer' @ [134:94] ==> public final val buyer: AbstractParty defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'rpc' @ [135:48] ==> value-parameter rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[ValueParameterDescriptorImpl]

'partyFromKey' @ [135:52] ==> public abstract fun partyFromKey(key: PublicKey): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'state' @ [135:65] ==> value-parameter state: IRSState defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[ValueParameterDescriptorImpl]

'seller' @ [135:71] ==> public final val seller: AbstractParty defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'owningKey' @ [135:78] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'state' @ [135:92] ==> value-parameter state: IRSState defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[ValueParameterDescriptorImpl]

'seller' @ [135:98] ==> public final val seller: AbstractParty defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'TradeView' @ [137:16] ==> public constructor TradeView(fixedLeg: Map<String, Any>, floatingLeg: Map<String, Any>, common: Map<String, Any>, ref: String) defined in net.corda.vega.api.PortfolioApiUtils.TradeView[ClassConstructorDescriptorImpl]

'mapOf' @ [138:28] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, (Any..Any?)>): Map<String, (Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (kotlin.Any..kotlin.Any?)

'to' @ [139:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'fixedRatePayer' @ [139:46] ==> val fixedRatePayer: AbstractParty defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'nameOrNull' @ [139:61] ==> public abstract fun nameOrNull(): X500Name? defined in net.corda.core.identity.AbstractParty[DeserializedSimpleFunctionDescriptor]

'commonName' @ [139:75] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'fixedRatePayer' @ [139:89] ==> val fixedRatePayer: AbstractParty defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'owningKey' @ [139:104] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [139:114] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'to' @ [140:25] ==> public infix fun <A, B> String.to(that: Map<String, (Any..Any?)>): Pair<String, Map<String, (Any..Any?)>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Map<String, (kotlin.Any..kotlin.Any?)>

'mapOf' @ [140:39] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, (Any..Any?)>): Map<String, (Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (kotlin.Any..kotlin.Any?)

'to' @ [141:33] ==> public infix fun <A, B> String.to(that: (String..String?)): Pair<String, (String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.String..kotlin.String?)

'fixedLeg' @ [141:44] ==> val fixedLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'currency' @ [141:53] ==> public final val RateCalculationSwapLeg.currency: (Currency..Currency?)[MyPropertyDescriptor]

'code' @ [141:62] ==> public final val Currency.code: (String..String?)[MyPropertyDescriptor]

'to' @ [142:33] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'fixedLeg' @ [142:47] ==> val fixedLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'notionalSchedule' @ [142:56] ==> public final val RateCalculationSwapLeg.notionalSchedule: (NotionalSchedule..NotionalSchedule?)[MyPropertyDescriptor]

'amount' @ [142:73] ==> public final val NotionalSchedule.amount: (ValueSchedule..ValueSchedule?)[MyPropertyDescriptor]

'initialValue' @ [142:80] ==> public final val ValueSchedule.initialValue: Double[MyPropertyDescriptor]

'to' @ [144:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'fixedLeg' @ [144:47] ==> val fixedLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'paymentSchedule' @ [144:56] ==> public final val RateCalculationSwapLeg.paymentSchedule: (PaymentSchedule..PaymentSchedule?)[MyPropertyDescriptor]

'paymentFrequency' @ [144:72] ==> public final val PaymentSchedule.paymentFrequency: (Frequency..Frequency?)[MyPropertyDescriptor]

'toString' @ [144:89] ==> @ToString public open fun toString(): String defined in com.opengamma.strata.basics.schedule.Frequency[JavaMethodDescriptor]

'to' @ [145:25] ==> public infix fun <A, B> String.to(that: (LocalDate..LocalDate?)): Pair<String, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'fixedLeg' @ [145:44] ==> val fixedLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'startDate' @ [145:53] ==> public final val RateCalculationSwapLeg.startDate: (AdjustableDate..AdjustableDate?)[MyPropertyDescriptor]

'unadjusted' @ [145:63] ==> public final val AdjustableDate.unadjusted: (LocalDate..LocalDate?)[MyPropertyDescriptor]

'to' @ [146:25] ==> public infix fun <A, B> String.to(that: (LocalDate..LocalDate?)): Pair<String, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'fixedLeg' @ [146:46] ==> val fixedLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'endDate' @ [146:55] ==> public final val RateCalculationSwapLeg.endDate: (AdjustableDate..AdjustableDate?)[MyPropertyDescriptor]

'unadjusted' @ [146:63] ==> public final val AdjustableDate.unadjusted: (LocalDate..LocalDate?)[MyPropertyDescriptor]

'to' @ [147:25] ==> public infix fun <A, B> String.to(that: Map<String, Double>): Pair<String, Map<String, Double>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Map<String, Double>

'mapOf' @ [147:40] ==> public fun <K, V> mapOf(pair: Pair<String, Double>): Map<String, Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Double

'to' @ [148:33] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'fixedRate' @ [148:44] ==> val fixedRate: FixedRateCalculation defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'rate' @ [148:54] ==> public final val FixedRateCalculation.rate: (ValueSchedule..ValueSchedule?)[MyPropertyDescriptor]

'initialValue' @ [148:59] ==> public final val ValueSchedule.initialValue: Double[MyPropertyDescriptor]

'to' @ [150:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'fixedLeg' @ [150:42] ==> val fixedLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'paymentSchedule' @ [150:51] ==> public final val RateCalculationSwapLeg.paymentSchedule: (PaymentSchedule..PaymentSchedule?)[MyPropertyDescriptor]

'paymentRelativeTo' @ [150:67] ==> public final val PaymentSchedule.paymentRelativeTo: (PaymentRelativeTo..PaymentRelativeTo?)[MyPropertyDescriptor]

'name' @ [150:85] ==> public final val name: String defined in com.opengamma.strata.product.swap.PaymentRelativeTo[DeserializedPropertyDescriptor]

'to' @ [151:25] ==> public infix fun <A, B> String.to(that: List<String>): Pair<String, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<String>

'listOf' @ [151:39] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [152:25] ==> public infix fun <A, B> String.to(that: Map<String, Any>): Pair<String, Map<String, Any>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Map<String, Any>

'mapOf' @ [152:46] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'mapOf' @ [154:31] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, (Any..Any?)>): Map<String, (Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (kotlin.Any..kotlin.Any?)

'to' @ [155:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'floatingRatePayer' @ [155:49] ==> val floatingRatePayer: AbstractParty defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'nameOrNull' @ [155:67] ==> public abstract fun nameOrNull(): X500Name? defined in net.corda.core.identity.AbstractParty[DeserializedSimpleFunctionDescriptor]

'commonName' @ [155:81] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'floatingRatePayer' @ [155:95] ==> val floatingRatePayer: AbstractParty defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'owningKey' @ [155:113] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [155:123] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'to' @ [156:25] ==> public infix fun <A, B> String.to(that: Map<String, (Any..Any?)>): Pair<String, Map<String, (Any..Any?)>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Map<String, (kotlin.Any..kotlin.Any?)>

'mapOf' @ [156:39] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, (Any..Any?)>): Map<String, (Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (kotlin.Any..kotlin.Any?)

'to' @ [157:33] ==> public infix fun <A, B> String.to(that: (String..String?)): Pair<String, (String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.String..kotlin.String?)

'floatingLeg' @ [157:44] ==> val floatingLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'currency' @ [157:56] ==> public final val RateCalculationSwapLeg.currency: (Currency..Currency?)[MyPropertyDescriptor]

'code' @ [157:65] ==> public final val Currency.code: (String..String?)[MyPropertyDescriptor]

'to' @ [158:33] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'floatingLeg' @ [158:47] ==> val floatingLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'notionalSchedule' @ [158:59] ==> public final val RateCalculationSwapLeg.notionalSchedule: (NotionalSchedule..NotionalSchedule?)[MyPropertyDescriptor]

'amount' @ [158:76] ==> public final val NotionalSchedule.amount: (ValueSchedule..ValueSchedule?)[MyPropertyDescriptor]

'initialValue' @ [158:83] ==> public final val ValueSchedule.initialValue: Double[MyPropertyDescriptor]

'to' @ [160:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'floatingLeg' @ [160:47] ==> val floatingLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'paymentSchedule' @ [160:59] ==> public final val RateCalculationSwapLeg.paymentSchedule: (PaymentSchedule..PaymentSchedule?)[MyPropertyDescriptor]

'paymentFrequency' @ [160:75] ==> public final val PaymentSchedule.paymentFrequency: (Frequency..Frequency?)[MyPropertyDescriptor]

'toString' @ [160:92] ==> @ToString public open fun toString(): String defined in com.opengamma.strata.basics.schedule.Frequency[JavaMethodDescriptor]

'to' @ [161:25] ==> public infix fun <A, B> String.to(that: (LocalDate..LocalDate?)): Pair<String, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'floatingLeg' @ [161:44] ==> val floatingLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'startDate' @ [161:56] ==> public final val RateCalculationSwapLeg.startDate: (AdjustableDate..AdjustableDate?)[MyPropertyDescriptor]

'unadjusted' @ [161:66] ==> public final val AdjustableDate.unadjusted: (LocalDate..LocalDate?)[MyPropertyDescriptor]

'to' @ [162:25] ==> public infix fun <A, B> String.to(that: (LocalDate..LocalDate?)): Pair<String, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'floatingLeg' @ [162:46] ==> val floatingLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'endDate' @ [162:58] ==> public final val RateCalculationSwapLeg.endDate: (AdjustableDate..AdjustableDate?)[MyPropertyDescriptor]

'unadjusted' @ [162:66] ==> public final val AdjustableDate.unadjusted: (LocalDate..LocalDate?)[MyPropertyDescriptor]

'to' @ [163:25] ==> public infix fun <A, B> String.to(that: (String..String?)): Pair<String, (String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.String..kotlin.String?)

'floatingRate' @ [163:36] ==> val floatingRate: IborRateCalculation defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'index' @ [163:49] ==> public final val IborRateCalculation.index: (IborIndex..IborIndex?)[MyPropertyDescriptor]

'name' @ [163:55] ==> public final val IborIndex.name: (String..String?)[MyPropertyDescriptor]

'to' @ [164:25] ==> public infix fun <A, B> String.to(that: (PaymentRelativeTo..PaymentRelativeTo?)): Pair<String, (PaymentRelativeTo..PaymentRelativeTo?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (com.opengamma.strata.product.swap.PaymentRelativeTo..com.opengamma.strata.product.swap.PaymentRelativeTo?)

'floatingLeg' @ [164:42] ==> val floatingLeg: RateCalculationSwapLeg defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'paymentSchedule' @ [164:54] ==> public final val RateCalculationSwapLeg.paymentSchedule: (PaymentSchedule..PaymentSchedule?)[MyPropertyDescriptor]

'paymentRelativeTo' @ [164:70] ==> public final val PaymentSchedule.paymentRelativeTo: (PaymentRelativeTo..PaymentRelativeTo?)[MyPropertyDescriptor]

'to' @ [165:25] ==> public infix fun <A, B> String.to(that: List<String>): Pair<String, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<String>

'listOf' @ [165:39] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [166:25] ==> public infix fun <A, B> String.to(that: List<String>): Pair<String, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<String>

'listOf' @ [166:46] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [167:25] ==> public infix fun <A, B> String.to(that: Map<String, Any>): Pair<String, Map<String, Any>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Map<String, Any>

'mapOf' @ [167:45] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'mapOf' @ [169:26] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, (Any..Any?)>): Map<String, (Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (kotlin.Any..kotlin.Any?)

'to' @ [170:25] ==> public infix fun <A, B> String.to(that: (LocalDate..LocalDate?)): Pair<String, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'trade' @ [170:44] ==> val trade: SwapTrade defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'product' @ [170:50] ==> public final val SwapTrade.product: (Swap..Swap?)[MyPropertyDescriptor]

'startDate' @ [170:58] ==> public final val Swap.startDate: (AdjustableDate..AdjustableDate?)[MyPropertyDescriptor]

'unadjusted' @ [170:68] ==> public final val AdjustableDate.unadjusted: (LocalDate..LocalDate?)[MyPropertyDescriptor]

'to' @ [171:25] ==> public infix fun <A, B> String.to(that: Map<String, Any>): Pair<String, Map<String, Any>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Map<String, Any>

'mapOf' @ [171:43] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Any>): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'to' @ [172:33] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [173:33] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [174:33] ==> public infix fun <A, B> String.to(that: Map<String, String>): Pair<String, Map<String, String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Map<String, String>

'mapOf' @ [174:44] ==> public fun <K, V> mapOf(pair: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [175:41] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'trade' @ [179:23] ==> val trade: SwapTrade defined in net.corda.vega.api.PortfolioApiUtils.createTradeView[LocalVariableDescriptor]

'info' @ [179:29] ==> public final val SwapTrade.info: (TradeInfo..TradeInfo?)[MyPropertyDescriptor]

'id' @ [179:34] ==> public final val TradeInfo.id: (Optional<(StandardId..StandardId?)>..Optional<(StandardId..StandardId?)>?)[MyPropertyDescriptor]

'get' @ [179:37] ==> public open fun get(): StandardId defined in java.util.Optional[JavaMethodDescriptor]

'value' @ [179:43] ==> public final val StandardId.value: (String..String?)[MyPropertyDescriptor]

