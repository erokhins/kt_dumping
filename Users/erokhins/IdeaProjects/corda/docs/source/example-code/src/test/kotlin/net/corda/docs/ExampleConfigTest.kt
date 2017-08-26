'configFilenames' @ [15:9] ==> value-parameter vararg configFilenames: String defined in net.corda.docs.ExampleConfigTest.readAndCheckConfigurations[ValueParameterDescriptorImpl]

'forEach' @ [15:25] ==> public inline fun <T> Array<out String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'println' @ [16:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [16:32] ==> value-parameter it: String defined in net.corda.docs.ExampleConfigTest.readAndCheckConfigurations.<anonymous>[ValueParameterDescriptorImpl]

'ExampleConfigTest' @ [17:38] ==> public constructor ExampleConfigTest() defined in net.corda.docs.ExampleConfigTest[ClassConstructorDescriptorImpl]

'java' @ [17:63] ==> public val <T> KClass<ExampleConfigTest>.java: Class<ExampleConfigTest> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ExampleConfigTest

'classLoader' @ [17:68] ==> public final val <T : (Any..Any?)> Class<ExampleConfigTest>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ExampleConfigTest

'getResource' @ [17:80] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'it' @ [17:92] ==> value-parameter it: String defined in net.corda.docs.ExampleConfigTest.readAndCheckConfigurations.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [18:26] ==> public abstract operator fun invoke(p1: Path): A defined in kotlin.Function1[FunctionInvokeDescriptor]

'get' @ [18:43] ==> public open fun get(p0: (URI..URI?)): (Path..Path?) defined in java.nio.file.Paths[JavaMethodDescriptor]

'configFileResource' @ [18:47] ==> val configFileResource: (URL..URL?) defined in net.corda.docs.ExampleConfigTest.readAndCheckConfigurations.<anonymous>[LocalVariableDescriptor]

'toURI' @ [18:66] ==> public open fun toURI(): (URI..URI?) defined in java.net.URL[JavaMethodDescriptor]

'config' @ [20:13] ==> val config: A defined in net.corda.docs.ExampleConfigTest.readAndCheckConfigurations.<anonymous>[LocalVariableDescriptor]

'javaClass' @ [20:20] ==> public val <T : Any> A.javaClass: Class<A> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> A

'kotlin' @ [20:30] ==> public val <T : Any> Class<A>.kotlin: KClass<A> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> A

'declaredMemberProperties' @ [20:37] ==> @SinceKotlin public val <T : Any> KClass<A>.declaredMemberProperties: Collection<KProperty1<A, *>> defined in kotlin.reflect.full[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> A

'forEach' @ [20:62] ==> @HidesMembers public inline fun <T> Iterable<KProperty1<A, *>>.forEach(action: (KProperty1<A, *>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<A, *>

'member' @ [21:17] ==> value-parameter member: KProperty1<A, *> defined in net.corda.docs.ExampleConfigTest.readAndCheckConfigurations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [21:24] ==> public abstract fun get(receiver: A): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'config' @ [21:28] ==> val config: A defined in net.corda.docs.ExampleConfigTest.readAndCheckConfigurations.<anonymous>[LocalVariableDescriptor]

'Test' @ [26:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'readAndCheckConfigurations' @ [28:9] ==> private final fun <A : Any> readAndCheckConfigurations(vararg configFilenames: String, loadConfig: (Path) -> FullNodeConfiguration): Unit defined in net.corda.docs.ExampleConfigTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <A : Any> -> FullNodeConfiguration

'get' @ [33:39] ==> public open fun get(p0: (String..String?), vararg p1: (String..String?)): (Path..Path?) defined in java.nio.file.Paths[JavaMethodDescriptor]

'ConfigHelper' @ [34:13] ==> public object ConfigHelper defined in net.corda.node.services.config[FakeCallableDescriptorForObject]

'loadConfig' @ [34:26] ==> public final fun loadConfig(baseDirectory: Path, configFile: Path = ..., allowMissingConfig: Boolean = ..., configOverrides: Config = ...): Config defined in net.corda.node.services.config.ConfigHelper[DeserializedSimpleFunctionDescriptor]

'baseDirectory' @ [35:37] ==> val baseDirectory: (Path..Path?) defined in net.corda.docs.ExampleConfigTest.`example node_confs parses fine`.<anonymous>[LocalVariableDescriptor]

'it' @ [36:34] ==> value-parameter it: Path defined in net.corda.docs.ExampleConfigTest.`example node_confs parses fine`.<anonymous>[ValueParameterDescriptorImpl]

'parseAs' @ [37:15] ==> public inline fun <reified T : Any> Config.parseAs(): FullNodeConfiguration defined in net.corda.nodeapi.config[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> FullNodeConfiguration

'Test' @ [41:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'readAndCheckConfigurations' @ [43:9] ==> private final fun <A : Any> readAndCheckConfigurations(vararg configFilenames: String, loadConfig: (Path) -> VerifierConfiguration): Unit defined in net.corda.docs.ExampleConfigTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <A : Any> -> VerifierConfiguration

'get' @ [46:39] ==> public open fun get(p0: (String..String?), vararg p1: (String..String?)): (Path..Path?) defined in java.nio.file.Paths[JavaMethodDescriptor]

'Verifier' @ [47:13] ==> public companion object defined in net.corda.verifier.Verifier[FakeCallableDescriptorForObject]

'loadConfiguration' @ [47:22] ==> public final fun loadConfiguration(baseDirectory: Path, configPath: Path): VerifierConfiguration defined in net.corda.verifier.Verifier.Companion[DeserializedSimpleFunctionDescriptor]

'baseDirectory' @ [47:40] ==> val baseDirectory: (Path..Path?) defined in net.corda.docs.ExampleConfigTest.`example verifier_conf parses fine`.<anonymous>[LocalVariableDescriptor]

'it' @ [47:55] ==> value-parameter it: Path defined in net.corda.docs.ExampleConfigTest.`example verifier_conf parses fine`.<anonymous>[ValueParameterDescriptorImpl]

