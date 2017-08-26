'TestDependencyInjectionBase' @ [9:36] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'Test' @ [11:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Cash' @ [13:23] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [13:37] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'CommercialPaper' @ [13:42] ==> public constructor CommercialPaper() defined in net.corda.finance.contracts.CommercialPaper[DeserializedClassConstructorDescriptor]

'java' @ [13:65] ==> public val <T> KClass<CommercialPaper>.java: Class<CommercialPaper> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CommercialPaper

'command' @ [14:29] ==> val command: Cash.Commands.Move defined in net.corda.core.serialization.CommandsSerializationTests.`test cash move serialization`[LocalVariableDescriptor]

'serialize' @ [14:37] ==> public fun <T : Any> Cash.Commands.Move.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<Cash.Commands.Move> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Move

'deserialize' @ [14:49] ==> public inline fun <reified T : Any> SerializedBytes<Cash.Commands.Move>.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): Cash.Commands.Move defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Move

'assertEquals' @ [16:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Cash.Commands.Move, actual: Cash.Commands.Move, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Move

'command' @ [16:22] ==> val command: Cash.Commands.Move defined in net.corda.core.serialization.CommandsSerializationTests.`test cash move serialization`[LocalVariableDescriptor]

'copiedCommand' @ [16:31] ==> val copiedCommand: Cash.Commands.Move defined in net.corda.core.serialization.CommandsSerializationTests.`test cash move serialization`[LocalVariableDescriptor]

