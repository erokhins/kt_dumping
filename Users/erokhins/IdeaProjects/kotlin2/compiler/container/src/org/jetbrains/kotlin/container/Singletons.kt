'Null' @ [34:58] ==> enum entry Null defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'lazy' @ [35:38] ==> public fun <T> lazy(initializer: () -> ArrayList<Closeable>): Lazy<ArrayList<Closeable>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<Closeable>

'ArrayList' @ [35:45] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Closeable

'when {
            state == ComponentState.Corrupted -> throw ContainerConsistencyException("Component descriptor $this is corrupted and cannot be accessed")
            state == ComponentState.Disposed -> throw ContainerConsistencyException("Component descriptor $this is disposed and cannot be accessed")
            instance == null -> createInstance(container)
        }' @ [38:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'state' @ [39:13] ==> protected final var state: ComponentState defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'Corrupted' @ [39:37] ==> enum entry Corrupted defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [39:56] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'this' @ [39:109] ==> <this> defined in org.jetbrains.kotlin.container.SingletonDescriptor[LazyClassReceiverParameterDescriptor]

'state' @ [40:13] ==> protected final var state: ComponentState defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'Disposed' @ [40:37] ==> enum entry Disposed defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [40:55] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'this' @ [40:108] ==> <this> defined in org.jetbrains.kotlin.container.SingletonDescriptor[LazyClassReceiverParameterDescriptor]

'instance' @ [41:13] ==> private final var instance: Any? defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'createInstance' @ [41:33] ==> private final fun createInstance(container: ComponentContainer): Unit defined in org.jetbrains.kotlin.container.SingletonDescriptor[SimpleFunctionDescriptorImpl]

'container' @ [41:48] ==> public final val container: ComponentContainer defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'instance' @ [43:16] ==> private final var instance: Any? defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'disposableObjects' @ [47:9] ==> private final val disposableObjects: ArrayList<Closeable> defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'add' @ [47:27] ==> public open fun add(element: Closeable): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ownedObject' @ [47:31] ==> value-parameter ownedObject: Closeable defined in org.jetbrains.kotlin.container.SingletonDescriptor.registerDisposableObject[ValueParameterDescriptorImpl]

'when (state) {
            ComponentState.Null -> {
                try {
                    instance = createInstance(container.createResolveContext(this))
                    return
                }
                catch (ex: Throwable) {
                    state = ComponentState.Corrupted
                    for (disposable in disposableObjects)
                        disposable.close()
                    throw ex
                }
            }
            ComponentState.Initializing ->
                throw ContainerConsistencyException("Could not create the component $this because it is being initialized. Do we have undetected circular dependency?")
            ComponentState.Initialized ->
                throw ContainerConsistencyException("Could not get the component $this. Instance is null in Initialized state")
            ComponentState.Corrupted ->
                throw ContainerConsistencyException("Could not get the component $this because it is corrupted")
            ComponentState.Disposing ->
                throw ContainerConsistencyException("Could not get the component $this because it is being disposed")
            ComponentState.Disposed ->
                throw ContainerConsistencyException("Could not get the component $this because it is already disposed")
        }' @ [53:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing, entry4: Nothing, entry5: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'state' @ [53:15] ==> protected final var state: ComponentState defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'Null' @ [54:28] ==> enum entry Null defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'instance' @ [56:21] ==> private final var instance: Any? defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'createInstance' @ [56:32] ==> protected abstract fun createInstance(context: ValueResolveContext): Any defined in org.jetbrains.kotlin.container.SingletonDescriptor[SimpleFunctionDescriptorImpl]

'container' @ [56:47] ==> value-parameter container: ComponentContainer defined in org.jetbrains.kotlin.container.SingletonDescriptor.createInstance[ValueParameterDescriptorImpl]

'createResolveContext' @ [56:57] ==> public abstract fun createResolveContext(requestingDescriptor: ValueDescriptor): ValueResolveContext defined in org.jetbrains.kotlin.container.ComponentContainer[SimpleFunctionDescriptorImpl]

'this' @ [56:78] ==> <this> defined in org.jetbrains.kotlin.container.SingletonDescriptor[LazyClassReceiverParameterDescriptor]

'state' @ [60:21] ==> protected final var state: ComponentState defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'Corrupted' @ [60:44] ==> enum entry Corrupted defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'disposableObjects' @ [61:40] ==> private final val disposableObjects: ArrayList<Closeable> defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'disposable' @ [62:25] ==> val disposable: Closeable defined in org.jetbrains.kotlin.container.SingletonDescriptor.createInstance[LocalVariableDescriptor]

'close' @ [62:36] ==> public abstract fun close(): Unit defined in java.io.Closeable[JavaMethodDescriptor]

'ex' @ [63:27] ==> val ex: Throwable defined in org.jetbrains.kotlin.container.SingletonDescriptor.createInstance[LocalVariableDescriptor]

'Initializing' @ [66:28] ==> enum entry Initializing defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [67:23] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'this' @ [67:86] ==> <this> defined in org.jetbrains.kotlin.container.SingletonDescriptor[LazyClassReceiverParameterDescriptor]

'Initialized' @ [68:28] ==> enum entry Initialized defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [69:23] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'this' @ [69:83] ==> <this> defined in org.jetbrains.kotlin.container.SingletonDescriptor[LazyClassReceiverParameterDescriptor]

'Corrupted' @ [70:28] ==> enum entry Corrupted defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [71:23] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'this' @ [71:83] ==> <this> defined in org.jetbrains.kotlin.container.SingletonDescriptor[LazyClassReceiverParameterDescriptor]

'Disposing' @ [72:28] ==> enum entry Disposing defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [73:23] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'this' @ [73:83] ==> <this> defined in org.jetbrains.kotlin.container.SingletonDescriptor[LazyClassReceiverParameterDescriptor]

'Disposed' @ [74:28] ==> enum entry Disposed defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [75:23] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'this' @ [75:83] ==> <this> defined in org.jetbrains.kotlin.container.SingletonDescriptor[LazyClassReceiverParameterDescriptor]

'instance' @ [80:28] ==> private final var instance: Any? defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'state' @ [81:9] ==> protected final var state: ComponentState defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'Disposing' @ [81:32] ==> enum entry Disposing defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'instance' @ [82:9] ==> private final var instance: Any? defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'wereInstance' @ [84:17] ==> val wereInstance: Any? defined in org.jetbrains.kotlin.container.SingletonDescriptor.disposeImpl[LocalVariableDescriptor]

'wereInstance' @ [85:17] ==> val wereInstance: Any? defined in org.jetbrains.kotlin.container.SingletonDescriptor.disposeImpl[LocalVariableDescriptor]

'close' @ [85:30] ==> public abstract fun close(): Unit defined in java.io.Closeable[JavaMethodDescriptor]

'disposableObjects' @ [86:32] ==> private final val disposableObjects: ArrayList<Closeable> defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'disposable' @ [87:17] ==> val disposable: Closeable defined in org.jetbrains.kotlin.container.SingletonDescriptor.disposeImpl[LocalVariableDescriptor]

'close' @ [87:28] ==> public abstract fun close(): Unit defined in java.io.Closeable[JavaMethodDescriptor]

'state' @ [90:13] ==> protected final var state: ComponentState defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'Corrupted' @ [90:36] ==> enum entry Corrupted defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'ex' @ [91:19] ==> val ex: Throwable defined in org.jetbrains.kotlin.container.SingletonDescriptor.disposeImpl[LocalVariableDescriptor]

'state' @ [93:9] ==> protected final var state: ComponentState defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'Disposed' @ [93:32] ==> enum entry Disposed defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'when (state) {
            ComponentState.Initialized ->
                disposeImpl()
            ComponentState.Corrupted -> {
            } // corrupted component is in the undefined state, ignore
            ComponentState.Null -> {
            } // it's ok to to remove null component, it may have been never needed

            ComponentState.Initializing ->
                throw ContainerConsistencyException("The component is being initialized and cannot be disposed.")
            ComponentState.Disposing ->
                throw ContainerConsistencyException("The component is already in disposing state.")
            ComponentState.Disposed ->
                throw ContainerConsistencyException("The component has already been destroyed.")
        }' @ [97:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'state' @ [97:15] ==> protected final var state: ComponentState defined in org.jetbrains.kotlin.container.SingletonDescriptor[PropertyDescriptorImpl]

'Initialized' @ [98:28] ==> enum entry Initialized defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'disposeImpl' @ [99:17] ==> private final fun disposeImpl(): Unit defined in org.jetbrains.kotlin.container.SingletonDescriptor[SimpleFunctionDescriptorImpl]

'Corrupted' @ [100:28] ==> enum entry Corrupted defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'Null' @ [102:28] ==> enum entry Null defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'Initializing' @ [105:28] ==> enum entry Initializing defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [106:23] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'Disposing' @ [107:28] ==> enum entry Disposing defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [108:23] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'Disposed' @ [109:28] ==> enum entry Disposed defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'ContainerConsistencyException' @ [110:23] ==> public constructor ContainerConsistencyException(message: String) defined in org.jetbrains.kotlin.container.ContainerConsistencyException[ClassConstructorDescriptorImpl]

'SingletonDescriptor' @ [118:99] ==> public constructor SingletonDescriptor(container: ComponentContainer) defined in org.jetbrains.kotlin.container.SingletonDescriptor[ClassConstructorDescriptorImpl]

'container' @ [118:119] ==> value-parameter container: ComponentContainer defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.<init>[ValueParameterDescriptorImpl]

'createInstanceOf' @ [119:70] ==> private final fun createInstanceOf(klass: Class<*>, context: ValueResolveContext): Any defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor[SimpleFunctionDescriptorImpl]

'klass' @ [119:87] ==> public final val klass: Class<*> defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor[PropertyDescriptorImpl]

'context' @ [119:94] ==> value-parameter context: ValueResolveContext defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.createInstance[ValueParameterDescriptorImpl]

'klass' @ [120:55] ==> public final val klass: Class<*> defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor[PropertyDescriptorImpl]

'getInfo' @ [120:61] ==> public fun Class<*>.getInfo(): ClassInfo defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'registrations' @ [120:71] ==> public final val registrations: List<Type> defined in org.jetbrains.kotlin.container.ClassInfo[PropertyDescriptorImpl]

'klass' @ [123:23] ==> value-parameter klass: Class<*> defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.createInstanceOf[ValueParameterDescriptorImpl]

'bindToConstructor' @ [123:29] ==> public fun Class<*>.bindToConstructor(context: ValueResolveContext): ConstructorBinding defined in org.jetbrains.kotlin.container in file Resolve.kt[SimpleFunctionDescriptorImpl]

'context' @ [123:47] ==> value-parameter context: ValueResolveContext defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.createInstanceOf[ValueParameterDescriptorImpl]

'state' @ [124:9] ==> protected final var state: ComponentState defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor[PropertyDescriptorImpl]

'Initializing' @ [124:32] ==> enum entry Initializing defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'binding' @ [125:36] ==> val binding: ConstructorBinding defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.createInstanceOf[LocalVariableDescriptor]

'argumentDescriptors' @ [125:44] ==> public final val argumentDescriptors: List<ValueDescriptor> defined in org.jetbrains.kotlin.container.ConstructorBinding[PropertyDescriptorImpl]

'argumentDescriptor' @ [126:17] ==> val argumentDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.createInstanceOf[LocalVariableDescriptor]

'argumentDescriptor' @ [126:52] ==> val argumentDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.createInstanceOf[LocalVariableDescriptor]

'registerDisposableObject' @ [127:17] ==> protected final fun registerDisposableObject(ownedObject: Closeable): Unit defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor[SimpleFunctionDescriptorImpl]

'argumentDescriptor' @ [127:42] ==> val argumentDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.createInstanceOf[LocalVariableDescriptor]

'binding' @ [131:27] ==> val binding: ConstructorBinding defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.createInstanceOf[LocalVariableDescriptor]

'constructor' @ [131:35] ==> public final val constructor: Constructor<*> defined in org.jetbrains.kotlin.container.ConstructorBinding[PropertyDescriptorImpl]

'computeArguments' @ [132:25] ==> public fun computeArguments(argumentDescriptors: List<ValueDescriptor>): List<Any> defined in org.jetbrains.kotlin.container[SimpleFunctionDescriptorImpl]

'binding' @ [132:42] ==> val binding: ConstructorBinding defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.createInstanceOf[LocalVariableDescriptor]

'argumentDescriptors' @ [132:50] ==> public final val argumentDescriptors: List<ValueDescriptor> defined in org.jetbrains.kotlin.container.ConstructorBinding[PropertyDescriptorImpl]

'constructor' @ [134:24] ==> val constructor: Constructor<*> defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.createInstanceOf[LocalVariableDescriptor]

'newInstance' @ [134:36] ==> @CallerSensitive public open fun newInstance(vararg p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Constructor[JavaMethodDescriptor]

'arguments' @ [134:49] ==> val arguments: List<Any> defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.createInstanceOf[LocalVariableDescriptor]

'toTypedArray' @ [134:59] ==> public inline fun <reified T> Collection<Any>.toTypedArray(): Array<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any

'state' @ [135:9] ==> protected final var state: ComponentState defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor[PropertyDescriptorImpl]

'Initialized' @ [135:32] ==> enum entry Initialized defined in org.jetbrains.kotlin.container.ComponentState[FakeCallableDescriptorForObject]

'instance' @ [136:16] ==> val instance: Any defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.createInstanceOf[LocalVariableDescriptor]

'klass' @ [140:25] ==> public final val klass: Class<*> defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor[PropertyDescriptorImpl]

'getInfo' @ [140:31] ==> public fun Class<*>.getInfo(): ClassInfo defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'classInfo' @ [141:16] ==> val classInfo: ClassInfo defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.getDependencies[LocalVariableDescriptor]

'constructorInfo' @ [141:26] ==> public final val constructorInfo: ConstructorInfo? defined in org.jetbrains.kotlin.container.ClassInfo[PropertyDescriptorImpl]

'parameters' @ [141:43] ==> public final val parameters: List<Type> defined in org.jetbrains.kotlin.container.ConstructorInfo[PropertyDescriptorImpl]

'orEmpty' @ [141:54] ==> @InlineOnly public inline fun <T> List<Type>?.orEmpty(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'classInfo' @ [141:66] ==> val classInfo: ClassInfo defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.getDependencies[LocalVariableDescriptor]

'setterInfos' @ [141:76] ==> public final val setterInfos: List<SetterInfo> defined in org.jetbrains.kotlin.container.ClassInfo[PropertyDescriptorImpl]

'flatMap' @ [141:88] ==> public inline fun <T, R> Iterable<SetterInfo>.flatMap(transform: (SetterInfo) -> Iterable<Type>): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SetterInfo
    <R> -> Type

'it' @ [141:98] ==> value-parameter it: SetterInfo defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor.getDependencies.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [141:101] ==> public final val parameters: List<Type> defined in org.jetbrains.kotlin.container.SetterInfo[PropertyDescriptorImpl]

'klass' @ [144:53] ==> public final val klass: Class<*> defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor[PropertyDescriptorImpl]

'simpleName' @ [144:59] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'SingletonTypeComponentDescriptor' @ [147:98] ==> public constructor SingletonTypeComponentDescriptor(container: ComponentContainer, klass: Class<*>) defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor[ClassConstructorDescriptorImpl]

'container' @ [147:131] ==> value-parameter container: ComponentContainer defined in org.jetbrains.kotlin.container.ImplicitSingletonTypeComponentDescriptor.<init>[ValueParameterDescriptorImpl]

'klass' @ [147:142] ==> value-parameter klass: Class<*> defined in org.jetbrains.kotlin.container.ImplicitSingletonTypeComponentDescriptor.<init>[ValueParameterDescriptorImpl]

'klass' @ [149:29] ==> public final val klass: Class<*> defined in org.jetbrains.kotlin.container.ImplicitSingletonTypeComponentDescriptor[PropertyDescriptorImpl]

'simpleName' @ [149:35] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'SingletonTypeComponentDescriptor' @ [153:97] ==> public constructor SingletonTypeComponentDescriptor(container: ComponentContainer, klass: Class<*>) defined in org.jetbrains.kotlin.container.SingletonTypeComponentDescriptor[ClassConstructorDescriptorImpl]

'container' @ [153:130] ==> value-parameter container: ComponentContainer defined in org.jetbrains.kotlin.container.DefaultSingletonTypeComponentDescriptor.<init>[ValueParameterDescriptorImpl]

'klass' @ [153:141] ==> value-parameter klass: Class<*> defined in org.jetbrains.kotlin.container.DefaultSingletonTypeComponentDescriptor.<init>[ValueParameterDescriptorImpl]

'klass' @ [155:28] ==> public final val klass: Class<*> defined in org.jetbrains.kotlin.container.DefaultSingletonTypeComponentDescriptor[PropertyDescriptorImpl]

'simpleName' @ [155:34] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

