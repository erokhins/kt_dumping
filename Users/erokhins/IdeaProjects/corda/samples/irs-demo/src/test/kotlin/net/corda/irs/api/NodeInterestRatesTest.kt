'TestDependencyInjectionBase' @ [37:31] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'NodeInterestRates' @ [38:21] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'parseFile' @ [38:39] ==> public final fun parseFile(s: String): NodeInterestRates.FixContainer defined in net.corda.irs.api.NodeInterestRates[DeserializedSimpleFunctionDescriptor]

'trimIndent' @ [45:13] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'generateKeyPair' @ [47:33] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Party' @ [48:29] ==> public constructor Party(name: X500Name, owningKey: PublicKey) defined in net.corda.core.identity.Party[DeserializedClassConstructorDescriptor]

'X500Name' @ [48:35] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'DUMMY_CASH_ISSUER_KEY' @ [48:91] ==> public final val DUMMY_CASH_ISSUER_KEY: KeyPair defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'public' @ [48:113] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'when (elem) {
            is Command<*> -> oracle.identity.owningKey in elem.signers && elem.value is Fix
            else -> false
        }' @ [54:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'elem' @ [54:22] ==> value-parameter elem: Any defined in net.corda.irs.api.NodeInterestRatesTest.fixCmdFilter[ValueParameterDescriptorImpl]

'oracle' @ [55:30] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'identity' @ [55:37] ==> public final val identity: Party defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedPropertyDescriptor]

'owningKey' @ [55:46] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'elem' @ [55:59] ==> value-parameter elem: Any defined in net.corda.irs.api.NodeInterestRatesTest.fixCmdFilter[ValueParameterDescriptorImpl]

'signers' @ [55:64] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'elem' @ [55:75] ==> value-parameter elem: Any defined in net.corda.irs.api.NodeInterestRatesTest.fixCmdFilter[ValueParameterDescriptorImpl]

'value' @ [55:80] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'elem' @ [60:42] ==> value-parameter elem: Any defined in net.corda.irs.api.NodeInterestRatesTest.filterCmds[ValueParameterDescriptorImpl]

'Before' @ [62:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'database' @ [64:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'configureDatabase' @ [64:20] ==> public fun configureDatabase(dataSourceProperties: Properties, databaseProperties: Properties?, createSchemaService: () -> SchemaService = ..., createIdentityService: () -> IdentityService): CordaPersistence defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'makeTestDataSourceProperties' @ [64:38] ==> public fun makeTestDataSourceProperties(nodeName: String = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'makeTestDatabaseProperties' @ [64:70] ==> public fun makeTestDatabaseProperties(key: String? = ..., value: String? = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'makeTestIdentityService' @ [64:126] ==> public fun makeTestIdentityService(): InMemoryIdentityService defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'database' @ [65:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'transaction' @ [65:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'oracle' @ [66:13] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'NodeInterestRates' @ [66:22] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'Oracle' @ [66:40] ==> public constructor Oracle(identity: Party, signingKey: PublicKey, services: ServiceHub) defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedClassConstructorDescriptor]

'MEGA_CORP' @ [67:21] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'MEGA_CORP_KEY' @ [68:21] ==> public val MEGA_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [68:35] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'MockServices' @ [69:21] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'DUMMY_CASH_ISSUER_KEY' @ [69:34] ==> public final val DUMMY_CASH_ISSUER_KEY: KeyPair defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'MEGA_CORP_KEY' @ [69:57] ==> public val MEGA_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'apply' @ [70:15] ==> @InlineOnly public inline fun <T> NodeInterestRates.Oracle.apply(block: NodeInterestRates.Oracle.() -> Unit): NodeInterestRates.Oracle defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Oracle

'knownFixes' @ [70:23] ==> public final var knownFixes: NodeInterestRates.FixContainer defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedPropertyDescriptor]

'TEST_DATA' @ [70:36] ==> public final val TEST_DATA: NodeInterestRates.FixContainer defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'After' @ [74:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'database' @ [76:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'close' @ [76:18] ==> public open fun close(): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'Test' @ [79:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [81:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'transaction' @ [81:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'NodeInterestRates' @ [82:21] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'parseFixOf' @ [82:39] ==> public final fun parseFixOf(key: String): FixOf defined in net.corda.irs.api.NodeInterestRates[DeserializedSimpleFunctionDescriptor]

'oracle' @ [83:23] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'query' @ [83:30] ==> @Suspendable public final fun query(queries: List<FixOf>): List<Fix> defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedSimpleFunctionDescriptor]

'listOf' @ [83:36] ==> public fun <T> listOf(element: FixOf): List<FixOf> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FixOf

'q' @ [83:43] ==> val q: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.`query successfully`.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [84:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'res' @ [84:29] ==> val res: List<Fix> defined in net.corda.irs.api.NodeInterestRatesTest.`query successfully`.<anonymous>[LocalVariableDescriptor]

'size' @ [84:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [85:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal, actual: BigDecimal, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal

'BigDecimal' @ [85:26] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'res' @ [85:47] ==> val res: List<Fix> defined in net.corda.irs.api.NodeInterestRatesTest.`query successfully`.<anonymous>[LocalVariableDescriptor]

'value' @ [85:54] ==> public final val value: BigDecimal defined in net.corda.finance.contracts.Fix[DeserializedPropertyDescriptor]

'assertEquals' @ [86:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: FixOf, actual: FixOf, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> FixOf

'q' @ [86:26] ==> val q: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.`query successfully`.<anonymous>[LocalVariableDescriptor]

'res' @ [86:29] ==> val res: List<Fix> defined in net.corda.irs.api.NodeInterestRatesTest.`query successfully`.<anonymous>[LocalVariableDescriptor]

'of' @ [86:36] ==> public final val of: FixOf defined in net.corda.finance.contracts.Fix[DeserializedPropertyDescriptor]

'Test' @ [90:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [92:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'transaction' @ [92:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'NodeInterestRates' @ [93:22] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'parseFixOf' @ [93:40] ==> public final fun parseFixOf(key: String): FixOf defined in net.corda.irs.api.NodeInterestRates[DeserializedSimpleFunctionDescriptor]

'NodeInterestRates' @ [94:22] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'parseFixOf' @ [94:40] ==> public final fun parseFixOf(key: String): FixOf defined in net.corda.irs.api.NodeInterestRates[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [95:21] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): NodeInterestRates.UnknownFix defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> UnknownFix

'oracle' @ [95:69] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'query' @ [95:76] ==> @Suspendable public final fun query(queries: List<FixOf>): List<Fix> defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedSimpleFunctionDescriptor]

'listOf' @ [95:82] ==> public fun <T> listOf(vararg elements: FixOf): List<FixOf> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FixOf

'q1' @ [95:89] ==> val q1: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.`query with one success and one missing`.<anonymous>[LocalVariableDescriptor]

'q2' @ [95:93] ==> val q2: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.`query with one success and one missing`.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [96:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: FixOf, actual: FixOf, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> FixOf

'e' @ [96:26] ==> val e: NodeInterestRates.UnknownFix defined in net.corda.irs.api.NodeInterestRatesTest.`query with one success and one missing`.<anonymous>[LocalVariableDescriptor]

'fix' @ [96:28] ==> public final val fix: FixOf defined in net.corda.irs.api.NodeInterestRates.UnknownFix[DeserializedPropertyDescriptor]

'q2' @ [96:33] ==> val q2: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.`query with one success and one missing`.<anonymous>[LocalVariableDescriptor]

'Test' @ [100:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [102:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'transaction' @ [102:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'NodeInterestRates' @ [103:21] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'parseFixOf' @ [103:39] ==> public final fun parseFixOf(key: String): FixOf defined in net.corda.irs.api.NodeInterestRates[DeserializedSimpleFunctionDescriptor]

'oracle' @ [104:23] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'query' @ [104:30] ==> @Suspendable public final fun query(queries: List<FixOf>): List<Fix> defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedSimpleFunctionDescriptor]

'listOf' @ [104:36] ==> public fun <T> listOf(element: FixOf): List<FixOf> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FixOf

'q' @ [104:43] ==> val q: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.`query successfully with interpolated rate`.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [105:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'res' @ [105:29] ==> val res: List<Fix> defined in net.corda.irs.api.NodeInterestRatesTest.`query successfully with interpolated rate`.<anonymous>[LocalVariableDescriptor]

'size' @ [105:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [106:20] ==> public open fun assertEquals(p0: Double, p1: Double, p2: Double): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'res' @ [106:44] ==> val res: List<Fix> defined in net.corda.irs.api.NodeInterestRatesTest.`query successfully with interpolated rate`.<anonymous>[LocalVariableDescriptor]

'value' @ [106:51] ==> public final val value: BigDecimal defined in net.corda.finance.contracts.Fix[DeserializedPropertyDescriptor]

'toDouble' @ [106:57] ==> public open fun toDouble(): Double defined in java.math.BigDecimal[JavaMethodDescriptor]

'assertEquals' @ [107:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: FixOf, actual: FixOf, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> FixOf

'q' @ [107:26] ==> val q: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.`query successfully with interpolated rate`.<anonymous>[LocalVariableDescriptor]

'res' @ [107:29] ==> val res: List<Fix> defined in net.corda.irs.api.NodeInterestRatesTest.`query successfully with interpolated rate`.<anonymous>[LocalVariableDescriptor]

'of' @ [107:36] ==> public final val of: FixOf defined in net.corda.finance.contracts.Fix[DeserializedPropertyDescriptor]

'Test' @ [111:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [113:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'transaction' @ [113:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> NodeInterestRates.UnknownFix): NodeInterestRates.UnknownFix defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnknownFix

'NodeInterestRates' @ [114:21] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'parseFixOf' @ [114:39] ==> public final fun parseFixOf(key: String): FixOf defined in net.corda.irs.api.NodeInterestRates[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [115:13] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): NodeInterestRates.UnknownFix defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> UnknownFix

'oracle' @ [115:61] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'query' @ [115:68] ==> @Suspendable public final fun query(queries: List<FixOf>): List<Fix> defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedSimpleFunctionDescriptor]

'listOf' @ [115:74] ==> public fun <T> listOf(element: FixOf): List<FixOf> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FixOf

'q' @ [115:81] ==> val q: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.`rate missing and unable to interpolate`.<anonymous>[LocalVariableDescriptor]

'Test' @ [119:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [121:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'transaction' @ [121:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> IllegalArgumentException /* = IllegalArgumentException */): IllegalArgumentException /* = IllegalArgumentException */ defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IllegalArgumentException

'assertFailsWith' @ [122:13] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'oracle' @ [122:57] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'query' @ [122:64] ==> @Suspendable public final fun query(queries: List<FixOf>): List<Fix> defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [122:70] ==> public fun <T> emptyList(): List<FixOf> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FixOf

'Test' @ [126:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [128:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'transaction' @ [128:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> IllegalArgumentException /* = IllegalArgumentException */): IllegalArgumentException /* = IllegalArgumentException */ defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IllegalArgumentException

'makeFullTx' @ [129:22] ==> private final fun makeFullTx(): TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest[SimpleFunctionDescriptorImpl]

'tx' @ [130:24] ==> val tx: TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest.`refuse to sign with no relevant commands`.<anonymous>[LocalVariableDescriptor]

'toWireTransaction' @ [130:27] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'when (elem) {
                    is TransactionState<ContractState> -> true
                    else -> false
                }' @ [132:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'elem' @ [132:30] ==> value-parameter elem: Any defined in net.corda.irs.api.NodeInterestRatesTest.`refuse to sign with no relevant commands`.<anonymous>.filterAllOutputs[ValueParameterDescriptorImpl]

'wtx1' @ [138:24] ==> val wtx1: WireTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`refuse to sign with no relevant commands`.<anonymous>[LocalVariableDescriptor]

'buildFilteredTransaction' @ [138:29] ==> public final fun buildFilteredTransaction(filtering: Predicate<Any>): FilteredTransaction defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'Predicate' @ [138:54] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (Any) -> Boolean): Predicate<Any> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Any

'filterAllOutputs' @ [138:66] ==> local final fun filterAllOutputs(elem: Any): Boolean defined in net.corda.irs.api.NodeInterestRatesTest.`refuse to sign with no relevant commands`.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFailsWith' @ [139:13] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'oracle' @ [139:57] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'sign' @ [139:64] ==> public final fun sign(ftx: FilteredTransaction): TransactionSignature defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedSimpleFunctionDescriptor]

'ftx1' @ [139:69] ==> val ftx1: FilteredTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`refuse to sign with no relevant commands`.<anonymous>[LocalVariableDescriptor]

'tx' @ [140:13] ==> val tx: TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest.`refuse to sign with no relevant commands`.<anonymous>[LocalVariableDescriptor]

'addCommand' @ [140:16] ==> public final fun addCommand(data: CommandData, vararg keys: PublicKey): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'Move' @ [140:41] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'ALICE_PUBKEY' @ [140:49] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'tx' @ [141:24] ==> val tx: TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest.`refuse to sign with no relevant commands`.<anonymous>[LocalVariableDescriptor]

'toWireTransaction' @ [141:27] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'wtx2' @ [142:24] ==> val wtx2: WireTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`refuse to sign with no relevant commands`.<anonymous>[LocalVariableDescriptor]

'buildFilteredTransaction' @ [142:29] ==> public final fun buildFilteredTransaction(filtering: Predicate<Any>): FilteredTransaction defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'Predicate' @ [142:54] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (Any) -> Boolean): Predicate<Any> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Any

'filterCmds' @ [142:71] ==> public final fun filterCmds(elem: Any): Boolean defined in net.corda.irs.api.NodeInterestRatesTest[SimpleFunctionDescriptorImpl]

'x' @ [142:82] ==> value-parameter x: Any defined in net.corda.irs.api.NodeInterestRatesTest.`refuse to sign with no relevant commands`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertFalse' @ [143:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'wtx1' @ [143:25] ==> val wtx1: WireTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`refuse to sign with no relevant commands`.<anonymous>[LocalVariableDescriptor]

'id' @ [143:30] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'wtx2' @ [143:36] ==> val wtx2: WireTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`refuse to sign with no relevant commands`.<anonymous>[LocalVariableDescriptor]

'id' @ [143:41] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'assertFailsWith' @ [144:13] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'oracle' @ [144:57] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'sign' @ [144:64] ==> public final fun sign(ftx: FilteredTransaction): TransactionSignature defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedSimpleFunctionDescriptor]

'ftx2' @ [144:69] ==> val ftx2: FilteredTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`refuse to sign with no relevant commands`.<anonymous>[LocalVariableDescriptor]

'Test' @ [148:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [150:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'transaction' @ [150:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'makePartialTX' @ [151:22] ==> private final fun makePartialTX(): TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest[SimpleFunctionDescriptorImpl]

'oracle' @ [152:23] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'query' @ [152:30] ==> @Suspendable public final fun query(queries: List<FixOf>): List<Fix> defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedSimpleFunctionDescriptor]

'listOf' @ [152:36] ==> public fun <T> listOf(element: FixOf): List<FixOf> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FixOf

'parseFixOf' @ [152:61] ==> public final fun parseFixOf(key: String): FixOf defined in net.corda.irs.api.NodeInterestRates[DeserializedSimpleFunctionDescriptor]

'first' @ [152:97] ==> public fun <T> List<Fix>.first(): Fix defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Fix

'tx' @ [153:13] ==> val tx: TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest.`sign successfully`.<anonymous>[LocalVariableDescriptor]

'addCommand' @ [153:16] ==> public final fun addCommand(data: CommandData, vararg keys: PublicKey): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'fix' @ [153:27] ==> val fix: Fix defined in net.corda.irs.api.NodeInterestRatesTest.`sign successfully`.<anonymous>[LocalVariableDescriptor]

'oracle' @ [153:32] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'identity' @ [153:39] ==> public final val identity: Party defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedPropertyDescriptor]

'owningKey' @ [153:48] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'tx' @ [155:23] ==> val tx: TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest.`sign successfully`.<anonymous>[LocalVariableDescriptor]

'toWireTransaction' @ [155:26] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'wtx' @ [156:23] ==> val wtx: WireTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`sign successfully`.<anonymous>[LocalVariableDescriptor]

'buildFilteredTransaction' @ [156:27] ==> public final fun buildFilteredTransaction(filtering: Predicate<Any>): FilteredTransaction defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'Predicate' @ [156:52] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (Any) -> Boolean): Predicate<Any> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Any

'fixCmdFilter' @ [156:69] ==> public final fun fixCmdFilter(elem: Any): Boolean defined in net.corda.irs.api.NodeInterestRatesTest[SimpleFunctionDescriptorImpl]

'x' @ [156:82] ==> value-parameter x: Any defined in net.corda.irs.api.NodeInterestRatesTest.`sign successfully`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'oracle' @ [157:29] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'sign' @ [157:36] ==> public final fun sign(ftx: FilteredTransaction): TransactionSignature defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedSimpleFunctionDescriptor]

'ftx' @ [157:41] ==> val ftx: FilteredTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`sign successfully`.<anonymous>[LocalVariableDescriptor]

'wtx' @ [158:13] ==> val wtx: WireTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`sign successfully`.<anonymous>[LocalVariableDescriptor]

'checkSignature' @ [158:17] ==> public final fun checkSignature(sig: TransactionSignature): Unit defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'signature' @ [158:32] ==> val signature: TransactionSignature defined in net.corda.irs.api.NodeInterestRatesTest.`sign successfully`.<anonymous>[LocalVariableDescriptor]

'Test' @ [162:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [164:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'transaction' @ [164:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'makePartialTX' @ [165:22] ==> private final fun makePartialTX(): TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest[SimpleFunctionDescriptorImpl]

'NodeInterestRates' @ [166:25] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'parseFixOf' @ [166:43] ==> public final fun parseFixOf(key: String): FixOf defined in net.corda.irs.api.NodeInterestRates[DeserializedSimpleFunctionDescriptor]

'Fix' @ [167:26] ==> public constructor Fix(of: FixOf, value: BigDecimal) defined in net.corda.finance.contracts.Fix[DeserializedClassConstructorDescriptor]

'fixOf' @ [167:30] ==> val fixOf: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign with unknown fix`.<anonymous>[LocalVariableDescriptor]

'BigDecimal' @ [167:37] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'tx' @ [168:13] ==> val tx: TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign with unknown fix`.<anonymous>[LocalVariableDescriptor]

'addCommand' @ [168:16] ==> public final fun addCommand(data: CommandData, vararg keys: PublicKey): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'badFix' @ [168:27] ==> val badFix: Fix defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign with unknown fix`.<anonymous>[LocalVariableDescriptor]

'oracle' @ [168:35] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'identity' @ [168:42] ==> public final val identity: Party defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedPropertyDescriptor]

'owningKey' @ [168:51] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'tx' @ [169:23] ==> val tx: TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign with unknown fix`.<anonymous>[LocalVariableDescriptor]

'toWireTransaction' @ [169:26] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'wtx' @ [170:23] ==> val wtx: WireTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign with unknown fix`.<anonymous>[LocalVariableDescriptor]

'buildFilteredTransaction' @ [170:27] ==> public final fun buildFilteredTransaction(filtering: Predicate<Any>): FilteredTransaction defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'Predicate' @ [170:52] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (Any) -> Boolean): Predicate<Any> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Any

'fixCmdFilter' @ [170:69] ==> public final fun fixCmdFilter(elem: Any): Boolean defined in net.corda.irs.api.NodeInterestRatesTest[SimpleFunctionDescriptorImpl]

'x' @ [170:82] ==> value-parameter x: Any defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign with unknown fix`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertFailsWith' @ [171:22] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): NodeInterestRates.UnknownFix defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> UnknownFix

'oracle' @ [171:70] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'sign' @ [171:77] ==> public final fun sign(ftx: FilteredTransaction): TransactionSignature defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedSimpleFunctionDescriptor]

'ftx' @ [171:82] ==> val ftx: FilteredTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign with unknown fix`.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [172:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: FixOf, actual: FixOf, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> FixOf

'fixOf' @ [172:26] ==> val fixOf: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign with unknown fix`.<anonymous>[LocalVariableDescriptor]

'e1' @ [172:33] ==> val e1: NodeInterestRates.UnknownFix defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign with unknown fix`.<anonymous>[LocalVariableDescriptor]

'fix' @ [172:36] ==> public final val fix: FixOf defined in net.corda.irs.api.NodeInterestRates.UnknownFix[DeserializedPropertyDescriptor]

'Test' @ [176:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [178:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'transaction' @ [178:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> IllegalArgumentException /* = IllegalArgumentException */): IllegalArgumentException /* = IllegalArgumentException */ defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IllegalArgumentException

'makePartialTX' @ [179:22] ==> private final fun makePartialTX(): TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest[SimpleFunctionDescriptorImpl]

'oracle' @ [180:23] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'query' @ [180:30] ==> @Suspendable public final fun query(queries: List<FixOf>): List<Fix> defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedSimpleFunctionDescriptor]

'listOf' @ [180:36] ==> public fun <T> listOf(element: FixOf): List<FixOf> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FixOf

'parseFixOf' @ [180:61] ==> public final fun parseFixOf(key: String): FixOf defined in net.corda.irs.api.NodeInterestRates[DeserializedSimpleFunctionDescriptor]

'first' @ [180:97] ==> public fun <T> List<Fix>.first(): Fix defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Fix

'when (elem) {
                    is Command<*> -> oracle.identity.owningKey in elem.signers && elem.value is Fix
                    is TransactionState<ContractState> -> true
                    else -> false
                }' @ [182:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'elem' @ [182:30] ==> value-parameter elem: Any defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign too many leaves`.<anonymous>.filtering[ValueParameterDescriptorImpl]

'oracle' @ [183:38] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'identity' @ [183:45] ==> public final val identity: Party defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedPropertyDescriptor]

'owningKey' @ [183:54] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'elem' @ [183:67] ==> value-parameter elem: Any defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign too many leaves`.<anonymous>.filtering[ValueParameterDescriptorImpl]

'signers' @ [183:72] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'elem' @ [183:83] ==> value-parameter elem: Any defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign too many leaves`.<anonymous>.filtering[ValueParameterDescriptorImpl]

'value' @ [183:88] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'tx' @ [188:13] ==> val tx: TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign too many leaves`.<anonymous>[LocalVariableDescriptor]

'addCommand' @ [188:16] ==> public final fun addCommand(data: CommandData, vararg keys: PublicKey): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'fix' @ [188:27] ==> val fix: Fix defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign too many leaves`.<anonymous>[LocalVariableDescriptor]

'oracle' @ [188:32] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'identity' @ [188:39] ==> public final val identity: Party defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedPropertyDescriptor]

'owningKey' @ [188:48] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'tx' @ [189:23] ==> val tx: TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign too many leaves`.<anonymous>[LocalVariableDescriptor]

'toWireTransaction' @ [189:26] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'wtx' @ [190:23] ==> val wtx: WireTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign too many leaves`.<anonymous>[LocalVariableDescriptor]

'buildFilteredTransaction' @ [190:27] ==> public final fun buildFilteredTransaction(filtering: Predicate<Any>): FilteredTransaction defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'Predicate' @ [190:52] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (Any) -> Boolean): Predicate<Any> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Any

'filtering' @ [190:64] ==> local final fun filtering(elem: Any): Boolean defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign too many leaves`.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFailsWith' @ [191:13] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'oracle' @ [191:57] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'sign' @ [191:64] ==> public final fun sign(ftx: FilteredTransaction): TransactionSignature defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedSimpleFunctionDescriptor]

'ftx' @ [191:69] ==> val ftx: FilteredTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`do not sign too many leaves`.<anonymous>[LocalVariableDescriptor]

'Test' @ [195:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeFullTx' @ [197:18] ==> private final fun makeFullTx(): TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest[SimpleFunctionDescriptorImpl]

'tx' @ [198:19] ==> val tx: TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest.`empty partial transaction to sign`[LocalVariableDescriptor]

'toWireTransaction' @ [198:22] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'wtx' @ [199:19] ==> val wtx: WireTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`empty partial transaction to sign`[LocalVariableDescriptor]

'buildFilteredTransaction' @ [199:23] ==> public final fun buildFilteredTransaction(filtering: Predicate<Any>): FilteredTransaction defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'Predicate' @ [199:48] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (Any) -> Boolean): Predicate<Any> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Any

'assertFailsWith' @ [200:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): MerkleTreeException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> MerkleTreeException

'oracle' @ [200:48] ==> public final lateinit var oracle: NodeInterestRates.Oracle defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'sign' @ [200:55] ==> public final fun sign(ftx: FilteredTransaction): TransactionSignature defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedSimpleFunctionDescriptor]

'ftx' @ [200:60] ==> val ftx: FilteredTransaction defined in net.corda.irs.api.NodeInterestRatesTest.`empty partial transaction to sign`[LocalVariableDescriptor]

'Test' @ [203:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'MockNetwork' @ [205:23] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'mockNet' @ [206:18] ==> val mockNet: MockNetwork defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'createNotaryNode' @ [206:26] ==> public final fun createNotaryNode(networkMapAddress: SingleMessageRecipient? = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., serviceName: X500Name? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'mockNet' @ [207:18] ==> val mockNet: MockNetwork defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'createNode' @ [207:26] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'n1' @ [207:37] ==> val n1: MockNetwork.MockNode defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'network' @ [207:40] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [207:48] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'ServiceInfo' @ [207:80] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'type' @ [207:117] ==> @field:JvmField public final val type: ServiceType defined in net.corda.irs.api.NodeInterestRates.Oracle.Companion[DeserializedPropertyDescriptor]

'n2' @ [208:9] ==> val n2: MockNetwork.MockNode defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'registerInitiatedFlow' @ [208:12] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<NodeInterestRates.FixQueryHandler>): Observable<NodeInterestRates.FixQueryHandler> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> FixQueryHandler

'NodeInterestRates' @ [208:34] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'FixQueryHandler' @ [208:52] ==> public constructor FixQueryHandler(otherParty: Party) defined in net.corda.irs.api.NodeInterestRates.FixQueryHandler[DeserializedClassConstructorDescriptor]

'java' @ [208:75] ==> public val <T> KClass<NodeInterestRates.FixQueryHandler>.java: Class<NodeInterestRates.FixQueryHandler> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FixQueryHandler

'n2' @ [209:9] ==> val n2: MockNetwork.MockNode defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'registerInitiatedFlow' @ [209:12] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<NodeInterestRates.FixSignHandler>): Observable<NodeInterestRates.FixSignHandler> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> FixSignHandler

'NodeInterestRates' @ [209:34] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'FixSignHandler' @ [209:52] ==> public constructor FixSignHandler(otherParty: Party) defined in net.corda.irs.api.NodeInterestRates.FixSignHandler[DeserializedClassConstructorDescriptor]

'java' @ [209:74] ==> public val <T> KClass<NodeInterestRates.FixSignHandler>.java: Class<NodeInterestRates.FixSignHandler> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FixSignHandler

'n2' @ [210:9] ==> val n2: MockNetwork.MockNode defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'database' @ [210:12] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [210:21] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'n2' @ [211:13] ==> val n2: MockNetwork.MockNode defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'installCordaService' @ [211:16] ==> public final fun <T : SerializeAsToken> installCordaService(serviceClass: Class<NodeInterestRates.Oracle>): NodeInterestRates.Oracle defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : SerializeAsToken> -> Oracle

'NodeInterestRates' @ [211:36] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'Oracle' @ [211:54] ==> public companion object defined in net.corda.irs.api.NodeInterestRates.Oracle[FakeCallableDescriptorForObject]

'java' @ [211:68] ==> public val <T> KClass<NodeInterestRates.Oracle>.java: Class<NodeInterestRates.Oracle> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Oracle

'knownFixes' @ [211:74] ==> public final var knownFixes: NodeInterestRates.FixContainer defined in net.corda.irs.api.NodeInterestRates.Oracle[DeserializedPropertyDescriptor]

'TEST_DATA' @ [211:87] ==> public final val TEST_DATA: NodeInterestRates.FixContainer defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'makePartialTX' @ [213:18] ==> private final fun makePartialTX(): TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest[SimpleFunctionDescriptorImpl]

'NodeInterestRates' @ [214:21] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'parseFixOf' @ [214:39] ==> public final fun parseFixOf(key: String): FixOf defined in net.corda.irs.api.NodeInterestRates[DeserializedSimpleFunctionDescriptor]

'n2' @ [215:22] ==> val n2: MockNetwork.MockNode defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'info' @ [215:25] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'serviceIdentities' @ [215:30] ==> public final fun serviceIdentities(type: ServiceType): List<Party> defined in net.corda.core.node.NodeInfo[DeserializedSimpleFunctionDescriptor]

'type' @ [215:73] ==> @field:JvmField public final val type: ServiceType defined in net.corda.irs.api.NodeInterestRates.Oracle.Companion[DeserializedPropertyDescriptor]

'first' @ [215:79] ==> public fun <T> List<Party>.first(): Party defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'FilteredRatesFlow' @ [216:20] ==> public constructor FilteredRatesFlow(tx: TransactionBuilder, oracle: Party, fixOf: FixOf, expectedRate: BigDecimal, rateTolerance: BigDecimal, progressTracker: ProgressTracker = ...) defined in net.corda.irs.api.NodeInterestRatesTest.FilteredRatesFlow[ClassConstructorDescriptorImpl]

'tx' @ [216:38] ==> val tx: TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'oracle' @ [216:42] ==> val oracle: Party defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'fixOf' @ [216:50] ==> val fixOf: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'BigDecimal' @ [216:57] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'BigDecimal' @ [216:78] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'LogHelper' @ [217:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'setLevel' @ [217:19] ==> public final fun setLevel(vararg loggerNames: String): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'mockNet' @ [218:9] ==> val mockNet: MockNetwork defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'runNetwork' @ [218:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'n1' @ [219:22] ==> val n1: MockNetwork.MockNode defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'services' @ [219:25] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [219:34] ==> public open fun <T> startFlow(logic: FlowLogic<TransactionSignature>): FlowStateMachine<TransactionSignature> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'flow' @ [219:44] ==> val flow: NodeInterestRatesTest.FilteredRatesFlow defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'resultFuture' @ [219:50] ==> public abstract val resultFuture: CordaFuture<TransactionSignature> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [220:9] ==> val mockNet: MockNetwork defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'runNetwork' @ [220:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'future' @ [221:9] ==> val future: CordaFuture<TransactionSignature> defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'getOrThrow' @ [221:16] ==> public fun <V> Future<TransactionSignature>.getOrThrow(timeout: Duration? = ...): TransactionSignature defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> TransactionSignature

'tx' @ [223:19] ==> val tx: TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'toWireTransaction' @ [223:22] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'commands' @ [223:42] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'map' @ [223:51] ==> public inline fun <T, R> Iterable<Command<*>>.map(transform: (Command<*>) -> Fix): List<Fix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>
    <R> -> Fix

'it' @ [223:57] ==> value-parameter it: Command<*> defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [223:60] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'first' @ [223:75] ==> public fun <T> List<Fix>.first(): Fix defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Fix

'assertEquals' @ [224:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: FixOf, actual: FixOf, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> FixOf

'fixOf' @ [224:22] ==> val fixOf: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'fix' @ [224:29] ==> val fix: Fix defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'of' @ [224:33] ==> public final val of: FixOf defined in net.corda.finance.contracts.Fix[DeserializedPropertyDescriptor]

'assertEquals' @ [225:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal, actual: BigDecimal, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal

'BigDecimal' @ [225:22] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'fix' @ [225:43] ==> val fix: Fix defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'value' @ [225:47] ==> public final val value: BigDecimal defined in net.corda.finance.contracts.Fix[DeserializedPropertyDescriptor]

'mockNet' @ [226:9] ==> val mockNet: MockNetwork defined in net.corda.irs.api.NodeInterestRatesTest.`network tearoff`[LocalVariableDescriptor]

'stopNodes' @ [226:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'RatesFixFlow' @ [234:64] ==> public companion object defined in net.corda.irs.flows.RatesFixFlow[FakeCallableDescriptorForObject]

'tracker' @ [234:77] ==> public final fun tracker(fixName: String): ProgressTracker defined in net.corda.irs.flows.RatesFixFlow.Companion[DeserializedSimpleFunctionDescriptor]

'fixOf' @ [234:85] ==> value-parameter fixOf: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.FilteredRatesFlow.<init>[ValueParameterDescriptorImpl]

'name' @ [234:91] ==> public final val name: String defined in net.corda.finance.contracts.FixOf[DeserializedPropertyDescriptor]

'RatesFixFlow' @ [235:11] ==> public constructor RatesFixFlow(tx: TransactionBuilder, oracle: Party, fixOf: FixOf, expectedRate: BigDecimal, rateTolerance: BigDecimal, progressTracker: ProgressTracker = ...) defined in net.corda.irs.flows.RatesFixFlow[DeserializedClassConstructorDescriptor]

'tx' @ [235:24] ==> value-parameter tx: TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest.FilteredRatesFlow.<init>[ValueParameterDescriptorImpl]

'oracle' @ [235:28] ==> value-parameter oracle: Party defined in net.corda.irs.api.NodeInterestRatesTest.FilteredRatesFlow.<init>[ValueParameterDescriptorImpl]

'fixOf' @ [235:36] ==> value-parameter fixOf: FixOf defined in net.corda.irs.api.NodeInterestRatesTest.FilteredRatesFlow.<init>[ValueParameterDescriptorImpl]

'expectedRate' @ [235:43] ==> value-parameter expectedRate: BigDecimal defined in net.corda.irs.api.NodeInterestRatesTest.FilteredRatesFlow.<init>[ValueParameterDescriptorImpl]

'rateTolerance' @ [235:57] ==> value-parameter rateTolerance: BigDecimal defined in net.corda.irs.api.NodeInterestRatesTest.FilteredRatesFlow.<init>[ValueParameterDescriptorImpl]

'progressTracker' @ [235:72] ==> value-parameter progressTracker: ProgressTracker = ... defined in net.corda.irs.api.NodeInterestRatesTest.FilteredRatesFlow.<init>[ValueParameterDescriptorImpl]

'when (elem) {
                is Command<*> -> oracle.owningKey in elem.signers && elem.value is Fix
                else -> false
            }' @ [237:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'elem' @ [237:26] ==> value-parameter elem: Any defined in net.corda.irs.api.NodeInterestRatesTest.FilteredRatesFlow.filtering[ValueParameterDescriptorImpl]

'oracle' @ [238:34] ==> protected final val oracle: Party defined in net.corda.irs.api.NodeInterestRatesTest.FilteredRatesFlow[DeserializedPropertyDescriptor]

'owningKey' @ [238:41] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'elem' @ [238:54] ==> value-parameter elem: Any defined in net.corda.irs.api.NodeInterestRatesTest.FilteredRatesFlow.filtering[ValueParameterDescriptorImpl]

'signers' @ [238:59] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'elem' @ [238:70] ==> value-parameter elem: Any defined in net.corda.irs.api.NodeInterestRatesTest.FilteredRatesFlow.filtering[ValueParameterDescriptorImpl]

'value' @ [238:75] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [244:35] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [244:54] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'withItems' @ [244:68] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [245:9] ==> public infix fun Cash.State.`issued by`(party: AbstractParty): Cash.State defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [245:14] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'CASH' @ [245:22] ==> public val Amount<Currency>.CASH: Cash.State defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'DUMMY_CASH_ISSUER' @ [245:39] ==> public final val DUMMY_CASH_ISSUER: Party defined in net.corda.irs.api.NodeInterestRatesTest[PropertyDescriptorImpl]

'ALICE' @ [245:68] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [245:88] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'makePartialTX' @ [247:32] ==> private final fun makePartialTX(): TransactionBuilder defined in net.corda.irs.api.NodeInterestRatesTest[SimpleFunctionDescriptorImpl]

'withItems' @ [247:48] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [247:58] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

