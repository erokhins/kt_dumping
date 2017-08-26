'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'JvmOverloads' @ [34:1] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'emptyList' @ [36:74] ==> public fun <T> emptyList(): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'DUMMY_NOTARY' @ [37:54] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'myInfo' @ [38:28] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [38:35] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [38:49] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'AnonymousParty' @ [39:14] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'myKey' @ [39:29] ==> val myKey: PublicKey defined in net.corda.testing.contracts.fillWithSomeTestDeals[LocalVariableDescriptor]

'dealIds' @ [41:49] ==> value-parameter dealIds: List<String> defined in net.corda.testing.contracts.fillWithSomeTestDeals[ValueParameterDescriptorImpl]

'map' @ [41:57] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> SignedTransaction): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> SignedTransaction

'TransactionBuilder' @ [43:26] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [43:54] ==> value-parameter notary: Party = ... defined in net.corda.testing.contracts.fillWithSomeTestDeals[ValueParameterDescriptorImpl]

'apply' @ [43:62] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'addOutputState' @ [44:13] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'State' @ [44:46] ==> public constructor State(contract: Contract = ..., participants: List<AbstractParty> = ..., ref: String) defined in net.corda.testing.contracts.DummyDealContract.State[ClassConstructorDescriptorImpl]

'it' @ [44:58] ==> value-parameter it: String defined in net.corda.testing.contracts.fillWithSomeTestDeals.<anonymous>[ValueParameterDescriptorImpl]

'participants' @ [44:77] ==> value-parameter participants: List<AbstractParty> = ... defined in net.corda.testing.contracts.fillWithSomeTestDeals[ValueParameterDescriptorImpl]

'plus' @ [44:90] ==> public operator fun <T> Collection<AbstractParty>.plus(element: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'me' @ [44:95] ==> val me: AnonymousParty defined in net.corda.testing.contracts.fillWithSomeTestDeals[LocalVariableDescriptor]

'addCommand' @ [45:13] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [45:24] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[SimpleFunctionDescriptorImpl]

'signInitialTransaction' @ [47:19] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'dummyIssue' @ [47:42] ==> val dummyIssue: TransactionBuilder defined in net.corda.testing.contracts.fillWithSomeTestDeals.<anonymous>[LocalVariableDescriptor]

'addSignature' @ [48:20] ==> public open fun addSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'stx' @ [48:33] ==> val stx: SignedTransaction defined in net.corda.testing.contracts.fillWithSomeTestDeals.<anonymous>[LocalVariableDescriptor]

'notary' @ [48:38] ==> value-parameter notary: Party = ... defined in net.corda.testing.contracts.fillWithSomeTestDeals[ValueParameterDescriptorImpl]

'owningKey' @ [48:45] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'recordTransactions' @ [51:5] ==> public open fun recordTransactions(txs: Iterable<SignedTransaction>): Unit defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'transactions' @ [51:24] ==> val transactions: List<SignedTransaction> defined in net.corda.testing.contracts.fillWithSomeTestDeals[LocalVariableDescriptor]

'transactions' @ [54:18] ==> val transactions: List<SignedTransaction> defined in net.corda.testing.contracts.fillWithSomeTestDeals[LocalVariableDescriptor]

'flatMap' @ [54:31] ==> public inline fun <T, R> Iterable<SignedTransaction>.flatMap(transform: (SignedTransaction) -> Iterable<StateAndRef<DealState>>): List<StateAndRef<DealState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> StateAndRef<DealState>

'stx' @ [55:9] ==> value-parameter stx: SignedTransaction defined in net.corda.testing.contracts.fillWithSomeTestDeals.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [55:13] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [55:16] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'indices' @ [55:24] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'map' @ [55:32] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> StateAndRef<DealState>): List<StateAndRef<DealState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> StateAndRef<DealState>

'stx' @ [55:43] ==> value-parameter stx: SignedTransaction defined in net.corda.testing.contracts.fillWithSomeTestDeals.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [55:47] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [55:50] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<DealState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> DealState

'i' @ [55:68] ==> value-parameter i: Int defined in net.corda.testing.contracts.fillWithSomeTestDeals.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Vault' @ [58:12] ==> public constructor Vault<out T : ContractState>(states: Iterable<StateAndRef<DealState>>) defined in net.corda.core.node.services.Vault[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> DealState

'states' @ [58:18] ==> val states: List<StateAndRef<DealState>> defined in net.corda.testing.contracts.fillWithSomeTestDeals[LocalVariableDescriptor]

'JvmOverloads' @ [61:1] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'emptyList' @ [64:81] ==> public fun <T> emptyList(): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'now' @ [68:72] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'myInfo' @ [69:28] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [69:35] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [69:49] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'AnonymousParty' @ [70:14] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'myKey' @ [70:29] ==> val myKey: PublicKey defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[LocalVariableDescriptor]

'DUMMY_NOTARY_KEY' @ [71:21] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'SignatureMetadata' @ [72:29] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'myInfo' @ [72:47] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'platformVersion' @ [72:54] ==> public final val platformVersion: Int defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'Crypto' @ [72:71] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [72:78] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'issuerKey' @ [72:98] ==> val issuerKey: KeyPair defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[LocalVariableDescriptor]

'public' @ [72:108] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'schemeNumberID' @ [72:116] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'..' @ [74:50] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'numberToCreate' @ [74:53] ==> value-parameter numberToCreate: Int defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[ValueParameterDescriptorImpl]

'map' @ [74:69] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> SignedTransaction): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> SignedTransaction

'TransactionBuilder' @ [76:26] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [76:54] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'apply' @ [76:68] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'addOutputState' @ [77:13] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'State' @ [77:48] ==> public constructor State(linearId: UniqueIdentifier = ..., contract: Contract = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearTimestamp: Instant = ..., linearBoolean: Boolean = ..., nonce: SecureHash = ...) defined in net.corda.testing.contracts.DummyLinearContract.State[ClassConstructorDescriptorImpl]

'UniqueIdentifier' @ [78:32] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[DeserializedClassConstructorDescriptor]

'externalId' @ [78:49] ==> value-parameter externalId: String? = ... defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[ValueParameterDescriptorImpl]

'participants' @ [79:36] ==> value-parameter participants: List<AbstractParty> = ... defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[ValueParameterDescriptorImpl]

'plus' @ [79:49] ==> public operator fun <T> Collection<AbstractParty>.plus(element: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'me' @ [79:54] ==> val me: AnonymousParty defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[LocalVariableDescriptor]

'linearString' @ [80:36] ==> value-parameter linearString: String = ... defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[ValueParameterDescriptorImpl]

'linearNumber' @ [81:36] ==> value-parameter linearNumber: Long = ... defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[ValueParameterDescriptorImpl]

'linearBoolean' @ [82:37] ==> value-parameter linearBoolean: Boolean = ... defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[ValueParameterDescriptorImpl]

'linearTimestamp' @ [83:39] ==> value-parameter linearTimestamp: Instant = ... defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[ValueParameterDescriptorImpl]

'addCommand' @ [84:13] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [84:24] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[SimpleFunctionDescriptorImpl]

'signInitialTransaction' @ [87:20] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'dummyIssue' @ [87:43] ==> val dummyIssue: TransactionBuilder defined in net.corda.testing.contracts.fillWithSomeTestLinearStates.<anonymous>[LocalVariableDescriptor]

'withAdditionalSignature' @ [87:55] ==> public final fun withAdditionalSignature(keyPair: KeyPair, signatureMetadata: SignatureMetadata): SignedTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'issuerKey' @ [87:79] ==> val issuerKey: KeyPair defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[LocalVariableDescriptor]

'signatureMetadata' @ [87:90] ==> val signatureMetadata: SignatureMetadata defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[LocalVariableDescriptor]

'recordTransactions' @ [90:5] ==> public open fun recordTransactions(txs: Iterable<SignedTransaction>): Unit defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'transactions' @ [90:24] ==> val transactions: List<SignedTransaction> defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[LocalVariableDescriptor]

'transactions' @ [93:18] ==> val transactions: List<SignedTransaction> defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[LocalVariableDescriptor]

'flatMap' @ [93:31] ==> public inline fun <T, R> Iterable<SignedTransaction>.flatMap(transform: (SignedTransaction) -> Iterable<StateAndRef<LinearState>>): List<StateAndRef<LinearState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> StateAndRef<LinearState>

'stx' @ [94:9] ==> value-parameter stx: SignedTransaction defined in net.corda.testing.contracts.fillWithSomeTestLinearStates.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [94:13] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [94:16] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'indices' @ [94:24] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'map' @ [94:32] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> StateAndRef<LinearState>): List<StateAndRef<LinearState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> StateAndRef<LinearState>

'stx' @ [94:43] ==> value-parameter stx: SignedTransaction defined in net.corda.testing.contracts.fillWithSomeTestLinearStates.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [94:47] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [94:50] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<LinearState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> LinearState

'i' @ [94:70] ==> value-parameter i: Int defined in net.corda.testing.contracts.fillWithSomeTestLinearStates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Vault' @ [97:12] ==> public constructor Vault<out T : ContractState>(states: Iterable<StateAndRef<LinearState>>) defined in net.corda.core.node.services.Vault[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> LinearState

'states' @ [97:18] ==> val states: List<StateAndRef<LinearState>> defined in net.corda.testing.contracts.fillWithSomeTestLinearStates[LocalVariableDescriptor]

'this' @ [112:66] ==> <this> defined in net.corda.testing.contracts.fillWithSomeTestCash[ReceiverParameterDescriptorImpl]

'DUMMY_NOTARY' @ [113:59] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'Random' @ [116:51] ==> public constructor Random() defined in java.util.Random[JavaClassConstructorDescriptor]

'OpaqueBytes' @ [117:56] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[DeserializedClassConstructorDescriptor]

'ByteArray' @ [117:68] ==> public constructor ByteArray(size: Int, init: (Int) -> Byte) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'DUMMY_CASH_ISSUER' @ [119:67] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'calculateRandomlySizedAmounts' @ [120:19] ==> public fun calculateRandomlySizedAmounts(howMuch: Amount<Currency>, min: Int, max: Int, rng: Random): LongArray defined in net.corda.testing.contracts[SimpleFunctionDescriptorImpl]

'howMuch' @ [120:49] ==> value-parameter howMuch: Amount<Currency> defined in net.corda.testing.contracts.fillWithSomeTestCash[ValueParameterDescriptorImpl]

'atLeastThisManyStates' @ [120:58] ==> value-parameter atLeastThisManyStates: Int = ... defined in net.corda.testing.contracts.fillWithSomeTestCash[ValueParameterDescriptorImpl]

'atMostThisManyStates' @ [120:81] ==> value-parameter atMostThisManyStates: Int = ... defined in net.corda.testing.contracts.fillWithSomeTestCash[ValueParameterDescriptorImpl]

'rng' @ [120:103] ==> value-parameter rng: Random = ... defined in net.corda.testing.contracts.fillWithSomeTestCash[ValueParameterDescriptorImpl]

'ownedBy' @ [122:17] ==> value-parameter ownedBy: AbstractParty? = ... defined in net.corda.testing.contracts.fillWithSomeTestCash[ValueParameterDescriptorImpl]

'owningKey' @ [122:26] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'myInfo' @ [122:39] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [122:46] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [122:60] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'AnonymousParty' @ [123:21] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'myKey' @ [123:36] ==> val myKey: PublicKey defined in net.corda.testing.contracts.fillWithSomeTestCash[LocalVariableDescriptor]

'Cash' @ [126:16] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'amounts' @ [127:49] ==> val amounts: LongArray defined in net.corda.testing.contracts.fillWithSomeTestCash[LocalVariableDescriptor]

'map' @ [127:57] ==> public inline fun <R> LongArray.map(transform: (Long) -> SignedTransaction): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'TransactionBuilder' @ [128:24] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'cash' @ [129:9] ==> val cash: Cash defined in net.corda.testing.contracts.fillWithSomeTestCash[LocalVariableDescriptor]

'generateIssue' @ [129:14] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'issuance' @ [129:28] ==> val issuance: TransactionBuilder defined in net.corda.testing.contracts.fillWithSomeTestCash.<anonymous>[LocalVariableDescriptor]

'Amount' @ [129:38] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'pennies' @ [129:45] ==> value-parameter pennies: Long defined in net.corda.testing.contracts.fillWithSomeTestCash.<anonymous>[ValueParameterDescriptorImpl]

'Issued' @ [129:54] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'issuedBy' @ [129:61] ==> value-parameter issuedBy: PartyAndReference = ... defined in net.corda.testing.contracts.fillWithSomeTestCash[ValueParameterDescriptorImpl]

'copy' @ [129:70] ==> public final fun copy(party: AbstractParty = ..., reference: OpaqueBytes = ...): PartyAndReference defined in net.corda.core.contracts.PartyAndReference[DeserializedSimpleFunctionDescriptor]

'ref' @ [129:87] ==> value-parameter ref: OpaqueBytes = ... defined in net.corda.testing.contracts.fillWithSomeTestCash[ValueParameterDescriptorImpl]

'howMuch' @ [129:93] ==> value-parameter howMuch: Amount<Currency> defined in net.corda.testing.contracts.fillWithSomeTestCash[ValueParameterDescriptorImpl]

'token' @ [129:101] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'anonParty' @ [129:110] ==> val anonParty: AnonymousParty defined in net.corda.testing.contracts.fillWithSomeTestCash[LocalVariableDescriptor]

'outputNotary' @ [129:121] ==> value-parameter outputNotary: Party = ... defined in net.corda.testing.contracts.fillWithSomeTestCash[ValueParameterDescriptorImpl]

'issuerServices' @ [131:20] ==> value-parameter issuerServices: ServiceHub = ... defined in net.corda.testing.contracts.fillWithSomeTestCash[ValueParameterDescriptorImpl]

'signInitialTransaction' @ [131:35] ==> public open fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'issuance' @ [131:58] ==> val issuance: TransactionBuilder defined in net.corda.testing.contracts.fillWithSomeTestCash.<anonymous>[LocalVariableDescriptor]

'issuedBy' @ [131:68] ==> value-parameter issuedBy: PartyAndReference = ... defined in net.corda.testing.contracts.fillWithSomeTestCash[ValueParameterDescriptorImpl]

'party' @ [131:77] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [131:83] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'recordTransactions' @ [134:5] ==> public open fun recordTransactions(txs: Iterable<SignedTransaction>): Unit defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'transactions' @ [134:24] ==> val transactions: List<SignedTransaction> defined in net.corda.testing.contracts.fillWithSomeTestCash[LocalVariableDescriptor]

'transactions' @ [137:18] ==> val transactions: List<SignedTransaction> defined in net.corda.testing.contracts.fillWithSomeTestCash[LocalVariableDescriptor]

'flatMap' @ [137:31] ==> public inline fun <T, R> Iterable<SignedTransaction>.flatMap(transform: (SignedTransaction) -> Iterable<StateAndRef<Cash.State>>): List<StateAndRef<Cash.State>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> StateAndRef<State>

'stx' @ [138:9] ==> value-parameter stx: SignedTransaction defined in net.corda.testing.contracts.fillWithSomeTestCash.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [138:13] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [138:16] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'indices' @ [138:24] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'map' @ [138:32] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> StateAndRef<Cash.State>): List<StateAndRef<Cash.State>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> StateAndRef<State>

'stx' @ [138:43] ==> value-parameter stx: SignedTransaction defined in net.corda.testing.contracts.fillWithSomeTestCash.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [138:47] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [138:50] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<Cash.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'i' @ [138:69] ==> value-parameter i: Int defined in net.corda.testing.contracts.fillWithSomeTestCash.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Vault' @ [141:12] ==> public constructor Vault<out T : ContractState>(states: Iterable<StateAndRef<Cash.State>>) defined in net.corda.core.node.services.Vault[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State

'states' @ [141:18] ==> val states: List<StateAndRef<Cash.State>> defined in net.corda.testing.contracts.fillWithSomeTestCash[LocalVariableDescriptor]

'this' @ [152:71] ==> <this> defined in net.corda.testing.contracts.fillWithSomeTestCommodity[ReceiverParameterDescriptorImpl]

'DUMMY_NOTARY' @ [153:64] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'OpaqueBytes' @ [154:61] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[DeserializedClassConstructorDescriptor]

'ByteArray' @ [154:73] ==> public constructor ByteArray(size: Int, init: (Int) -> Byte) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'DUMMY_OBLIGATION_ISSUER' @ [156:72] ==> public val DUMMY_OBLIGATION_ISSUER: Party defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'ref' @ [156:96] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'ownedBy' @ [157:28] ==> value-parameter ownedBy: AbstractParty? = ... defined in net.corda.testing.contracts.fillWithSomeTestCommodity[ValueParameterDescriptorImpl]

'owningKey' @ [157:37] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'myInfo' @ [157:50] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [157:57] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [157:71] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'AnonymousParty' @ [158:14] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'myKey' @ [158:29] ==> val myKey: PublicKey defined in net.corda.testing.contracts.fillWithSomeTestCommodity[LocalVariableDescriptor]

'CommodityContract' @ [160:21] ==> public constructor CommodityContract() defined in net.corda.finance.contracts.asset.CommodityContract[DeserializedClassConstructorDescriptor]

'TransactionBuilder' @ [161:20] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'commodity' @ [162:5] ==> val commodity: CommodityContract defined in net.corda.testing.contracts.fillWithSomeTestCommodity[LocalVariableDescriptor]

'generateIssue' @ [162:15] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Commodity>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.CommodityContract[DeserializedSimpleFunctionDescriptor]

'issuance' @ [162:29] ==> val issuance: TransactionBuilder defined in net.corda.testing.contracts.fillWithSomeTestCommodity[LocalVariableDescriptor]

'Amount' @ [162:39] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Commodity>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Commodity>

'amount' @ [162:46] ==> value-parameter amount: Amount<Commodity> defined in net.corda.testing.contracts.fillWithSomeTestCommodity[ValueParameterDescriptorImpl]

'quantity' @ [162:53] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Issued' @ [162:63] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Commodity) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Commodity

'issuedBy' @ [162:70] ==> value-parameter issuedBy: PartyAndReference = ... defined in net.corda.testing.contracts.fillWithSomeTestCommodity[ValueParameterDescriptorImpl]

'copy' @ [162:79] ==> public final fun copy(party: AbstractParty = ..., reference: OpaqueBytes = ...): PartyAndReference defined in net.corda.core.contracts.PartyAndReference[DeserializedSimpleFunctionDescriptor]

'ref' @ [162:96] ==> value-parameter ref: OpaqueBytes = ... defined in net.corda.testing.contracts.fillWithSomeTestCommodity[ValueParameterDescriptorImpl]

'amount' @ [162:102] ==> value-parameter amount: Amount<Commodity> defined in net.corda.testing.contracts.fillWithSomeTestCommodity[ValueParameterDescriptorImpl]

'token' @ [162:109] ==> public final val token: Commodity defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'me' @ [162:118] ==> val me: AnonymousParty defined in net.corda.testing.contracts.fillWithSomeTestCommodity[LocalVariableDescriptor]

'outputNotary' @ [162:122] ==> value-parameter outputNotary: Party = ... defined in net.corda.testing.contracts.fillWithSomeTestCommodity[ValueParameterDescriptorImpl]

'issuerServices' @ [163:23] ==> value-parameter issuerServices: ServiceHub = ... defined in net.corda.testing.contracts.fillWithSomeTestCommodity[ValueParameterDescriptorImpl]

'signInitialTransaction' @ [163:38] ==> public open fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'issuance' @ [163:61] ==> val issuance: TransactionBuilder defined in net.corda.testing.contracts.fillWithSomeTestCommodity[LocalVariableDescriptor]

'issuedBy' @ [163:71] ==> value-parameter issuedBy: PartyAndReference = ... defined in net.corda.testing.contracts.fillWithSomeTestCommodity[ValueParameterDescriptorImpl]

'party' @ [163:80] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [163:86] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'recordTransactions' @ [165:5] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'transaction' @ [165:24] ==> val transaction: SignedTransaction defined in net.corda.testing.contracts.fillWithSomeTestCommodity[LocalVariableDescriptor]

'Vault' @ [167:12] ==> public constructor Vault<out T : ContractState>(states: Iterable<StateAndRef<CommodityContract.State>>) defined in net.corda.core.node.services.Vault[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State

'setOf' @ [167:18] ==> public fun <T> setOf(element: StateAndRef<CommodityContract.State>): Set<StateAndRef<CommodityContract.State>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'transaction' @ [167:24] ==> val transaction: SignedTransaction defined in net.corda.testing.contracts.fillWithSomeTestCommodity[LocalVariableDescriptor]

'tx' @ [167:36] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [167:39] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<CommodityContract.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'min' @ [171:20] ==> value-parameter min: Int defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[ValueParameterDescriptorImpl]

'floor' @ [171:31] ==> public open fun floor(p0: Double): Double defined in java.lang.Math[JavaMethodDescriptor]

'rng' @ [171:37] ==> value-parameter rng: Random defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[ValueParameterDescriptorImpl]

'nextDouble' @ [171:41] ==> public open fun nextDouble(): Double defined in java.util.Random[JavaMethodDescriptor]

'max' @ [171:57] ==> value-parameter max: Int defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[ValueParameterDescriptorImpl]

'min' @ [171:63] ==> value-parameter min: Int defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[ValueParameterDescriptorImpl]

'toInt' @ [171:69] ==> public open fun toInt(): Int defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'howMuch' @ [172:20] ==> value-parameter howMuch: Amount<Currency> defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[ValueParameterDescriptorImpl]

'quantity' @ [172:28] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'numSlots' @ [172:39] ==> val numSlots: Int defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'check' @ [173:5] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'baseSize' @ [173:11] ==> val baseSize: Long defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'baseSize' @ [173:27] ==> val baseSize: Long defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'LongArray' @ [175:19] ==> public constructor LongArray(size: Int, init: (Int) -> Long) defined in kotlin.LongArray[DeserializedClassConstructorDescriptor]

'numSlots' @ [175:29] ==> val numSlots: Int defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'baseSize' @ [175:41] ==> val baseSize: Long defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'/' @ [179:21] ==> public final operator fun div(other: Int): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'numSlots' @ [179:27] ==> val numSlots: Int defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'amounts' @ [180:15] ==> val amounts: LongArray defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'indices' @ [180:23] ==> public val LongArray.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'if (i != amounts.lastIndex) {
            val adjustBy = rng.nextDouble() * maxAdjust - (maxAdjust / 2)
            val adjustment = (1 + adjustBy)
            val adjustTo = (amounts[i] * adjustment).toLong()
            amounts[i] = adjustTo
            distanceFromGoal += baseSize - adjustTo
        } else {
            amounts[i] += distanceFromGoal
        }' @ [181:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'i' @ [181:13] ==> val i: Int defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'amounts' @ [181:18] ==> val amounts: LongArray defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'lastIndex' @ [181:26] ==> public val LongArray.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]

'rng' @ [182:28] ==> value-parameter rng: Random defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[ValueParameterDescriptorImpl]

'nextDouble' @ [182:32] ==> public open fun nextDouble(): Double defined in java.util.Random[JavaMethodDescriptor]

'maxAdjust' @ [182:47] ==> val maxAdjust: Double defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'maxAdjust' @ [182:60] ==> val maxAdjust: Double defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'+' @ [183:31] ==> public final operator fun plus(other: Double): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'adjustBy' @ [183:35] ==> val adjustBy: Double defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'amounts' @ [184:29] ==> val amounts: LongArray defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'i' @ [184:37] ==> val i: Int defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'adjustment' @ [184:42] ==> val adjustment: Double defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'toLong' @ [184:54] ==> public open fun toLong(): Long defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'amounts' @ [185:13] ==> val amounts: LongArray defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'i' @ [185:21] ==> val i: Int defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'adjustTo' @ [185:26] ==> val adjustTo: Long defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'distanceFromGoal' @ [186:13] ==> var distanceFromGoal: Long defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'baseSize' @ [186:33] ==> val baseSize: Long defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'adjustTo' @ [186:44] ==> val adjustTo: Long defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'amounts' @ [188:13] ==> val amounts: LongArray defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'i' @ [188:21] ==> val i: Int defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'distanceFromGoal' @ [188:27] ==> var distanceFromGoal: Long defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'amounts' @ [193:5] ==> val amounts: LongArray defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'howMuch' @ [193:19] ==> value-parameter howMuch: Amount<Currency> defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[ValueParameterDescriptorImpl]

'quantity' @ [193:27] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'amounts' @ [193:38] ==> val amounts: LongArray defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'sum' @ [193:46] ==> public fun LongArray.sum(): Long defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'amounts' @ [195:12] ==> val amounts: LongArray defined in net.corda.testing.contracts.calculateRandomlySizedAmounts[LocalVariableDescriptor]

'states' @ [200:5] ==> value-parameter states: List<StateAndRef<T>> defined in net.corda.testing.contracts.consume[ValueParameterDescriptorImpl]

'forEach' @ [200:12] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<T>>.forEach(action: (StateAndRef<T>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'TransactionBuilder' @ [201:24] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [201:52] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consume[ValueParameterDescriptorImpl]

'apply' @ [201:60] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'addInputState' @ [202:13] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'it' @ [202:27] ==> value-parameter it: StateAndRef<T> defined in net.corda.testing.contracts.consume.<anonymous>[ValueParameterDescriptorImpl]

'addCommand' @ [203:13] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [203:24] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[SimpleFunctionDescriptorImpl]

'notary' @ [203:37] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consume[ValueParameterDescriptorImpl]

'owningKey' @ [203:44] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [205:26] ==> public open fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'builder' @ [205:49] ==> val builder: TransactionBuilder defined in net.corda.testing.contracts.consume.<anonymous>[LocalVariableDescriptor]

'notary' @ [205:58] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consume[ValueParameterDescriptorImpl]

'owningKey' @ [205:65] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'recordTransactions' @ [207:9] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'consumedTx' @ [207:28] ==> val consumedTx: SignedTransaction defined in net.corda.testing.contracts.consume.<anonymous>[LocalVariableDescriptor]

'TransactionBuilder' @ [213:19] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [213:47] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consumeAndProduce[ValueParameterDescriptorImpl]

'apply' @ [213:55] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'addInputState' @ [214:9] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'stateAndRef' @ [214:23] ==> value-parameter stateAndRef: StateAndRef<T> defined in net.corda.testing.contracts.consumeAndProduce[ValueParameterDescriptorImpl]

'addCommand' @ [215:9] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [215:20] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[SimpleFunctionDescriptorImpl]

'notary' @ [215:33] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consumeAndProduce[ValueParameterDescriptorImpl]

'owningKey' @ [215:40] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [217:22] ==> public open fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'builder' @ [217:45] ==> var builder: TransactionBuilder defined in net.corda.testing.contracts.consumeAndProduce[LocalVariableDescriptor]

'notary' @ [217:54] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consumeAndProduce[ValueParameterDescriptorImpl]

'owningKey' @ [217:61] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'recordTransactions' @ [219:5] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'consumedTx' @ [219:24] ==> val consumedTx: SignedTransaction defined in net.corda.testing.contracts.consumeAndProduce[LocalVariableDescriptor]

'builder' @ [222:5] ==> var builder: TransactionBuilder defined in net.corda.testing.contracts.consumeAndProduce[LocalVariableDescriptor]

'TransactionBuilder' @ [222:15] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [222:43] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consumeAndProduce[ValueParameterDescriptorImpl]

'apply' @ [222:51] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'addOutputState' @ [223:9] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'State' @ [223:44] ==> public constructor State(linearId: UniqueIdentifier = ..., contract: Contract = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearTimestamp: Instant = ..., linearBoolean: Boolean = ..., nonce: SecureHash = ...) defined in net.corda.testing.contracts.DummyLinearContract.State[ClassConstructorDescriptorImpl]

'stateAndRef' @ [223:61] ==> value-parameter stateAndRef: StateAndRef<T> defined in net.corda.testing.contracts.consumeAndProduce[ValueParameterDescriptorImpl]

'state' @ [223:73] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [223:79] ==> public final val data: T defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'linearId' @ [223:84] ==> public abstract val linearId: UniqueIdentifier defined in net.corda.core.contracts.LinearState[DeserializedPropertyDescriptor]

'stateAndRef' @ [224:32] ==> value-parameter stateAndRef: StateAndRef<T> defined in net.corda.testing.contracts.consumeAndProduce[ValueParameterDescriptorImpl]

'state' @ [224:44] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [224:50] ==> public final val data: T defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'participants' @ [224:55] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.LinearState[DeserializedPropertyDescriptor]

'addCommand' @ [225:9] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [225:20] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[SimpleFunctionDescriptorImpl]

'notary' @ [225:33] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consumeAndProduce[ValueParameterDescriptorImpl]

'owningKey' @ [225:40] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [227:22] ==> public open fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'builder' @ [227:45] ==> var builder: TransactionBuilder defined in net.corda.testing.contracts.consumeAndProduce[LocalVariableDescriptor]

'notary' @ [227:54] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consumeAndProduce[ValueParameterDescriptorImpl]

'owningKey' @ [227:61] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'recordTransactions' @ [229:5] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'producedTx' @ [229:24] ==> val producedTx: SignedTransaction defined in net.corda.testing.contracts.consumeAndProduce[LocalVariableDescriptor]

'producedTx' @ [231:12] ==> val producedTx: SignedTransaction defined in net.corda.testing.contracts.consumeAndProduce[LocalVariableDescriptor]

'tx' @ [231:23] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [231:26] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<T> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> T

'states' @ [235:5] ==> value-parameter states: List<StateAndRef<T>> defined in net.corda.testing.contracts.consumeAndProduce[ValueParameterDescriptorImpl]

'forEach' @ [235:12] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<T>>.forEach(action: (StateAndRef<T>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'consumeAndProduce' @ [236:9] ==> public fun <T : LinearState> ServiceHub.consumeAndProduce(stateAndRef: StateAndRef<T>, notary: Party): StateAndRef<T> defined in net.corda.testing.contracts[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : LinearState> -> T

'it' @ [236:27] ==> value-parameter it: StateAndRef<T> defined in net.corda.testing.contracts.consumeAndProduce.<anonymous>[ValueParameterDescriptorImpl]

'notary' @ [236:31] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consumeAndProduce[ValueParameterDescriptorImpl]

'consume' @ [240:88] ==> public fun <T : LinearState> ServiceHub.consume(states: List<StateAndRef<DealState>>, notary: Party): Unit defined in net.corda.testing.contracts[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : LinearState> -> DealState

'dealStates' @ [240:96] ==> value-parameter dealStates: List<StateAndRef<DealState>> defined in net.corda.testing.contracts.consumeDeals[ValueParameterDescriptorImpl]

'notary' @ [240:108] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consumeDeals[ValueParameterDescriptorImpl]

'consume' @ [241:99] ==> public fun <T : LinearState> ServiceHub.consume(states: List<StateAndRef<LinearState>>, notary: Party): Unit defined in net.corda.testing.contracts[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : LinearState> -> LinearState

'linearStates' @ [241:107] ==> value-parameter linearStates: List<StateAndRef<LinearState>> defined in net.corda.testing.contracts.consumeLinearStates[ValueParameterDescriptorImpl]

'notary' @ [241:121] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consumeLinearStates[ValueParameterDescriptorImpl]

'consumeAndProduce' @ [242:98] ==> public fun <T : LinearState> ServiceHub.consumeAndProduce(states: List<StateAndRef<LinearState>>, notary: Party): Unit defined in net.corda.testing.contracts[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : LinearState> -> LinearState

'linearStates' @ [242:116] ==> value-parameter linearStates: List<StateAndRef<LinearState>> defined in net.corda.testing.contracts.evolveLinearStates[ValueParameterDescriptorImpl]

'notary' @ [242:130] ==> value-parameter notary: Party defined in net.corda.testing.contracts.evolveLinearStates[ValueParameterDescriptorImpl]

'consumeAndProduce' @ [243:117] ==> public fun <T : LinearState> ServiceHub.consumeAndProduce(stateAndRef: StateAndRef<LinearState>, notary: Party): StateAndRef<LinearState> defined in net.corda.testing.contracts[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : LinearState> -> LinearState

'linearState' @ [243:135] ==> value-parameter linearState: StateAndRef<LinearState> defined in net.corda.testing.contracts.evolveLinearState[ValueParameterDescriptorImpl]

'notary' @ [243:148] ==> value-parameter notary: Party defined in net.corda.testing.contracts.evolveLinearState[ValueParameterDescriptorImpl]

'JvmOverloads' @ [245:1] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'CHARLIE' @ [246:66] ==> public val CHARLIE: Party defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'vaultService' @ [247:19] ==> public abstract val vaultService: VaultService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'rawUpdates' @ [247:32] ==> public abstract val rawUpdates: Observable<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedPropertyDescriptor]

'toFuture' @ [247:43] ==> public fun <T> Observable<Vault.Update<ContractState>>.toFuture(): CordaFuture<Vault.Update<ContractState>> defined in net.corda.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Update<ContractState>

'this' @ [248:20] ==> <this> defined in net.corda.testing.contracts.consumeCash[ReceiverParameterDescriptorImpl]

'TransactionBuilder' @ [251:19] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [251:38] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consumeCash[ValueParameterDescriptorImpl]

'apply' @ [251:46] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Cash' @ [252:9] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'generateSpend' @ [252:14] ==> @JvmStatic @Suspendable public final fun generateSpend(services: ServiceHub, tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, onlyFromParties: Set<AbstractParty> = ...): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.Cash.Companion[DeserializedSimpleFunctionDescriptor]

'services' @ [252:28] ==> val services: ServiceHub defined in net.corda.testing.contracts.consumeCash[LocalVariableDescriptor]

'this' @ [252:38] ==> <this> defined in net.corda.testing.contracts.consumeCash.<anonymous>[ReceiverParameterDescriptorImpl]

'amount' @ [252:44] ==> value-parameter amount: Amount<Currency> defined in net.corda.testing.contracts.consumeCash[ValueParameterDescriptorImpl]

'to' @ [252:52] ==> value-parameter to: Party = ... defined in net.corda.testing.contracts.consumeCash[ValueParameterDescriptorImpl]

'signInitialTransaction' @ [254:19] ==> public open fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'builder' @ [254:42] ==> val builder: TransactionBuilder defined in net.corda.testing.contracts.consumeCash[LocalVariableDescriptor]

'notary' @ [254:51] ==> value-parameter notary: Party defined in net.corda.testing.contracts.consumeCash[ValueParameterDescriptorImpl]

'owningKey' @ [254:58] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'recordTransactions' @ [256:5] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'spendTx' @ [256:24] ==> val spendTx: SignedTransaction defined in net.corda.testing.contracts.consumeCash[LocalVariableDescriptor]

'update' @ [258:12] ==> val update: CordaFuture<Vault.Update<ContractState>> defined in net.corda.testing.contracts.consumeCash[LocalVariableDescriptor]

'getOrThrow' @ [258:19] ==> public fun <V> Future<Vault.Update<ContractState>>.getOrThrow(timeout: Duration? = ...): Vault.Update<ContractState> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Update<ContractState>

'ofSeconds' @ [258:39] ==> public open fun ofSeconds(p0: Long): (Duration..Duration?) defined in java.time.Duration[JavaMethodDescriptor]

