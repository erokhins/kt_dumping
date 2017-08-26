'TestCase' @ [25:30] ==> public constructor TestCase() defined in junit.framework.TestCase[JavaClassConstructorDescriptor]

'Test' @ [26:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'K2JVMCompilerArguments' @ [28:20] ==> public constructor K2JVMCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedClassConstructorDescriptor]

'JvmBuildMetaInfo' @ [29:20] ==> public fun JvmBuildMetaInfo(args: CommonCompilerArguments): JvmBuildMetaInfo defined in org.jetbrains.kotlin.build[DeserializedSimpleFunctionDescriptor]

'args' @ [29:37] ==> val args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testSerialization[LocalVariableDescriptor]

'JvmBuildMetaInfo' @ [30:22] ==> public companion object defined in org.jetbrains.kotlin.build.JvmBuildMetaInfo[FakeCallableDescriptorForObject]

'serializeToString' @ [30:39] ==> public final fun serializeToString(info: JvmBuildMetaInfo): String defined in org.jetbrains.kotlin.build.JvmBuildMetaInfo.Companion[DeserializedSimpleFunctionDescriptor]

'info' @ [30:57] ==> val info: JvmBuildMetaInfo defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testSerialization[LocalVariableDescriptor]

'listOf' @ [31:28] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [50:9] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'expectedKeys' @ [50:22] ==> val expectedKeys: List<String> defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testSerialization[LocalVariableDescriptor]

'actual' @ [50:36] ==> val actual: String defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testSerialization[LocalVariableDescriptor]

'split' @ [50:43] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [50:63] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'line' @ [50:77] ==> value-parameter line: String defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testSerialization.<anonymous>[ValueParameterDescriptorImpl]

'split' @ [50:82] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'first' @ [50:93] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [53:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'K2JVMCompilerArguments' @ [55:20] ==> public constructor K2JVMCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedClassConstructorDescriptor]

'JvmBuildMetaInfo' @ [56:20] ==> public fun JvmBuildMetaInfo(args: CommonCompilerArguments): JvmBuildMetaInfo defined in org.jetbrains.kotlin.build[DeserializedSimpleFunctionDescriptor]

'args' @ [56:37] ==> val args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testSerializationDeserialization[LocalVariableDescriptor]

'JvmBuildMetaInfo' @ [57:26] ==> public companion object defined in org.jetbrains.kotlin.build.JvmBuildMetaInfo[FakeCallableDescriptorForObject]

'serializeToString' @ [57:43] ==> public final fun serializeToString(info: JvmBuildMetaInfo): String defined in org.jetbrains.kotlin.build.JvmBuildMetaInfo.Companion[DeserializedSimpleFunctionDescriptor]

'info' @ [57:61] ==> val info: JvmBuildMetaInfo defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testSerializationDeserialization[LocalVariableDescriptor]

'JvmBuildMetaInfo' @ [58:28] ==> public companion object defined in org.jetbrains.kotlin.build.JvmBuildMetaInfo[FakeCallableDescriptorForObject]

'deserializeFromString' @ [58:45] ==> public final fun deserializeFromString(str: String): JvmBuildMetaInfo? defined in org.jetbrains.kotlin.build.JvmBuildMetaInfo.Companion[DeserializedSimpleFunctionDescriptor]

'serialized' @ [58:67] ==> val serialized: String defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testSerializationDeserialization[LocalVariableDescriptor]

'assertEquals' @ [59:9] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'info' @ [59:22] ==> val info: JvmBuildMetaInfo defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testSerializationDeserialization[LocalVariableDescriptor]

'deserialized' @ [59:28] ==> val deserialized: JvmBuildMetaInfo? defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testSerializationDeserialization[LocalVariableDescriptor]

'Test' @ [62:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'K2JVMCompilerArguments' @ [64:21] ==> public constructor K2JVMCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedClassConstructorDescriptor]

'args1' @ [65:9] ==> val args1: K2JVMCompilerArguments defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testEquals[LocalVariableDescriptor]

'coroutinesState' @ [65:15] ==> @Argument public final var coroutinesState: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'CommonCompilerArguments' @ [65:33] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'ENABLE' @ [65:57] ==> public const final val ENABLE: String defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments.Companion[DeserializedPropertyDescriptor]

'JvmBuildMetaInfo' @ [66:21] ==> public fun JvmBuildMetaInfo(args: CommonCompilerArguments): JvmBuildMetaInfo defined in org.jetbrains.kotlin.build[DeserializedSimpleFunctionDescriptor]

'args1' @ [66:38] ==> val args1: K2JVMCompilerArguments defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testEquals[LocalVariableDescriptor]

'K2JVMCompilerArguments' @ [68:21] ==> public constructor K2JVMCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedClassConstructorDescriptor]

'args2' @ [69:9] ==> val args2: K2JVMCompilerArguments defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testEquals[LocalVariableDescriptor]

'coroutinesState' @ [69:15] ==> @Argument public final var coroutinesState: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'CommonCompilerArguments' @ [69:33] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'WARN' @ [69:57] ==> public const final val WARN: String defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments.Companion[DeserializedPropertyDescriptor]

'JvmBuildMetaInfo' @ [70:21] ==> public fun JvmBuildMetaInfo(args: CommonCompilerArguments): JvmBuildMetaInfo defined in org.jetbrains.kotlin.build[DeserializedSimpleFunctionDescriptor]

'args2' @ [70:38] ==> val args2: K2JVMCompilerArguments defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testEquals[LocalVariableDescriptor]

'assertNotEquals' @ [72:9] ==> public open fun assertNotEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'info1' @ [72:25] ==> val info1: JvmBuildMetaInfo defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testEquals[LocalVariableDescriptor]

'info2' @ [72:32] ==> val info2: JvmBuildMetaInfo defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testEquals[LocalVariableDescriptor]

'assertEquals' @ [73:9] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'info1' @ [73:22] ==> val info1: JvmBuildMetaInfo defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testEquals[LocalVariableDescriptor]

'info2' @ [73:29] ==> val info2: JvmBuildMetaInfo defined in org.jetbrains.kotlin.build.JvmBuildMetaInfoTest.testEquals[LocalVariableDescriptor]

'copy' @ [73:35] ==> public final fun copy(isEAP: Boolean = ..., compilerBuildVersion: String = ..., languageVersionString: String = ..., apiVersionString: String = ..., coroutinesEnable: Boolean = ..., coroutinesWarn: Boolean = ..., coroutinesError: Boolean = ..., multiplatformEnable: Boolean = ..., metadataVersionMajor: Int = ..., metadataVersionMinor: Int = ..., metadataVersionPatch: Int = ..., bytecodeVersionMajor: Int = ..., bytecodeVersionMinor: Int = ..., bytecodeVersionPatch: Int = ..., ownVersion: Int = ..., coroutinesVersion: Int = ..., multiplatformVersion: Int = ...): JvmBuildMetaInfo defined in org.jetbrains.kotlin.build.JvmBuildMetaInfo[DeserializedSimpleFunctionDescriptor]

