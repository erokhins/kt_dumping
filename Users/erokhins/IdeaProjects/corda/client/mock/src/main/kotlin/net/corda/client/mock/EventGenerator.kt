'Generator' @ [19:36] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pickOne' @ [19:46] ==> public fun <A> Generator.Companion.pickOne(list: List<Party>): Generator<Party> defined in net.corda.client.mock[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Party

'parties' @ [19:54] ==> public final val parties: List<Party> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'Generator' @ [20:39] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'intRange' @ [20:49] ==> public fun Generator.Companion.intRange(from: Int, to: Int): Generator<Int> defined in net.corda.client.mock in file Generator.kt[SimpleFunctionDescriptorImpl]

'map' @ [20:64] ==> public final fun <B> map(function: (Int) -> OpaqueBytes): Generator<OpaqueBytes> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> OpaqueBytes

'OpaqueBytes' @ [20:80] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[DeserializedClassConstructorDescriptor]

'ByteArray' @ [20:92] ==> public constructor ByteArray(size: Int, init: (Int) -> Byte) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'number' @ [20:107] ==> value-parameter number: Int defined in net.corda.client.mock.EventGenerator.issueRefGenerator.<anonymous>[ValueParameterDescriptorImpl]

'toByte' @ [20:114] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Generator' @ [21:37] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'longRange' @ [21:47] ==> public fun Generator.Companion.longRange(from: Long, to: Long): Generator<Long> defined in net.corda.client.mock in file Generator.kt[SimpleFunctionDescriptorImpl]

'Generator' @ [22:39] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pickOne' @ [22:49] ==> public fun <A> Generator.Companion.pickOne(list: List<Currency>): Generator<Currency> defined in net.corda.client.mock[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Currency

'currencies' @ [22:57] ==> public final val currencies: List<Currency> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'mutableMapOf' @ [23:61] ==> public fun <K, V> mutableMapOf(vararg pairs: Pair<Currency, Long>): MutableMap<Currency, Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Currency
    <V> -> Long

'USD' @ [23:74] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'GBP' @ [23:85] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'currencyMap' @ [26:9] ==> protected final val currencyMap: MutableMap<Currency, Long> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'computeIfPresent' @ [26:21] ==> public final fun computeIfPresent(p0: Currency, p1: (Currency, Long) -> Long?): Long? defined in kotlin.collections.MutableMap[MyFunctionDescriptor]

'ccy' @ [26:38] ==> value-parameter ccy: Currency defined in net.corda.client.mock.EventGenerator.addToMap[ValueParameterDescriptorImpl]

'max' @ [26:62] ==> public open fun max(p0: Long, p1: Long): Long defined in java.lang.Math[JavaMethodDescriptor]

'value' @ [26:70] ==> value-parameter value: Long defined in net.corda.client.mock.EventGenerator.addToMap.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [26:78] ==> value-parameter amount: Long defined in net.corda.client.mock.EventGenerator.addToMap[ValueParameterDescriptorImpl]

'amountGenerator' @ [29:40] ==> protected final val amountGenerator: Generator<Long> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'combine' @ [29:56] ==> public final fun <B, C, D, R> combine(other1: Generator<Party>, other2: Generator<OpaqueBytes>, other3: Generator<Currency>, function: (Long, Party, OpaqueBytes, Currency) -> CashIssueAndPaymentFlow.IssueAndPaymentRequest): Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Party
    <C> -> OpaqueBytes
    <D> -> Currency
    <R> -> IssueAndPaymentRequest

'partyGenerator' @ [29:64] ==> protected final val partyGenerator: Generator<Party> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'issueRefGenerator' @ [29:80] ==> protected final val issueRefGenerator: Generator<OpaqueBytes> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'currencyGenerator' @ [29:99] ==> protected final val currencyGenerator: Generator<Currency> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'addToMap' @ [30:9] ==> protected final fun addToMap(ccy: Currency, amount: Long): Unit defined in net.corda.client.mock.EventGenerator[SimpleFunctionDescriptorImpl]

'ccy' @ [30:18] ==> value-parameter ccy: Currency defined in net.corda.client.mock.EventGenerator.issueCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [30:23] ==> value-parameter amount: Long defined in net.corda.client.mock.EventGenerator.issueCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'IssueAndPaymentRequest' @ [31:9] ==> public constructor IssueAndPaymentRequest(amount: Amount<Currency>, issueRef: OpaqueBytes, recipient: Party, notary: Party, anonymous: Boolean) defined in net.corda.finance.flows.CashIssueAndPaymentFlow.IssueAndPaymentRequest[DeserializedClassConstructorDescriptor]

'Amount' @ [31:32] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'amount' @ [31:39] ==> value-parameter amount: Long defined in net.corda.client.mock.EventGenerator.issueCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'ccy' @ [31:47] ==> value-parameter ccy: Currency defined in net.corda.client.mock.EventGenerator.issueCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'issueRef' @ [31:53] ==> value-parameter issueRef: OpaqueBytes defined in net.corda.client.mock.EventGenerator.issueCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [31:63] ==> value-parameter to: Party defined in net.corda.client.mock.EventGenerator.issueCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'notary' @ [31:67] ==> public final val notary: Party defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'amountGenerator' @ [34:39] ==> protected final val amountGenerator: Generator<Long> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'combine' @ [34:55] ==> public final fun <B, C, R> combine(other1: Generator<OpaqueBytes>, other2: Generator<Currency>, function: (Long, OpaqueBytes, Currency) -> CashExitFlow.ExitRequest): Generator<CashExitFlow.ExitRequest> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> OpaqueBytes
    <C> -> Currency
    <R> -> ExitRequest

'issueRefGenerator' @ [34:63] ==> protected final val issueRefGenerator: Generator<OpaqueBytes> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'currencyGenerator' @ [34:82] ==> protected final val currencyGenerator: Generator<Currency> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'addToMap' @ [35:9] ==> protected final fun addToMap(ccy: Currency, amount: Long): Unit defined in net.corda.client.mock.EventGenerator[SimpleFunctionDescriptorImpl]

'ccy' @ [35:18] ==> value-parameter ccy: Currency defined in net.corda.client.mock.EventGenerator.exitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'-' @ [35:23] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'amount' @ [35:24] ==> value-parameter amount: Long defined in net.corda.client.mock.EventGenerator.exitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'ExitRequest' @ [36:9] ==> public constructor ExitRequest(amount: Amount<Currency>, issueRef: OpaqueBytes) defined in net.corda.finance.flows.CashExitFlow.ExitRequest[DeserializedClassConstructorDescriptor]

'Amount' @ [36:21] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'amount' @ [36:28] ==> value-parameter amount: Long defined in net.corda.client.mock.EventGenerator.exitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'ccy' @ [36:36] ==> value-parameter ccy: Currency defined in net.corda.client.mock.EventGenerator.exitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'issueRef' @ [36:42] ==> value-parameter issueRef: OpaqueBytes defined in net.corda.client.mock.EventGenerator.exitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'amountGenerator' @ [39:34] ==> protected final val amountGenerator: Generator<Long> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'combine' @ [39:50] ==> public final fun <B, C, R> combine(other1: Generator<Party>, other2: Generator<Currency>, function: (Long, Party, Currency) -> CashPaymentFlow.PaymentRequest): Generator<CashPaymentFlow.PaymentRequest> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Party
    <C> -> Currency
    <R> -> PaymentRequest

'partyGenerator' @ [39:58] ==> protected final val partyGenerator: Generator<Party> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'currencyGenerator' @ [39:74] ==> protected final val currencyGenerator: Generator<Currency> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'PaymentRequest' @ [40:9] ==> public constructor PaymentRequest(amount: Amount<Currency>, recipient: Party, anonymous: Boolean, issuerConstraint: Set<Party> = ...) defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[DeserializedClassConstructorDescriptor]

'Amount' @ [40:24] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'amountIssued' @ [40:31] ==> value-parameter amountIssued: Long defined in net.corda.client.mock.EventGenerator.moveCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'currency' @ [40:45] ==> value-parameter currency: Currency defined in net.corda.client.mock.EventGenerator.moveCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'recipient' @ [40:56] ==> value-parameter recipient: Party defined in net.corda.client.mock.EventGenerator.moveCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'Generator' @ [43:32] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'frequency' @ [43:42] ==> public final fun <A> frequency(generators: List<Pair<Double, Generator<AbstractCashFlow.AbstractRequest>>>): Generator<AbstractCashFlow.AbstractRequest> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> AbstractRequest

'listOf' @ [43:52] ==> public fun <T> listOf(vararg elements: Pair<Double, Generator<AbstractCashFlow.AbstractRequest>>): List<Pair<Double, Generator<AbstractCashFlow.AbstractRequest>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Double, Generator<AbstractRequest>>

'to' @ [44:13] ==> public infix fun <A, B> Double.to(that: Generator<CashExitFlow.ExitRequest>): Pair<Double, Generator<CashExitFlow.ExitRequest>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Double
    <B> -> Generator<ExitRequest>

'exitCashGenerator' @ [44:20] ==> protected final val exitCashGenerator: Generator<CashExitFlow.ExitRequest> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'to' @ [45:13] ==> public infix fun <A, B> Double.to(that: Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest>): Pair<Double, Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Double
    <B> -> Generator<IssueAndPaymentRequest>

'issueCashGenerator' @ [45:20] ==> protected final val issueCashGenerator: Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest> defined in net.corda.client.mock.EventGenerator[PropertyDescriptorImpl]

'EventGenerator' @ [53:98] ==> public constructor EventGenerator(parties: List<Party>, currencies: List<Currency>, notary: Party) defined in net.corda.client.mock.EventGenerator[ClassConstructorDescriptorImpl]

'parties' @ [53:113] ==> value-parameter parties: List<Party> defined in net.corda.client.mock.ErrorFlowsEventGenerator.<init>[ValueParameterDescriptorImpl]

'currencies' @ [53:122] ==> value-parameter currencies: List<Currency> defined in net.corda.client.mock.ErrorFlowsEventGenerator.<init>[ValueParameterDescriptorImpl]

'notary' @ [53:134] ==> value-parameter notary: Party defined in net.corda.client.mock.ErrorFlowsEventGenerator.<init>[ValueParameterDescriptorImpl]

'Generator' @ [59:34] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pickOne' @ [59:44] ==> public fun <A> Generator.Companion.pickOne(list: List<ErrorFlowsEventGenerator.IssuerEvents>): Generator<ErrorFlowsEventGenerator.IssuerEvents> defined in net.corda.client.mock[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> IssuerEvents

'values' @ [59:65] ==> public final fun values(): Array<ErrorFlowsEventGenerator.IssuerEvents> defined in net.corda.client.mock.ErrorFlowsEventGenerator.IssuerEvents[SimpleFunctionDescriptorImpl]

'toList' @ [59:74] ==> public fun <T> Array<out ErrorFlowsEventGenerator.IssuerEvents>.toList(): List<ErrorFlowsEventGenerator.IssuerEvents> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IssuerEvents

'amountGenerator' @ [61:42] ==> protected final val amountGenerator: Generator<Long> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'combine' @ [61:58] ==> public final fun <B, C, D, R> combine(other1: Generator<OpaqueBytes>, other2: Generator<Currency>, other3: Generator<ErrorFlowsEventGenerator.IssuerEvents>, function: (Long, OpaqueBytes, Currency, ErrorFlowsEventGenerator.IssuerEvents) -> CashExitFlow.ExitRequest): Generator<CashExitFlow.ExitRequest> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> OpaqueBytes
    <C> -> Currency
    <D> -> IssuerEvents
    <R> -> ExitRequest

'issueRefGenerator' @ [61:66] ==> protected final val issueRefGenerator: Generator<OpaqueBytes> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'currencyGenerator' @ [61:85] ==> protected final val currencyGenerator: Generator<Currency> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'errorGenerator' @ [61:104] ==> private final val errorGenerator: Generator<ErrorFlowsEventGenerator.IssuerEvents> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'when (errorType) {
            IssuerEvents.NORMAL_EXIT -> {
                println("Normal exit")
                if (currencyMap[ccy]!! <=  amount) addToMap(ccy, -amount)
                ExitRequest(Amount(amount, ccy), issueRef) // It may fail at the beginning, but we don't care.
            }
            IssuerEvents.EXIT_ERROR -> {
                println("Exit error")
                ExitRequest(Amount(currencyMap[ccy]!! * 2, ccy), issueRef)
            }
        }' @ [62:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CashExitFlow.ExitRequest, entry1: CashExitFlow.ExitRequest): CashExitFlow.ExitRequest[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ExitRequest

'errorType' @ [62:15] ==> value-parameter errorType: ErrorFlowsEventGenerator.IssuerEvents defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorExitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'NORMAL_EXIT' @ [63:26] ==> enum entry NORMAL_EXIT defined in net.corda.client.mock.ErrorFlowsEventGenerator.IssuerEvents[FakeCallableDescriptorForObject]

'println' @ [64:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'currencyMap' @ [65:21] ==> protected final val currencyMap: MutableMap<Currency, Long> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'ccy' @ [65:33] ==> value-parameter ccy: Currency defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorExitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [65:44] ==> value-parameter amount: Long defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorExitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'addToMap' @ [65:52] ==> protected final fun addToMap(ccy: Currency, amount: Long): Unit defined in net.corda.client.mock.ErrorFlowsEventGenerator[SimpleFunctionDescriptorImpl]

'ccy' @ [65:61] ==> value-parameter ccy: Currency defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorExitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'-' @ [65:66] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'amount' @ [65:67] ==> value-parameter amount: Long defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorExitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'ExitRequest' @ [66:17] ==> public constructor ExitRequest(amount: Amount<Currency>, issueRef: OpaqueBytes) defined in net.corda.finance.flows.CashExitFlow.ExitRequest[DeserializedClassConstructorDescriptor]

'Amount' @ [66:29] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'amount' @ [66:36] ==> value-parameter amount: Long defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorExitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'ccy' @ [66:44] ==> value-parameter ccy: Currency defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorExitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'issueRef' @ [66:50] ==> value-parameter issueRef: OpaqueBytes defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorExitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'EXIT_ERROR' @ [68:26] ==> enum entry EXIT_ERROR defined in net.corda.client.mock.ErrorFlowsEventGenerator.IssuerEvents[FakeCallableDescriptorForObject]

'println' @ [69:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'ExitRequest' @ [70:17] ==> public constructor ExitRequest(amount: Amount<Currency>, issueRef: OpaqueBytes) defined in net.corda.finance.flows.CashExitFlow.ExitRequest[DeserializedClassConstructorDescriptor]

'Amount' @ [70:29] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'currencyMap' @ [70:36] ==> protected final val currencyMap: MutableMap<Currency, Long> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'ccy' @ [70:48] ==> value-parameter ccy: Currency defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorExitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'ccy' @ [70:60] ==> value-parameter ccy: Currency defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorExitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'issueRef' @ [70:66] ==> value-parameter issueRef: OpaqueBytes defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorExitCashGenerator.<anonymous>[ValueParameterDescriptorImpl]

'amountGenerator' @ [75:39] ==> protected final val amountGenerator: Generator<Long> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'combine' @ [75:55] ==> public final fun <B, C, R> combine(other1: Generator<Party>, other2: Generator<Currency>, function: (Long, Party, Currency) -> CashPaymentFlow.PaymentRequest): Generator<CashPaymentFlow.PaymentRequest> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Party
    <C> -> Currency
    <R> -> PaymentRequest

'partyGenerator' @ [75:63] ==> protected final val partyGenerator: Generator<Party> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'currencyGenerator' @ [75:79] ==> protected final val currencyGenerator: Generator<Currency> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'PaymentRequest' @ [76:9] ==> public constructor PaymentRequest(amount: Amount<Currency>, recipient: Party, anonymous: Boolean, issuerConstraint: Set<Party> = ...) defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[DeserializedClassConstructorDescriptor]

'Amount' @ [76:24] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'amountIssued' @ [76:31] ==> value-parameter amountIssued: Long defined in net.corda.client.mock.ErrorFlowsEventGenerator.normalMoveGenerator.<anonymous>[ValueParameterDescriptorImpl]

'currency' @ [76:45] ==> value-parameter currency: Currency defined in net.corda.client.mock.ErrorFlowsEventGenerator.normalMoveGenerator.<anonymous>[ValueParameterDescriptorImpl]

'recipient' @ [76:56] ==> value-parameter recipient: Party defined in net.corda.client.mock.ErrorFlowsEventGenerator.normalMoveGenerator.<anonymous>[ValueParameterDescriptorImpl]

'partyGenerator' @ [79:38] ==> protected final val partyGenerator: Generator<Party> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'combine' @ [79:53] ==> public final fun <B, R> combine(other1: Generator<Currency>, function: (Party, Currency) -> CashPaymentFlow.PaymentRequest): Generator<CashPaymentFlow.PaymentRequest> defined in net.corda.client.mock.Generator[SimpleFunctionDescriptorImpl]
Inferred types:
    <B> -> Currency
    <R> -> PaymentRequest

'currencyGenerator' @ [79:61] ==> protected final val currencyGenerator: Generator<Currency> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'PaymentRequest' @ [80:9] ==> public constructor PaymentRequest(amount: Amount<Currency>, recipient: Party, anonymous: Boolean, issuerConstraint: Set<Party> = ...) defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[DeserializedClassConstructorDescriptor]

'Amount' @ [80:24] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'currencyMap' @ [80:31] ==> protected final val currencyMap: MutableMap<Currency, Long> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'currency' @ [80:43] ==> value-parameter currency: Currency defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorMoveGenerator.<anonymous>[ValueParameterDescriptorImpl]

'currency' @ [80:60] ==> value-parameter currency: Currency defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorMoveGenerator.<anonymous>[ValueParameterDescriptorImpl]

'recipient' @ [80:71] ==> value-parameter recipient: Party defined in net.corda.client.mock.ErrorFlowsEventGenerator.errorMoveGenerator.<anonymous>[ValueParameterDescriptorImpl]

'Generator' @ [83:38] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'frequency' @ [83:48] ==> public final fun <A> frequency(generators: List<Pair<Double, Generator<CashPaymentFlow.PaymentRequest>>>): Generator<CashPaymentFlow.PaymentRequest> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> PaymentRequest

'listOf' @ [83:58] ==> public fun <T> listOf(vararg elements: Pair<Double, Generator<CashPaymentFlow.PaymentRequest>>): List<Pair<Double, Generator<CashPaymentFlow.PaymentRequest>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Double, Generator<PaymentRequest>>

'to' @ [84:13] ==> public infix fun <A, B> Double.to(that: Generator<CashPaymentFlow.PaymentRequest>): Pair<Double, Generator<CashPaymentFlow.PaymentRequest>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Double
    <B> -> Generator<PaymentRequest>

'errorMoveGenerator' @ [84:20] ==> private final val errorMoveGenerator: Generator<CashPaymentFlow.PaymentRequest> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'to' @ [85:13] ==> public infix fun <A, B> Double.to(that: Generator<CashPaymentFlow.PaymentRequest>): Pair<Double, Generator<CashPaymentFlow.PaymentRequest>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Double
    <B> -> Generator<PaymentRequest>

'normalMoveGenerator' @ [85:20] ==> private final val normalMoveGenerator: Generator<CashPaymentFlow.PaymentRequest> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'Generator' @ [88:36] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'frequency' @ [88:46] ==> public final fun <A> frequency(generators: List<Pair<Double, Generator<AbstractCashFlow.AbstractRequest>>>): Generator<AbstractCashFlow.AbstractRequest> defined in net.corda.client.mock.Generator.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> AbstractRequest

'listOf' @ [88:56] ==> public fun <T> listOf(vararg elements: Pair<Double, Generator<AbstractCashFlow.AbstractRequest>>): List<Pair<Double, Generator<AbstractCashFlow.AbstractRequest>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Double, Generator<AbstractRequest>>

'to' @ [89:13] ==> public infix fun <A, B> Double.to(that: Generator<CashExitFlow.ExitRequest>): Pair<Double, Generator<CashExitFlow.ExitRequest>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Double
    <B> -> Generator<ExitRequest>

'errorExitCashGenerator' @ [89:20] ==> private final val errorExitCashGenerator: Generator<CashExitFlow.ExitRequest> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

'to' @ [90:13] ==> public infix fun <A, B> Double.to(that: Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest>): Pair<Double, Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Double
    <B> -> Generator<IssueAndPaymentRequest>

'issueCashGenerator' @ [90:20] ==> protected final val issueCashGenerator: Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest> defined in net.corda.client.mock.ErrorFlowsEventGenerator[PropertyDescriptorImpl]

