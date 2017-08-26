'Exception' @ [36:113] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'message' @ [36:123] ==> value-parameter message: String defined in org.jetbrains.kotlin.container.InvalidCardinalityException.<init>[ValueParameterDescriptorImpl]

'Initial' @ [39:39] ==> enum entry Initial defined in org.jetbrains.kotlin.container.ComponentStorageState[FakeCallableDescriptorForObject]

'ComponentRegistry' @ [40:28] ==> public constructor ComponentRegistry() defined in org.jetbrains.kotlin.container.ComponentRegistry[ClassConstructorDescriptorImpl]

'parent' @ [42:9] ==> value-parameter parent: ComponentStorage? defined in org.jetbrains.kotlin.container.ComponentStorage.<init>[ValueParameterDescriptorImpl]

'let' @ [42:17] ==> @InlineOnly public inline fun <T, R> ComponentStorage.let(block: (ComponentStorage) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ComponentStorage
    <R> -> Unit

'registry' @ [42:23] ==> private final val registry: ComponentRegistry defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'addAll' @ [42:32] ==> public final fun addAll(other: ComponentRegistry): Unit defined in org.jetbrains.kotlin.container.ComponentRegistry[SimpleFunctionDescriptorImpl]

'it' @ [42:39] ==> value-parameter it: ComponentStorage defined in org.jetbrains.kotlin.container.ComponentStorage.<init>.<anonymous>[ValueParameterDescriptorImpl]

'registry' @ [42:42] ==> private final val registry: ComponentRegistry defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'LinkedHashSet' @ [45:31] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ComponentDescriptor

'createLinkedSet' @ [46:41] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> createLinkedSet(): MultiMap<(ComponentDescriptor..ComponentDescriptor?), (Type..Type?)> defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ComponentDescriptor
    <V : (Any..Any?)> -> Type

'state' @ [49:13] ==> public final var state: ComponentStorageState defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'Initial' @ [49:44] ==> enum entry Initial defined in org.jetbrains.kotlin.container.ComponentStorageState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [50:19] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'registry' @ [52:21] ==> private final val registry: ComponentRegistry defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'tryGetEntry' @ [52:30] ==> public final fun tryGetEntry(request: Type): Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry[SimpleFunctionDescriptorImpl]

'request' @ [52:42] ==> value-parameter request: Type defined in org.jetbrains.kotlin.container.ComponentStorage.resolve[ValueParameterDescriptorImpl]

'entry' @ [53:13] ==> val entry: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.resolve[LocalVariableDescriptor]

'isNotEmpty' @ [53:19] ==> @InlineOnly public inline fun <T> Collection<ComponentDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ComponentDescriptor

'registerDependency' @ [54:13] ==> private final fun registerDependency(request: Type, context: ValueResolveContext): Unit defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'request' @ [54:32] ==> value-parameter request: Type defined in org.jetbrains.kotlin.container.ComponentStorage.resolve[ValueParameterDescriptorImpl]

'context' @ [54:41] ==> value-parameter context: ValueResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.resolve[ValueParameterDescriptorImpl]

'entry' @ [56:17] ==> val entry: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.resolve[LocalVariableDescriptor]

'size' @ [56:23] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'InvalidCardinalityException' @ [57:23] ==> public constructor InvalidCardinalityException(message: String, descriptors: Collection<ComponentDescriptor>) defined in org.jetbrains.kotlin.container.InvalidCardinalityException[ClassConstructorDescriptorImpl]

'request' @ [57:61] ==> value-parameter request: Type defined in org.jetbrains.kotlin.container.ComponentStorage.resolve[ValueParameterDescriptorImpl]

'entry' @ [57:138] ==> val entry: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.resolve[LocalVariableDescriptor]

'entry' @ [58:20] ==> val entry: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.resolve[LocalVariableDescriptor]

'singleOrNull' @ [58:26] ==> public fun <T> Iterable<ComponentDescriptor>.singleOrNull(): ComponentDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ComponentDescriptor

'context' @ [64:13] ==> value-parameter context: ValueResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.registerDependency[ValueParameterDescriptorImpl]

'context' @ [65:30] ==> value-parameter context: ValueResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.registerDependency[ValueParameterDescriptorImpl]

'requestingDescriptor' @ [65:38] ==> public final val requestingDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.container.ComponentResolveContext[PropertyDescriptorImpl]

'descriptor' @ [66:17] ==> val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.registerDependency[LocalVariableDescriptor]

'dependencies' @ [67:17] ==> private final val dependencies: MultiMap<(ComponentDescriptor..ComponentDescriptor?), (Type..Type?)> defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'putValue' @ [67:30] ==> public open fun putValue(@Nullable p0: ComponentDescriptor?, p1: (Type..Type?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'descriptor' @ [67:39] ==> val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.registerDependency[LocalVariableDescriptor]

'request' @ [67:51] ==> value-parameter request: Type defined in org.jetbrains.kotlin.container.ComponentStorage.registerDependency[ValueParameterDescriptorImpl]

'with' @ [72:44] ==> @InlineOnly public inline fun <T, R> with(receiver: PrintStream, block: PrintStream.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PrintStream
    <R> -> Unit

'printer' @ [72:50] ==> value-parameter printer: PrintStream defined in org.jetbrains.kotlin.container.ComponentStorage.dump[ValueParameterDescriptorImpl]

'myId' @ [73:36] ==> private final val myId: String defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'println' @ [74:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'heading' @ [74:17] ==> val heading: String defined in org.jetbrains.kotlin.container.ComponentStorage.dump.<anonymous>[LocalVariableDescriptor]

'println' @ [75:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'repeat' @ [75:21] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'heading' @ [75:28] ==> val heading: String defined in org.jetbrains.kotlin.container.ComponentStorage.dump.<anonymous>[LocalVariableDescriptor]

'length' @ [75:36] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'println' @ [76:9] ==> public open fun println(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'getDescriptorsInDisposeOrder' @ [77:9] ==> private final fun getDescriptorsInDisposeOrder(): List<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'forEach' @ [77:40] ==> @HidesMembers public inline fun <T> Iterable<ComponentDescriptor>.forEach(action: (ComponentDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ComponentDescriptor

'println' @ [78:13] ==> public open fun println(p0: (Any..Any?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'descriptor' @ [78:21] ==> value-parameter descriptor: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.dump.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'dependencies' @ [79:13] ==> private final val dependencies: MultiMap<(ComponentDescriptor..ComponentDescriptor?), (Type..Type?)> defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'descriptor' @ [79:26] ==> value-parameter descriptor: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.dump.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [79:38] ==> @HidesMembers public inline fun <T> Iterable<(Type..Type?)>.forEach(action: ((Type..Type?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'print' @ [80:17] ==> public open fun print(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'it' @ [81:32] ==> value-parameter it: (Type..Type?) defined in org.jetbrains.kotlin.container.ComponentStorage.dump.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [81:35] ==> public open fun toString(): String defined in java.lang.reflect.Type[DeserializedSimpleFunctionDescriptor]

'print' @ [82:17] ==> public open fun print(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'typeName' @ [82:23] ==> val typeName: String defined in org.jetbrains.kotlin.container.ComponentStorage.dump.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'substringBefore' @ [82:32] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'print' @ [83:17] ==> public open fun print(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'print' @ [84:17] ==> public open fun print(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'typeName' @ [84:23] ==> val typeName: String defined in org.jetbrains.kotlin.container.ComponentStorage.dump.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'substringAfterLast' @ [84:32] ==> public fun String.substringAfterLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'registry' @ [85:31] ==> private final val registry: ComponentRegistry defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'tryGetEntry' @ [85:40] ==> public final fun tryGetEntry(request: Type): Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry[SimpleFunctionDescriptorImpl]

'it' @ [85:52] ==> value-parameter it: (Type..Type?) defined in org.jetbrains.kotlin.container.ComponentStorage.dump.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'print' @ [86:17] ==> public open fun print(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'print' @ [87:17] ==> public open fun print(p0: (Any..Any?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'resolve' @ [87:23] ==> val resolve: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.dump.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'println' @ [88:17] ==> public open fun println(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'println' @ [90:13] ==> public open fun println(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'registerDependency' @ [96:9] ==> private final fun registerDependency(request: Type, context: ValueResolveContext): Unit defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'request' @ [96:28] ==> value-parameter request: Type defined in org.jetbrains.kotlin.container.ComponentStorage.resolveMultiple[ValueParameterDescriptorImpl]

'context' @ [96:37] ==> value-parameter context: ValueResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.resolveMultiple[ValueParameterDescriptorImpl]

'registry' @ [97:16] ==> private final val registry: ComponentRegistry defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'tryGetEntry' @ [97:25] ==> public final fun tryGetEntry(request: Type): Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry[SimpleFunctionDescriptorImpl]

'request' @ [97:37] ==> value-parameter request: Type defined in org.jetbrains.kotlin.container.ComponentStorage.resolveMultiple[ValueParameterDescriptorImpl]

'state' @ [101:13] ==> public final var state: ComponentStorageState defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'Disposed' @ [101:44] ==> enum entry Disposed defined in org.jetbrains.kotlin.container.ComponentStorageState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [102:19] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'state' @ [102:82] ==> public final var state: ComponentStorageState defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'items' @ [105:28] ==> value-parameter items: List<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.registerDescriptors[ValueParameterDescriptorImpl]

'descriptors' @ [106:13] ==> private final val descriptors: LinkedHashSet<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'add' @ [106:25] ==> public open fun add(element: ComponentDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [106:29] ==> val descriptor: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.registerDescriptors[LocalVariableDescriptor]

'state' @ [108:13] ==> public final var state: ComponentStorageState defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'Initialized' @ [108:44] ==> enum entry Initialized defined in org.jetbrains.kotlin.container.ComponentStorageState[FakeCallableDescriptorForObject]

'composeDescriptors' @ [109:13] ==> private final fun composeDescriptors(context: ComponentResolveContext, descriptors: Collection<ComponentDescriptor>): Unit defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'context' @ [109:32] ==> value-parameter context: ComponentResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.registerDescriptors[ValueParameterDescriptorImpl]

'items' @ [109:41] ==> value-parameter items: List<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.registerDescriptors[ValueParameterDescriptorImpl]

'state' @ [114:13] ==> public final var state: ComponentStorageState defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'Initial' @ [114:44] ==> enum entry Initial defined in org.jetbrains.kotlin.container.ComponentStorageState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [115:19] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'myId' @ [115:61] ==> private final val myId: String defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'state' @ [117:9] ==> public final var state: ComponentStorageState defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'Initialized' @ [117:39] ==> enum entry Initialized defined in org.jetbrains.kotlin.container.ComponentStorageState[FakeCallableDescriptorForObject]

'composeDescriptors' @ [118:9] ==> private final fun composeDescriptors(context: ComponentResolveContext, descriptors: Collection<ComponentDescriptor>): Unit defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'context' @ [118:28] ==> value-parameter context: ComponentResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.compose[ValueParameterDescriptorImpl]

'descriptors' @ [118:37] ==> private final val descriptors: LinkedHashSet<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'descriptors' @ [122:13] ==> value-parameter descriptors: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.composeDescriptors[ValueParameterDescriptorImpl]

'isEmpty' @ [122:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'registry' @ [124:9] ==> private final val registry: ComponentRegistry defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'addAll' @ [124:18] ==> public final fun addAll(descriptors: Collection<ComponentDescriptor>): Unit defined in org.jetbrains.kotlin.container.ComponentRegistry[SimpleFunctionDescriptorImpl]

'descriptors' @ [124:25] ==> value-parameter descriptors: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.composeDescriptors[ValueParameterDescriptorImpl]

'inspectDependenciesAndRegisterAdhoc' @ [126:25] ==> private final fun inspectDependenciesAndRegisterAdhoc(context: ComponentResolveContext, descriptors: Collection<ComponentDescriptor>): LinkedHashSet<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'context' @ [126:61] ==> value-parameter context: ComponentResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.composeDescriptors[ValueParameterDescriptorImpl]

'descriptors' @ [126:70] ==> value-parameter descriptors: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.composeDescriptors[ValueParameterDescriptorImpl]

'injectProperties' @ [128:9] ==> private final fun injectProperties(context: ComponentResolveContext, components: Collection<ComponentDescriptor>): Unit defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'context' @ [128:26] ==> value-parameter context: ComponentResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.composeDescriptors[ValueParameterDescriptorImpl]

'descriptors' @ [128:35] ==> value-parameter descriptors: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.composeDescriptors[ValueParameterDescriptorImpl]

'implicits' @ [128:49] ==> val implicits: LinkedHashSet<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.composeDescriptors[LocalVariableDescriptor]

'components' @ [132:27] ==> value-parameter components: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.injectProperties[ValueParameterDescriptorImpl]

'component' @ [133:17] ==> val component: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.injectProperties[LocalVariableDescriptor]

'shouldInjectProperties' @ [133:27] ==> public open val shouldInjectProperties: Boolean defined in org.jetbrains.kotlin.container.ComponentDescriptor[PropertyDescriptorImpl]

'injectProperties' @ [134:17] ==> private final fun injectProperties(instance: Any, context: ValueResolveContext): Unit defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'component' @ [134:34] ==> val component: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.injectProperties[LocalVariableDescriptor]

'getValue' @ [134:44] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ComponentDescriptor[SimpleFunctionDescriptorImpl]

'context' @ [134:56] ==> value-parameter context: ComponentResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.injectProperties[ValueParameterDescriptorImpl]

'container' @ [134:64] ==> public final val container: StorageComponentContainer defined in org.jetbrains.kotlin.container.ComponentResolveContext[PropertyDescriptorImpl]

'createResolveContext' @ [134:74] ==> public open fun createResolveContext(requestingDescriptor: ValueDescriptor): ValueResolveContext defined in org.jetbrains.kotlin.container.StorageComponentContainer[SimpleFunctionDescriptorImpl]

'component' @ [134:95] ==> val component: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.injectProperties[LocalVariableDescriptor]

'LinkedHashSet' @ [140:21] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ComponentDescriptor

'HashSet' @ [141:28] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Type

'descriptors' @ [142:28] ==> value-parameter descriptors: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.inspectDependenciesAndRegisterAdhoc[ValueParameterDescriptorImpl]

'collectAdhocComponents' @ [143:13] ==> private final fun collectAdhocComponents(context: ComponentResolveContext, descriptor: ComponentDescriptor, visitedTypes: HashSet<Type>, adhocDescriptors: LinkedHashSet<ComponentDescriptor>): Unit defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'context' @ [143:36] ==> value-parameter context: ComponentResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.inspectDependenciesAndRegisterAdhoc[ValueParameterDescriptorImpl]

'descriptor' @ [143:45] ==> val descriptor: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.inspectDependenciesAndRegisterAdhoc[LocalVariableDescriptor]

'visitedTypes' @ [143:57] ==> val visitedTypes: HashSet<Type> defined in org.jetbrains.kotlin.container.ComponentStorage.inspectDependenciesAndRegisterAdhoc[LocalVariableDescriptor]

'adhoc' @ [143:71] ==> val adhoc: LinkedHashSet<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.inspectDependenciesAndRegisterAdhoc[LocalVariableDescriptor]

'registry' @ [145:9] ==> private final val registry: ComponentRegistry defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'addAll' @ [145:18] ==> public final fun addAll(descriptors: Collection<ComponentDescriptor>): Unit defined in org.jetbrains.kotlin.container.ComponentRegistry[SimpleFunctionDescriptorImpl]

'adhoc' @ [145:25] ==> val adhoc: LinkedHashSet<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.inspectDependenciesAndRegisterAdhoc[LocalVariableDescriptor]

'adhoc' @ [146:16] ==> val adhoc: LinkedHashSet<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.inspectDependenciesAndRegisterAdhoc[LocalVariableDescriptor]

'descriptor' @ [152:28] ==> value-parameter descriptor: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[ValueParameterDescriptorImpl]

'getDependencies' @ [152:39] ==> public abstract fun getDependencies(context: ValueResolveContext): Collection<Type> defined in org.jetbrains.kotlin.container.ComponentDescriptor[SimpleFunctionDescriptorImpl]

'context' @ [152:55] ==> value-parameter context: ComponentResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[ValueParameterDescriptorImpl]

'dependencies' @ [153:22] ==> val dependencies: Collection<Type> defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[LocalVariableDescriptor]

'!' @ [154:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'visitedTypes' @ [154:18] ==> value-parameter visitedTypes: HashSet<Type> defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[ValueParameterDescriptorImpl]

'add' @ [154:31] ==> public open fun add(element: Type): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'type' @ [154:35] ==> val type: Type defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[LocalVariableDescriptor]

'registry' @ [157:25] ==> private final val registry: ComponentRegistry defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'tryGetEntry' @ [157:34] ==> public final fun tryGetEntry(request: Type): Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry[SimpleFunctionDescriptorImpl]

'type' @ [157:46] ==> val type: Type defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[LocalVariableDescriptor]

'entry' @ [158:17] ==> val entry: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[LocalVariableDescriptor]

'isEmpty' @ [158:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'when (type) {
                    is Class<*> -> type
                    is ParameterizedType -> type.rawType as? Class<*>
                    else -> null
                }' @ [159:42] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Class<*>?, entry1: Class<*>?, entry2: Class<*>?): Class<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Class<*>?

'type' @ [159:48] ==> val type: Type defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[LocalVariableDescriptor]

'type' @ [160:36] ==> val type: Type defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[LocalVariableDescriptor]

'type' @ [161:45] ==> val type: Type defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[LocalVariableDescriptor]

'rawType' @ [161:50] ==> public final val ParameterizedType.rawType: (Type..Type?)[MyPropertyDescriptor]

'rawType' @ [165:42] ==> val rawType: Class<*>? defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[LocalVariableDescriptor]

'let' @ [165:51] ==> @InlineOnly public inline fun <T, R> Class<out (Any..Any?)>.let(block: (Class<out (Any..Any?)>) -> ComponentDescriptor?): ComponentDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out (kotlin.Any..kotlin.Any?)>
    <R> -> ComponentDescriptor?

'getImplicitlyDefinedDependency' @ [165:57] ==> private final fun getImplicitlyDefinedDependency(context: ComponentResolveContext, rawType: Class<*>): ComponentDescriptor? defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'context' @ [165:88] ==> value-parameter context: ComponentResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[ValueParameterDescriptorImpl]

'it' @ [165:97] ==> value-parameter it: Class<out (Any..Any?)> defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents.<anonymous>[ValueParameterDescriptorImpl]

'adhocDescriptors' @ [167:17] ==> value-parameter adhocDescriptors: LinkedHashSet<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[ValueParameterDescriptorImpl]

'add' @ [167:34] ==> public open fun add(element: ComponentDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'implicitDependency' @ [167:38] ==> val implicitDependency: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[LocalVariableDescriptor]

'collectAdhocComponents' @ [168:17] ==> private final fun collectAdhocComponents(context: ComponentResolveContext, descriptor: ComponentDescriptor, visitedTypes: HashSet<Type>, adhocDescriptors: LinkedHashSet<ComponentDescriptor>): Unit defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'context' @ [168:40] ==> value-parameter context: ComponentResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[ValueParameterDescriptorImpl]

'implicitDependency' @ [168:49] ==> val implicitDependency: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[LocalVariableDescriptor]

'visitedTypes' @ [168:69] ==> value-parameter visitedTypes: HashSet<Type> defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[ValueParameterDescriptorImpl]

'adhocDescriptors' @ [168:83] ==> value-parameter adhocDescriptors: LinkedHashSet<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.collectAdhocComponents[ValueParameterDescriptorImpl]

'!' @ [174:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAbstract' @ [174:23] ==> public open fun isAbstract(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'rawType' @ [174:34] ==> value-parameter rawType: Class<*> defined in org.jetbrains.kotlin.container.ComponentStorage.getImplicitlyDefinedDependency[ValueParameterDescriptorImpl]

'modifiers' @ [174:42] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.modifiers: Int[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'!' @ [174:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'rawType' @ [174:57] ==> value-parameter rawType: Class<*> defined in org.jetbrains.kotlin.container.ComponentStorage.getImplicitlyDefinedDependency[ValueParameterDescriptorImpl]

'isPrimitive' @ [174:65] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isPrimitive: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'ImplicitSingletonTypeComponentDescriptor' @ [175:20] ==> public constructor ImplicitSingletonTypeComponentDescriptor(container: ComponentContainer, klass: Class<*>) defined in org.jetbrains.kotlin.container.ImplicitSingletonTypeComponentDescriptor[ClassConstructorDescriptorImpl]

'context' @ [175:61] ==> value-parameter context: ComponentResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.getImplicitlyDefinedDependency[ValueParameterDescriptorImpl]

'container' @ [175:69] ==> public final val container: StorageComponentContainer defined in org.jetbrains.kotlin.container.ComponentResolveContext[PropertyDescriptorImpl]

'rawType' @ [175:80] ==> value-parameter rawType: Class<*> defined in org.jetbrains.kotlin.container.ComponentStorage.getImplicitlyDefinedDependency[ValueParameterDescriptorImpl]

'rawType' @ [178:37] ==> value-parameter rawType: Class<*> defined in org.jetbrains.kotlin.container.ComponentStorage.getImplicitlyDefinedDependency[ValueParameterDescriptorImpl]

'getInfo' @ [178:45] ==> public fun Class<*>.getInfo(): ClassInfo defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'defaultImplementation' @ [178:55] ==> public final val defaultImplementation: Class<*>? defined in org.jetbrains.kotlin.container.ClassInfo[PropertyDescriptorImpl]

'defaultImplementation' @ [179:13] ==> val defaultImplementation: Class<*>? defined in org.jetbrains.kotlin.container.ComponentStorage.getImplicitlyDefinedDependency[LocalVariableDescriptor]

'defaultImplementation' @ [179:46] ==> val defaultImplementation: Class<*>? defined in org.jetbrains.kotlin.container.ComponentStorage.getImplicitlyDefinedDependency[LocalVariableDescriptor]

'getInfo' @ [179:68] ==> public fun Class<*>.getInfo(): ClassInfo defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'constructorInfo' @ [179:78] ==> public final val constructorInfo: ConstructorInfo? defined in org.jetbrains.kotlin.container.ClassInfo[PropertyDescriptorImpl]

'DefaultSingletonTypeComponentDescriptor' @ [180:20] ==> public constructor DefaultSingletonTypeComponentDescriptor(container: ComponentContainer, klass: Class<*>) defined in org.jetbrains.kotlin.container.DefaultSingletonTypeComponentDescriptor[ClassConstructorDescriptorImpl]

'context' @ [180:60] ==> value-parameter context: ComponentResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.getImplicitlyDefinedDependency[ValueParameterDescriptorImpl]

'container' @ [180:68] ==> public final val container: StorageComponentContainer defined in org.jetbrains.kotlin.container.ComponentResolveContext[PropertyDescriptorImpl]

'defaultImplementation' @ [180:79] ==> val defaultImplementation: Class<*>? defined in org.jetbrains.kotlin.container.ComponentStorage.getImplicitlyDefinedDependency[LocalVariableDescriptor]

'defaultImplementation' @ [183:13] ==> val defaultImplementation: Class<*>? defined in org.jetbrains.kotlin.container.ComponentStorage.getImplicitlyDefinedDependency[LocalVariableDescriptor]

'defaultImplementation' @ [184:20] ==> val defaultImplementation: Class<*>? defined in org.jetbrains.kotlin.container.ComponentStorage.getImplicitlyDefinedDependency[LocalVariableDescriptor]

'getField' @ [184:42] ==> @CallerSensitive public open fun getField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'get' @ [184:64] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'let' @ [184:75] ==> @InlineOnly public inline fun <T, R> Any.let(block: (Any) -> DefaultInstanceComponentDescriptor): DefaultInstanceComponentDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any
    <R> -> DefaultInstanceComponentDescriptor

'instance' @ [191:25] ==> value-parameter instance: Any defined in org.jetbrains.kotlin.container.ComponentStorage.injectProperties[ValueParameterDescriptorImpl]

'java' @ [191:41] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'getInfo' @ [191:46] ==> public fun Class<*>.getInfo(): ClassInfo defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'classInfo' @ [193:9] ==> val classInfo: ClassInfo defined in org.jetbrains.kotlin.container.ComponentStorage.injectProperties[LocalVariableDescriptor]

'setterInfos' @ [193:19] ==> public final val setterInfos: List<SetterInfo> defined in org.jetbrains.kotlin.container.ClassInfo[PropertyDescriptorImpl]

'forEach' @ [193:31] ==> @HidesMembers public inline fun <T> Iterable<SetterInfo>.forEach(action: (SetterInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SetterInfo

'component1' @ [193:42] ==> public final operator fun component1(): Method defined in org.jetbrains.kotlin.container.SetterInfo[SimpleFunctionDescriptorImpl]

'method' @ [194:33] ==> val method: Method defined in org.jetbrains.kotlin.container.ComponentStorage.injectProperties.<anonymous>[LocalVariableDescriptor]

'bindToMethod' @ [194:40] ==> public fun Method.bindToMethod(context: ValueResolveContext): MethodBinding defined in org.jetbrains.kotlin.container in file Resolve.kt[SimpleFunctionDescriptorImpl]

'context' @ [194:53] ==> value-parameter context: ValueResolveContext defined in org.jetbrains.kotlin.container.ComponentStorage.injectProperties[ValueParameterDescriptorImpl]

'methodBinding' @ [195:13] ==> val methodBinding: MethodBinding defined in org.jetbrains.kotlin.container.ComponentStorage.injectProperties.<anonymous>[LocalVariableDescriptor]

'invoke' @ [195:27] ==> public final fun invoke(instance: Any): Unit defined in org.jetbrains.kotlin.container.MethodBinding[SimpleFunctionDescriptorImpl]

'instance' @ [195:34] ==> value-parameter instance: Any defined in org.jetbrains.kotlin.container.ComponentStorage.injectProperties[ValueParameterDescriptorImpl]

'state' @ [200:13] ==> public final var state: ComponentStorageState defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'Initialized' @ [200:44] ==> enum entry Initialized defined in org.jetbrains.kotlin.container.ComponentStorageState[FakeCallableDescriptorForObject]

'state' @ [201:17] ==> public final var state: ComponentStorageState defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'Initial' @ [201:48] ==> enum entry Initial defined in org.jetbrains.kotlin.container.ComponentStorageState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [203:19] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'state' @ [203:97] ==> public final var state: ComponentStorageState defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'state' @ [206:9] ==> public final var state: ComponentStorageState defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'Disposing' @ [206:39] ==> enum entry Disposing defined in org.jetbrains.kotlin.container.ComponentStorageState[FakeCallableDescriptorForObject]

'getDescriptorsInDisposeOrder' @ [207:27] ==> private final fun getDescriptorsInDisposeOrder(): List<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'disposeList' @ [208:28] ==> val disposeList: List<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.dispose[LocalVariableDescriptor]

'disposeDescriptor' @ [209:13] ==> private final fun disposeDescriptor(descriptor: ComponentDescriptor): Unit defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'descriptor' @ [209:31] ==> val descriptor: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.dispose[LocalVariableDescriptor]

'state' @ [210:9] ==> public final var state: ComponentStorageState defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'Disposed' @ [210:39] ==> enum entry Disposed defined in org.jetbrains.kotlin.container.ComponentStorageState[FakeCallableDescriptorForObject]

'topologicalSort' @ [214:16] ==> public fun <T> topologicalSort(items: Iterable<ComponentDescriptor>, dependencies: (ComponentDescriptor) -> Iterable<ComponentDescriptor>): List<ComponentDescriptor> defined in org.jetbrains.kotlin.container[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ComponentDescriptor

'descriptors' @ [214:32] ==> private final val descriptors: LinkedHashSet<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'ArrayList' @ [215:29] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ComponentDescriptor

'dependencies' @ [216:35] ==> private final val dependencies: MultiMap<(ComponentDescriptor..ComponentDescriptor?), (Type..Type?)> defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'it' @ [216:48] ==> value-parameter it: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.getDescriptorsInDisposeOrder.<anonymous>[ValueParameterDescriptorImpl]

'registry' @ [217:36] ==> private final val registry: ComponentRegistry defined in org.jetbrains.kotlin.container.ComponentStorage[PropertyDescriptorImpl]

'tryGetEntry' @ [217:45] ==> public final fun tryGetEntry(request: Type): Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry[SimpleFunctionDescriptorImpl]

'interfaceType' @ [217:57] ==> val interfaceType: (Type..Type?) defined in org.jetbrains.kotlin.container.ComponentStorage.getDescriptorsInDisposeOrder.<anonymous>[LocalVariableDescriptor]

'dependent' @ [218:21] ==> val dependent: ArrayList<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.getDescriptorsInDisposeOrder.<anonymous>[LocalVariableDescriptor]

'add' @ [218:31] ==> public open fun add(element: ComponentDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'dependency' @ [218:35] ==> val dependency: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.getDescriptorsInDisposeOrder.<anonymous>[LocalVariableDescriptor]

'dependent' @ [221:13] ==> val dependent: ArrayList<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage.getDescriptorsInDisposeOrder.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [226:13] ==> value-parameter descriptor: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.disposeDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [227:13] ==> value-parameter descriptor: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentStorage.disposeDescriptor[ValueParameterDescriptorImpl]

'close' @ [227:24] ==> public abstract fun close(): Unit defined in java.io.Closeable[JavaMethodDescriptor]

