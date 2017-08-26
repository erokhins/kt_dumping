'StorageComponentContainer' @ [22:13] ==> public constructor StorageComponentContainer(id: String, parent: StorageComponentContainer? = ...) defined in org.jetbrains.kotlin.container.StorageComponentContainer[ClassConstructorDescriptorImpl]

'id' @ [22:39] ==> value-parameter id: String defined in org.jetbrains.kotlin.container.composeContainer[ValueParameterDescriptorImpl]

'parent' @ [22:43] ==> value-parameter parent: StorageComponentContainer? = ... defined in org.jetbrains.kotlin.container.composeContainer[ValueParameterDescriptorImpl]

'c' @ [23:5] ==> val c: StorageComponentContainer defined in org.jetbrains.kotlin.container.composeContainer[LocalVariableDescriptor]

'invoke' @ [23:7] ==> public abstract operator fun StorageComponentContainer.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'c' @ [24:5] ==> val c: StorageComponentContainer defined in org.jetbrains.kotlin.container.composeContainer[LocalVariableDescriptor]

'compose' @ [24:7] ==> public final fun compose(): StorageComponentContainer defined in org.jetbrains.kotlin.container.StorageComponentContainer[SimpleFunctionDescriptorImpl]

'c' @ [25:12] ==> val c: StorageComponentContainer defined in org.jetbrains.kotlin.container.composeContainer[LocalVariableDescriptor]

'registerSingleton' @ [29:5] ==> public fun StorageComponentContainer.registerSingleton(klass: Class<*>): StorageComponentContainer defined in org.jetbrains.kotlin.container in file Container.kt[SimpleFunctionDescriptorImpl]

'java' @ [29:32] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'getService' @ [33:12] ==> public fun <T : Any> ComponentProvider.getService(request: Class<T>): T defined in org.jetbrains.kotlin.container[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [33:32] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Suppress' @ [36:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'resolve' @ [38:12] ==> public abstract fun resolve(request: Type): ValueDescriptor? defined in org.jetbrains.kotlin.container.ComponentProvider[SimpleFunctionDescriptorImpl]

'request' @ [38:20] ==> value-parameter request: Class<T> defined in org.jetbrains.kotlin.container.tryGetService[ValueParameterDescriptorImpl]

'getValue' @ [38:30] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ValueDescriptor[SimpleFunctionDescriptorImpl]

'tryGetService' @ [42:12] ==> @Suppress public fun <T : Any> ComponentProvider.tryGetService(request: Class<T>): T? defined in org.jetbrains.kotlin.container[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'request' @ [42:26] ==> value-parameter request: Class<T> defined in org.jetbrains.kotlin.container.getService[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [42:44] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'request' @ [42:91] ==> value-parameter request: Class<T> defined in org.jetbrains.kotlin.container.getService[ValueParameterDescriptorImpl]

'registerInstance' @ [46:5] ==> public fun StorageComponentContainer.registerInstance(instance: Any): StorageComponentContainer defined in org.jetbrains.kotlin.container in file Container.kt[SimpleFunctionDescriptorImpl]

'instance' @ [46:22] ==> value-parameter instance: Any defined in org.jetbrains.kotlin.container.useInstance[ValueParameterDescriptorImpl]

'getService' @ [50:12] ==> public fun <T : Any> ComponentProvider.getService(request: Class<T>): T defined in org.jetbrains.kotlin.container[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'java' @ [50:32] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

