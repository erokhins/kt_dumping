'verifies' @ [40:13] ==> public abstract fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.Verifies[SimpleFunctionDescriptorImpl]

'expectedMessage' @ [43:17] ==> value-parameter expectedMessage: String? defined in net.corda.testing.Verifies.failsWith[ValueParameterDescriptorImpl]

'exception' @ [44:40] ==> val exception: Exception /* = Exception */ defined in net.corda.testing.Verifies.failsWith[LocalVariableDescriptor]

'message' @ [44:50] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'if (exceptionMessage == null) {
                    throw AssertionError(
                            "Expected exception containing '$expectedMessage' but raised exception had no message",
                            exception
                    )
                } else if (!exceptionMessage.toLowerCase().contains(expectedMessage.toLowerCase())) {
                    throw AssertionError(
                            "Expected exception containing '$expectedMessage' but raised exception was '$exception'",
                            exception
                    )
                }' @ [45:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'exceptionMessage' @ [45:21] ==> val exceptionMessage: String? defined in net.corda.testing.Verifies.failsWith[LocalVariableDescriptor]

'AssertionError' @ [46:27] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'expectedMessage' @ [47:62] ==> value-parameter expectedMessage: String? defined in net.corda.testing.Verifies.failsWith[ValueParameterDescriptorImpl]

'exception' @ [48:29] ==> val exception: Exception /* = Exception */ defined in net.corda.testing.Verifies.failsWith[LocalVariableDescriptor]

'!' @ [50:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'exceptionMessage' @ [50:29] ==> val exceptionMessage: String? defined in net.corda.testing.Verifies.failsWith[LocalVariableDescriptor]

'toLowerCase' @ [50:46] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'contains' @ [50:60] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expectedMessage' @ [50:69] ==> value-parameter expectedMessage: String? defined in net.corda.testing.Verifies.failsWith[ValueParameterDescriptorImpl]

'toLowerCase' @ [50:85] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'AssertionError' @ [51:27] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'expectedMessage' @ [52:62] ==> value-parameter expectedMessage: String? defined in net.corda.testing.Verifies.failsWith[ValueParameterDescriptorImpl]

'exception' @ [52:106] ==> val exception: Exception /* = Exception */ defined in net.corda.testing.Verifies.failsWith[LocalVariableDescriptor]

'exception' @ [53:29] ==> val exception: Exception /* = Exception */ defined in net.corda.testing.Verifies.failsWith[LocalVariableDescriptor]

'!' @ [60:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'exceptionThrown' @ [60:14] ==> val exceptionThrown: Boolean defined in net.corda.testing.Verifies.failsWith[LocalVariableDescriptor]

'AssertionError' @ [61:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'Token' @ [64:36] ==> internal object Token : EnforceVerifyOrFail defined in net.corda.testing.EnforceVerifyOrFail[FakeCallableDescriptorForObject]

'failsWith' @ [70:19] ==> public open fun failsWith(expectedMessage: String?): EnforceVerifyOrFail defined in net.corda.testing.Verifies[SimpleFunctionDescriptorImpl]

'failsWith' @ [75:43] ==> public open fun failsWith(expectedMessage: String?): EnforceVerifyOrFail defined in net.corda.testing.Verifies[SimpleFunctionDescriptorImpl]

'msg' @ [75:53] ==> value-parameter msg: String defined in net.corda.testing.Verifies.`fails with`[ValueParameterDescriptorImpl]

'interpreter' @ [127:60] ==> value-parameter interpreter: L defined in net.corda.testing.LedgerDSL.<init>[ValueParameterDescriptorImpl]

'JvmOverloads' @ [132:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'TransactionBuilder' @ [133:85] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [133:113] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'_transaction' @ [135:13] ==> public open fun _transaction(transactionLabel: String?, transactionBuilder: TransactionBuilder, dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[SimpleFunctionDescriptorImpl]

'label' @ [135:26] ==> value-parameter label: String? = ... defined in net.corda.testing.LedgerDSL.transaction[ValueParameterDescriptorImpl]

'transactionBuilder' @ [135:33] ==> value-parameter transactionBuilder: TransactionBuilder = ... defined in net.corda.testing.LedgerDSL.transaction[ValueParameterDescriptorImpl]

'dsl' @ [135:53] ==> value-parameter dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail defined in net.corda.testing.LedgerDSL.transaction[ValueParameterDescriptorImpl]

'JvmOverloads' @ [140:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'TransactionBuilder' @ [141:95] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [141:123] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'_unverifiedTransaction' @ [143:13] ==> public open fun _unverifiedTransaction(transactionLabel: String?, transactionBuilder: TransactionBuilder, dsl: TransactionDSL<TransactionDSLInterpreter>.() -> Unit): WireTransaction defined in net.corda.testing.LedgerDSL[SimpleFunctionDescriptorImpl]

'label' @ [143:36] ==> value-parameter label: String? = ... defined in net.corda.testing.LedgerDSL.unverifiedTransaction[ValueParameterDescriptorImpl]

'transactionBuilder' @ [143:43] ==> value-parameter transactionBuilder: TransactionBuilder = ... defined in net.corda.testing.LedgerDSL.unverifiedTransaction[ValueParameterDescriptorImpl]

'dsl' @ [143:63] ==> value-parameter dsl: TransactionDSL<TransactionDSLInterpreter>.() -> Unit defined in net.corda.testing.LedgerDSL.unverifiedTransaction[ValueParameterDescriptorImpl]

'retrieveOutputStateAndRef' @ [149:13] ==> public open fun <S : ContractState> retrieveOutputStateAndRef(clazz: Class<S>, label: String): StateAndRef<S> defined in net.corda.testing.LedgerDSL[SimpleFunctionDescriptorImpl]
Inferred types:
    <S : ContractState> -> S

'java' @ [149:48] ==> public val <T> KClass<S>.java: Class<S> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> S

'this' @ [149:54] ==> <this> defined in net.corda.testing.LedgerDSL.outputStateAndRef[ReceiverParameterDescriptorImpl]

'outputStateAndRef' @ [156:13] ==> public final inline fun <reified S : ContractState> String.outputStateAndRef(): StateAndRef<S> defined in net.corda.testing.LedgerDSL[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified S : ContractState> -> S

'state' @ [156:36] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [156:42] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'retrieveOutputStateAndRef' @ [162:13] ==> public open fun <S : ContractState> retrieveOutputStateAndRef(clazz: Class<S>, label: String): StateAndRef<S> defined in net.corda.testing.LedgerDSL[SimpleFunctionDescriptorImpl]
Inferred types:
    <S : ContractState> -> S

'clazz' @ [162:39] ==> value-parameter clazz: Class<S> defined in net.corda.testing.LedgerDSL.retrieveOutput[ValueParameterDescriptorImpl]

'label' @ [162:46] ==> value-parameter label: String defined in net.corda.testing.LedgerDSL.retrieveOutput[ValueParameterDescriptorImpl]

'state' @ [162:53] ==> public final val state: TransactionState<S> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [162:59] ==> public final val data: S defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

