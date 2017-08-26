'Test' @ [25:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'StorageComponentContainer' @ [27:25] ==> public constructor StorageComponentContainer(id: String, parent: StorageComponentContainer? = ...) defined in org.jetbrains.kotlin.container.StorageComponentContainer[DeserializedClassConstructorDescriptor]

'assertFails' @ [28:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'container' @ [29:13] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_throw_when_not_composed[LocalVariableDescriptor]

'resolve' @ [29:23] ==> public inline fun <reified T : Any> StorageComponentContainer.resolve(context: ValueResolveContext = ...): ValueDescriptor? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestComponentInterface

'Test' @ [33:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [35:25] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'assertNull' @ [36:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'container' @ [36:20] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_to_null_when_empty[LocalVariableDescriptor]

'resolve' @ [36:30] ==> public inline fun <reified T : Any> StorageComponentContainer.resolve(context: ValueResolveContext = ...): ValueDescriptor? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestComponentInterface

'Test' @ [39:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [41:25] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [41:52] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestComponent

'container' @ [43:26] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_to_instance_when_registered[LocalVariableDescriptor]

'resolve' @ [43:36] ==> public inline fun <reified T : Any> StorageComponentContainer.resolve(context: ValueResolveContext = ...): ValueDescriptor? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestComponentInterface

'assertNotNull' @ [44:9] ==> public fun <T : Any> assertNotNull(actual: ValueDescriptor?, message: String? = ...): ValueDescriptor defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ValueDescriptor

'descriptor' @ [44:23] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_to_instance_when_registered[LocalVariableDescriptor]

'descriptor' @ [45:24] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_to_instance_when_registered[LocalVariableDescriptor]

'getValue' @ [45:37] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ValueDescriptor[DeserializedSimpleFunctionDescriptor]

'assertNotNull' @ [46:9] ==> public fun <T : Any> assertNotNull(actual: TestComponentInterface?, message: String? = ...): TestComponentInterface defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TestComponentInterface

'instance' @ [46:23] ==> val instance: TestComponentInterface defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_to_instance_when_registered[LocalVariableDescriptor]

'assertFails' @ [47:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'instance' @ [48:13] ==> val instance: TestComponentInterface defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_to_instance_when_registered[LocalVariableDescriptor]

'foo' @ [48:22] ==> public abstract fun foo(): Unit defined in org.jetbrains.kotlin.container.tests.TestComponentInterface[SimpleFunctionDescriptorImpl]

'Test' @ [52:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [54:25] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useInstance' @ [55:13] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'ManualTestComponent' @ [55:25] ==> public constructor ManualTestComponent(name: String) defined in org.jetbrains.kotlin.container.tests.ManualTestComponent[ClassConstructorDescriptorImpl]

'useImpl' @ [56:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponent

'container' @ [59:26] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_instance_dependency[LocalVariableDescriptor]

'resolve' @ [59:36] ==> public inline fun <reified T : Any> StorageComponentContainer.resolve(context: ValueResolveContext = ...): ValueDescriptor? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponent

'assertNotNull' @ [60:9] ==> public fun <T : Any> assertNotNull(actual: ValueDescriptor?, message: String? = ...): ValueDescriptor defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ValueDescriptor

'descriptor' @ [60:23] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_instance_dependency[LocalVariableDescriptor]

'descriptor' @ [61:24] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_instance_dependency[LocalVariableDescriptor]

'getValue' @ [61:37] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ValueDescriptor[DeserializedSimpleFunctionDescriptor]

'assertNotNull' @ [62:9] ==> public fun <T : Any> assertNotNull(actual: TestClientComponent?, message: String? = ...): TestClientComponent defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TestClientComponent

'instance' @ [62:23] ==> val instance: TestClientComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_instance_dependency[LocalVariableDescriptor]

'assertNotNull' @ [63:9] ==> public fun <T : Any> assertNotNull(actual: TestComponentInterface?, message: String? = ...): TestComponentInterface defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TestComponentInterface

'instance' @ [63:23] ==> val instance: TestClientComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_instance_dependency[LocalVariableDescriptor]

'dep' @ [63:32] ==> public final val dep: TestComponentInterface defined in org.jetbrains.kotlin.container.tests.TestClientComponent[PropertyDescriptorImpl]

'assertFails' @ [64:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'instance' @ [65:13] ==> val instance: TestClientComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_instance_dependency[LocalVariableDescriptor]

'dep' @ [65:22] ==> public final val dep: TestComponentInterface defined in org.jetbrains.kotlin.container.tests.TestClientComponent[PropertyDescriptorImpl]

'foo' @ [65:26] ==> public abstract fun foo(): Unit defined in org.jetbrains.kotlin.container.tests.TestComponentInterface[SimpleFunctionDescriptorImpl]

'assertTrue' @ [67:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'instance' @ [67:20] ==> val instance: TestClientComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_instance_dependency[LocalVariableDescriptor]

'dep' @ [67:29] ==> public final val dep: TestComponentInterface defined in org.jetbrains.kotlin.container.tests.TestClientComponent[PropertyDescriptorImpl]

'assertEquals' @ [68:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'instance' @ [68:31] ==> val instance: TestClientComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_instance_dependency[LocalVariableDescriptor]

'dep' @ [68:40] ==> public final val dep: TestComponentInterface defined in org.jetbrains.kotlin.container.tests.TestClientComponent[PropertyDescriptorImpl]

'name' @ [68:68] ==> public final val name: String defined in org.jetbrains.kotlin.container.tests.ManualTestComponent[PropertyDescriptorImpl]

'container' @ [69:9] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_instance_dependency[LocalVariableDescriptor]

'close' @ [69:19] ==> public open fun close(): Unit defined in org.jetbrains.kotlin.container.StorageComponentContainer[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [70:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'instance' @ [70:20] ==> val instance: TestClientComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_instance_dependency[LocalVariableDescriptor]

'disposed' @ [70:29] ==> public final var disposed: Boolean defined in org.jetbrains.kotlin.container.tests.TestClientComponent[PropertyDescriptorImpl]

'assertFalse' @ [71:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'instance' @ [71:21] ==> val instance: TestClientComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_instance_dependency[LocalVariableDescriptor]

'dep' @ [71:30] ==> public final val dep: TestComponentInterface defined in org.jetbrains.kotlin.container.tests.TestClientComponent[PropertyDescriptorImpl]

'disposed' @ [71:34] ==> public open var disposed: Boolean defined in org.jetbrains.kotlin.container.tests.ManualTestComponent[PropertyDescriptorImpl]

'Test' @ [74:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [76:25] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [77:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestComponent

'useImpl' @ [78:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponent

'container' @ [81:26] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_type_dependency[LocalVariableDescriptor]

'resolve' @ [81:36] ==> public inline fun <reified T : Any> StorageComponentContainer.resolve(context: ValueResolveContext = ...): ValueDescriptor? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponent

'assertNotNull' @ [82:9] ==> public fun <T : Any> assertNotNull(actual: ValueDescriptor?, message: String? = ...): ValueDescriptor defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ValueDescriptor

'descriptor' @ [82:23] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_type_dependency[LocalVariableDescriptor]

'descriptor' @ [83:24] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_type_dependency[LocalVariableDescriptor]

'getValue' @ [83:37] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ValueDescriptor[DeserializedSimpleFunctionDescriptor]

'assertNotNull' @ [84:9] ==> public fun <T : Any> assertNotNull(actual: TestClientComponent?, message: String? = ...): TestClientComponent defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TestClientComponent

'instance' @ [84:23] ==> val instance: TestClientComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_type_dependency[LocalVariableDescriptor]

'assertNotNull' @ [85:9] ==> public fun <T : Any> assertNotNull(actual: TestComponentInterface?, message: String? = ...): TestComponentInterface defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TestComponentInterface

'instance' @ [85:23] ==> val instance: TestClientComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_type_dependency[LocalVariableDescriptor]

'dep' @ [85:32] ==> public final val dep: TestComponentInterface defined in org.jetbrains.kotlin.container.tests.TestClientComponent[PropertyDescriptorImpl]

'assertFails' @ [86:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'instance' @ [87:13] ==> val instance: TestClientComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_type_dependency[LocalVariableDescriptor]

'dep' @ [87:22] ==> public final val dep: TestComponentInterface defined in org.jetbrains.kotlin.container.tests.TestClientComponent[PropertyDescriptorImpl]

'foo' @ [87:26] ==> public abstract fun foo(): Unit defined in org.jetbrains.kotlin.container.tests.TestComponentInterface[SimpleFunctionDescriptorImpl]

'container' @ [89:9] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_type_dependency[LocalVariableDescriptor]

'close' @ [89:19] ==> public open fun close(): Unit defined in org.jetbrains.kotlin.container.StorageComponentContainer[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [90:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'instance' @ [90:20] ==> val instance: TestClientComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_type_dependency[LocalVariableDescriptor]

'disposed' @ [90:29] ==> public final var disposed: Boolean defined in org.jetbrains.kotlin.container.tests.TestClientComponent[PropertyDescriptorImpl]

'assertTrue' @ [91:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'instance' @ [91:20] ==> val instance: TestClientComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_type_dependency[LocalVariableDescriptor]

'dep' @ [91:29] ==> public final val dep: TestComponentInterface defined in org.jetbrains.kotlin.container.tests.TestClientComponent[PropertyDescriptorImpl]

'disposed' @ [91:33] ==> public abstract val disposed: Boolean defined in org.jetbrains.kotlin.container.tests.TestComponentInterface[PropertyDescriptorImpl]

'Test' @ [94:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [96:9] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [97:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestComponent

'useImpl' @ [98:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponent

'useImpl' @ [99:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponent2

'use' @ [100:11] ==> @InlineOnly public inline fun <T : Closeable?, R> StorageComponentContainer.use(block: (StorageComponentContainer) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> StorageComponentContainer
    <R> -> Unit

'it' @ [101:30] ==> value-parameter it: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_multiple_types.<anonymous>[ValueParameterDescriptorImpl]

'resolveMultiple' @ [101:33] ==> public inline fun <reified T : Any> StorageComponentContainer.resolveMultiple(context: ValueResolveContext = ...): Iterable<ValueDescriptor> defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponentInterface

'assertNotNull' @ [102:13] ==> public fun <T : Any> assertNotNull(actual: Iterable<ValueDescriptor>?, message: String? = ...): Iterable<ValueDescriptor> defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Iterable<ValueDescriptor>

'descriptor' @ [102:27] ==> val descriptor: Iterable<ValueDescriptor> defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_multiple_types.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [103:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'descriptor' @ [103:29] ==> val descriptor: Iterable<ValueDescriptor> defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_multiple_types.<anonymous>[LocalVariableDescriptor]

'count' @ [103:40] ==> public fun <T> Iterable<ValueDescriptor>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueDescriptor

'Test' @ [107:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [109:9] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [110:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestComponent

'useImpl' @ [111:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponent

'use' @ [112:11] ==> @InlineOnly public inline fun <T : Closeable?, R> StorageComponentContainer.use(block: (StorageComponentContainer) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> StorageComponentContainer
    <R> -> Unit

'it' @ [113:31] ==> value-parameter it: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_singleton_types_to_same_instances.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [113:34] ==> public inline fun <reified T : Any> StorageComponentContainer.resolve(context: ValueResolveContext = ...): ValueDescriptor? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponentInterface

'assertNotNull' @ [114:13] ==> public fun <T : Any> assertNotNull(actual: ValueDescriptor?, message: String? = ...): ValueDescriptor defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ValueDescriptor

'descriptor1' @ [114:27] ==> val descriptor1: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_singleton_types_to_same_instances.<anonymous>[LocalVariableDescriptor]

'it' @ [115:31] ==> value-parameter it: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_singleton_types_to_same_instances.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [115:34] ==> public inline fun <reified T : Any> StorageComponentContainer.resolve(context: ValueResolveContext = ...): ValueDescriptor? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponentInterface

'assertNotNull' @ [116:13] ==> public fun <T : Any> assertNotNull(actual: ValueDescriptor?, message: String? = ...): ValueDescriptor defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ValueDescriptor

'descriptor2' @ [116:27] ==> val descriptor2: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_singleton_types_to_same_instances.<anonymous>[LocalVariableDescriptor]

'assertTrue' @ [117:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'descriptor1' @ [117:24] ==> val descriptor1: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_singleton_types_to_same_instances.<anonymous>[LocalVariableDescriptor]

'descriptor2' @ [117:39] ==> val descriptor2: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_singleton_types_to_same_instances.<anonymous>[LocalVariableDescriptor]

'assertTrue' @ [118:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'descriptor1' @ [118:24] ==> val descriptor1: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_singleton_types_to_same_instances.<anonymous>[LocalVariableDescriptor]

'getValue' @ [118:38] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ValueDescriptor[DeserializedSimpleFunctionDescriptor]

'descriptor2' @ [118:52] ==> val descriptor2: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_singleton_types_to_same_instances.<anonymous>[LocalVariableDescriptor]

'getValue' @ [118:66] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ValueDescriptor[DeserializedSimpleFunctionDescriptor]

'Test' @ [122:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [124:9] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [125:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestAdhocComponent1

'useImpl' @ [126:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestAdhocComponent2

'use' @ [127:11] ==> @InlineOnly public inline fun <T : Closeable?, R> StorageComponentContainer.use(block: (StorageComponentContainer) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> StorageComponentContainer
    <R> -> Unit

'it' @ [128:31] ==> value-parameter it: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_adhoc_types_to_same_instances.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [128:34] ==> public inline fun <reified T : Any> StorageComponentContainer.resolve(context: ValueResolveContext = ...): ValueDescriptor? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestAdhocComponent1

'assertNotNull' @ [129:13] ==> public fun <T : Any> assertNotNull(actual: ValueDescriptor?, message: String? = ...): ValueDescriptor defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ValueDescriptor

'descriptor1' @ [129:27] ==> val descriptor1: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_adhoc_types_to_same_instances.<anonymous>[LocalVariableDescriptor]

'it' @ [130:31] ==> value-parameter it: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_adhoc_types_to_same_instances.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [130:34] ==> public inline fun <reified T : Any> StorageComponentContainer.resolve(context: ValueResolveContext = ...): ValueDescriptor? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestAdhocComponent2

'assertNotNull' @ [131:13] ==> public fun <T : Any> assertNotNull(actual: ValueDescriptor?, message: String? = ...): ValueDescriptor defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ValueDescriptor

'descriptor2' @ [131:27] ==> val descriptor2: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_adhoc_types_to_same_instances.<anonymous>[LocalVariableDescriptor]

'descriptor1' @ [132:30] ==> val descriptor1: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_adhoc_types_to_same_instances.<anonymous>[LocalVariableDescriptor]

'getValue' @ [132:44] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ValueDescriptor[DeserializedSimpleFunctionDescriptor]

'descriptor2' @ [133:30] ==> val descriptor2: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_adhoc_types_to_same_instances.<anonymous>[LocalVariableDescriptor]

'getValue' @ [133:44] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ValueDescriptor[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [134:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'component1' @ [134:24] ==> val component1: TestAdhocComponent1 defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_adhoc_types_to_same_instances.<anonymous>[LocalVariableDescriptor]

'service' @ [134:35] ==> public final val service: TestAdhocComponentService defined in org.jetbrains.kotlin.container.tests.TestAdhocComponent1[PropertyDescriptorImpl]

'component2' @ [134:47] ==> val component2: TestAdhocComponent2 defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_adhoc_types_to_same_instances.<anonymous>[LocalVariableDescriptor]

'service' @ [134:58] ==> public final val service: TestAdhocComponentService defined in org.jetbrains.kotlin.container.tests.TestAdhocComponent2[PropertyDescriptorImpl]

'Test' @ [138:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [140:9] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [141:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestComponent

'useImpl' @ [142:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponent

'useImpl' @ [143:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponent2

'useImpl' @ [144:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestIterableComponent

'use' @ [145:11] ==> @InlineOnly public inline fun <T : Closeable?, R> StorageComponentContainer.use(block: (StorageComponentContainer) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> StorageComponentContainer
    <R> -> Unit

'it' @ [146:30] ==> value-parameter it: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_iterable.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [146:33] ==> public inline fun <reified T : Any> StorageComponentContainer.resolve(context: ValueResolveContext = ...): ValueDescriptor? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestIterableComponent

'assertNotNull' @ [147:13] ==> public fun <T : Any> assertNotNull(actual: ValueDescriptor?, message: String? = ...): ValueDescriptor defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ValueDescriptor

'descriptor' @ [147:27] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_iterable.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [148:37] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_iterable.<anonymous>[LocalVariableDescriptor]

'getValue' @ [148:50] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ValueDescriptor[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [149:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'iterableComponent' @ [149:29] ==> val iterableComponent: TestIterableComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_iterable.<anonymous>[LocalVariableDescriptor]

'components' @ [149:47] ==> public final val components: Iterable<TestClientComponentInterface> defined in org.jetbrains.kotlin.container.tests.TestIterableComponent[PropertyDescriptorImpl]

'count' @ [149:58] ==> public fun <T> Iterable<TestClientComponentInterface>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestClientComponentInterface

'assertTrue' @ [150:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'iterableComponent' @ [150:24] ==> val iterableComponent: TestIterableComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_iterable.<anonymous>[LocalVariableDescriptor]

'components' @ [150:42] ==> public final val components: Iterable<TestClientComponentInterface> defined in org.jetbrains.kotlin.container.tests.TestIterableComponent[PropertyDescriptorImpl]

'any' @ [150:53] ==> public inline fun <T> Iterable<TestClientComponentInterface>.any(predicate: (TestClientComponentInterface) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestClientComponentInterface

'it' @ [150:59] ==> value-parameter it: TestClientComponentInterface defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_iterable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertTrue' @ [151:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'iterableComponent' @ [151:24] ==> val iterableComponent: TestIterableComponent defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_iterable.<anonymous>[LocalVariableDescriptor]

'components' @ [151:42] ==> public final val components: Iterable<TestClientComponentInterface> defined in org.jetbrains.kotlin.container.tests.TestIterableComponent[PropertyDescriptorImpl]

'any' @ [151:53] ==> public inline fun <T> Iterable<TestClientComponentInterface>.any(predicate: (TestClientComponentInterface) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestClientComponentInterface

'it' @ [151:59] ==> value-parameter it: TestClientComponentInterface defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_iterable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [155:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [157:9] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [158:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestComponent

'useImpl' @ [159:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponent

'useImpl' @ [160:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestClientComponent2

'useImpl' @ [161:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestStringComponent

'useImpl' @ [162:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JavaTestComponents

'use' @ [163:11] ==> @InlineOnly public inline fun <T : Closeable?, R> StorageComponentContainer.use(block: (StorageComponentContainer) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> StorageComponentContainer
    <R> -> Unit

'it' @ [164:30] ==> value-parameter it: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_java_iterable.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [164:33] ==> public inline fun <reified T : Any> StorageComponentContainer.resolve(context: ValueResolveContext = ...): ValueDescriptor? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JavaTestComponents

'assertNotNull' @ [165:13] ==> public fun <T : Any> assertNotNull(actual: ValueDescriptor?, message: String? = ...): ValueDescriptor defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ValueDescriptor

'descriptor' @ [165:27] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_java_iterable.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [166:37] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_java_iterable.<anonymous>[LocalVariableDescriptor]

'getValue' @ [166:50] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ValueDescriptor[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [167:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'iterableComponent' @ [167:29] ==> val iterableComponent: JavaTestComponents defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_java_iterable.<anonymous>[LocalVariableDescriptor]

'components' @ [167:47] ==> public final val components: (MutableIterable<(TestClientComponentInterface..TestClientComponentInterface?)>..Iterable<(TestClientComponentInterface..TestClientComponentInterface?)>?) defined in org.jetbrains.kotlin.container.tests.JavaTestComponents[JavaPropertyDescriptor]

'count' @ [167:58] ==> public fun <T> Iterable<(TestClientComponentInterface..TestClientComponentInterface?)>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.container.tests.TestClientComponentInterface..org.jetbrains.kotlin.container.tests.TestClientComponentInterface?)

'assertTrue' @ [168:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'iterableComponent' @ [168:24] ==> val iterableComponent: JavaTestComponents defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_java_iterable.<anonymous>[LocalVariableDescriptor]

'components' @ [168:42] ==> public final val components: (MutableIterable<(TestClientComponentInterface..TestClientComponentInterface?)>..Iterable<(TestClientComponentInterface..TestClientComponentInterface?)>?) defined in org.jetbrains.kotlin.container.tests.JavaTestComponents[JavaPropertyDescriptor]

'any' @ [168:53] ==> public inline fun <T> Iterable<(TestClientComponentInterface..TestClientComponentInterface?)>.any(predicate: ((TestClientComponentInterface..TestClientComponentInterface?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.container.tests.TestClientComponentInterface..org.jetbrains.kotlin.container.tests.TestClientComponentInterface?)

'it' @ [168:59] ==> value-parameter it: (TestClientComponentInterface..TestClientComponentInterface?) defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_java_iterable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertTrue' @ [169:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'iterableComponent' @ [169:24] ==> val iterableComponent: JavaTestComponents defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_java_iterable.<anonymous>[LocalVariableDescriptor]

'components' @ [169:42] ==> public final val components: (MutableIterable<(TestClientComponentInterface..TestClientComponentInterface?)>..Iterable<(TestClientComponentInterface..TestClientComponentInterface?)>?) defined in org.jetbrains.kotlin.container.tests.JavaTestComponents[JavaPropertyDescriptor]

'any' @ [169:53] ==> public inline fun <T> Iterable<(TestClientComponentInterface..TestClientComponentInterface?)>.any(predicate: ((TestClientComponentInterface..TestClientComponentInterface?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.container.tests.TestClientComponentInterface..org.jetbrains.kotlin.container.tests.TestClientComponentInterface?)

'it' @ [169:59] ==> value-parameter it: (TestClientComponentInterface..TestClientComponentInterface?) defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_java_iterable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [170:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'iterableComponent' @ [170:29] ==> val iterableComponent: JavaTestComponents defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_java_iterable.<anonymous>[LocalVariableDescriptor]

'genericComponents' @ [170:47] ==> public final val genericComponents: (MutableIterable<(TestGenericComponent<(String..String?)>..TestGenericComponent<(String..String?)>?)>..Iterable<(TestGenericComponent<(String..String?)>..TestGenericComponent<(String..String?)>?)>?) defined in org.jetbrains.kotlin.container.tests.JavaTestComponents[JavaPropertyDescriptor]

'count' @ [170:65] ==> public fun <T> Iterable<(TestGenericComponent<(String..String?)>..TestGenericComponent<(String..String?)>?)>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.container.tests.TestGenericComponent<(kotlin.String..kotlin.String?)>..org.jetbrains.kotlin.container.tests.TestGenericComponent<(kotlin.String..kotlin.String?)>?)

'assertTrue' @ [171:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'iterableComponent' @ [171:24] ==> val iterableComponent: JavaTestComponents defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_java_iterable.<anonymous>[LocalVariableDescriptor]

'genericComponents' @ [171:42] ==> public final val genericComponents: (MutableIterable<(TestGenericComponent<(String..String?)>..TestGenericComponent<(String..String?)>?)>..Iterable<(TestGenericComponent<(String..String?)>..TestGenericComponent<(String..String?)>?)>?) defined in org.jetbrains.kotlin.container.tests.JavaTestComponents[JavaPropertyDescriptor]

'any' @ [171:60] ==> public inline fun <T> Iterable<(TestGenericComponent<(String..String?)>..TestGenericComponent<(String..String?)>?)>.any(predicate: ((TestGenericComponent<(String..String?)>..TestGenericComponent<(String..String?)>?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.container.tests.TestGenericComponent<(kotlin.String..kotlin.String?)>..org.jetbrains.kotlin.container.tests.TestGenericComponent<(kotlin.String..kotlin.String?)>?)

'it' @ [171:66] ==> value-parameter it: (TestGenericComponent<(String..String?)>..TestGenericComponent<(String..String?)>?) defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_resolve_java_iterable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [175:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [177:9] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [178:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestGenericClient

'useImpl' @ [179:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestStringComponent

'useImpl' @ [180:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestIntComponent

'use' @ [181:11] ==> @InlineOnly public inline fun <T : Closeable?, R> StorageComponentContainer.use(block: (StorageComponentContainer) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> StorageComponentContainer
    <R> -> Unit

'it' @ [182:30] ==> value-parameter it: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_distinguish_generic.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [182:33] ==> public inline fun <reified T : Any> StorageComponentContainer.resolve(context: ValueResolveContext = ...): ValueDescriptor? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestGenericClient

'assertNotNull' @ [183:13] ==> public fun <T : Any> assertNotNull(actual: ValueDescriptor?, message: String? = ...): ValueDescriptor defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ValueDescriptor

'descriptor' @ [183:27] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_distinguish_generic.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [184:33] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_distinguish_generic.<anonymous>[LocalVariableDescriptor]

'getValue' @ [184:46] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ValueDescriptor[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [185:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'genericClient' @ [185:24] ==> val genericClient: TestGenericClient defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_distinguish_generic.<anonymous>[LocalVariableDescriptor]

'component1' @ [185:38] ==> public final val component1: TestGenericComponent<String> defined in org.jetbrains.kotlin.container.tests.TestGenericClient[PropertyDescriptorImpl]

'assertTrue' @ [186:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'genericClient' @ [186:24] ==> val genericClient: TestGenericClient defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_distinguish_generic.<anonymous>[LocalVariableDescriptor]

'component2' @ [186:38] ==> public final val component2: TestGenericComponent<Int> defined in org.jetbrains.kotlin.container.tests.TestGenericClient[PropertyDescriptorImpl]

'Test' @ [205:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [207:9] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [208:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestComponent

'useInstance' @ [209:13] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'TestComponent' @ [209:25] ==> public constructor TestComponent() defined in org.jetbrains.kotlin.container.tests.TestComponent[ClassConstructorDescriptorImpl]

'use' @ [210:11] ==> @InlineOnly public inline fun <T : Closeable?, R> StorageComponentContainer.use(block: (StorageComponentContainer) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> StorageComponentContainer
    <R> -> Unit

'assertTrue' @ [211:13] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [212:17] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'it' @ [213:21] ==> value-parameter it: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_fail_with_invalid_cardinality.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [213:24] ==> public inline fun <reified T : Any> StorageComponentContainer.resolve(context: ValueResolveContext = ...): ValueDescriptor? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TestComponent

'Inject' @ [223:13] ==> public constructor Inject() defined in javax.inject.Inject[JavaClassConstructorDescriptor]

'isSetterCalled' @ [224:17] ==> public final var isSetterCalled: Boolean defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.WithSetters[PropertyDescriptorImpl]

'Test' @ [228:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [230:27] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [231:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> WithSetters

'get' @ [232:11] ==> public inline fun <reified T : Any> ComponentProvider.get(): ComponentContainerTest.WithSetters defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> WithSetters

'assertTrue' @ [234:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'withSetters' @ [234:20] ==> val withSetters: ComponentContainerTest.WithSetters defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_inject_properties_of_singletons[LocalVariableDescriptor]

'isSetterCalled' @ [234:32] ==> public final var isSetterCalled: Boolean defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.WithSetters[PropertyDescriptorImpl]

'Test' @ [237:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'WithSetters' @ [239:27] ==> public constructor WithSetters() defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.WithSetters[ClassConstructorDescriptorImpl]

'composeContainer' @ [240:9] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useInstance' @ [241:13] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'withSetters' @ [241:25] ==> val withSetters: ComponentContainerTest.WithSetters defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_not_inject_properties_of_instances[LocalVariableDescriptor]

'assertFalse' @ [244:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'withSetters' @ [244:21] ==> val withSetters: ComponentContainerTest.WithSetters defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_not_inject_properties_of_instances[LocalVariableDescriptor]

'isSetterCalled' @ [244:33] ==> public final var isSetterCalled: Boolean defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.WithSetters[PropertyDescriptorImpl]

'Test' @ [247:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Inject' @ [253:17] ==> public constructor Inject() defined in javax.inject.Inject[JavaClassConstructorDescriptor]

'Inject' @ [259:17] ==> public constructor Inject() defined in javax.inject.Inject[JavaClassConstructorDescriptor]

'composeContainer' @ [262:17] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [263:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> A

'get' @ [264:11] ==> public inline fun <reified T : Any> ComponentProvider.get(): A defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> A

'a' @ [266:17] ==> val a: A defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_discover_dependencies_recursively[LocalVariableDescriptor]

'b' @ [266:19] ==> public final var b: B? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_discover_dependencies_recursively.A[PropertyDescriptorImpl]

'assertTrue' @ [267:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'b' @ [267:20] ==> val b: B? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_discover_dependencies_recursively[LocalVariableDescriptor]

'b' @ [268:17] ==> val b: B? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_discover_dependencies_recursively[LocalVariableDescriptor]

'c' @ [268:21] ==> public final var c: C? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_discover_dependencies_recursively.B[PropertyDescriptorImpl]

'assertTrue' @ [269:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'c' @ [269:20] ==> val c: C? defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.should_discover_dependencies_recursively[LocalVariableDescriptor]

'Test' @ [272:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [277:18] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [278:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> A

'composeContainer' @ [281:18] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'ac' @ [281:40] ==> val ac: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.use_parent_context_to_discover_dependencies[LocalVariableDescriptor]

'useImpl' @ [282:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> B

'bc' @ [284:17] ==> val bc: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.use_parent_context_to_discover_dependencies[LocalVariableDescriptor]

'get' @ [284:20] ==> public inline fun <reified T : Any> ComponentProvider.get(): B defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> B

'ac' @ [286:17] ==> val ac: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.use_parent_context_to_discover_dependencies[LocalVariableDescriptor]

'get' @ [286:20] ==> public inline fun <reified T : Any> ComponentProvider.get(): A defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> A

'assertTrue' @ [287:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'b' @ [287:20] ==> val b: B defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.use_parent_context_to_discover_dependencies[LocalVariableDescriptor]

'assertTrue' @ [288:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'b' @ [288:20] ==> val b: B defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.use_parent_context_to_discover_dependencies[LocalVariableDescriptor]

'a' @ [288:22] ==> public final val a: A defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.use_parent_context_to_discover_dependencies.B[PropertyDescriptorImpl]

'assertTrue' @ [289:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'a' @ [289:20] ==> val a: A defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.use_parent_context_to_discover_dependencies[LocalVariableDescriptor]

'assertTrue' @ [290:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'b' @ [290:20] ==> val b: B defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.use_parent_context_to_discover_dependencies[LocalVariableDescriptor]

'a' @ [290:22] ==> public final val a: A defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.use_parent_context_to_discover_dependencies.B[PropertyDescriptorImpl]

'a' @ [290:28] ==> val a: A defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.use_parent_context_to_discover_dependencies[LocalVariableDescriptor]

'Test' @ [293:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [298:18] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [299:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> A

'composeContainer' @ [302:19] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'ac' @ [302:42] ==> val ac: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.several_child_dependencies[LocalVariableDescriptor]

'useImpl' @ [303:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> B

'composeContainer' @ [305:19] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'ac' @ [305:42] ==> val ac: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.several_child_dependencies[LocalVariableDescriptor]

'useImpl' @ [306:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> B

'ac' @ [308:17] ==> val ac: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.several_child_dependencies[LocalVariableDescriptor]

'get' @ [308:20] ==> public inline fun <reified T : Any> ComponentProvider.get(): A defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> A

'assertTrue' @ [309:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'a' @ [309:20] ==> val a: A defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.several_child_dependencies[LocalVariableDescriptor]

'assertTrue' @ [310:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'a' @ [310:20] ==> val a: A defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.several_child_dependencies[LocalVariableDescriptor]

'bc2' @ [310:26] ==> val bc2: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.several_child_dependencies[LocalVariableDescriptor]

'get' @ [310:30] ==> public inline fun <reified T : Any> ComponentProvider.get(): B defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> B

'a' @ [310:39] ==> public final val a: A defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.several_child_dependencies.B[PropertyDescriptorImpl]

'assertTrue' @ [311:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'a' @ [311:20] ==> val a: A defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.several_child_dependencies[LocalVariableDescriptor]

'bc1' @ [311:26] ==> val bc1: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.several_child_dependencies[LocalVariableDescriptor]

'get' @ [311:30] ==> public inline fun <reified T : Any> ComponentProvider.get(): B defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> B

'a' @ [311:39] ==> public final val a: A defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.several_child_dependencies.B[PropertyDescriptorImpl]

'assertTrue' @ [312:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'a' @ [312:20] ==> val a: A defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.several_child_dependencies[LocalVariableDescriptor]

'bc1' @ [312:26] ==> val bc1: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.several_child_dependencies[LocalVariableDescriptor]

'get' @ [312:30] ==> public inline fun <reified T : Any> ComponentProvider.get(): A defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> A

'DefaultImplementation' @ [315:5] ==> public constructor DefaultImplementation(impl: KClass<*>) defined in org.jetbrains.kotlin.container.DefaultImplementation[DeserializedClassConstructorDescriptor]

'Impl' @ [315:35] ==> public constructor Impl() defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.Impl[ClassConstructorDescriptorImpl]

'I' @ [318:18] ==> public constructor I() defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.I[ClassConstructorDescriptorImpl]

'I' @ [320:18] ==> public constructor I() defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.I[ClassConstructorDescriptorImpl]

'Test' @ [324:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [328:17] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [329:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Use

'get' @ [330:11] ==> public inline fun <reified T : Any> ComponentProvider.get(): Use defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Use

'assertTrue' @ [332:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'u' @ [332:20] ==> val u: Use defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.default_implementation[LocalVariableDescriptor]

'i' @ [332:22] ==> public final val i: ComponentContainerTest.I defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.default_implementation.Use[PropertyDescriptorImpl]

'Test' @ [335:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [337:18] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [338:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Impl2

'useImpl' @ [339:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Use

'ac' @ [342:17] ==> val ac: StorageComponentContainer defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.non_default_implementation[LocalVariableDescriptor]

'get' @ [342:20] ==> public inline fun <reified T : Any> ComponentProvider.get(): ComponentContainerTest.Use defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Use

'assertTrue' @ [343:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'u' @ [343:20] ==> val u: ComponentContainerTest.Use defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.non_default_implementation[LocalVariableDescriptor]

'i' @ [343:22] ==> public final val i: ComponentContainerTest.I defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.Use[PropertyDescriptorImpl]

'DefaultImplementation' @ [346:5] ==> public constructor DefaultImplementation(impl: KClass<*>) defined in org.jetbrains.kotlin.container.DefaultImplementation[DeserializedClassConstructorDescriptor]

'A' @ [346:35] ==> public object A : ComponentContainerTest.S defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest[FakeCallableDescriptorForObject]

'Test' @ [353:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'composeContainer' @ [355:20] ==> public fun composeContainer(id: String, parent: StorageComponentContainer? = ..., init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'useImpl' @ [356:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> UseS

'get' @ [357:11] ==> public inline fun <reified T : Any> ComponentProvider.get(): ComponentContainerTest.UseS defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> UseS

'assertTrue' @ [359:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'useS' @ [359:20] ==> val useS: ComponentContainerTest.UseS defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.test_default_object[LocalVariableDescriptor]

's' @ [359:25] ==> public final val s: ComponentContainerTest.S defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest.UseS[PropertyDescriptorImpl]

'A' @ [359:31] ==> public object A : ComponentContainerTest.S defined in org.jetbrains.kotlin.container.tests.ComponentContainerTest[FakeCallableDescriptorForObject]

