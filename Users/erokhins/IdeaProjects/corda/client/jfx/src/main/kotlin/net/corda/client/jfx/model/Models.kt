'ObservableDelegate' @ [71:25] ==> public constructor ObservableDelegate<M : Any, T>(klass: KClass<M>, observableProperty: (M) -> Observable<T>) defined in net.corda.client.jfx.model.TrackedDelegate.ObservableDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M
    <T> -> T

'observableProperty' @ [71:54] ==> value-parameter noinline observableProperty: (M) -> Observable<T> defined in net.corda.client.jfx.model.observable[ValueParameterDescriptorImpl]

'ObserverDelegate' @ [74:25] ==> public constructor ObserverDelegate<M : Any, T>(klass: KClass<M>, observerProperty: (M) -> Observer<T>) defined in net.corda.client.jfx.model.TrackedDelegate.ObserverDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M
    <T> -> T

'observerProperty' @ [74:52] ==> value-parameter noinline observerProperty: (M) -> Observer<T> defined in net.corda.client.jfx.model.observer[ValueParameterDescriptorImpl]

'SubjectDelegate' @ [77:25] ==> public constructor SubjectDelegate<M : Any, T>(klass: KClass<M>, subjectProperty: (M) -> Subject<T, T>) defined in net.corda.client.jfx.model.TrackedDelegate.SubjectDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M
    <T> -> T

'subjectProperty' @ [77:51] ==> value-parameter noinline subjectProperty: (M) -> Subject<T, T> defined in net.corda.client.jfx.model.subject[ValueParameterDescriptorImpl]

'EventStreamDelegate' @ [80:25] ==> public constructor EventStreamDelegate<M : Any, T>(klass: KClass<M>, eventStreamProperty: (M) -> EventStream<T>) defined in net.corda.client.jfx.model.TrackedDelegate.EventStreamDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M
    <T> -> T

'streamProperty' @ [80:55] ==> value-parameter noinline streamProperty: (M) -> EventStream<T> defined in net.corda.client.jfx.model.eventStream[ValueParameterDescriptorImpl]

'EventSinkDelegate' @ [83:25] ==> public constructor EventSinkDelegate<M : Any, T>(klass: KClass<M>, eventSinkProperty: (M) -> EventSink<T>) defined in net.corda.client.jfx.model.TrackedDelegate.EventSinkDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M
    <T> -> T

'sinkProperty' @ [83:53] ==> value-parameter noinline sinkProperty: (M) -> EventSink<T> defined in net.corda.client.jfx.model.eventSink[ValueParameterDescriptorImpl]

'ObservableValueDelegate' @ [86:25] ==> public constructor ObservableValueDelegate<M : Any, T>(klass: KClass<M>, observableValueProperty: (M) -> ObservableValue<T>) defined in net.corda.client.jfx.model.TrackedDelegate.ObservableValueDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M
    <T> -> T

'observableValueProperty' @ [86:59] ==> value-parameter noinline observableValueProperty: (M) -> ObservableValue<T> defined in net.corda.client.jfx.model.observableValue[ValueParameterDescriptorImpl]

'WritableValueDelegate' @ [89:25] ==> public constructor WritableValueDelegate<M : Any, T>(klass: KClass<M>, writableValueProperty: (M) -> WritableValue<T>) defined in net.corda.client.jfx.model.TrackedDelegate.WritableValueDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M
    <T> -> T

'writableValueProperty' @ [89:57] ==> value-parameter noinline writableValueProperty: (M) -> WritableValue<T> defined in net.corda.client.jfx.model.writableValue[ValueParameterDescriptorImpl]

'ObjectPropertyDelegate' @ [92:25] ==> public constructor ObjectPropertyDelegate<M : Any, T>(klass: KClass<M>, objectPropertyProperty: (M) -> ObjectProperty<T>) defined in net.corda.client.jfx.model.TrackedDelegate.ObjectPropertyDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M
    <T> -> T

'objectProperty' @ [92:58] ==> value-parameter noinline objectProperty: (M) -> ObjectProperty<T> defined in net.corda.client.jfx.model.objectProperty[ValueParameterDescriptorImpl]

'ObservableListDelegate' @ [95:25] ==> public constructor ObservableListDelegate<M : Any, T>(klass: KClass<M>, observableListProperty: (M) -> ObservableList<T>) defined in net.corda.client.jfx.model.TrackedDelegate.ObservableListDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M
    <T> -> T

'observableListProperty' @ [95:58] ==> value-parameter noinline observableListProperty: (M) -> ObservableList<T> defined in net.corda.client.jfx.model.observableList[ValueParameterDescriptorImpl]

'ObservableListReadOnlyDelegate' @ [98:25] ==> public constructor ObservableListReadOnlyDelegate<M : Any, out T>(klass: KClass<M>, observableListReadOnlyProperty: (M) -> ObservableList<out T>) defined in net.corda.client.jfx.model.TrackedDelegate.ObservableListReadOnlyDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M
    <out T> -> T

'observableListProperty' @ [98:66] ==> value-parameter noinline observableListProperty: (M) -> ObservableList<out T> defined in net.corda.client.jfx.model.observableListReadOnly[ValueParameterDescriptorImpl]

'HashMap' @ [101:30] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KClass<*>
    <V : (Any..Any?)> -> Any

'HashMap' @ [106:35] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KClass<*>
    <V : (Any..Any?)> -> MutableSet<KClass<*>>

'modelStore' @ [108:49] ==> private final val modelStore: HashMap<KClass<*>, Any> defined in net.corda.client.jfx.model.Models[PropertyDescriptorImpl]

'getOrPut' @ [108:60] ==> public inline fun <K, V> MutableMap<KClass<*>, Any>.getOrPut(key: KClass<*>, defaultValue: () -> Any): Any defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KClass<*>
    <V> -> Any

'klass' @ [108:69] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.Models.initModel[ValueParameterDescriptorImpl]

'klass' @ [108:78] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.Models.initModel[ValueParameterDescriptorImpl]

'java' @ [108:84] ==> public val <T> KClass<M>.java: Class<M> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> M

'newInstance' @ [108:89] ==> @CallerSensitive public open fun newInstance(): (M..M?) defined in java.lang.Class[JavaMethodDescriptor]

'dependencyGraph' @ [110:9] ==> private final val dependencyGraph: HashMap<KClass<*>, MutableSet<KClass<*>>> defined in net.corda.client.jfx.model.Models[PropertyDescriptorImpl]

'getOrPut' @ [110:25] ==> public inline fun <K, V> MutableMap<KClass<*>, MutableSet<KClass<*>>>.getOrPut(key: KClass<*>, defaultValue: () -> MutableSet<KClass<*>>): MutableSet<KClass<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KClass<*>
    <V> -> MutableSet<KClass<*>>

'origin' @ [110:34] ==> value-parameter origin: KClass<*> defined in net.corda.client.jfx.model.Models.get[ValueParameterDescriptorImpl]

'mutableSetOf' @ [110:44] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<KClass<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KClass<*>

'add' @ [110:72] ==> public abstract fun add(element: KClass<*>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'klass' @ [110:76] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.Models.get[ValueParameterDescriptorImpl]

'initModel' @ [111:21] ==> public final fun <M : Any> initModel(klass: KClass<M>): Any defined in net.corda.client.jfx.model.Models[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [111:31] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.Models.get[ValueParameterDescriptorImpl]

'model' @ [112:13] ==> val model: Any defined in net.corda.client.jfx.model.Models.get[LocalVariableDescriptor]

'javaClass' @ [112:19] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'klass' @ [112:32] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.Models.get[ValueParameterDescriptorImpl]

'java' @ [112:38] ==> public val <T> KClass<M>.java: Class<M> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> M

'IllegalStateException' @ [113:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'klass' @ [113:60] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.Models.get[ValueParameterDescriptorImpl]

'qualifiedName' @ [113:66] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'model' @ [113:92] ==> val model: Any defined in net.corda.client.jfx.model.Models.get[LocalVariableDescriptor]

'javaClass' @ [113:98] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'Suppress' @ [116:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'model' @ [117:16] ==> val model: Any defined in net.corda.client.jfx.model.Models.get[LocalVariableDescriptor]

'get' @ [120:62] ==> public final fun <M : Any> get(klass: KClass<M>, origin: KClass<*>): M defined in net.corda.client.jfx.model.Models[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> M

'origin' @ [120:76] ==> value-parameter origin: KClass<*> defined in net.corda.client.jfx.model.Models.get[ValueParameterDescriptorImpl]

'Models' @ [125:9] ==> public object Models defined in net.corda.client.jfx.model in file Models.kt[FakeCallableDescriptorForObject]

'initModel' @ [125:16] ==> public final fun <M : Any> initModel(klass: KClass<M>): Any defined in net.corda.client.jfx.model.Models[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [125:26] ==> public final val klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate[PropertyDescriptorImpl]

'TrackedDelegate<M>' @ [128:108] ==> private constructor TrackedDelegate<M : Any>(klass: KClass<M>) defined in net.corda.client.jfx.model.TrackedDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [128:127] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.ObservableDelegate.<init>[ValueParameterDescriptorImpl]

'invoke' @ [130:20] ==> public abstract operator fun invoke(p1: M): Observable<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'get' @ [130:46] ==> public final fun <M : Any> get(klass: KClass<M>, origin: KClass<*>): M defined in net.corda.client.jfx.model.Models[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [130:50] ==> public final val klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.ObservableDelegate[PropertyDescriptorImpl]

'thisRef' @ [130:57] ==> value-parameter thisRef: Any defined in net.corda.client.jfx.model.TrackedDelegate.ObservableDelegate.getValue[ValueParameterDescriptorImpl]

'javaClass' @ [130:65] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'kotlin' @ [130:75] ==> public val <T : Any> Class<Any>.kotlin: KClass<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'TrackedDelegate<M>' @ [134:102] ==> private constructor TrackedDelegate<M : Any>(klass: KClass<M>) defined in net.corda.client.jfx.model.TrackedDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [134:121] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.ObserverDelegate.<init>[ValueParameterDescriptorImpl]

'invoke' @ [136:20] ==> public abstract operator fun invoke(p1: M): Observer<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'get' @ [136:44] ==> public final fun <M : Any> get(klass: KClass<M>, origin: KClass<*>): M defined in net.corda.client.jfx.model.Models[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [136:48] ==> public final val klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.ObserverDelegate[PropertyDescriptorImpl]

'thisRef' @ [136:55] ==> value-parameter thisRef: Any defined in net.corda.client.jfx.model.TrackedDelegate.ObserverDelegate.getValue[ValueParameterDescriptorImpl]

'javaClass' @ [136:63] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'kotlin' @ [136:73] ==> public val <T : Any> Class<Any>.kotlin: KClass<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'TrackedDelegate<M>' @ [140:102] ==> private constructor TrackedDelegate<M : Any>(klass: KClass<M>) defined in net.corda.client.jfx.model.TrackedDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [140:121] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.SubjectDelegate.<init>[ValueParameterDescriptorImpl]

'invoke' @ [142:20] ==> public abstract operator fun invoke(p1: M): Subject<T, T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'get' @ [142:43] ==> public final fun <M : Any> get(klass: KClass<M>, origin: KClass<*>): M defined in net.corda.client.jfx.model.Models[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [142:47] ==> public final val klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.SubjectDelegate[PropertyDescriptorImpl]

'thisRef' @ [142:54] ==> value-parameter thisRef: Any defined in net.corda.client.jfx.model.TrackedDelegate.SubjectDelegate.getValue[ValueParameterDescriptorImpl]

'javaClass' @ [142:62] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'kotlin' @ [142:72] ==> public val <T : Any> Class<Any>.kotlin: KClass<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'TrackedDelegate<M>' @ [146:123] ==> private constructor TrackedDelegate<M : Any>(klass: KClass<M>) defined in net.corda.client.jfx.model.TrackedDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [146:142] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.EventStreamDelegate.<init>[ValueParameterDescriptorImpl]

'invoke' @ [148:20] ==> public abstract operator fun invoke(p1: M): EventStream<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'get' @ [148:47] ==> public final fun <M : Any> get(klass: KClass<M>, origin: KClass<*>): M defined in net.corda.client.jfx.model.Models[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [148:51] ==> public final val klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.EventStreamDelegate[PropertyDescriptorImpl]

'thisRef' @ [148:58] ==> value-parameter thisRef: Any defined in net.corda.client.jfx.model.TrackedDelegate.EventStreamDelegate.getValue[ValueParameterDescriptorImpl]

'javaClass' @ [148:66] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'kotlin' @ [148:76] ==> public val <T : Any> Class<Any>.kotlin: KClass<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'TrackedDelegate<M>' @ [152:117] ==> private constructor TrackedDelegate<M : Any>(klass: KClass<M>) defined in net.corda.client.jfx.model.TrackedDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [152:136] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.EventSinkDelegate.<init>[ValueParameterDescriptorImpl]

'invoke' @ [154:20] ==> public abstract operator fun invoke(p1: M): EventSink<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'get' @ [154:45] ==> public final fun <M : Any> get(klass: KClass<M>, origin: KClass<*>): M defined in net.corda.client.jfx.model.Models[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [154:49] ==> public final val klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.EventSinkDelegate[PropertyDescriptorImpl]

'thisRef' @ [154:56] ==> value-parameter thisRef: Any defined in net.corda.client.jfx.model.TrackedDelegate.EventSinkDelegate.getValue[ValueParameterDescriptorImpl]

'javaClass' @ [154:64] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'kotlin' @ [154:74] ==> public val <T : Any> Class<Any>.kotlin: KClass<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'TrackedDelegate<M>' @ [158:123] ==> private constructor TrackedDelegate<M : Any>(klass: KClass<M>) defined in net.corda.client.jfx.model.TrackedDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [158:142] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.ObservableValueDelegate.<init>[ValueParameterDescriptorImpl]

'invoke' @ [160:20] ==> public abstract operator fun invoke(p1: M): ObservableValue<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'get' @ [160:51] ==> public final fun <M : Any> get(klass: KClass<M>, origin: KClass<*>): M defined in net.corda.client.jfx.model.Models[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [160:55] ==> public final val klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.ObservableValueDelegate[PropertyDescriptorImpl]

'thisRef' @ [160:62] ==> value-parameter thisRef: Any defined in net.corda.client.jfx.model.TrackedDelegate.ObservableValueDelegate.getValue[ValueParameterDescriptorImpl]

'javaClass' @ [160:70] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'kotlin' @ [160:80] ==> public val <T : Any> Class<Any>.kotlin: KClass<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'TrackedDelegate<M>' @ [164:117] ==> private constructor TrackedDelegate<M : Any>(klass: KClass<M>) defined in net.corda.client.jfx.model.TrackedDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [164:136] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.WritableValueDelegate.<init>[ValueParameterDescriptorImpl]

'invoke' @ [166:20] ==> public abstract operator fun invoke(p1: M): WritableValue<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'get' @ [166:49] ==> public final fun <M : Any> get(klass: KClass<M>, origin: KClass<*>): M defined in net.corda.client.jfx.model.Models[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [166:53] ==> public final val klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.WritableValueDelegate[PropertyDescriptorImpl]

'thisRef' @ [166:60] ==> value-parameter thisRef: Any defined in net.corda.client.jfx.model.TrackedDelegate.WritableValueDelegate.getValue[ValueParameterDescriptorImpl]

'javaClass' @ [166:68] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'kotlin' @ [166:78] ==> public val <T : Any> Class<Any>.kotlin: KClass<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'TrackedDelegate<M>' @ [170:120] ==> private constructor TrackedDelegate<M : Any>(klass: KClass<M>) defined in net.corda.client.jfx.model.TrackedDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [170:139] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.ObservableListDelegate.<init>[ValueParameterDescriptorImpl]

'invoke' @ [172:20] ==> public abstract operator fun invoke(p1: M): ObservableList<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'get' @ [172:50] ==> public final fun <M : Any> get(klass: KClass<M>, origin: KClass<*>): M defined in net.corda.client.jfx.model.Models[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [172:54] ==> public final val klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.ObservableListDelegate[PropertyDescriptorImpl]

'thisRef' @ [172:61] ==> value-parameter thisRef: Any defined in net.corda.client.jfx.model.TrackedDelegate.ObservableListDelegate.getValue[ValueParameterDescriptorImpl]

'javaClass' @ [172:69] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'kotlin' @ [172:79] ==> public val <T : Any> Class<Any>.kotlin: KClass<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'TrackedDelegate<M>' @ [176:144] ==> private constructor TrackedDelegate<M : Any>(klass: KClass<M>) defined in net.corda.client.jfx.model.TrackedDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [176:163] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.ObservableListReadOnlyDelegate.<init>[ValueParameterDescriptorImpl]

'invoke' @ [178:20] ==> public abstract operator fun invoke(p1: M): ObservableList<out T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'get' @ [178:58] ==> public final fun <M : Any> get(klass: KClass<M>, origin: KClass<*>): M defined in net.corda.client.jfx.model.Models[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [178:62] ==> public final val klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.ObservableListReadOnlyDelegate[PropertyDescriptorImpl]

'thisRef' @ [178:69] ==> value-parameter thisRef: Any defined in net.corda.client.jfx.model.TrackedDelegate.ObservableListReadOnlyDelegate.getValue[ValueParameterDescriptorImpl]

'javaClass' @ [178:77] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'kotlin' @ [178:87] ==> public val <T : Any> Class<Any>.kotlin: KClass<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'TrackedDelegate<M>' @ [182:120] ==> private constructor TrackedDelegate<M : Any>(klass: KClass<M>) defined in net.corda.client.jfx.model.TrackedDelegate[ClassConstructorDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [182:139] ==> value-parameter klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.ObjectPropertyDelegate.<init>[ValueParameterDescriptorImpl]

'invoke' @ [184:20] ==> public abstract operator fun invoke(p1: M): ObjectProperty<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'get' @ [184:50] ==> public final fun <M : Any> get(klass: KClass<M>, origin: KClass<*>): M defined in net.corda.client.jfx.model.Models[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> M

'klass' @ [184:54] ==> public final val klass: KClass<M> defined in net.corda.client.jfx.model.TrackedDelegate.ObjectPropertyDelegate[PropertyDescriptorImpl]

'thisRef' @ [184:61] ==> value-parameter thisRef: Any defined in net.corda.client.jfx.model.TrackedDelegate.ObjectPropertyDelegate.getValue[ValueParameterDescriptorImpl]

'javaClass' @ [184:69] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'kotlin' @ [184:79] ==> public val <T : Any> Class<Any>.kotlin: KClass<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

