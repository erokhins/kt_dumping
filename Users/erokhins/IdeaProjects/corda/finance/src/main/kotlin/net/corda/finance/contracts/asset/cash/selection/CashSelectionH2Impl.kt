'loggerFor' @ [30:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> CashSelectionH2Impl

'metaData' @ [34:16] ==> value-parameter metaData: DatabaseMetaData defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.isCompatible[ValueParameterDescriptorImpl]

'driverName' @ [34:25] ==> public final val DatabaseMetaData.driverName: (String..String?)[MyPropertyDescriptor]

'JDBC_DRIVER_NAME' @ [34:39] ==> public final val JDBC_DRIVER_NAME: String defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.Companion[PropertyDescriptorImpl]

'ReentrantLock' @ [40:44] ==> public constructor ReentrantLock() defined in java.util.concurrent.locks.ReentrantLock[JavaClassConstructorDescriptor]

'Suspendable' @ [56:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'onlyFromIssuerParties' @ [64:29] ==> value-parameter onlyFromIssuerParties: Set<AbstractParty> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'fold' @ [64:51] ==> public inline fun <T, R> Iterable<AbstractParty>.fold(initial: String, operation: (String, AbstractParty) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> String

'left' @ [64:77] ==> value-parameter left: String defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[ValueParameterDescriptorImpl]

'right' @ [64:89] ==> value-parameter right: AbstractParty defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [64:95] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [64:105] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'dropLast' @ [64:129] ==> public fun String.dropLast(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'withIssuerRefs' @ [65:29] ==> value-parameter withIssuerRefs: Set<OpaqueBytes> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'fold' @ [65:44] ==> public inline fun <T, R> Iterable<OpaqueBytes>.fold(initial: String, operation: (String, OpaqueBytes) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OpaqueBytes
    <R> -> String

'left' @ [65:70] ==> value-parameter left: String defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[ValueParameterDescriptorImpl]

'right' @ [65:82] ==> value-parameter right: OpaqueBytes defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[ValueParameterDescriptorImpl]

'bytes' @ [65:88] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[DeserializedPropertyDescriptor]

'toHexString' @ [65:94] ==> public fun ByteArray.toHexString(): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'dropLast' @ [65:115] ==> public fun String.dropLast(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'mutableListOf' @ [67:28] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<StateAndRef<Cash.State>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'..' @ [76:28] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'MAX_RETRIES' @ [76:31] ==> private final val MAX_RETRIES: Int defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl[PropertyDescriptorImpl]

'spendLock' @ [78:13] ==> private final val spendLock: ReentrantLock defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl[PropertyDescriptorImpl]

'withLock' @ [78:23] ==> @InlineOnly public inline fun <T> Lock.withLock(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'services' @ [79:33] ==> value-parameter services: ServiceHub defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'jdbcSession' @ [79:42] ==> public abstract fun jdbcSession(): Connection defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'createStatement' @ [79:56] ==> public abstract fun createStatement(): (Statement..Statement?) defined in java.sql.Connection[JavaMethodDescriptor]

'statement' @ [81:21] ==> val statement: (Statement..Statement?) defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'execute' @ [81:31] ==> public abstract fun execute(p0: (String..String?)): Boolean defined in java.sql.Statement[JavaMethodDescriptor]

'+' @ [85:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'amount' @ [90:43] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'token' @ [90:50] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'amount' @ [90:69] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'quantity' @ [90:76] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'lockId' @ [91:41] ==> value-parameter lockId: UUID defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'if (notary != null)
                                " AND vs.notary_name = '${notary.name}'" else ""' @ [93:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'notary' @ [93:34] ==> value-parameter notary: Party? defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'notary' @ [94:59] ==> value-parameter notary: Party? defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'name' @ [94:66] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'if (onlyFromIssuerParties.isNotEmpty())
                                " AND ccs.issuer_key IN ($issuerKeysStr)" else ""' @ [95:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'onlyFromIssuerParties' @ [95:34] ==> value-parameter onlyFromIssuerParties: Set<AbstractParty> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'isNotEmpty' @ [95:56] ==> @InlineOnly public inline fun <T> Collection<AbstractParty>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'issuerKeysStr' @ [96:59] ==> val issuerKeysStr: String defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'if (withIssuerRefs.isNotEmpty())
                                " AND ccs.issuer_ref IN ($issuerRefsStr)" else ""' @ [97:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'withIssuerRefs' @ [97:34] ==> value-parameter withIssuerRefs: Set<OpaqueBytes> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'isNotEmpty' @ [97:49] ==> @InlineOnly public inline fun <T> Collection<OpaqueBytes>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OpaqueBytes

'issuerRefsStr' @ [98:59] ==> val issuerRefsStr: String defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'statement' @ [101:30] ==> val statement: (Statement..Statement?) defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'executeQuery' @ [101:40] ==> public abstract fun executeQuery(p0: (String..String?)): (ResultSet..ResultSet?) defined in java.sql.Statement[JavaMethodDescriptor]

'selectJoin' @ [101:53] ==> val selectJoin: String defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'stateAndRefs' @ [102:21] ==> val stateAndRefs: MutableList<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'clear' @ [102:34] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'log' @ [103:21] ==> public final val log: Logger defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.Companion[PropertyDescriptorImpl]

'debug' @ [103:25] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'selectJoin' @ [103:31] ==> val selectJoin: String defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'rs' @ [105:28] ==> val rs: (ResultSet..ResultSet?) defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'next' @ [105:31] ==> public abstract operator fun next(): Boolean defined in java.sql.ResultSet[JavaMethodDescriptor]

'SecureHash' @ [106:38] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [106:49] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'rs' @ [106:55] ==> val rs: (ResultSet..ResultSet?) defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'getString' @ [106:58] ==> public abstract fun getString(p0: Int): (String..String?) defined in java.sql.ResultSet[JavaMethodDescriptor]

'rs' @ [107:37] ==> val rs: (ResultSet..ResultSet?) defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'getInt' @ [107:40] ==> public abstract fun getInt(p0: Int): Int defined in java.sql.ResultSet[JavaMethodDescriptor]

'StateRef' @ [108:40] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'txHash' @ [108:49] ==> val txHash: SecureHash.SHA256 defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'index' @ [108:57] ==> val index: Int defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'rs' @ [109:37] ==> val rs: (ResultSet..ResultSet?) defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'getBytes' @ [109:40] ==> public abstract fun getBytes(p0: Int): (ByteArray..ByteArray?) defined in java.sql.ResultSet[JavaMethodDescriptor]

'deserialize' @ [109:52] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): TransactionState<Cash.State> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TransactionState<State>

'SerializationDefaults' @ [109:104] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'STORAGE_CONTEXT' @ [109:126] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'rs' @ [110:39] ==> val rs: (ResultSet..ResultSet?) defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'getLong' @ [110:42] ==> public abstract fun getLong(p0: Int): Long defined in java.sql.ResultSet[JavaMethodDescriptor]

'totalPennies' @ [111:25] ==> var totalPennies: Long defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'rs' @ [111:40] ==> val rs: (ResultSet..ResultSet?) defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'getLong' @ [111:43] ==> public abstract fun getLong(p0: Int): Long defined in java.sql.ResultSet[JavaMethodDescriptor]

'rs' @ [112:41] ==> val rs: (ResultSet..ResultSet?) defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'getString' @ [112:44] ==> public abstract fun getString(p0: Int): (String..String?) defined in java.sql.ResultSet[JavaMethodDescriptor]

'stateAndRefs' @ [113:25] ==> val stateAndRefs: MutableList<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'add' @ [113:38] ==> public abstract fun add(element: StateAndRef<Cash.State>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'StateAndRef' @ [113:42] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<Cash.State>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State

'state' @ [113:54] ==> val state: TransactionState<Cash.State> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'stateRef' @ [113:61] ==> val stateRef: StateRef defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'log' @ [114:25] ==> public final val log: Logger defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.Companion[PropertyDescriptorImpl]

'trace' @ [114:29] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'rowLockId' @ [114:44] ==> val rowLockId: (String..String?) defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'lockId' @ [114:56] ==> value-parameter lockId: UUID defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'stateRef' @ [114:66] ==> val stateRef: StateRef defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'pennies' @ [114:78] ==> val pennies: Long defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'totalPennies' @ [114:88] ==> var totalPennies: Long defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'stateAndRefs' @ [117:25] ==> val stateAndRefs: MutableList<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'isNotEmpty' @ [117:38] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<Cash.State>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'totalPennies' @ [117:54] ==> var totalPennies: Long defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'amount' @ [117:70] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'quantity' @ [117:77] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'log' @ [119:25] ==> public final val log: Logger defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.Companion[PropertyDescriptorImpl]

'trace' @ [119:29] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'amount' @ [119:56] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'stateAndRefs' @ [119:75] ==> val stateAndRefs: MutableList<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'count' @ [119:88] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<Cash.State>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'totalPennies' @ [119:115] ==> var totalPennies: Long defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'stateAndRefs' @ [119:138] ==> val stateAndRefs: MutableList<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'services' @ [123:25] ==> value-parameter services: ServiceHub defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'vaultService' @ [123:34] ==> public abstract val vaultService: VaultService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'softLockReserve' @ [123:47] ==> public abstract fun softLockReserve(lockId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'lockId' @ [123:63] ==> value-parameter lockId: UUID defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'stateAndRefs' @ [123:72] ==> val stateAndRefs: MutableList<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'map' @ [123:85] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.map(transform: (StateAndRef<Cash.State>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> StateRef

'it' @ [123:91] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [123:94] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'toNonEmptySet' @ [123:101] ==> public fun <T> Collection<StateRef>.toNonEmptySet(): NonEmptySet<StateRef> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'stateAndRefs' @ [124:32] ==> val stateAndRefs: MutableList<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'log' @ [126:21] ==> public final val log: Logger defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.Companion[PropertyDescriptorImpl]

'trace' @ [126:25] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'amount' @ [126:58] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'totalPennies' @ [126:80] ==> var totalPennies: Long defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'stateAndRefs' @ [126:120] ==> val stateAndRefs: MutableList<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'map' @ [126:133] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.map(transform: (StateAndRef<Cash.State>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> StateRef

'it' @ [126:139] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [126:142] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'log' @ [129:21] ==> public final val log: Logger defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.Companion[PropertyDescriptorImpl]

'error' @ [129:25] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'amount' @ [129:84] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'onlyFromIssuerParties' @ [129:117] ==> value-parameter onlyFromIssuerParties: Set<AbstractParty> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'notary' @ [129:150] ==> value-parameter notary: Party? defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'lockId' @ [129:168] ==> value-parameter lockId: UUID defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'e' @ [130:26] ==> val e: SQLException defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'stateAndRefs' @ [133:21] ==> val stateAndRefs: MutableList<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'clear' @ [133:34] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'log' @ [134:21] ==> public final val log: Logger defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.Companion[PropertyDescriptorImpl]

'warn' @ [134:25] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [134:30] ==> val e: StatesNotAvailableException defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'message' @ [134:32] ==> public open val message: String? defined in net.corda.core.node.services.StatesNotAvailableException[DeserializedPropertyDescriptor]

'statement' @ [137:21] ==> val statement: (Statement..Statement?) defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending.<anonymous>[LocalVariableDescriptor]

'close' @ [137:31] ==> public abstract fun close(): Unit defined in java.sql.Statement[JavaMethodDescriptor]

'log' @ [141:13] ==> public final val log: Logger defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.Companion[PropertyDescriptorImpl]

'warn' @ [141:17] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'retryCount' @ [141:57] ==> val retryCount: Int defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'retryCount' @ [143:17] ==> val retryCount: Int defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'MAX_RETRIES' @ [143:31] ==> private final val MAX_RETRIES: Int defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl[PropertyDescriptorImpl]

'sleep' @ [144:24] ==> @Instrumented public open fun sleep(p0: Long): Unit defined in co.paralleluniverse.strands.Strand[JavaMethodDescriptor]

'RETRY_SLEEP' @ [144:30] ==> private final val RETRY_SLEEP: Int defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl[PropertyDescriptorImpl]

'retryCount' @ [144:44] ==> val retryCount: Int defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'toLong' @ [144:55] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'log' @ [148:9] ==> public final val log: Logger defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.Companion[PropertyDescriptorImpl]

'warn' @ [148:13] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'amount' @ [148:65] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'stateAndRefs' @ [149:16] ==> val stateAndRefs: MutableList<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.cash.selection.CashSelectionH2Impl.unconsumedCashStatesForSpending[LocalVariableDescriptor]

