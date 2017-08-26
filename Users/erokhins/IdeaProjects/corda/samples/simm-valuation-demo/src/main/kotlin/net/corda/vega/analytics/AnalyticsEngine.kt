'InitialMarginTriple' @ [28:22] ==> public constructor InitialMarginTriple(first: Double, second: Double, third: Double) defined in net.corda.vega.analytics.InitialMarginTriple[ClassConstructorDescriptorImpl]

'AnalyticsEngine' @ [64:31] ==> public constructor AnalyticsEngine() defined in net.corda.vega.analytics.AnalyticsEngine[ClassConstructorDescriptorImpl]

'loggerFor' @ [66:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> OGSIMMAnalyticsEngine

'loadCurveGroup' @ [70:16] ==> private final fun loadCurveGroup(): CurveGroupDefinition defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[SimpleFunctionDescriptorImpl]

'loadMarketData' @ [74:16] ==> private final fun loadMarketData(asOf: LocalDate): MarketData defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[SimpleFunctionDescriptorImpl]

'asOf' @ [74:31] ==> value-parameter asOf: LocalDate defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.marketData[ValueParameterDescriptorImpl]

'log' @ [78:9] ==> public final val log: Logger defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.Companion[PropertyDescriptorImpl]

'info' @ [78:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'trades' @ [78:46] ==> value-parameter trades: List<ResolvedSwapTrade> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[ValueParameterDescriptorImpl]

'size' @ [78:53] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'empty' @ [80:65] ==> public open fun empty(): (CurrencyParameterSensitivities..CurrencyParameterSensitivities?) defined in com.opengamma.strata.market.param.CurrencyParameterSensitivities[JavaMethodDescriptor]

'empty' @ [81:57] ==> public open fun empty(): (MultiCurrencyAmount..MultiCurrencyAmount?) defined in com.opengamma.strata.basics.currency.MultiCurrencyAmount[JavaMethodDescriptor]

'trades' @ [82:31] ==> value-parameter trades: List<ResolvedSwapTrade> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[ValueParameterDescriptorImpl]

'resolvedTrade' @ [83:24] ==> val resolvedTrade: ResolvedSwapTrade defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[LocalVariableDescriptor]

'product' @ [83:38] ==> public final val ResolvedSwapTrade.product: (ResolvedSwap..ResolvedSwap?)[MyPropertyDescriptor]

'pricer' @ [85:38] ==> value-parameter pricer: DiscountingSwapProductPricer defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[ValueParameterDescriptorImpl]

'presentValueSensitivity' @ [85:45] ==> public open fun presentValueSensitivity(p0: (ResolvedSwap..ResolvedSwap?), p1: (RatesProvider..RatesProvider?)): (PointSensitivityBuilder..PointSensitivityBuilder?) defined in com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer[JavaMethodDescriptor]

'swap' @ [85:69] ==> val swap: (ResolvedSwap..ResolvedSwap?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[LocalVariableDescriptor]

'combinedRatesProvider' @ [85:75] ==> value-parameter combinedRatesProvider: ImmutableRatesProvider defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[ValueParameterDescriptorImpl]

'build' @ [85:98] ==> public open fun build(): (PointSensitivities..PointSensitivities?) defined in com.opengamma.strata.market.sensitivity.PointSensitivityBuilder[JavaMethodDescriptor]

'combinedRatesProvider' @ [86:33] ==> value-parameter combinedRatesProvider: ImmutableRatesProvider defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[ValueParameterDescriptorImpl]

'parameterSensitivity' @ [86:55] ==> public open fun parameterSensitivity(p0: (PointSensitivities..PointSensitivities?)): (CurrencyParameterSensitivities..CurrencyParameterSensitivities?) defined in com.opengamma.strata.pricer.rate.ImmutableRatesProvider[JavaMethodDescriptor]

'pointSensitivities' @ [86:76] ==> val pointSensitivities: (PointSensitivities..PointSensitivities?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[LocalVariableDescriptor]

'pricer' @ [87:36] ==> value-parameter pricer: DiscountingSwapProductPricer defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[ValueParameterDescriptorImpl]

'currencyExposure' @ [87:43] ==> public open fun currencyExposure(p0: (ResolvedSwap..ResolvedSwap?), p1: (RatesProvider..RatesProvider?)): (MultiCurrencyAmount..MultiCurrencyAmount?) defined in com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer[JavaMethodDescriptor]

'swap' @ [87:60] ==> val swap: (ResolvedSwap..ResolvedSwap?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[LocalVariableDescriptor]

'combinedRatesProvider' @ [87:66] ==> value-parameter combinedRatesProvider: ImmutableRatesProvider defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[ValueParameterDescriptorImpl]

'totalSensitivities' @ [89:13] ==> var totalSensitivities: (CurrencyParameterSensitivities..CurrencyParameterSensitivities?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[LocalVariableDescriptor]

'totalSensitivities' @ [89:34] ==> var totalSensitivities: (CurrencyParameterSensitivities..CurrencyParameterSensitivities?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[LocalVariableDescriptor]

'combinedWith' @ [89:53] ==> public open fun combinedWith(p0: (CurrencyParameterSensitivities..CurrencyParameterSensitivities?)): (CurrencyParameterSensitivities..CurrencyParameterSensitivities?) defined in com.opengamma.strata.market.param.CurrencyParameterSensitivities[JavaMethodDescriptor]

'sensitivities' @ [89:66] ==> val sensitivities: (CurrencyParameterSensitivities..CurrencyParameterSensitivities?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[LocalVariableDescriptor]

'totalCurrencyExposure' @ [90:13] ==> var totalCurrencyExposure: (MultiCurrencyAmount..MultiCurrencyAmount?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[LocalVariableDescriptor]

'totalCurrencyExposure' @ [90:37] ==> var totalCurrencyExposure: (MultiCurrencyAmount..MultiCurrencyAmount?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[LocalVariableDescriptor]

'plus' @ [90:59] ==> public open operator fun plus(p0: (MultiCurrencyAmount..MultiCurrencyAmount?)): (MultiCurrencyAmount..MultiCurrencyAmount?) defined in com.opengamma.strata.basics.currency.MultiCurrencyAmount[JavaMethodDescriptor]

'currencyExposure' @ [90:64] ==> val currencyExposure: (MultiCurrencyAmount..MultiCurrencyAmount?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[LocalVariableDescriptor]

'Pair' @ [92:16] ==> public constructor Pair<out A, out B>(first: (CurrencyParameterSensitivities..CurrencyParameterSensitivities?), second: (MultiCurrencyAmount..MultiCurrencyAmount?)) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> (com.opengamma.strata.market.param.CurrencyParameterSensitivities..com.opengamma.strata.market.param.CurrencyParameterSensitivities?)
    <out B> -> (com.opengamma.strata.basics.currency.MultiCurrencyAmount..com.opengamma.strata.basics.currency.MultiCurrencyAmount?)

'totalSensitivities' @ [92:21] ==> var totalSensitivities: (CurrencyParameterSensitivities..CurrencyParameterSensitivities?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[LocalVariableDescriptor]

'totalCurrencyExposure' @ [92:41] ==> var totalCurrencyExposure: (MultiCurrencyAmount..MultiCurrencyAmount?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.sensitivities[LocalVariableDescriptor]

'PortfolioNormalizer' @ [98:26] ==> public constructor PortfolioNormalizer(eur: Currency?, combinedRatesProvider: ImmutableRatesProvider?) defined in net.corda.vega.analytics.PortfolioNormalizer[ClassConstructorDescriptorImpl]

'EUR' @ [98:55] ==> public final val EUR: (Currency..Currency?) defined in com.opengamma.strata.basics.currency.Currency[JavaPropertyDescriptor]

'combinedRatesProvider' @ [98:60] ==> value-parameter combinedRatesProvider: ImmutableRatesProvider defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.margin[ValueParameterDescriptorImpl]

'RwamBimmNotProductClassesCalculator' @ [99:31] ==> public constructor RwamBimmNotProductClassesCalculator(fxRateProvider: MarketDataFxRateProvider?, eur: Currency?, instance: Any) defined in net.corda.vega.analytics.RwamBimmNotProductClassesCalculator[ClassConstructorDescriptorImpl]

'fxRateProvider' @ [100:17] ==> value-parameter fxRateProvider: MarketDataFxRateProvider defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.margin[ValueParameterDescriptorImpl]

'EUR' @ [101:26] ==> public final val EUR: (Currency..Currency?) defined in com.opengamma.strata.basics.currency.Currency[JavaPropertyDescriptor]

'INSTANCE' @ [102:35] ==> public object INSTANCE defined in net.corda.vega.analytics.IsdaConfiguration[FakeCallableDescriptorForObject]

'BimmAnalysisUtils' @ [104:22] ==> @Suppress public object BimmAnalysisUtils defined in net.corda.vega.analytics in file OGStub.kt[FakeCallableDescriptorForObject]

'computeMargin' @ [104:40] ==> public final fun computeMargin(combinedRatesProvider: ImmutableRatesProvider?, normalizer: PortfolioNormalizer, calculatorTotal: RwamBimmNotProductClassesCalculator, first: CurrencyParameterSensitivities, second: MultiCurrencyAmount): Triple<Double, Double, Double> defined in net.corda.vega.analytics.BimmAnalysisUtils[SimpleFunctionDescriptorImpl]

'combinedRatesProvider' @ [105:17] ==> value-parameter combinedRatesProvider: ImmutableRatesProvider defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.margin[ValueParameterDescriptorImpl]

'normalizer' @ [106:17] ==> val normalizer: PortfolioNormalizer defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.margin[LocalVariableDescriptor]

'calculatorTotal' @ [107:17] ==> val calculatorTotal: RwamBimmNotProductClassesCalculator defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.margin[LocalVariableDescriptor]

'totalSensitivities' @ [108:17] ==> value-parameter totalSensitivities: CurrencyParameterSensitivities defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.margin[ValueParameterDescriptorImpl]

'totalCurrencyExposure' @ [109:17] ==> value-parameter totalCurrencyExposure: MultiCurrencyAmount defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.margin[ValueParameterDescriptorImpl]

'Triple' @ [110:16] ==> public constructor Triple<out A, out B, out C>(first: Double, second: Double, third: Double) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Double
    <out B> -> Double
    <out C> -> Double

'margin' @ [110:23] ==> val margin: Triple<Double, Double, Double> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.margin[LocalVariableDescriptor]

'first' @ [110:30] ==> public final val first: Double defined in kotlin.Triple[DeserializedPropertyDescriptor]

'margin' @ [110:37] ==> val margin: Triple<Double, Double, Double> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.margin[LocalVariableDescriptor]

'second' @ [110:44] ==> public final val second: Double defined in kotlin.Triple[DeserializedPropertyDescriptor]

'margin' @ [110:52] ==> val margin: Triple<Double, Double, Double> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.margin[LocalVariableDescriptor]

'third' @ [110:59] ==> public final val third: Double defined in kotlin.Triple[DeserializedPropertyDescriptor]

'load' @ [114:53] ==> public open fun load(p0: (ResourceLocator..ResourceLocator?), p1: (ResourceLocator..ResourceLocator?), vararg p2: (ResourceLocator..ResourceLocator?)): (ImmutableMap<(CurveGroupName..CurveGroupName?), (CurveGroupDefinition..CurveGroupDefinition?)>..ImmutableMap<(CurveGroupName..CurveGroupName?), (CurveGroupDefinition..CurveGroupDefinition?)>?) defined in com.opengamma.strata.loader.csv.RatesCalibrationCsvLoader[JavaMethodDescriptor]

'ofClasspathUrl' @ [115:33] ==> public open fun ofClasspathUrl(p0: (URL..URL?)): (ResourceLocator..ResourceLocator?) defined in com.opengamma.strata.collect.io.ResourceLocator[JavaMethodDescriptor]

'javaClass' @ [115:48] ==> public val <T : Any> OGSIMMAnalyticsEngine.javaClass: Class<OGSIMMAnalyticsEngine> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> OGSIMMAnalyticsEngine

'getResource' @ [115:58] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.Class[JavaMethodDescriptor]

'ofClasspathUrl' @ [116:33] ==> public open fun ofClasspathUrl(p0: (URL..URL?)): (ResourceLocator..ResourceLocator?) defined in com.opengamma.strata.collect.io.ResourceLocator[JavaMethodDescriptor]

'javaClass' @ [116:48] ==> public val <T : Any> OGSIMMAnalyticsEngine.javaClass: Class<OGSIMMAnalyticsEngine> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> OGSIMMAnalyticsEngine

'getResource' @ [116:58] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.Class[JavaMethodDescriptor]

'ofClasspathUrl' @ [117:33] ==> public open fun ofClasspathUrl(p0: (URL..URL?)): (ResourceLocator..ResourceLocator?) defined in com.opengamma.strata.collect.io.ResourceLocator[JavaMethodDescriptor]

'javaClass' @ [117:48] ==> public val <T : Any> OGSIMMAnalyticsEngine.javaClass: Class<OGSIMMAnalyticsEngine> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> OGSIMMAnalyticsEngine

'getResource' @ [117:58] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.Class[JavaMethodDescriptor]

'curveGroups' @ [118:16] ==> val curveGroups: (ImmutableMap<(CurveGroupName..CurveGroupName?), (CurveGroupDefinition..CurveGroupDefinition?)>..ImmutableMap<(CurveGroupName..CurveGroupName?), (CurveGroupDefinition..CurveGroupDefinition?)>?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.loadCurveGroup[LocalVariableDescriptor]

'of' @ [118:43] ==> @FromString public open fun of(p0: (String..String?)): (CurveGroupName..CurveGroupName?) defined in com.opengamma.strata.market.curve.CurveGroupName[JavaMethodDescriptor]

'javaClass' @ [122:25] ==> public val <T : Any> OGSIMMAnalyticsEngine.javaClass: Class<OGSIMMAnalyticsEngine> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> OGSIMMAnalyticsEngine

'getResource' @ [122:35] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.Class[JavaMethodDescriptor]

'javaClass' @ [123:21] ==> public val <T : Any> OGSIMMAnalyticsEngine.javaClass: Class<OGSIMMAnalyticsEngine> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> OGSIMMAnalyticsEngine

'getResource' @ [123:31] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.Class[JavaMethodDescriptor]

'load' @ [125:38] ==> public open fun load(p0: (LocalDate..LocalDate?), p1: (MutableCollection<(ResourceLocator..ResourceLocator?)>..Collection<(ResourceLocator..ResourceLocator?)>?)): (ImmutableMap<(QuoteId..QuoteId?), (Double..Double?)>..ImmutableMap<(QuoteId..QuoteId?), (Double..Double?)>?) defined in com.opengamma.strata.loader.csv.QuotesCsvLoader[JavaMethodDescriptor]

'asOf' @ [125:43] ==> value-parameter asOf: LocalDate defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.loadMarketData[ValueParameterDescriptorImpl]

'of' @ [125:63] ==> public open fun <E : (Any..Any?)> of(p0: (ResourceLocator..ResourceLocator?)): (ImmutableList<(ResourceLocator..ResourceLocator?)>..ImmutableList<(ResourceLocator..ResourceLocator?)>?) defined in com.google.common.collect.ImmutableList[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ResourceLocator

'ofClasspathUrl' @ [125:82] ==> public open fun ofClasspathUrl(p0: (URL..URL?)): (ResourceLocator..ResourceLocator?) defined in com.opengamma.strata.collect.io.ResourceLocator[JavaMethodDescriptor]

'quotesUrl' @ [125:97] ==> val quotesUrl: (URL..URL?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.loadMarketData[LocalVariableDescriptor]

'load' @ [126:40] ==> public open fun load(p0: (LocalDate..LocalDate?), vararg p1: (ResourceLocator..ResourceLocator?)): (ImmutableMap<(FxRateId..FxRateId?), (FxRate..FxRate?)>..ImmutableMap<(FxRateId..FxRateId?), (FxRate..FxRate?)>?) defined in com.opengamma.strata.loader.csv.FxRatesCsvLoader[JavaMethodDescriptor]

'asOf' @ [126:45] ==> value-parameter asOf: LocalDate defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.loadMarketData[ValueParameterDescriptorImpl]

'ofClasspathUrl' @ [126:67] ==> public open fun ofClasspathUrl(p0: (URL..URL?)): (ResourceLocator..ResourceLocator?) defined in com.opengamma.strata.collect.io.ResourceLocator[JavaMethodDescriptor]

'fxUrl' @ [126:82] ==> val fxUrl: (URL..URL?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.loadMarketData[LocalVariableDescriptor]

'builder' @ [127:36] ==> public open fun builder(p0: (LocalDate..LocalDate?)): (ImmutableMarketDataBuilder..ImmutableMarketDataBuilder?) defined in com.opengamma.strata.data.ImmutableMarketData[JavaMethodDescriptor]

'asOf' @ [127:44] ==> value-parameter asOf: LocalDate defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.loadMarketData[ValueParameterDescriptorImpl]

'addValueMap' @ [127:50] ==> public open fun addValueMap(p0: (MutableMap<out (MarketDataId<*>..MarketDataId<*>?), *>..Map<out (MarketDataId<*>..MarketDataId<*>?), *>?)): (ImmutableMarketDataBuilder..ImmutableMarketDataBuilder?) defined in com.opengamma.strata.data.ImmutableMarketDataBuilder[JavaMethodDescriptor]

'quotes' @ [127:62] ==> val quotes: (ImmutableMap<(QuoteId..QuoteId?), (Double..Double?)>..ImmutableMap<(QuoteId..QuoteId?), (Double..Double?)>?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.loadMarketData[LocalVariableDescriptor]

'addValueMap' @ [127:70] ==> public open fun addValueMap(p0: (MutableMap<out (MarketDataId<*>..MarketDataId<*>?), *>..Map<out (MarketDataId<*>..MarketDataId<*>?), *>?)): (ImmutableMarketDataBuilder..ImmutableMarketDataBuilder?) defined in com.opengamma.strata.data.ImmutableMarketDataBuilder[JavaMethodDescriptor]

'fxRates' @ [127:82] ==> val fxRates: (ImmutableMap<(FxRateId..FxRateId?), (FxRate..FxRate?)>..ImmutableMap<(FxRateId..FxRateId?), (FxRate..FxRate?)>?) defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.loadMarketData[LocalVariableDescriptor]

'build' @ [127:91] ==> public open fun build(): (ImmutableMarketData..ImmutableMarketData?) defined in com.opengamma.strata.data.ImmutableMarketDataBuilder[JavaMethodDescriptor]

'trades' @ [137:16] ==> value-parameter trades: List<ResolvedSwapTrade> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateSensitivitiesBatch[ValueParameterDescriptorImpl]

'map' @ [138:18] ==> public inline fun <T, R> Iterable<ResolvedSwapTrade>.map(transform: (ResolvedSwapTrade) -> Pair<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount>): List<Pair<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedSwapTrade
    <R> -> Pair<ResolvedSwapTrade, CurrencyAmount>

'this' @ [139:42] ==> <this> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[LazyClassReceiverParameterDescriptor]

'sensitivities' @ [139:47] ==> public open fun sensitivities(trades: List<ResolvedSwapTrade>, pricer: DiscountingSwapProductPricer, combinedRatesProvider: ImmutableRatesProvider): Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[SimpleFunctionDescriptorImpl]

'trades' @ [139:61] ==> value-parameter trades: List<ResolvedSwapTrade> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateSensitivitiesBatch[ValueParameterDescriptorImpl]

'omit' @ [139:68] ==> public fun <E> List<ResolvedSwapTrade>.omit(ignoree: ResolvedSwapTrade): List<ResolvedSwapTrade> defined in net.corda.vega.analytics[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> ResolvedSwapTrade

'it' @ [139:73] ==> value-parameter it: ResolvedSwapTrade defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateSensitivitiesBatch.<anonymous>[ValueParameterDescriptorImpl]

'pricer' @ [139:78] ==> value-parameter pricer: DiscountingSwapProductPricer defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateSensitivitiesBatch[ValueParameterDescriptorImpl]

'ratesProvider' @ [139:86] ==> value-parameter ratesProvider: ImmutableRatesProvider defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateSensitivitiesBatch[ValueParameterDescriptorImpl]

'it' @ [140:21] ==> value-parameter it: ResolvedSwapTrade defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateSensitivitiesBatch.<anonymous>[ValueParameterDescriptorImpl]

'CurrencyAmount' @ [140:27] ==> public constructor CurrencyAmount(currencyParameterSensitivities: CurrencyParameterSensitivities, multiCurrencyAmount: MultiCurrencyAmount) defined in net.corda.vega.analytics.AnalyticsEngine.CurrencyAmount[ClassConstructorDescriptorImpl]

'sensAmountPair' @ [140:42] ==> val sensAmountPair: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateSensitivitiesBatch.<anonymous>[LocalVariableDescriptor]

'first' @ [140:57] ==> public final val first: CurrencyParameterSensitivities defined in kotlin.Pair[DeserializedPropertyDescriptor]

'sensAmountPair' @ [140:64] ==> val sensAmountPair: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateSensitivitiesBatch.<anonymous>[LocalVariableDescriptor]

'second' @ [140:79] ==> public final val second: MultiCurrencyAmount defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toMap' @ [141:19] ==> public fun <K, V> Iterable<Pair<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount>>.toMap(): Map<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ResolvedSwapTrade
    <V> -> CurrencyAmount

'PortfolioNormalizer' @ [148:26] ==> public constructor PortfolioNormalizer(eur: Currency?, combinedRatesProvider: ImmutableRatesProvider?) defined in net.corda.vega.analytics.PortfolioNormalizer[ClassConstructorDescriptorImpl]

'EUR' @ [148:55] ==> public final val EUR: (Currency..Currency?) defined in com.opengamma.strata.basics.currency.Currency[JavaPropertyDescriptor]

'combinedRatesProvider' @ [148:60] ==> value-parameter combinedRatesProvider: ImmutableRatesProvider defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch[ValueParameterDescriptorImpl]

'RwamBimmNotProductClassesCalculator' @ [149:31] ==> public constructor RwamBimmNotProductClassesCalculator(fxRateProvider: MarketDataFxRateProvider?, eur: Currency?, instance: Any) defined in net.corda.vega.analytics.RwamBimmNotProductClassesCalculator[ClassConstructorDescriptorImpl]

'fxRateProvider' @ [149:67] ==> value-parameter fxRateProvider: MarketDataFxRateProvider defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch[ValueParameterDescriptorImpl]

'EUR' @ [149:92] ==> public final val EUR: (Currency..Currency?) defined in com.opengamma.strata.basics.currency.Currency[JavaPropertyDescriptor]

'INSTANCE' @ [149:115] ==> public object INSTANCE defined in net.corda.vega.analytics.IsdaConfiguration[FakeCallableDescriptorForObject]

'tradeSensitivitiesMap' @ [150:16] ==> value-parameter tradeSensitivitiesMap: Map<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch[ValueParameterDescriptorImpl]

'map' @ [150:38] ==> public inline fun <K, V, R> Map<out ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount>.map(transform: (Map.Entry<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount>) -> Pair<ResolvedSwapTrade, InitialMarginTriple>): List<Pair<ResolvedSwapTrade, InitialMarginTriple>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ResolvedSwapTrade
    <V> -> CurrencyAmount
    <R> -> Pair<ResolvedSwapTrade, InitialMarginTriple>

'BimmAnalysisUtils' @ [151:21] ==> @Suppress public object BimmAnalysisUtils defined in net.corda.vega.analytics in file OGStub.kt[FakeCallableDescriptorForObject]

'computeMargin' @ [151:39] ==> public final fun computeMargin(combinedRatesProvider: ImmutableRatesProvider?, normalizer: PortfolioNormalizer, calculatorTotal: RwamBimmNotProductClassesCalculator, first: CurrencyParameterSensitivities, second: MultiCurrencyAmount): Triple<Double, Double, Double> defined in net.corda.vega.analytics.BimmAnalysisUtils[SimpleFunctionDescriptorImpl]

'combinedRatesProvider' @ [151:53] ==> value-parameter combinedRatesProvider: ImmutableRatesProvider defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch[ValueParameterDescriptorImpl]

'normalizer' @ [151:76] ==> val normalizer: PortfolioNormalizer defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch[LocalVariableDescriptor]

'calculatorTotal' @ [151:88] ==> val calculatorTotal: RwamBimmNotProductClassesCalculator defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch[LocalVariableDescriptor]

'it' @ [151:105] ==> value-parameter it: Map.Entry<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [151:108] ==> public abstract val value: AnalyticsEngine.CurrencyAmount defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'currencyParameterSensitivities' @ [151:114] ==> public final val currencyParameterSensitivities: CurrencyParameterSensitivities defined in net.corda.vega.analytics.AnalyticsEngine.CurrencyAmount[PropertyDescriptorImpl]

'it' @ [151:146] ==> value-parameter it: Map.Entry<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [151:149] ==> public abstract val value: AnalyticsEngine.CurrencyAmount defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'multiCurrencyAmount' @ [151:155] ==> public final val multiCurrencyAmount: MultiCurrencyAmount defined in net.corda.vega.analytics.AnalyticsEngine.CurrencyAmount[PropertyDescriptorImpl]

'it' @ [152:13] ==> value-parameter it: Map.Entry<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [152:16] ==> public abstract val key: ResolvedSwapTrade defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'InitialMarginTriple' @ [153:21] ==> public constructor InitialMarginTriple(first: Double, second: Double, third: Double) defined in net.corda.vega.analytics.InitialMarginTriple[ClassConstructorDescriptorImpl]

'portfolioMargin' @ [153:41] ==> value-parameter portfolioMargin: InitialMarginTriple defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch[ValueParameterDescriptorImpl]

'first' @ [153:57] ==> public final val first: Double defined in net.corda.vega.analytics.InitialMarginTriple[PropertyDescriptorImpl]

't' @ [153:65] ==> val t: Triple<Double, Double, Double> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch.<anonymous>[LocalVariableDescriptor]

'first' @ [153:67] ==> public final val first: Double defined in kotlin.Triple[DeserializedPropertyDescriptor]

'portfolioMargin' @ [154:29] ==> value-parameter portfolioMargin: InitialMarginTriple defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch[ValueParameterDescriptorImpl]

'second' @ [154:45] ==> public final val second: Double defined in net.corda.vega.analytics.InitialMarginTriple[PropertyDescriptorImpl]

't' @ [154:54] ==> val t: Triple<Double, Double, Double> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch.<anonymous>[LocalVariableDescriptor]

'second' @ [154:56] ==> public final val second: Double defined in kotlin.Triple[DeserializedPropertyDescriptor]

'portfolioMargin' @ [155:29] ==> value-parameter portfolioMargin: InitialMarginTriple defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch[ValueParameterDescriptorImpl]

'third' @ [155:45] ==> public final val third: Double defined in net.corda.vega.analytics.InitialMarginTriple[PropertyDescriptorImpl]

't' @ [155:53] ==> val t: Triple<Double, Double, Double> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine.calculateMarginBatch.<anonymous>[LocalVariableDescriptor]

'third' @ [155:55] ==> public final val third: Double defined in kotlin.Triple[DeserializedPropertyDescriptor]

'toCordaCompatible' @ [155:62] ==> public fun InitialMarginTriple.toCordaCompatible(): InitialMarginTriple defined in net.corda.vega.flows[SimpleFunctionDescriptorImpl]

'toMap' @ [156:11] ==> public fun <K, V> Iterable<Pair<ResolvedSwapTrade, InitialMarginTriple>>.toMap(): Map<ResolvedSwapTrade, InitialMarginTriple> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ResolvedSwapTrade
    <V> -> InitialMarginTriple

'this' @ [164:12] ==> <this> defined in net.corda.vega.analytics.omit[ReceiverParameterDescriptorImpl]

'filter' @ [164:17] ==> public inline fun <T> Iterable<E>.filter(predicate: (E) -> Boolean): List<E> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> E

'it' @ [164:26] ==> value-parameter it: E defined in net.corda.vega.analytics.omit.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [164:53] ==> value-parameter it: E defined in net.corda.vega.analytics.omit.<anonymous>[ValueParameterDescriptorImpl]

'ignoree' @ [164:59] ==> value-parameter ignoree: ResolvedSwapTrade defined in net.corda.vega.analytics.omit[ValueParameterDescriptorImpl]

