'Exception' @ [25:56] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'message' @ [25:66] ==> value-parameter message: String defined in org.jetbrains.kotlin.container.ContainerConsistencyException.<init>[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [37:42] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'getValue' @ [42:52] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'parent' @ [43:29] ==> value-parameter parent: StorageComponentContainer? = ... defined in org.jetbrains.kotlin.container.StorageComponentContainer.<init>[ValueParameterDescriptorImpl]

'let' @ [43:37] ==> @InlineOnly public inline fun <T, R> StorageComponentContainer.let(block: (StorageComponentContainer) -> ComponentResolveContext): ComponentResolveContext defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StorageComponentContainer
    <R> -> ComponentResolveContext

'ComponentResolveContext' @ [43:43] ==> public constructor ComponentResolveContext(container: StorageComponentContainer, requestingDescriptor: ValueDescriptor, parentContext: ValueResolveContext? = ...) defined in org.jetbrains.kotlin.container.ComponentResolveContext[ClassConstructorDescriptorImpl]

'it' @ [43:67] ==> value-parameter it: StorageComponentContainer defined in org.jetbrains.kotlin.container.StorageComponentContainer.unknownContext.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'DynamicComponentDescriptor' @ [43:71] ==> public object DynamicComponentDescriptor : ValueDescriptor defined in org.jetbrains.kotlin.container in file Container.kt[FakeCallableDescriptorForObject]

'ComponentResolveContext' @ [44:9] ==> public constructor ComponentResolveContext(container: StorageComponentContainer, requestingDescriptor: ValueDescriptor, parentContext: ValueResolveContext? = ...) defined in org.jetbrains.kotlin.container.ComponentResolveContext[ClassConstructorDescriptorImpl]

'this' @ [44:33] ==> <this> defined in org.jetbrains.kotlin.container.StorageComponentContainer[LazyClassReceiverParameterDescriptor]

'DynamicComponentDescriptor' @ [44:39] ==> public object DynamicComponentDescriptor : ValueDescriptor defined in org.jetbrains.kotlin.container in file Container.kt[FakeCallableDescriptorForObject]

'parentContext' @ [44:67] ==> val parentContext: ComponentResolveContext? defined in org.jetbrains.kotlin.container.StorageComponentContainer.unknownContext.<anonymous>[LocalVariableDescriptor]

'ComponentStorage' @ [46:54] ==> public constructor ComponentStorage(myId: String, parent: ComponentStorage?) defined in org.jetbrains.kotlin.container.ComponentStorage[ClassConstructorDescriptorImpl]

'id' @ [46:71] ==> value-parameter id: String defined in org.jetbrains.kotlin.container.StorageComponentContainer.<init>[ValueParameterDescriptorImpl]

'parent' @ [46:75] ==> value-parameter parent: StorageComponentContainer? = ... defined in org.jetbrains.kotlin.container.StorageComponentContainer.<init>[ValueParameterDescriptorImpl]

'componentStorage' @ [46:83] ==> private final val componentStorage: ComponentStorage defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'requestingDescriptor' @ [49:13] ==> value-parameter requestingDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.container.StorageComponentContainer.createResolveContext[ValueParameterDescriptorImpl]

'DynamicComponentDescriptor' @ [49:37] ==> public object DynamicComponentDescriptor : ValueDescriptor defined in org.jetbrains.kotlin.container in file Container.kt[FakeCallableDescriptorForObject]

'unknownContext' @ [50:20] ==> public final val unknownContext: ComponentResolveContext defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'ComponentResolveContext' @ [51:16] ==> public constructor ComponentResolveContext(container: StorageComponentContainer, requestingDescriptor: ValueDescriptor, parentContext: ValueResolveContext? = ...) defined in org.jetbrains.kotlin.container.ComponentResolveContext[ClassConstructorDescriptorImpl]

'this' @ [51:40] ==> <this> defined in org.jetbrains.kotlin.container.StorageComponentContainer[LazyClassReceiverParameterDescriptor]

'requestingDescriptor' @ [51:46] ==> value-parameter requestingDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.container.StorageComponentContainer.createResolveContext[ValueParameterDescriptorImpl]

'componentStorage' @ [55:9] ==> private final val componentStorage: ComponentStorage defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'compose' @ [55:26] ==> public final fun compose(context: ComponentResolveContext): Unit defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'unknownContext' @ [55:34] ==> public final val unknownContext: ComponentResolveContext defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'this' @ [56:16] ==> <this> defined in org.jetbrains.kotlin.container.StorageComponentContainer[LazyClassReceiverParameterDescriptor]

'componentStorage' @ [60:9] ==> private final val componentStorage: ComponentStorage defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'dump' @ [60:26] ==> public final fun dump(printer: PrintStream): Unit defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'printer' @ [60:31] ==> value-parameter printer: PrintStream defined in org.jetbrains.kotlin.container.StorageComponentContainer.dump[ValueParameterDescriptorImpl]

'componentStorage' @ [63:28] ==> private final val componentStorage: ComponentStorage defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'dispose' @ [63:45] ==> public final fun dispose(): Unit defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'componentStorage' @ [66:16] ==> private final val componentStorage: ComponentStorage defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'resolve' @ [66:33] ==> public open fun resolve(request: Type, context: ValueResolveContext): ValueDescriptor? defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'request' @ [66:41] ==> value-parameter request: Type defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolve[ValueParameterDescriptorImpl]

'context' @ [66:50] ==> value-parameter context: ValueResolveContext defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolve[ValueParameterDescriptorImpl]

'resolveIterable' @ [66:62] ==> private final fun resolveIterable(request: Type, context: ValueResolveContext): ValueDescriptor? defined in org.jetbrains.kotlin.container.StorageComponentContainer[SimpleFunctionDescriptorImpl]

'request' @ [66:78] ==> value-parameter request: Type defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolve[ValueParameterDescriptorImpl]

'context' @ [66:87] ==> value-parameter context: ValueResolveContext defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolve[ValueParameterDescriptorImpl]

'resolve' @ [70:16] ==> public final fun resolve(request: Type, context: ValueResolveContext): ValueDescriptor? defined in org.jetbrains.kotlin.container.StorageComponentContainer[SimpleFunctionDescriptorImpl]

'request' @ [70:24] ==> value-parameter request: Type defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolve[ValueParameterDescriptorImpl]

'unknownContext' @ [70:33] ==> public final val unknownContext: ComponentResolveContext defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'request' @ [74:13] ==> value-parameter request: Type defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[ValueParameterDescriptorImpl]

'request' @ [75:23] ==> value-parameter request: Type defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[ValueParameterDescriptorImpl]

'rawType' @ [75:31] ==> public final val ParameterizedType.rawType: (Type..Type?)[MyPropertyDescriptor]

'rawType' @ [76:13] ==> val rawType: (Type..Type?) defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[LocalVariableDescriptor]

'Iterable' @ [76:24] ==> @InlineOnly public inline fun <T> Iterable(crossinline iterator: () -> Iterator<???>): Iterable<???> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@585942da

'java' @ [76:40] ==> public val <T> KClass<Iterable<*>>.java: Class<Iterable<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Iterable<*>

'request' @ [77:29] ==> value-parameter request: Type defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[ValueParameterDescriptorImpl]

'actualTypeArguments' @ [77:37] ==> public final val ParameterizedType.actualTypeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'typeArguments' @ [78:13] ==> val typeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[LocalVariableDescriptor]

'size' @ [78:27] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'typeArguments' @ [79:36] ==> val typeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[LocalVariableDescriptor]

'when (iterableTypeArgument) {
            is WildcardType -> {
                val upperBounds = iterableTypeArgument.upperBounds
                if (upperBounds.size != 1) return null
                upperBounds[0]
            }
            is Class<*> -> iterableTypeArgument
            is ParameterizedType -> iterableTypeArgument
            else -> return null
        }' @ [80:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Type..Type?), entry1: (Type..Type?), entry2: (Type..Type?), entry3: (Type..Type?)): (Type..Type?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'iterableTypeArgument' @ [80:34] ==> val iterableTypeArgument: (Type..Type?) defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[LocalVariableDescriptor]

'iterableTypeArgument' @ [82:35] ==> val iterableTypeArgument: (Type..Type?) defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[LocalVariableDescriptor]

'upperBounds' @ [82:56] ==> public final val WildcardType.upperBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'upperBounds' @ [83:21] ==> val upperBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[LocalVariableDescriptor]

'size' @ [83:33] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'upperBounds' @ [84:17] ==> val upperBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[LocalVariableDescriptor]

'iterableTypeArgument' @ [86:28] ==> val iterableTypeArgument: (Type..Type?) defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[LocalVariableDescriptor]

'iterableTypeArgument' @ [87:37] ==> val iterableTypeArgument: (Type..Type?) defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[LocalVariableDescriptor]

'IterableDescriptor' @ [90:16] ==> public constructor IterableDescriptor(descriptors: Iterable<ValueDescriptor>) defined in org.jetbrains.kotlin.container.IterableDescriptor[ClassConstructorDescriptorImpl]

'componentStorage' @ [90:35] ==> private final val componentStorage: ComponentStorage defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'resolveMultiple' @ [90:52] ==> public final fun resolveMultiple(request: Type, context: ValueResolveContext): Iterable<ValueDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'iterableType' @ [90:68] ==> val iterableType: (Type..Type?) defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[LocalVariableDescriptor]

'context' @ [90:82] ==> value-parameter context: ValueResolveContext defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveIterable[ValueParameterDescriptorImpl]

'unknownContext' @ [93:75] ==> public final val unknownContext: ComponentResolveContext defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'componentStorage' @ [94:16] ==> private final val componentStorage: ComponentStorage defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'resolveMultiple' @ [94:33] ==> public final fun resolveMultiple(request: Type, context: ValueResolveContext): Iterable<ValueDescriptor> defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'request' @ [94:49] ==> value-parameter request: Class<*> defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveMultiple[ValueParameterDescriptorImpl]

'context' @ [94:58] ==> value-parameter context: ValueResolveContext = ... defined in org.jetbrains.kotlin.container.StorageComponentContainer.resolveMultiple[ValueParameterDescriptorImpl]

'componentStorage' @ [98:9] ==> private final val componentStorage: ComponentStorage defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'registerDescriptors' @ [98:26] ==> internal final fun registerDescriptors(context: ComponentResolveContext, items: List<ComponentDescriptor>): Unit defined in org.jetbrains.kotlin.container.ComponentStorage[SimpleFunctionDescriptorImpl]

'unknownContext' @ [98:46] ==> public final val unknownContext: ComponentResolveContext defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'descriptors' @ [98:62] ==> value-parameter descriptors: List<ComponentDescriptor> defined in org.jetbrains.kotlin.container.StorageComponentContainer.registerDescriptors[ValueParameterDescriptorImpl]

'this' @ [99:16] ==> <this> defined in org.jetbrains.kotlin.container.StorageComponentContainer[LazyClassReceiverParameterDescriptor]

'request' @ [103:34] ==> value-parameter request: Class<T> defined in org.jetbrains.kotlin.container.StorageComponentContainer.create[ValueParameterDescriptorImpl]

'bindToConstructor' @ [103:42] ==> public fun Class<*>.bindToConstructor(context: ValueResolveContext): ConstructorBinding defined in org.jetbrains.kotlin.container in file Resolve.kt[SimpleFunctionDescriptorImpl]

'unknownContext' @ [103:60] ==> public final val unknownContext: ComponentResolveContext defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'constructorBinding' @ [104:20] ==> val constructorBinding: ConstructorBinding defined in org.jetbrains.kotlin.container.StorageComponentContainer.create[LocalVariableDescriptor]

'argumentDescriptors' @ [104:39] ==> public final val argumentDescriptors: List<ValueDescriptor> defined in org.jetbrains.kotlin.container.ConstructorBinding[PropertyDescriptorImpl]

'map' @ [104:59] ==> public inline fun <T, R> Iterable<ValueDescriptor>.map(transform: (ValueDescriptor) -> Any): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueDescriptor
    <R> -> Any

'it' @ [104:65] ==> value-parameter it: ValueDescriptor defined in org.jetbrains.kotlin.container.StorageComponentContainer.create.<anonymous>[ValueParameterDescriptorImpl]

'getValue' @ [104:68] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ValueDescriptor[SimpleFunctionDescriptorImpl]

'toTypedArray' @ [104:81] ==> public inline fun <reified T> Collection<Any>.toTypedArray(): Array<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any

'constructorBinding' @ [105:16] ==> val constructorBinding: ConstructorBinding defined in org.jetbrains.kotlin.container.StorageComponentContainer.create[LocalVariableDescriptor]

'constructor' @ [105:35] ==> public final val constructor: Constructor<*> defined in org.jetbrains.kotlin.container.ConstructorBinding[PropertyDescriptorImpl]

'newInstance' @ [105:47] ==> @CallerSensitive public open fun newInstance(vararg p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Constructor[JavaMethodDescriptor]

'args' @ [105:60] ==> val args: Array<Any> defined in org.jetbrains.kotlin.container.StorageComponentContainer.create[LocalVariableDescriptor]

'registerDescriptors' @ [110:12] ==> internal final fun registerDescriptors(descriptors: List<ComponentDescriptor>): StorageComponentContainer defined in org.jetbrains.kotlin.container.StorageComponentContainer[SimpleFunctionDescriptorImpl]

'listOf' @ [110:32] ==> public fun <T> listOf(element: SingletonTypeComponentDescriptor): List<SingletonTypeComponentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SingletonTypeComponentDescriptor

'SingletonTypeComponentDescriptor' @ [110:39] ==> public constructor SingletonTypeComponentDescriptor(container: ComponentContainer, klass: Class<*>) defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor[ClassConstructorDescriptorImpl]

'this' @ [110:72] ==> <this> defined in org.jetbrains.kotlin.container.registerSingleton[ReceiverParameterDescriptorImpl]

'klass' @ [110:78] ==> value-parameter klass: Class<*> defined in org.jetbrains.kotlin.container.registerSingleton[ValueParameterDescriptorImpl]

'registerDescriptors' @ [114:12] ==> internal final fun registerDescriptors(descriptors: List<ComponentDescriptor>): StorageComponentContainer defined in org.jetbrains.kotlin.container.StorageComponentContainer[SimpleFunctionDescriptorImpl]

'listOf' @ [114:32] ==> public fun <T> listOf(element: InstanceComponentDescriptor): List<InstanceComponentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InstanceComponentDescriptor

'InstanceComponentDescriptor' @ [114:39] ==> public constructor InstanceComponentDescriptor(instance: Any) defined in org.jetbrains.kotlin.container.InstanceComponentDescriptor[ClassConstructorDescriptorImpl]

'instance' @ [114:67] ==> value-parameter instance: Any defined in org.jetbrains.kotlin.container.registerInstance[ValueParameterDescriptorImpl]

'unknownContext' @ [117:95] ==> public final val unknownContext: ComponentResolveContext defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'resolve' @ [118:12] ==> public final fun resolve(request: Type, context: ValueResolveContext): ValueDescriptor? defined in org.jetbrains.kotlin.container.StorageComponentContainer[SimpleFunctionDescriptorImpl]

'java' @ [118:29] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'context' @ [118:35] ==> value-parameter context: ValueResolveContext = ... defined in org.jetbrains.kotlin.container.resolve[ValueParameterDescriptorImpl]

'unknownContext' @ [121:103] ==> public final val unknownContext: ComponentResolveContext defined in org.jetbrains.kotlin.container.StorageComponentContainer[PropertyDescriptorImpl]

'resolveMultiple' @ [122:12] ==> public final fun resolveMultiple(request: Class<*>, context: ValueResolveContext = ...): Iterable<ValueDescriptor> defined in org.jetbrains.kotlin.container.StorageComponentContainer[SimpleFunctionDescriptorImpl]

'java' @ [122:37] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'context' @ [122:43] ==> value-parameter context: ValueResolveContext = ... defined in org.jetbrains.kotlin.container.resolveMultiple[ValueParameterDescriptorImpl]

