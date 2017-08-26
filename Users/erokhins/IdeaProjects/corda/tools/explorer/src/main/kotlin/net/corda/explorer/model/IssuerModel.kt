'Regex' @ [13:27] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'observableList' @ [16:38] ==> public inline fun <reified M : Any, T> observableList(noinline observableListProperty: (NetworkIdentityModel) -> ObservableList<NodeInfo>): TrackedDelegate.ObservableListDelegate<NetworkIdentityModel, NodeInfo> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> NetworkIdentityModel
    <T> -> NodeInfo

'NetworkIdentityModel' @ [16:53] ==> public constructor NetworkIdentityModel() defined in net.corda.client.jfx.model.NetworkIdentityModel[DeserializedClassConstructorDescriptor]

'observableValue' @ [17:31] ==> public inline fun <reified M : Any, T> observableValue(noinline observableValueProperty: (NetworkIdentityModel) -> ObservableValue<NodeInfo?>): TrackedDelegate.ObservableValueDelegate<NetworkIdentityModel, NodeInfo?> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> NetworkIdentityModel
    <T> -> NodeInfo?

'NetworkIdentityModel' @ [17:47] ==> public constructor NetworkIdentityModel() defined in net.corda.client.jfx.model.NetworkIdentityModel[DeserializedClassConstructorDescriptor]

'observableList' @ [18:40] ==> public inline fun <reified M : Any, T> observableList(noinline observableListProperty: (ReportingCurrencyModel) -> ObservableList<Currency>): TrackedDelegate.ObservableListDelegate<ReportingCurrencyModel, Currency> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> ReportingCurrencyModel
    <T> -> Currency

'ReportingCurrencyModel' @ [18:55] ==> public constructor ReportingCurrencyModel() defined in net.corda.explorer.model.ReportingCurrencyModel[ClassConstructorDescriptorImpl]

'networkIdentities' @ [20:45] ==> private final val networkIdentities: ObservableList<NodeInfo> defined in net.corda.explorer.model.IssuerModel[PropertyDescriptorImpl]

'filtered' @ [20:63] ==> public final fun filtered(p0: (((NodeInfo..NodeInfo?)) -> Boolean..(((NodeInfo..NodeInfo?)) -> Boolean)?)): (FilteredList<(NodeInfo..NodeInfo?)>..FilteredList<(NodeInfo..NodeInfo?)>?) defined in javafx.collections.ObservableList[MyFunctionDescriptor]

'it' @ [20:74] ==> value-parameter it: (NodeInfo..NodeInfo?) defined in net.corda.explorer.model.IssuerModel.issuers.<anonymous>[ValueParameterDescriptorImpl]

'advertisedServices' @ [20:77] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'any' @ [20:96] ==> public inline fun <T> Iterable<ServiceEntry>.any(predicate: (ServiceEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [20:102] ==> value-parameter it: ServiceEntry defined in net.corda.explorer.model.IssuerModel.issuers.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [20:105] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'type' @ [20:110] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'id' @ [20:115] ==> public final val id: String defined in net.corda.core.node.services.ServiceType[DeserializedPropertyDescriptor]

'matches' @ [20:118] ==> @InlineOnly public infix inline fun CharSequence.matches(regex: Regex): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ISSUER_SERVICE_TYPE' @ [20:126] ==> public val ISSUER_SERVICE_TYPE: Regex defined in net.corda.explorer.model in file IssuerModel.kt[PropertyDescriptorImpl]

'ChosenList' @ [22:25] ==> public constructor ChosenList<E>(chosenListObservable: ObservableValue<out ObservableList<out Currency>>) defined in net.corda.client.jfx.utils.ChosenList[DeserializedClassConstructorDescriptor]
Inferred types:
    <E> -> Currency

'myIdentity' @ [22:36] ==> private final val myIdentity: ObservableValue<NodeInfo?> defined in net.corda.explorer.model.IssuerModel[PropertyDescriptorImpl]

'map' @ [22:47] ==> public fun <A, B> ObservableValue<out NodeInfo?>.map(function: (NodeInfo?) -> ObservableList<Currency>): ObservableValue<ObservableList<Currency>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> NodeInfo?
    <B> -> ObservableList<Currency>

'it' @ [23:9] ==> value-parameter it: NodeInfo? defined in net.corda.explorer.model.IssuerModel.currencyTypes.<anonymous>[ValueParameterDescriptorImpl]

'issuerCurrency' @ [23:13] ==> private final fun NodeInfo.issuerCurrency(): Currency? defined in net.corda.explorer.model.IssuerModel[SimpleFunctionDescriptorImpl]

'let' @ [23:31] ==> @InlineOnly public inline fun <T, R> Currency.let(block: (Currency) -> ObservableList<Currency>): ObservableList<Currency> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Currency
    <R> -> ObservableList<Currency>

'listOf' @ [23:38] ==> public fun <T> listOf(element: Currency): List<Currency> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Currency

'it' @ [23:45] ==> value-parameter it: Currency defined in net.corda.explorer.model.IssuerModel.currencyTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'observable' @ [23:50] ==> public fun <T> List<Currency>.observable(): ObservableList<Currency> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Currency

'supportedCurrencies' @ [23:68] ==> private final val supportedCurrencies: ObservableList<Currency> defined in net.corda.explorer.model.IssuerModel[PropertyDescriptorImpl]

'ChosenList' @ [26:28] ==> public constructor ChosenList<E>(chosenListObservable: ObservableValue<out ObservableList<out CashTransaction>>) defined in net.corda.client.jfx.utils.ChosenList[DeserializedClassConstructorDescriptor]
Inferred types:
    <E> -> CashTransaction

'myIdentity' @ [26:39] ==> private final val myIdentity: ObservableValue<NodeInfo?> defined in net.corda.explorer.model.IssuerModel[PropertyDescriptorImpl]

'map' @ [26:50] ==> public fun <A, B> ObservableValue<out NodeInfo?>.map(function: (NodeInfo?) -> ObservableList<CashTransaction>): ObservableValue<ObservableList<CashTransaction>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> NodeInfo?
    <B> -> ObservableList<CashTransaction>

'if (it?.isIssuerNode() ?: false)
            CashTransaction.values().asList().observable()
        else
            listOf(CashTransaction.Pay).observable()' @ [27:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ObservableList<CashTransaction>, elseBranch: ObservableList<CashTransaction>): ObservableList<CashTransaction>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ObservableList<CashTransaction>

'it' @ [27:13] ==> value-parameter it: NodeInfo? defined in net.corda.explorer.model.IssuerModel.transactionTypes.<anonymous>[ValueParameterDescriptorImpl]

'isIssuerNode' @ [27:17] ==> private final fun NodeInfo.isIssuerNode(): Boolean defined in net.corda.explorer.model.IssuerModel[SimpleFunctionDescriptorImpl]

'values' @ [28:29] ==> public final fun values(): Array<CashTransaction> defined in net.corda.explorer.model.CashTransaction[SimpleFunctionDescriptorImpl]

'asList' @ [28:38] ==> public fun <T> Array<out CashTransaction>.asList(): List<CashTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CashTransaction

'observable' @ [28:47] ==> public fun <T> List<CashTransaction>.observable(): ObservableList<CashTransaction> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CashTransaction

'listOf' @ [30:13] ==> public fun <T> listOf(element: CashTransaction): List<CashTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CashTransaction

'Pay' @ [30:36] ==> enum entry Pay defined in net.corda.explorer.model.CashTransaction[FakeCallableDescriptorForObject]

'observable' @ [30:41] ==> public fun <T> List<CashTransaction>.observable(): ObservableList<CashTransaction> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CashTransaction

'advertisedServices' @ [33:43] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'any' @ [33:62] ==> public inline fun <T> Iterable<ServiceEntry>.any(predicate: (ServiceEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [33:68] ==> value-parameter it: ServiceEntry defined in net.corda.explorer.model.IssuerModel.isIssuerNode.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [33:71] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'type' @ [33:76] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'id' @ [33:81] ==> public final val id: String defined in net.corda.core.node.services.ServiceType[DeserializedPropertyDescriptor]

'matches' @ [33:84] ==> @InlineOnly public infix inline fun CharSequence.matches(regex: Regex): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ISSUER_SERVICE_TYPE' @ [33:92] ==> public val ISSUER_SERVICE_TYPE: Regex defined in net.corda.explorer.model in file IssuerModel.kt[PropertyDescriptorImpl]

'if (isIssuerNode()) {
        val issuer = advertisedServices.first { it.info.type.id.matches(ISSUER_SERVICE_TYPE) }
        Currency.getInstance(issuer.info.type.id.substringAfterLast("."))
    } else
        null' @ [35:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Currency?, elseBranch: Currency?): Currency?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Currency?

'isIssuerNode' @ [35:49] ==> private final fun NodeInfo.isIssuerNode(): Boolean defined in net.corda.explorer.model.IssuerModel[SimpleFunctionDescriptorImpl]

'advertisedServices' @ [36:22] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'first' @ [36:41] ==> public inline fun <T> Iterable<ServiceEntry>.first(predicate: (ServiceEntry) -> Boolean): ServiceEntry defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [36:49] ==> value-parameter it: ServiceEntry defined in net.corda.explorer.model.IssuerModel.issuerCurrency.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [36:52] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'type' @ [36:57] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'id' @ [36:62] ==> public final val id: String defined in net.corda.core.node.services.ServiceType[DeserializedPropertyDescriptor]

'matches' @ [36:65] ==> @InlineOnly public infix inline fun CharSequence.matches(regex: Regex): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ISSUER_SERVICE_TYPE' @ [36:73] ==> public val ISSUER_SERVICE_TYPE: Regex defined in net.corda.explorer.model in file IssuerModel.kt[PropertyDescriptorImpl]

'getInstance' @ [37:18] ==> public open fun getInstance(p0: (String..String?)): (Currency..Currency?) defined in java.util.Currency[JavaMethodDescriptor]

'issuer' @ [37:30] ==> val issuer: ServiceEntry defined in net.corda.explorer.model.IssuerModel.issuerCurrency[LocalVariableDescriptor]

'info' @ [37:37] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'type' @ [37:42] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'id' @ [37:47] ==> public final val id: String defined in net.corda.core.node.services.ServiceType[DeserializedPropertyDescriptor]

'substringAfterLast' @ [37:50] ==> public fun String.substringAfterLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

