'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'Suppress' @ [22:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'!' @ [24:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expr' @ [24:14] ==> value-parameter expr: Boolean defined in net.corda.core.contracts.Requirements.using[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [24:26] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'this' @ [24:73] ==> <this> defined in net.corda.core.contracts.Requirements.using[ReceiverParameterDescriptorImpl]

'Requirements' @ [28:58] ==> public object Requirements defined in net.corda.core.contracts in file ContractsDSL.kt[FakeCallableDescriptorForObject]

'invoke' @ [28:71] ==> public abstract operator fun Requirements.invoke(): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'filter' @ [37:9] ==> public inline fun <T> Iterable<AuthenticatedObject<CommandData>>.filter(predicate: (AuthenticatedObject<CommandData>) -> Boolean): List<AuthenticatedObject<CommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>

'it' @ [37:18] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.select.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [37:21] ==> public final val value: CommandData defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'filter' @ [38:17] ==> public inline fun <T> Iterable<AuthenticatedObject<CommandData>>.filter(predicate: (AuthenticatedObject<CommandData>) -> Boolean): List<AuthenticatedObject<CommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>

'if (signer == null) true else signer in it.signers' @ [38:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'signer' @ [38:30] ==> value-parameter signer: PublicKey? = ... defined in net.corda.core.contracts.select[ValueParameterDescriptorImpl]

'signer' @ [38:56] ==> value-parameter signer: PublicKey? = ... defined in net.corda.core.contracts.select[ValueParameterDescriptorImpl]

'it' @ [38:66] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.select.<anonymous>[ValueParameterDescriptorImpl]

'signers' @ [38:69] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'filter' @ [39:17] ==> public inline fun <T> Iterable<AuthenticatedObject<CommandData>>.filter(predicate: (AuthenticatedObject<CommandData>) -> Boolean): List<AuthenticatedObject<CommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>

'if (party == null) true else party in it.signingParties' @ [39:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'party' @ [39:30] ==> value-parameter party: AbstractParty? = ... defined in net.corda.core.contracts.select[ValueParameterDescriptorImpl]

'party' @ [39:55] ==> value-parameter party: AbstractParty? = ... defined in net.corda.core.contracts.select[ValueParameterDescriptorImpl]

'it' @ [39:64] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.select.<anonymous>[ValueParameterDescriptorImpl]

'signingParties' @ [39:67] ==> public final val signingParties: List<Party> defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'map' @ [40:17] ==> public inline fun <T, R> Iterable<AuthenticatedObject<CommandData>>.map(transform: (AuthenticatedObject<CommandData>) -> AuthenticatedObject<T>): List<AuthenticatedObject<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>
    <R> -> AuthenticatedObject<T>

'AuthenticatedObject' @ [40:23] ==> public constructor AuthenticatedObject<out T : Any>(signers: List<PublicKey>, signingParties: List<Party>, value: T) defined in net.corda.core.contracts.AuthenticatedObject[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Any> -> T

'it' @ [40:43] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.select.<anonymous>[ValueParameterDescriptorImpl]

'signers' @ [40:46] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'it' @ [40:55] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.select.<anonymous>[ValueParameterDescriptorImpl]

'signingParties' @ [40:58] ==> public final val signingParties: List<Party> defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'it' @ [40:74] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.select.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [40:77] ==> public final val value: CommandData defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'filter' @ [47:9] ==> public inline fun <T> Iterable<AuthenticatedObject<CommandData>>.filter(predicate: (AuthenticatedObject<CommandData>) -> Boolean): List<AuthenticatedObject<CommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>

'it' @ [47:18] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.select.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [47:21] ==> public final val value: CommandData defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'filter' @ [48:17] ==> public inline fun <T> Iterable<AuthenticatedObject<CommandData>>.filter(predicate: (AuthenticatedObject<CommandData>) -> Boolean): List<AuthenticatedObject<CommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>

'if (signers == null) true else it.signers.containsAll(signers)' @ [48:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'signers' @ [48:30] ==> value-parameter signers: Collection<PublicKey>? defined in net.corda.core.contracts.select[ValueParameterDescriptorImpl]

'it' @ [48:57] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.select.<anonymous>[ValueParameterDescriptorImpl]

'signers' @ [48:60] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'containsAll' @ [48:68] ==> public abstract fun containsAll(elements: Collection<PublicKey>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'signers' @ [48:80] ==> value-parameter signers: Collection<PublicKey>? defined in net.corda.core.contracts.select[ValueParameterDescriptorImpl]

'filter' @ [49:17] ==> public inline fun <T> Iterable<AuthenticatedObject<CommandData>>.filter(predicate: (AuthenticatedObject<CommandData>) -> Boolean): List<AuthenticatedObject<CommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>

'if (parties == null) true else it.signingParties.containsAll(parties)' @ [49:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'parties' @ [49:30] ==> value-parameter parties: Collection<Party>? defined in net.corda.core.contracts.select[ValueParameterDescriptorImpl]

'it' @ [49:57] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.select.<anonymous>[ValueParameterDescriptorImpl]

'signingParties' @ [49:60] ==> public final val signingParties: List<Party> defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'containsAll' @ [49:75] ==> public abstract fun containsAll(elements: Collection<Party>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'parties' @ [49:87] ==> value-parameter parties: Collection<Party>? defined in net.corda.core.contracts.select[ValueParameterDescriptorImpl]

'map' @ [50:17] ==> public inline fun <T, R> Iterable<AuthenticatedObject<CommandData>>.map(transform: (AuthenticatedObject<CommandData>) -> AuthenticatedObject<T>): List<AuthenticatedObject<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>
    <R> -> AuthenticatedObject<T>

'AuthenticatedObject' @ [50:23] ==> public constructor AuthenticatedObject<out T : Any>(signers: List<PublicKey>, signingParties: List<Party>, value: T) defined in net.corda.core.contracts.AuthenticatedObject[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Any> -> T

'it' @ [50:43] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.select.<anonymous>[ValueParameterDescriptorImpl]

'signers' @ [50:46] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'it' @ [50:55] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.select.<anonymous>[ValueParameterDescriptorImpl]

'signingParties' @ [50:58] ==> public final val signingParties: List<Party> defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'it' @ [50:74] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.select.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [50:77] ==> public final val value: CommandData defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'select' @ [54:5] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<T>> defined in net.corda.core.contracts[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : CommandData> -> T

'single' @ [54:17] ==> public fun <T> List<AuthenticatedObject<T>>.single(): AuthenticatedObject<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<T>

'IllegalStateException' @ [56:11] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'qualifiedName' @ [56:54] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'mapNotNull' @ [61:9] ==> public inline fun <T, R : Any> Iterable<AuthenticatedObject<CommandData>>.mapNotNull(transform: (AuthenticatedObject<CommandData>) -> AuthenticatedObject<C>?): List<AuthenticatedObject<C>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>
    <R : Any> -> AuthenticatedObject<C>

'Suppress' @ [61:22] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (klass.isInstance(it.value)) it as AuthenticatedObject<C> else null' @ [61:50] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AuthenticatedObject<C>?, elseBranch: AuthenticatedObject<C>?): AuthenticatedObject<C>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AuthenticatedObject<C>?

'klass' @ [61:54] ==> value-parameter klass: Class<C> defined in net.corda.core.contracts.requireSingleCommand[ValueParameterDescriptorImpl]

'isInstance' @ [61:60] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [61:71] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.requireSingleCommand.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [61:74] ==> public final val value: CommandData defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'it' @ [61:82] ==> value-parameter it: AuthenticatedObject<CommandData> defined in net.corda.core.contracts.requireSingleCommand.<anonymous>[ValueParameterDescriptorImpl]

'single' @ [61:123] ==> public fun <T> List<AuthenticatedObject<C>>.single(): AuthenticatedObject<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<C>

'Throws' @ [68:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IllegalArgumentException' @ [68:9] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'inputs' @ [75:25] ==> value-parameter inputs: List<OwnableState> defined in net.corda.core.contracts.verifyMoveCommand[ValueParameterDescriptorImpl]

'map' @ [75:32] ==> public inline fun <T, R> Iterable<OwnableState>.map(transform: (OwnableState) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OwnableState
    <R> -> PublicKey

'it' @ [75:38] ==> value-parameter it: OwnableState defined in net.corda.core.contracts.verifyMoveCommand.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [75:41] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.OwnableState[PropertyDescriptorImpl]

'owningKey' @ [75:47] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[PropertyDescriptorImpl]

'toSet' @ [75:59] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'commands' @ [76:19] ==> value-parameter commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.contracts.verifyMoveCommand[ValueParameterDescriptorImpl]

'requireSingleCommand' @ [76:28] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.requireSingleCommand(): AuthenticatedObject<T> defined in net.corda.core.contracts[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : CommandData> -> T

'command' @ [77:26] ==> val command: AuthenticatedObject<T> defined in net.corda.core.contracts.verifyMoveCommand[LocalVariableDescriptor]

'signers' @ [77:34] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'toSet' @ [77:42] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'requireThat' @ [78:5] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit

'using' @ [79:9] ==> @Suppress public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[SimpleFunctionDescriptorImpl]

'keysThatSigned' @ [79:66] ==> val keysThatSigned: Set<PublicKey> defined in net.corda.core.contracts.verifyMoveCommand[LocalVariableDescriptor]

'containsAll' @ [79:81] ==> public abstract fun containsAll(elements: Collection<PublicKey>): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'owningPubKeys' @ [79:93] ==> val owningPubKeys: Set<PublicKey> defined in net.corda.core.contracts.verifyMoveCommand[LocalVariableDescriptor]

'command' @ [81:12] ==> val command: AuthenticatedObject<T> defined in net.corda.core.contracts.verifyMoveCommand[LocalVariableDescriptor]

'value' @ [81:20] ==> public final val value: T defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

