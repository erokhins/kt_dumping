'NotaryFlow.Service' @ [12:91] ==> public constructor Service(otherSide: Party, service: TrustedAuthorityNotaryService) defined in net.corda.core.flows.NotaryFlow.Service[DeserializedClassConstructorDescriptor]

'otherSide' @ [12:110] ==> value-parameter otherSide: Party defined in net.corda.node.services.transactions.NonValidatingNotaryFlow.<init>[ValueParameterDescriptorImpl]

'service' @ [12:121] ==> value-parameter service: TrustedAuthorityNotaryService defined in net.corda.node.services.transactions.NonValidatingNotaryFlow.<init>[ValueParameterDescriptorImpl]

'Suspendable' @ [21:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'receive' @ [23:21] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<Any> defined in net.corda.node.services.transactions.NonValidatingNotaryFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Any

'otherSide' @ [23:34] ==> public final val otherSide: Party defined in net.corda.node.services.transactions.NonValidatingNotaryFlow[DeserializedPropertyDescriptor]

'unwrap' @ [23:45] ==> public inline fun <T, R> UntrustworthyData<Any>.unwrap(validator: (Any) -> TransactionParts): TransactionParts defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any
    <R> -> TransactionParts

'when (it) {
                is FilteredTransaction -> {
                    it.verify()
                    TransactionParts(it.rootHash, it.filteredLeaves.inputs, it.filteredLeaves.timeWindow)
                }
                is NotaryChangeWireTransaction -> TransactionParts(it.id, it.inputs, null)
                else -> {
                    throw IllegalArgumentException("Received unexpected transaction type: ${it::class.java.simpleName}," +
                            "expected either ${FilteredTransaction::class.java.simpleName} or ${NotaryChangeWireTransaction::class.java.simpleName}")
                }
            }' @ [24:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TransactionParts, entry1: TransactionParts, entry2: TransactionParts): TransactionParts[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TransactionParts

'it' @ [24:19] ==> value-parameter it: Any defined in net.corda.node.services.transactions.NonValidatingNotaryFlow.receiveAndVerifyTx.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [26:21] ==> value-parameter it: Any defined in net.corda.node.services.transactions.NonValidatingNotaryFlow.receiveAndVerifyTx.<anonymous>[ValueParameterDescriptorImpl]

'verify' @ [26:24] ==> public final fun verify(): Boolean defined in net.corda.core.transactions.FilteredTransaction[DeserializedSimpleFunctionDescriptor]

'TransactionParts' @ [27:21] ==> public constructor TransactionParts(id: SecureHash, inputs: List<StateRef>, timestamp: TimeWindow?) defined in net.corda.core.flows.TransactionParts[DeserializedClassConstructorDescriptor]

'it' @ [27:38] ==> value-parameter it: Any defined in net.corda.node.services.transactions.NonValidatingNotaryFlow.receiveAndVerifyTx.<anonymous>[ValueParameterDescriptorImpl]

'rootHash' @ [27:41] ==> public final val rootHash: SecureHash defined in net.corda.core.transactions.FilteredTransaction[DeserializedPropertyDescriptor]

'it' @ [27:51] ==> value-parameter it: Any defined in net.corda.node.services.transactions.NonValidatingNotaryFlow.receiveAndVerifyTx.<anonymous>[ValueParameterDescriptorImpl]

'filteredLeaves' @ [27:54] ==> public final val filteredLeaves: FilteredLeaves defined in net.corda.core.transactions.FilteredTransaction[DeserializedPropertyDescriptor]

'inputs' @ [27:69] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.FilteredLeaves[DeserializedPropertyDescriptor]

'it' @ [27:77] ==> value-parameter it: Any defined in net.corda.node.services.transactions.NonValidatingNotaryFlow.receiveAndVerifyTx.<anonymous>[ValueParameterDescriptorImpl]

'filteredLeaves' @ [27:80] ==> public final val filteredLeaves: FilteredLeaves defined in net.corda.core.transactions.FilteredTransaction[DeserializedPropertyDescriptor]

'timeWindow' @ [27:95] ==> public open val timeWindow: TimeWindow? defined in net.corda.core.transactions.FilteredLeaves[DeserializedPropertyDescriptor]

'TransactionParts' @ [29:51] ==> public constructor TransactionParts(id: SecureHash, inputs: List<StateRef>, timestamp: TimeWindow?) defined in net.corda.core.flows.TransactionParts[DeserializedClassConstructorDescriptor]

'it' @ [29:68] ==> value-parameter it: Any defined in net.corda.node.services.transactions.NonValidatingNotaryFlow.receiveAndVerifyTx.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [29:71] ==> public open val id: SecureHash defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedPropertyDescriptor]

'it' @ [29:75] ==> value-parameter it: Any defined in net.corda.node.services.transactions.NonValidatingNotaryFlow.receiveAndVerifyTx.<anonymous>[ValueParameterDescriptorImpl]

'inputs' @ [29:78] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [31:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [31:52] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [31:93] ==> value-parameter it: Any defined in net.corda.node.services.transactions.NonValidatingNotaryFlow.receiveAndVerifyTx.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [31:103] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'simpleName' @ [31:108] ==> public final val <T : (Any..Any?)> Class<out Any>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'FilteredTransaction' @ [32:48] ==> public companion object defined in net.corda.core.transactions.FilteredTransaction[FakeCallableDescriptorForObject]

'java' @ [32:75] ==> public val <T> KClass<FilteredTransaction>.java: Class<FilteredTransaction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FilteredTransaction

'simpleName' @ [32:80] ==> public final val <T : (Any..Any?)> Class<FilteredTransaction>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FilteredTransaction

'NotaryChangeWireTransaction' @ [32:97] ==> public constructor NotaryChangeWireTransaction(inputs: List<StateRef>, notary: Party, newNotary: Party) defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedClassConstructorDescriptor]

'java' @ [32:132] ==> public val <T> KClass<NotaryChangeWireTransaction>.java: Class<NotaryChangeWireTransaction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction

'simpleName' @ [32:137] ==> public final val <T : (Any..Any?)> Class<NotaryChangeWireTransaction>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NotaryChangeWireTransaction

'parts' @ [36:16] ==> val parts: TransactionParts defined in net.corda.node.services.transactions.NonValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

