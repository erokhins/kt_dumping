'this' @ [18:25] ==> public constructor State(linearId: UniqueIdentifier) defined in net.corda.node.shell.CustomTypeJsonParsingTests.State[ClassConstructorDescriptorImpl]

'UniqueIdentifier' @ [18:30] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[DeserializedClassConstructorDescriptor]

'this' @ [23:25] ==> public constructor UuidState(uuid: UUID) defined in net.corda.node.shell.CustomTypeJsonParsingTests.UuidState[ClassConstructorDescriptorImpl]

'randomUUID' @ [23:35] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'Before' @ [26:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'objectMapper' @ [28:9] ==> public final lateinit var objectMapper: ObjectMapper defined in net.corda.node.shell.CustomTypeJsonParsingTests[PropertyDescriptorImpl]

'ObjectMapper' @ [28:24] ==> public constructor ObjectMapper() defined in com.fasterxml.jackson.databind.ObjectMapper[JavaClassConstructorDescriptor]

'SimpleModule' @ [29:28] ==> public constructor SimpleModule() defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaClassConstructorDescriptor]

'simpleModule' @ [30:9] ==> val simpleModule: SimpleModule defined in net.corda.node.shell.CustomTypeJsonParsingTests.setup[LocalVariableDescriptor]

'addDeserializer' @ [30:22] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(UniqueIdentifier..UniqueIdentifier?)>..Class<(UniqueIdentifier..UniqueIdentifier?)>?), p1: (JsonDeserializer<out (UniqueIdentifier..UniqueIdentifier?)>..JsonDeserializer<out (UniqueIdentifier..UniqueIdentifier?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> UniqueIdentifier

'UniqueIdentifier' @ [30:38] ==> public companion object defined in net.corda.core.contracts.UniqueIdentifier[FakeCallableDescriptorForObject]

'java' @ [30:62] ==> public val <T> KClass<UniqueIdentifier>.java: Class<UniqueIdentifier> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UniqueIdentifier

'InteractiveShell' @ [30:68] ==> public object InteractiveShell defined in net.corda.node.shell[FakeCallableDescriptorForObject]

'UniqueIdentifierDeserializer' @ [30:85] ==> public object UniqueIdentifierDeserializer : JsonDeserializer<UniqueIdentifier> defined in net.corda.node.shell.InteractiveShell[FakeCallableDescriptorForObject]

'simpleModule' @ [31:9] ==> val simpleModule: SimpleModule defined in net.corda.node.shell.CustomTypeJsonParsingTests.setup[LocalVariableDescriptor]

'addDeserializer' @ [31:22] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(UUID..UUID?)>..Class<(UUID..UUID?)>?), p1: (JsonDeserializer<out (UUID..UUID?)>..JsonDeserializer<out (UUID..UUID?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> UUID

'java' @ [31:50] ==> public val <T> KClass<UUID>.java: Class<UUID> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UUID

'InteractiveShell' @ [31:56] ==> public object InteractiveShell defined in net.corda.node.shell[FakeCallableDescriptorForObject]

'UUIDDeserializer' @ [31:73] ==> public object UUIDDeserializer : JsonDeserializer<UUID> defined in net.corda.node.shell.InteractiveShell[FakeCallableDescriptorForObject]

'objectMapper' @ [32:9] ==> public final lateinit var objectMapper: ObjectMapper defined in net.corda.node.shell.CustomTypeJsonParsingTests[PropertyDescriptorImpl]

'registerModule' @ [32:22] ==> public open fun registerModule(p0: (Module..Module?)): (ObjectMapper..ObjectMapper?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]

'simpleModule' @ [32:37] ==> val simpleModule: SimpleModule defined in net.corda.node.shell.CustomTypeJsonParsingTests.setup[LocalVariableDescriptor]

'Test' @ [35:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'objectMapper' @ [38:21] ==> public final lateinit var objectMapper: ObjectMapper defined in net.corda.node.shell.CustomTypeJsonParsingTests[PropertyDescriptorImpl]

'readValue' @ [38:34] ==> public inline fun <reified T : Any> ObjectMapper.readValue(content: String): CustomTypeJsonParsingTests.State defined in com.fasterxml.jackson.module.kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> State

'json' @ [38:51] ==> val json: String defined in net.corda.node.shell.CustomTypeJsonParsingTests.`Deserializing UniqueIdentifier by parsing string`[LocalVariableDescriptor]

'assertEquals' @ [40:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'state' @ [40:62] ==> val state: CustomTypeJsonParsingTests.State defined in net.corda.node.shell.CustomTypeJsonParsingTests.`Deserializing UniqueIdentifier by parsing string`[LocalVariableDescriptor]

'linearId' @ [40:68] ==> public final val linearId: UniqueIdentifier defined in net.corda.node.shell.CustomTypeJsonParsingTests.State[PropertyDescriptorImpl]

'externalId' @ [40:77] ==> public final val externalId: String? defined in net.corda.core.contracts.UniqueIdentifier[DeserializedPropertyDescriptor]

'Test' @ [43:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'objectMapper' @ [46:21] ==> public final lateinit var objectMapper: ObjectMapper defined in net.corda.node.shell.CustomTypeJsonParsingTests[PropertyDescriptorImpl]

'readValue' @ [46:34] ==> public inline fun <reified T : Any> ObjectMapper.readValue(content: String): CustomTypeJsonParsingTests.State defined in com.fasterxml.jackson.module.kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> State

'json' @ [46:51] ==> val json: String defined in net.corda.node.shell.CustomTypeJsonParsingTests.`Deserializing UniqueIdentifier by parsing string with underscore`[LocalVariableDescriptor]

'assertEquals' @ [48:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'state' @ [48:35] ==> val state: CustomTypeJsonParsingTests.State defined in net.corda.node.shell.CustomTypeJsonParsingTests.`Deserializing UniqueIdentifier by parsing string with underscore`[LocalVariableDescriptor]

'linearId' @ [48:41] ==> public final val linearId: UniqueIdentifier defined in net.corda.node.shell.CustomTypeJsonParsingTests.State[PropertyDescriptorImpl]

'externalId' @ [48:50] ==> public final val externalId: String? defined in net.corda.core.contracts.UniqueIdentifier[DeserializedPropertyDescriptor]

'assertEquals' @ [49:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'state' @ [49:62] ==> val state: CustomTypeJsonParsingTests.State defined in net.corda.node.shell.CustomTypeJsonParsingTests.`Deserializing UniqueIdentifier by parsing string with underscore`[LocalVariableDescriptor]

'linearId' @ [49:68] ==> public final val linearId: UniqueIdentifier defined in net.corda.node.shell.CustomTypeJsonParsingTests.State[PropertyDescriptorImpl]

'id' @ [49:77] ==> public final val id: UUID defined in net.corda.core.contracts.UniqueIdentifier[DeserializedPropertyDescriptor]

'toString' @ [49:80] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'Test' @ [52:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'objectMapper' @ [55:9] ==> public final lateinit var objectMapper: ObjectMapper defined in net.corda.node.shell.CustomTypeJsonParsingTests[PropertyDescriptorImpl]

'readValue' @ [55:22] ==> public inline fun <reified T : Any> ObjectMapper.readValue(content: String): CustomTypeJsonParsingTests.State defined in com.fasterxml.jackson.module.kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> State

'json' @ [55:39] ==> val json: String defined in net.corda.node.shell.CustomTypeJsonParsingTests.`Deserializing by parsing string contain invalid uuid with underscore`[LocalVariableDescriptor]

'Test' @ [58:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'objectMapper' @ [61:21] ==> public final lateinit var objectMapper: ObjectMapper defined in net.corda.node.shell.CustomTypeJsonParsingTests[PropertyDescriptorImpl]

'readValue' @ [61:34] ==> public inline fun <reified T : Any> ObjectMapper.readValue(content: String): CustomTypeJsonParsingTests.UuidState defined in com.fasterxml.jackson.module.kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> UuidState

'json' @ [61:55] ==> val json: String defined in net.corda.node.shell.CustomTypeJsonParsingTests.`Deserializing UUID by parsing string`[LocalVariableDescriptor]

'assertEquals' @ [63:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'state' @ [63:62] ==> val state: CustomTypeJsonParsingTests.UuidState defined in net.corda.node.shell.CustomTypeJsonParsingTests.`Deserializing UUID by parsing string`[LocalVariableDescriptor]

'uuid' @ [63:68] ==> public final val uuid: UUID defined in net.corda.node.shell.CustomTypeJsonParsingTests.UuidState[PropertyDescriptorImpl]

'toString' @ [63:73] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'Test' @ [66:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'objectMapper' @ [69:9] ==> public final lateinit var objectMapper: ObjectMapper defined in net.corda.node.shell.CustomTypeJsonParsingTests[PropertyDescriptorImpl]

'readValue' @ [69:22] ==> public inline fun <reified T : Any> ObjectMapper.readValue(content: String): CustomTypeJsonParsingTests.UuidState defined in com.fasterxml.jackson.module.kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> UuidState

'json' @ [69:43] ==> val json: String defined in net.corda.node.shell.CustomTypeJsonParsingTests.`Deserializing UUID by parsing invalid uuid string`[LocalVariableDescriptor]

