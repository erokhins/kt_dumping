'Suppress' @ [25:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'FlowLogic<String>' @ [26:34] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> String

'this' @ [27:31] ==> public constructor FlowA(a: String) defined in net.corda.node.InteractiveShellTest.FlowA[ClassConstructorDescriptorImpl]

'b' @ [27:36] ==> value-parameter b: Int defined in net.corda.node.InteractiveShellTest.FlowA.<init>[ValueParameterDescriptorImpl]

'toString' @ [27:38] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'this' @ [28:42] ==> public constructor FlowA(a: String) defined in net.corda.node.InteractiveShellTest.FlowA[ClassConstructorDescriptorImpl]

'b' @ [28:47] ==> value-parameter b: Int defined in net.corda.node.InteractiveShellTest.FlowA.<init>[ValueParameterDescriptorImpl]

'toString' @ [28:49] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'c' @ [28:62] ==> value-parameter c: String defined in net.corda.node.InteractiveShellTest.FlowA.<init>[ValueParameterDescriptorImpl]

'this' @ [29:49] ==> public constructor FlowA(a: String) defined in net.corda.node.InteractiveShellTest.FlowA[ClassConstructorDescriptorImpl]

'amount' @ [29:54] ==> value-parameter amount: Amount<Currency> defined in net.corda.node.InteractiveShellTest.FlowA.<init>[ValueParameterDescriptorImpl]

'toString' @ [29:61] ==> public open fun toString(): String defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'this' @ [30:72] ==> public constructor FlowA(a: String) defined in net.corda.node.InteractiveShellTest.FlowA[ClassConstructorDescriptorImpl]

'pair' @ [30:77] ==> value-parameter pair: Pair<Amount<Currency>, SecureHash.SHA256> defined in net.corda.node.InteractiveShellTest.FlowA.<init>[ValueParameterDescriptorImpl]

'toString' @ [30:82] ==> public open fun toString(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'this' @ [31:37] ==> public constructor FlowA(a: String) defined in net.corda.node.InteractiveShellTest.FlowA[ClassConstructorDescriptorImpl]

'party' @ [31:42] ==> value-parameter party: Party defined in net.corda.node.InteractiveShellTest.FlowA.<init>[ValueParameterDescriptorImpl]

'name' @ [31:48] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toString' @ [31:53] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'a' @ [33:31] ==> public final val a: String defined in net.corda.node.InteractiveShellTest.FlowA[PropertyDescriptorImpl]

'InMemoryIdentityService' @ [36:23] ==> public constructor InMemoryIdentityService(wellKnownIdentities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509CertificateHolder) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'listOf' @ [36:47] ==> public fun <T> listOf(element: PartyAndCertificate): List<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'MEGA_CORP_IDENTITY' @ [36:54] ==> public val MEGA_CORP_IDENTITY: PartyAndCertificate defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_CA' @ [36:87] ==> public val DUMMY_CA: CertificateAndKeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'certificate' @ [36:96] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'JacksonSupport' @ [37:22] ==> public object JacksonSupport defined in net.corda.jackson[FakeCallableDescriptorForObject]

'createInMemoryMapper' @ [37:37] ==> @JvmStatic @JvmOverloads public final fun createInMemoryMapper(identityService: IdentityService, factory: JsonFactory = ..., fuzzyIdentityMatch: Boolean = ...): ObjectMapper defined in net.corda.jackson.JacksonSupport[DeserializedSimpleFunctionDescriptor]

'ids' @ [37:58] ==> private final val ids: InMemoryIdentityService defined in net.corda.node.InteractiveShellTest[PropertyDescriptorImpl]

'YAMLFactory' @ [37:63] ==> public constructor YAMLFactory() defined in com.fasterxml.jackson.dataformat.yaml.YAMLFactory[JavaClassConstructorDescriptor]

'InteractiveShell' @ [41:9] ==> public object InteractiveShell defined in net.corda.node.shell[FakeCallableDescriptorForObject]

'runFlowFromString' @ [41:26] ==> public final fun runFlowFromString(invoke: (FlowLogic<*>) -> FlowStateMachine<*>, inputData: String, clazz: Class<out FlowLogic<*>>, om: ObjectMapper = ...): FlowStateMachine<*> defined in net.corda.node.shell.InteractiveShell[DeserializedSimpleFunctionDescriptor]

'DummyFSM' @ [41:46] ==> public constructor DummyFSM(logic: InteractiveShellTest.FlowA) defined in net.corda.node.InteractiveShellTest.DummyFSM[ClassConstructorDescriptorImpl]

'it' @ [41:55] ==> value-parameter it: FlowLogic<*> defined in net.corda.node.InteractiveShellTest.check.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [41:68] ==> @InlineOnly public inline fun <T> InteractiveShellTest.DummyFSM.apply(block: InteractiveShellTest.DummyFSM.() -> Unit): InteractiveShellTest.DummyFSM defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DummyFSM

'output' @ [41:76] ==> var output: InteractiveShellTest.DummyFSM? defined in net.corda.node.InteractiveShellTest.check[LocalVariableDescriptor]

'this' @ [41:85] ==> <this> defined in net.corda.node.InteractiveShellTest.check.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'input' @ [41:95] ==> value-parameter input: String defined in net.corda.node.InteractiveShellTest.check[ValueParameterDescriptorImpl]

'java' @ [41:115] ==> public val <T> KClass<InteractiveShellTest.FlowA>.java: Class<InteractiveShellTest.FlowA> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FlowA

'om' @ [41:121] ==> private final val om: ObjectMapper defined in net.corda.node.InteractiveShellTest[PropertyDescriptorImpl]

'assertEquals' @ [42:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'expected' @ [42:22] ==> value-parameter expected: String defined in net.corda.node.InteractiveShellTest.check[ValueParameterDescriptorImpl]

'output' @ [42:32] ==> var output: InteractiveShellTest.DummyFSM? defined in net.corda.node.InteractiveShellTest.check[LocalVariableDescriptor]

'logic' @ [42:41] ==> public final val logic: InteractiveShellTest.FlowA defined in net.corda.node.InteractiveShellTest.DummyFSM[PropertyDescriptorImpl]

'a' @ [42:47] ==> public final val a: String defined in net.corda.node.InteractiveShellTest.FlowA[PropertyDescriptorImpl]

'input' @ [42:50] ==> value-parameter input: String defined in net.corda.node.InteractiveShellTest.check[ValueParameterDescriptorImpl]

'Test' @ [45:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'check' @ [47:9] ==> private final fun check(input: String, expected: String): Unit defined in net.corda.node.InteractiveShellTest[SimpleFunctionDescriptorImpl]

'check' @ [48:9] ==> private final fun check(input: String, expected: String): Unit defined in net.corda.node.InteractiveShellTest[SimpleFunctionDescriptorImpl]

'check' @ [49:9] ==> private final fun check(input: String, expected: String): Unit defined in net.corda.node.InteractiveShellTest[SimpleFunctionDescriptorImpl]

'Test' @ [52:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'check' @ [52:45] ==> private final fun check(input: String, expected: String): Unit defined in net.corda.node.InteractiveShellTest[SimpleFunctionDescriptorImpl]

'Test' @ [54:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'check' @ [54:44] ==> private final fun check(input: String, expected: String): Unit defined in net.corda.node.InteractiveShellTest[SimpleFunctionDescriptorImpl]

'Test' @ [59:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'InteractiveShell' @ [59:22] ==> public object InteractiveShell defined in net.corda.node.shell[FakeCallableDescriptorForObject]

'NoApplicableConstructor' @ [59:39] ==> public constructor NoApplicableConstructor(errors: List<String>) defined in net.corda.node.shell.InteractiveShell.NoApplicableConstructor[DeserializedClassConstructorDescriptor]

'check' @ [60:29] ==> private final fun check(input: String, expected: String): Unit defined in net.corda.node.InteractiveShellTest[SimpleFunctionDescriptorImpl]

'Test' @ [62:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'InteractiveShell' @ [62:22] ==> public object InteractiveShell defined in net.corda.node.shell[FakeCallableDescriptorForObject]

'NoApplicableConstructor' @ [62:39] ==> public constructor NoApplicableConstructor(errors: List<String>) defined in net.corda.node.shell.InteractiveShell.NoApplicableConstructor[DeserializedClassConstructorDescriptor]

'check' @ [63:30] ==> private final fun check(input: String, expected: String): Unit defined in net.corda.node.InteractiveShellTest[SimpleFunctionDescriptorImpl]

'Test' @ [65:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'InteractiveShell' @ [65:22] ==> public object InteractiveShell defined in net.corda.node.shell[FakeCallableDescriptorForObject]

'NoApplicableConstructor' @ [65:39] ==> public constructor NoApplicableConstructor(errors: List<String>) defined in net.corda.node.shell.InteractiveShell.NoApplicableConstructor[DeserializedClassConstructorDescriptor]

'check' @ [66:31] ==> private final fun check(input: String, expected: String): Unit defined in net.corda.node.InteractiveShellTest[SimpleFunctionDescriptorImpl]

'Test' @ [68:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'check' @ [69:19] ==> private final fun check(input: String, expected: String): Unit defined in net.corda.node.InteractiveShellTest[SimpleFunctionDescriptorImpl]

'MEGA_CORP' @ [69:37] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [69:47] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [69:57] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [69:67] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toString' @ [69:72] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'UnsupportedOperationException' @ [73:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [76:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [79:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [82:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [85:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [87:59] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [88:51] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [89:58] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [90:68] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [91:65] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'Unit' @ [92:105] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'Unit' @ [93:114] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'Unit' @ [95:85] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

